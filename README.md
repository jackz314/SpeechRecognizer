# SpeechRecognizer
Offline Speech Recognizer for Android

This is a proof of concept speech recognizer app using models and pipelines from Google's [Recorder app](https://play.google.com/store/apps/details?id=com.google.android.apps.recorder), which uses their [All-Neural On-Device Speech Recognizer](https://ai.googleblog.com/2019/03/an-all-neural-on-device-speech.html).

See [this repo](https://github.com/AIFanatic/google-offline-speech-recognition) for more analysis of the reverse engineering efforts. It's based on Google's quick search box apk, which is slightly different from the methods used here, but the general structures and operation flows are the same.

## Features

* Offline speech recognition for mics or audio files with real-time display.
* ML Punctuator from the same Recorder app.
* Playback of audio files for testing.

## Audio File Requirements

The files have to contain single-channel raw PCM data. The data will be resampled to 16KHz, which is the sample rate the recognition model uses.

## Disclaimer

This proof of concept is made for educational and testing purposes only. Usage of any of the proof of concepts or artifacts found in this repository for commercial or other purposes are not permitted, the developer assumes no liability and are not responsible for any misuse.
