// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface DynamicClassContextLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.DynamicClassContextLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 num_instances = 1;</code>
   * @return Whether the numInstances field is set.
   */
  boolean hasNumInstances();
  /**
   * <code>optional int32 num_instances = 1;</code>
   * @return The numInstances.
   */
  int getNumInstances();

  /**
   * <code>optional string oov_class_name = 2;</code>
   * @return Whether the oovClassName field is set.
   */
  boolean hasOovClassName();
  /**
   * <code>optional string oov_class_name = 2;</code>
   * @return The oovClassName.
   */
  java.lang.String getOovClassName();
  /**
   * <code>optional string oov_class_name = 2;</code>
   * @return The bytes for oovClassName.
   */
  com.google.protobuf.ByteString
      getOovClassNameBytes();
}