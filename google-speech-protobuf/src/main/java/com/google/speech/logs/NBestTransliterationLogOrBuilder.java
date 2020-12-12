// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface NBestTransliterationLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.NBestTransliterationLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string hypothesis = 1;</code>
   * @return A list containing the hypothesis.
   */
  java.util.List<java.lang.String>
      getHypothesisList();
  /**
   * <code>repeated string hypothesis = 1;</code>
   * @return The count of hypothesis.
   */
  int getHypothesisCount();
  /**
   * <code>repeated string hypothesis = 1;</code>
   * @param index The index of the element to return.
   * @return The hypothesis at the given index.
   */
  java.lang.String getHypothesis(int index);
  /**
   * <code>repeated string hypothesis = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hypothesis at the given index.
   */
  com.google.protobuf.ByteString
      getHypothesisBytes(int index);

  /**
   * <code>optional int32 writing_script = 2;</code>
   * @return Whether the writingScript field is set.
   */
  boolean hasWritingScript();
  /**
   * <code>optional int32 writing_script = 2;</code>
   * @return The writingScript.
   */
  int getWritingScript();
}