// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/metrics.proto

package com.google.speech.trainingcache;

public interface EventWrittenLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.training_cache.EventWrittenLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.training_cache.EventType event_type = 1;</code>
   * @return Whether the eventType field is set.
   */
  boolean hasEventType();
  /**
   * <code>optional .speech.training_cache.EventType event_type = 1;</code>
   * @return The eventType.
   */
  com.google.speech.trainingcache.EventType getEventType();

  /**
   * <code>optional int32 event_size = 2;</code>
   * @return Whether the eventSize field is set.
   */
  boolean hasEventSize();
  /**
   * <code>optional int32 event_size = 2;</code>
   * @return The eventSize.
   */
  int getEventSize();

  /**
   * <code>optional int32 file_size = 3;</code>
   * @return Whether the fileSize field is set.
   */
  boolean hasFileSize();
  /**
   * <code>optional int32 file_size = 3;</code>
   * @return The fileSize.
   */
  int getFileSize();

  /**
   * <code>optional int64 buffer_delay_ms = 4;</code>
   * @return Whether the bufferDelayMs field is set.
   */
  boolean hasBufferDelayMs();
  /**
   * <code>optional int64 buffer_delay_ms = 4;</code>
   * @return The bufferDelayMs.
   */
  long getBufferDelayMs();

  /**
   * <code>optional int64 write_latency_ms = 5;</code>
   * @return Whether the writeLatencyMs field is set.
   */
  boolean hasWriteLatencyMs();
  /**
   * <code>optional int64 write_latency_ms = 5;</code>
   * @return The writeLatencyMs.
   */
  long getWriteLatencyMs();

  /**
   * <code>optional bool is_overwrite = 6;</code>
   * @return Whether the isOverwrite field is set.
   */
  boolean hasIsOverwrite();
  /**
   * <code>optional bool is_overwrite = 6;</code>
   * @return The isOverwrite.
   */
  boolean getIsOverwrite();
}
