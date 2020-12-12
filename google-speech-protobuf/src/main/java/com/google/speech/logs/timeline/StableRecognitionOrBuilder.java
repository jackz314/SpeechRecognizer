// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

public interface StableRecognitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.timeline.StableRecognition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string recognition_result = 1;</code>
   * @return Whether the recognitionResult field is set.
   */
  boolean hasRecognitionResult();
  /**
   * <code>optional string recognition_result = 1;</code>
   * @return The recognitionResult.
   */
  java.lang.String getRecognitionResult();
  /**
   * <code>optional string recognition_result = 1;</code>
   * @return The bytes for recognitionResult.
   */
  com.google.protobuf.ByteString
      getRecognitionResultBytes();

  /**
   * <code>optional int64 start_time_usec = 2;</code>
   * @return Whether the startTimeUsec field is set.
   */
  boolean hasStartTimeUsec();
  /**
   * <code>optional int64 start_time_usec = 2;</code>
   * @return The startTimeUsec.
   */
  long getStartTimeUsec();

  /**
   * <code>optional int64 end_time_usec = 3;</code>
   * @return Whether the endTimeUsec field is set.
   */
  boolean hasEndTimeUsec();
  /**
   * <code>optional int64 end_time_usec = 3;</code>
   * @return The endTimeUsec.
   */
  long getEndTimeUsec();
}