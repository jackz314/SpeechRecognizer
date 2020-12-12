// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface LatticeRescoringModelLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.LatticeRescoringModelLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.logs.LatticeRescoringModelLog.LatticeRescoringType model_type = 1;</code>
   * @return Whether the modelType field is set.
   */
  boolean hasModelType();
  /**
   * <code>optional .speech.logs.LatticeRescoringModelLog.LatticeRescoringType model_type = 1;</code>
   * @return The modelType.
   */
  com.google.speech.logs.LatticeRescoringModelLog.LatticeRescoringType getModelType();

  /**
   * <code>optional bool timed_out = 2 [default = false];</code>
   * @return Whether the timedOut field is set.
   */
  boolean hasTimedOut();
  /**
   * <code>optional bool timed_out = 2 [default = false];</code>
   * @return The timedOut.
   */
  boolean getTimedOut();
}