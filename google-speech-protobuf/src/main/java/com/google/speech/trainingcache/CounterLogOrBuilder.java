// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/metrics.proto

package com.google.speech.trainingcache;

public interface CounterLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.training_cache.CounterLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int64 key = 2;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <code>optional int64 key = 2;</code>
   * @return The key.
   */
  long getKey();

  /**
   * <code>optional int64 increment = 3;</code>
   * @return Whether the increment field is set.
   */
  boolean hasIncrement();
  /**
   * <code>optional int64 increment = 3;</code>
   * @return The increment.
   */
  long getIncrement();
}
