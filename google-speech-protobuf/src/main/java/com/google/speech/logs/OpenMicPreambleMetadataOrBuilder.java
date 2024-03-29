// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface OpenMicPreambleMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.OpenMicPreambleMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string open_mic_model = 1;</code>
   * @return Whether the openMicModel field is set.
   */
  boolean hasOpenMicModel();
  /**
   * <code>optional string open_mic_model = 1;</code>
   * @return The openMicModel.
   */
  java.lang.String getOpenMicModel();
  /**
   * <code>optional string open_mic_model = 1;</code>
   * @return The bytes for openMicModel.
   */
  com.google.protobuf.ByteString
      getOpenMicModelBytes();

  /**
   * <code>optional bool false_alarm = 2;</code>
   * @return Whether the falseAlarm field is set.
   */
  boolean hasFalseAlarm();
  /**
   * <code>optional bool false_alarm = 2;</code>
   * @return The falseAlarm.
   */
  boolean getFalseAlarm();
}
