// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/s3_log.proto

package com.google.speech.logs;

public interface InputLanguageDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.InputLanguageDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string raw_language = 1;</code>
   * @return Whether the rawLanguage field is set.
   */
  boolean hasRawLanguage();
  /**
   * <code>optional string raw_language = 1;</code>
   * @return The rawLanguage.
   */
  java.lang.String getRawLanguage();
  /**
   * <code>optional string raw_language = 1;</code>
   * @return The bytes for rawLanguage.
   */
  com.google.protobuf.ByteString
      getRawLanguageBytes();

  /**
   * <code>optional string canonical_language = 2;</code>
   * @return Whether the canonicalLanguage field is set.
   */
  boolean hasCanonicalLanguage();
  /**
   * <code>optional string canonical_language = 2;</code>
   * @return The canonicalLanguage.
   */
  java.lang.String getCanonicalLanguage();
  /**
   * <code>optional string canonical_language = 2;</code>
   * @return The bytes for canonicalLanguage.
   */
  com.google.protobuf.ByteString
      getCanonicalLanguageBytes();

  /**
   * <code>repeated string additional_raw_language = 3;</code>
   * @return A list containing the additionalRawLanguage.
   */
  java.util.List<java.lang.String>
      getAdditionalRawLanguageList();
  /**
   * <code>repeated string additional_raw_language = 3;</code>
   * @return The count of additionalRawLanguage.
   */
  int getAdditionalRawLanguageCount();
  /**
   * <code>repeated string additional_raw_language = 3;</code>
   * @param index The index of the element to return.
   * @return The additionalRawLanguage at the given index.
   */
  java.lang.String getAdditionalRawLanguage(int index);
  /**
   * <code>repeated string additional_raw_language = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalRawLanguage at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalRawLanguageBytes(int index);

  /**
   * <code>repeated string additional_canonical_language = 4;</code>
   * @return A list containing the additionalCanonicalLanguage.
   */
  java.util.List<java.lang.String>
      getAdditionalCanonicalLanguageList();
  /**
   * <code>repeated string additional_canonical_language = 4;</code>
   * @return The count of additionalCanonicalLanguage.
   */
  int getAdditionalCanonicalLanguageCount();
  /**
   * <code>repeated string additional_canonical_language = 4;</code>
   * @param index The index of the element to return.
   * @return The additionalCanonicalLanguage at the given index.
   */
  java.lang.String getAdditionalCanonicalLanguage(int index);
  /**
   * <code>repeated string additional_canonical_language = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the additionalCanonicalLanguage at the given index.
   */
  com.google.protobuf.ByteString
      getAdditionalCanonicalLanguageBytes(int index);

  /**
   * <code>repeated string server_added_raw_language = 5;</code>
   * @return A list containing the serverAddedRawLanguage.
   */
  java.util.List<java.lang.String>
      getServerAddedRawLanguageList();
  /**
   * <code>repeated string server_added_raw_language = 5;</code>
   * @return The count of serverAddedRawLanguage.
   */
  int getServerAddedRawLanguageCount();
  /**
   * <code>repeated string server_added_raw_language = 5;</code>
   * @param index The index of the element to return.
   * @return The serverAddedRawLanguage at the given index.
   */
  java.lang.String getServerAddedRawLanguage(int index);
  /**
   * <code>repeated string server_added_raw_language = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the serverAddedRawLanguage at the given index.
   */
  com.google.protobuf.ByteString
      getServerAddedRawLanguageBytes(int index);

  /**
   * <code>repeated string server_added_canonical_language = 6;</code>
   * @return A list containing the serverAddedCanonicalLanguage.
   */
  java.util.List<java.lang.String>
      getServerAddedCanonicalLanguageList();
  /**
   * <code>repeated string server_added_canonical_language = 6;</code>
   * @return The count of serverAddedCanonicalLanguage.
   */
  int getServerAddedCanonicalLanguageCount();
  /**
   * <code>repeated string server_added_canonical_language = 6;</code>
   * @param index The index of the element to return.
   * @return The serverAddedCanonicalLanguage at the given index.
   */
  java.lang.String getServerAddedCanonicalLanguage(int index);
  /**
   * <code>repeated string server_added_canonical_language = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the serverAddedCanonicalLanguage at the given index.
   */
  com.google.protobuf.ByteString
      getServerAddedCanonicalLanguageBytes(int index);
}