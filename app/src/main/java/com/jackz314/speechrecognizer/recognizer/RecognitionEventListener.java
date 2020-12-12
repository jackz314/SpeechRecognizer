package com.jackz314.speechrecognizer.recognizer;

import com.google.speech.recognizer.api.Recognizer;

@FunctionalInterface
public interface RecognitionEventListener {
    void onNewRecognitionEvent(Recognizer.RecognitionEvent event);
}
