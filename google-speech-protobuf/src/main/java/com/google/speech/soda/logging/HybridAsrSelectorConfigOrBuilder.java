// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface HybridAsrSelectorConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.HybridAsrSelectorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 mode = 1;</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <code>optional int32 mode = 1;</code>
   * @return The mode.
   */
  int getMode();

  /**
   * <code>optional float on_device_confidence_threshold = 2;</code>
   * @return Whether the onDeviceConfidenceThreshold field is set.
   */
  boolean hasOnDeviceConfidenceThreshold();
  /**
   * <code>optional float on_device_confidence_threshold = 2;</code>
   * @return The onDeviceConfidenceThreshold.
   */
  float getOnDeviceConfidenceThreshold();
}
