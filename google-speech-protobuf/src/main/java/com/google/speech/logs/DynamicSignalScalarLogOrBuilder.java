// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface DynamicSignalScalarLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.DynamicSignalScalarLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional float dynamic_gain = 1;</code>
   * @return Whether the dynamicGain field is set.
   */
  boolean hasDynamicGain();
  /**
   * <code>optional float dynamic_gain = 1;</code>
   * @return The dynamicGain.
   */
  float getDynamicGain();

  /**
   * <code>optional float rms_estimate = 2;</code>
   * @return Whether the rmsEstimate field is set.
   */
  boolean hasRmsEstimate();
  /**
   * <code>optional float rms_estimate = 2;</code>
   * @return The rmsEstimate.
   */
  float getRmsEstimate();
}
