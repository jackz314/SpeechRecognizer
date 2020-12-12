package com.jackz314.speechrecognizer.recognizer;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.speech.recognizer.pipeline.PipelineProto;
import com.jackz314.speechrecognizer.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

public class ModelLoader {
    private static final String TAG = "ModelLoader";

    private Context context;
    private File modelRootDir;
    private File modelDir;
    private byte[] modelConfig;
    private String modelName;

    public ModelLoader(Context context, String path) throws IOException {
        this.context = context;
        modelRootDir = new File(path);
        unpackDefaultModel();
    }

    public ModelLoader(Context context) throws IOException {
        this.context = context;
        modelRootDir = context.getDir("models", Context.MODE_PRIVATE);
//        if(!modelRootDir.mkdirs()) throw new IOException("Unable to create model extraction directory");
        unpackDefaultModel();
    }

    private void loadModelConfig() throws IOException {
        File f = new File(modelDir, "dictation.config");
        modelConfig = new byte[(int) f.length()];

        try (InputStream buf = new FileInputStream(f)) {
            int read = buf.read(modelConfig, 0, modelConfig.length);
            if (read != modelConfig.length) {
                Log.e(TAG, "onCreate: failed to read dictation.config");
            }
            PipelineProto.PipelineDef pipeDef = PipelineProto.PipelineDef.parseFrom(modelConfig);
//            Log.d(TAG, "getDictationConfig: pipeline def: " + pipeDef);
            modelName = pipeDef.getName();
        }
    }

    public byte[] getModelConfig() throws IOException {
        if(modelConfig == null) loadModelConfig();
        return modelConfig;
    }

    public File getModelDir() {
        return modelDir;
    }

    public static long transferStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        long totalRead = 0;
        int read;
        byte[] buf = new byte[8192];
        while ((read = inputStream.read(buf)) != -1) {
            outputStream.write(buf, 0, read);
            totalRead += read;
        }
        return totalRead;
    }

    //unzip inputstream content into target directory outDir
    public static void unzip(InputStream inputStream, File outDir) throws IOException{
        try(ZipInputStream zipInputStream = new ZipInputStream(inputStream)){
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                String name = entry.getName();
                File outFile = new File(outDir, name);
                if (!outFile.getCanonicalPath().startsWith(outDir.getCanonicalPath())) {
                    throw new ZipException( "Illegal file name: " + name);
                } else if (!entry.isDirectory()) { // store entry file (create sub directory if needed)
                    File dir = outFile.getParentFile();
                    if(dir == null) {
                        throw new IOException("Target file parent is null: " + outFile);
                    }
                    if (dir.isDirectory() || dir.mkdirs()) {
                        try (FileOutputStream fileOutputStream = new FileOutputStream(outFile)) {
                            long transferredSize = transferStream(zipInputStream, fileOutputStream);
                            Log.d(TAG, "unzip: saved file " + outFile + " " + transferredSize);
                        }
                        long time = entry.getTime();
                        if (time > 0)
                            //noinspection ResultOfMethodCallIgnored
                            outFile.setLastModified(time);
                    } else
                        throw new IOException("Failed to create directory: " + dir.getAbsolutePath());
                } else if (!outFile.isDirectory() && !outFile.mkdirs()) // create entry directory
                    throw new IOException("Failed to create directory: " + outFile.getAbsolutePath());
            }
        }
    }

    public void unpackDefaultModel() throws IOException {
        //skip if model already unpacked
        File defaultDir = new File(modelRootDir, "default");
        modelDir = defaultDir;
        if(new File(defaultDir, "dictation.config").exists()) return;
        ((Activity) context).runOnUiThread(()->Toast.makeText(context, "Loading models for the first time, please wait...", Toast.LENGTH_SHORT).show());
        InputStream inputStream = context.getResources().openRawResource(R.raw.lp_en_us);
        unzip(inputStream, defaultDir);
    }
}
