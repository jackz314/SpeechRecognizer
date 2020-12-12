// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

public interface HotwordModelInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.HotwordModelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
   * @return Whether the hotwordId field is set.
   */
  boolean hasHotwordId();
  /**
   * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
   * @return The hotwordId.
   */
  com.google.speech.soda.logging.HotwordModelInfo.HotwordId getHotwordId();

  /**
   * <code>optional string model_id = 2;</code>
   * @return Whether the modelId field is set.
   */
  boolean hasModelId();
  /**
   * <code>optional string model_id = 2;</code>
   * @return The modelId.
   */
  java.lang.String getModelId();
  /**
   * <code>optional string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString
      getModelIdBytes();
}