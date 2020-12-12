// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

public interface BackendRecognizerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.timeline.BackendRecognizerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.logs.timeline.BackendRecognizerRequest.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <code>optional .speech.logs.timeline.BackendRecognizerRequest.Event event = 1;</code>
   * @return The event.
   */
  com.google.speech.logs.timeline.BackendRecognizerRequest.Event getEvent();

  /**
   * <code>optional string recognizer_language = 2;</code>
   * @return Whether the recognizerLanguage field is set.
   */
  boolean hasRecognizerLanguage();
  /**
   * <code>optional string recognizer_language = 2;</code>
   * @return The recognizerLanguage.
   */
  java.lang.String getRecognizerLanguage();
  /**
   * <code>optional string recognizer_language = 2;</code>
   * @return The bytes for recognizerLanguage.
   */
  com.google.protobuf.ByteString
      getRecognizerLanguageBytes();

  /**
   * <code>optional int32 num_audio_bytes = 3;</code>
   * @return Whether the numAudioBytes field is set.
   */
  boolean hasNumAudioBytes();
  /**
   * <code>optional int32 num_audio_bytes = 3;</code>
   * @return The numAudioBytes.
   */
  int getNumAudioBytes();
}
