// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface InitEventLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.InitEventLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 init_duration_ms = 1;</code>
   * @return Whether the initDurationMs field is set.
   */
  boolean hasInitDurationMs();
  /**
   * <code>optional int64 init_duration_ms = 1;</code>
   * @return The initDurationMs.
   */
  long getInitDurationMs();

  /**
   * <code>optional int32 config_status = 2;</code>
   * @return Whether the configStatus field is set.
   */
  boolean hasConfigStatus();
  /**
   * <code>optional int32 config_status = 2;</code>
   * @return The configStatus.
   */
  int getConfigStatus();
}
