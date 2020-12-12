package com.jackz314.speechrecognizer;

import android.Manifest;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.jackz314.speechrecognizer.recognizer.RecognizerRunner;
import com.jackz314.speechrecognizer.recognizer.ResampleInputStream;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private static final int FILE_PERMISSION_REQUEST_CODE = 101;
    private static final int MIC_PERMISSION_REQUEST_CODE = 102;
    private static final String TAG = "MainActivity";

    private TextView outputTextView;
    private TextView statusTextView;
    private Button runButton;
    private Button stopButton;
    private Button playFileButton;
    private Button recordButton;

    private boolean isRecognizing = false;
    private boolean isFile = true;
    private boolean isPlaying = false;

    private InputStream playbackInputStream;
    private ExecutorService soundES;
    private boolean stopPlayback = false;

    private RecognizerRunner runner;

    private Uri audioFile;
    private File sdcard;

    private String filePath;
    private String modelName;

    private static final int PICK_FILE_INTENT = 10086;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!checkFilePermission()) {
            requestFilePermission();
        }

        sdcard = Environment.getExternalStorageDirectory();
        Log.d(TAG, "onCreate: sdcard path: " + sdcard.getAbsolutePath());
        outputTextView = findViewById(R.id.outputTextView);
        statusTextView = findViewById(R.id.statusText);
//        outputTextView.setOnClickListener(v -> copyText(outputTextView.getText()));
        outputTextView.setOnLongClickListener(v -> {
            v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
            copyText(outputTextView.getText());
            return false;
        });

        setStatus("", "");

        Button loadBtn = findViewById(R.id.loadBtn);
        loadBtn.setOnClickListener(view -> startPickFileIntent(null));

        runButton = findViewById(R.id.runRecBtn);
        runButton.setEnabled(false);
        runButton.setOnClickListener(this::toggleRecognition);

        stopButton = findViewById(R.id.stopRecBtn);
        stopButton.setEnabled(false);
        stopButton.setOnClickListener(v -> stopRecognition());

        Button clearBtn = findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(view -> outputTextView.setText(""));

        playFileButton = findViewById(R.id.playFileBtn);
        playFileButton.setEnabled(false);
        playFileButton.setOnClickListener(view -> {
            if(isPlaying){
                stopAudioPlayback();
                isPlaying = false;
                playFileButton.setText("Play");
            }else{
                isPlaying = true;
                playFileButton.setText("Stop");
                if (soundES == null) soundES = Executors.newSingleThreadExecutor();
                soundES.execute(this::playAudio);
            }
        });

        recordButton = findViewById(R.id.useMicBtn);
        recordButton.setOnClickListener(v -> {
            if (!checkMicPermission()) {
                requestMicPermission();
            }else{
                setupUseRecorder();
            }
        });
    }

    private void copyText(CharSequence text) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("recognition result", text);
        clipboardManager.setPrimaryClip(clip);
        Toast.makeText(this, "Copied result to clipboard", Toast.LENGTH_SHORT).show();
    }

    private void stopAudioPlayback() {
        stopPlayback = true;
    }

    private InputStream getAudioInputStream() throws IOException {
//        return new FileInputStream(new File(sdcard.getAbsolutePath() +"/ondevice/samples/hout.wav"));
//        return new ResampleInputStream(sdcard.getAbsolutePath() + "/ondevice/samples/h.wav", 16000);
        if(!isFile) return null;
        return new ResampleInputStream(audioFile, 16000, this);
    }

    private boolean checkMicPermission() {
        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private void requestMicPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.RECORD_AUDIO)) {
            Toast.makeText(this, "We need microphone permission to record audio. Please allow this permission in App Settings.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.RECORD_AUDIO}, MIC_PERMISSION_REQUEST_CODE);
        }
    }

    private boolean checkFilePermission() {
        int result = ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    private void requestFilePermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)) {
            Toast.makeText(this, "Write External Storage permission allows us to read files. Please allow this permission in App Settings.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, FILE_PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        if (requestCode == FILE_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.d(TAG, "Permission Granted, Now you can use local drive .");
            } else {
                Log.d(TAG, "Permission Denied, You cannot use local drive .");
            }
        } else if (requestCode == MIC_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.d(TAG, "Permission Granted, Now you can record audio.");
                setupUseRecorder();
            } else {
                Log.d(TAG, "Permission Denied, You can't record audio without this permission.");
            }
        }
    }

    private void startPickFileIntent(Uri pickerInitialUri) {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("audio/*");

        if (pickerInitialUri != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, pickerInitialUri);
        }

        startActivityForResult(intent, PICK_FILE_INTENT);
    }


    private void setupUseRecorder() {
        isFile = false;
        stopRecognition();
        runButton.setEnabled(true);
        setStatus("Microphone @ 16KHz, 16-bit PCM", null);
    }

    private void setupAudioFile(Uri uri) {
        audioFile = uri;
        isFile = true;
        stopRecognition();
        runButton.setEnabled(true);
        playFileButton.setEnabled(true);
        setStatus(audioFile.getPath(), null);
    }

    private void setStatus(String audioSrc, String modelName) {
        if (audioSrc != null) this.filePath = audioSrc;
        if (modelName != null) this.modelName = modelName;
        runOnUiThread(() -> statusTextView.setText("Audio: " + this.filePath + "\nModel: " + this.modelName));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == PICK_FILE_INTENT) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                setupAudioFile(data.getData());
            } else {
                Log.e(TAG, "onActivityResult: pick file intent cancelled: " + resultCode);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void stopRecognition(){
        try {
            if(runner != null) runner.close();
            runner = null;
        } catch (IOException e) {
            Log.e(TAG, "stopRecognition: failed to close recognition runner", e);
        }
        isRecognizing = false;
        runOnUiThread(() -> {
            runButton.setEnabled(true);
            stopButton.setEnabled(false);
        });
    }

    private void toggleRecognition(View view) {
        stopButton.setEnabled(true);
        if (!isRecognizing) {//resume/start
            isRecognizing = true;
            runButton.setEnabled(false);
            if(runner == null) {
                //stop running if exception
                if(!initRecogRunner()) return;
            }
            runner.resume();
        }
    }

    private boolean initRecogRunner(){
        outputTextView.setText("...");
        try {
            runner = new RecognizerRunner(this, getAudioInputStream(), result -> {
                if(result == null){// over
                    stopRecognition();
                    return;
                }
                runOnUiThread(()->outputTextView.setText(result));
            });
            return true;
        } catch (IOException e) {
            Toast.makeText(this, "Error initializing recognizer: " + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void playAudio() {
        if (!isPlaying) return;
        try {
            getNewPlaybackInputStream();
            AudioTrack audioTrack = new AudioTrack(AudioAttributes.CONTENT_TYPE_MUSIC, 16000, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT, ResampleInputStream.DEFAULT_BUFFER_SIZE, AudioTrack.MODE_STREAM);
            byte[] buf = new byte[ResampleInputStream.DEFAULT_BUFFER_SIZE];
            audioTrack.play();
            int size;
            stopPlayback = false;
            while ((size = playbackInputStream.read(buf)) != -1) {
                if (stopPlayback) break;
                audioTrack.write(buf, 0, size);
            }
            if (playbackInputStream != null) playbackInputStream.close();
            if (audioTrack.getState() != AudioTrack.STATE_UNINITIALIZED) {
                audioTrack.stop();
                audioTrack.release();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        isPlaying = false;
        runOnUiThread(() -> playFileButton.setText("Play"));
    }

    private void getNewPlaybackInputStream() throws IOException {
        if (playbackInputStream != null) playbackInputStream.close();
        playbackInputStream = getAudioInputStream();
    }
}
