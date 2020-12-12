// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface HybridAsrRecognitionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.HybridAsrRecognitionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent.Type type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent.Type type = 1;</code>
   * @return The type.
   */
  com.google.speech.soda.logging.HybridAsrRecognitionEvent.Type getType();

  /**
   * <code>optional int32 hypothesis_length = 2;</code>
   * @return Whether the hypothesisLength field is set.
   */
  boolean hasHypothesisLength();
  /**
   * <code>optional int32 hypothesis_length = 2;</code>
   * @return The hypothesisLength.
   */
  int getHypothesisLength();

  /**
   * <code>optional int64 timestamp_ms = 3;</code>
   * @return Whether the timestampMs field is set.
   */
  boolean hasTimestampMs();
  /**
   * <code>optional int64 timestamp_ms = 3;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();
}
