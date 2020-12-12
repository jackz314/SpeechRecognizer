// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface MultiDeviceHotwordMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.MultiDeviceHotwordMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional float hotword_power = 1;</code>
   * @return Whether the hotwordPower field is set.
   */
  boolean hasHotwordPower();
  /**
   * <code>optional float hotword_power = 1;</code>
   * @return The hotwordPower.
   */
  float getHotwordPower();

  /**
   * <code>optional float background_power = 2;</code>
   * @return Whether the backgroundPower field is set.
   */
  boolean hasBackgroundPower();
  /**
   * <code>optional float background_power = 2;</code>
   * @return The backgroundPower.
   */
  float getBackgroundPower();
}
