// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface ContactAffinityRankMetricsLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.ContactAffinityRankMetricsLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 affinity_percentile = 1;</code>
   * @return Whether the affinityPercentile field is set.
   */
  boolean hasAffinityPercentile();
  /**
   * <code>optional int32 affinity_percentile = 1;</code>
   * @return The affinityPercentile.
   */
  int getAffinityPercentile();

  /**
   * <code>optional int32 hyp_num = 2;</code>
   * @return Whether the hypNum field is set.
   */
  boolean hasHypNum();
  /**
   * <code>optional int32 hyp_num = 2;</code>
   * @return The hypNum.
   */
  int getHypNum();

  /**
   * <code>optional string contact_source = 3;</code>
   * @return Whether the contactSource field is set.
   */
  boolean hasContactSource();
  /**
   * <code>optional string contact_source = 3;</code>
   * @return The contactSource.
   */
  java.lang.String getContactSource();
  /**
   * <code>optional string contact_source = 3;</code>
   * @return The bytes for contactSource.
   */
  com.google.protobuf.ByteString
      getContactSourceBytes();

  /**
   * <code>optional int32 affinity_rank = 4;</code>
   * @return Whether the affinityRank field is set.
   */
  boolean hasAffinityRank();
  /**
   * <code>optional int32 affinity_rank = 4;</code>
   * @return The affinityRank.
   */
  int getAffinityRank();

  /**
   * <code>optional int32 num_contacts_with_affinity = 5;</code>
   * @return Whether the numContactsWithAffinity field is set.
   */
  boolean hasNumContactsWithAffinity();
  /**
   * <code>optional int32 num_contacts_with_affinity = 5;</code>
   * @return The numContactsWithAffinity.
   */
  int getNumContactsWithAffinity();
}