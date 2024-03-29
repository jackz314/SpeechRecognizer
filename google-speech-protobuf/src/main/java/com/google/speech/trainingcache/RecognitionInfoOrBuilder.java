// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/recognition_info.proto

package com.google.speech.trainingcache;

public interface RecognitionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.training_cache.RecognitionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   * @return The metadata.
   */
  com.google.speech.trainingcache.EkhoMetadata getMetadata();
  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   */
  com.google.speech.trainingcache.EkhoMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <code>optional .speech.training_cache.RecognitionTriggerType trigger_type = 2;</code>
   * @return Whether the triggerType field is set.
   */
  boolean hasTriggerType();
  /**
   * <code>optional .speech.training_cache.RecognitionTriggerType trigger_type = 2;</code>
   * @return The triggerType.
   */
  speech.training_cache.RecognitionTriggerTypeOuterClass.RecognitionTriggerType getTriggerType();

  /**
   * <code>repeated string hypothesis = 3;</code>
   * @return A list containing the hypothesis.
   */
  java.util.List<java.lang.String>
      getHypothesisList();
  /**
   * <code>repeated string hypothesis = 3;</code>
   * @return The count of hypothesis.
   */
  int getHypothesisCount();
  /**
   * <code>repeated string hypothesis = 3;</code>
   * @param index The index of the element to return.
   * @return The hypothesis at the given index.
   */
  java.lang.String getHypothesis(int index);
  /**
   * <code>repeated string hypothesis = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hypothesis at the given index.
   */
  com.google.protobuf.ByteString
      getHypothesisBytes(int index);

  /**
   * <code>optional float intended_query_score = 4;</code>
   * @return Whether the intendedQueryScore field is set.
   */
  boolean hasIntendedQueryScore();
  /**
   * <code>optional float intended_query_score = 4;</code>
   * @return The intendedQueryScore.
   */
  float getIntendedQueryScore();

  /**
   * <code>optional float intended_query_acoustic_score = 5;</code>
   * @return Whether the intendedQueryAcousticScore field is set.
   */
  boolean hasIntendedQueryAcousticScore();
  /**
   * <code>optional float intended_query_acoustic_score = 5;</code>
   * @return The intendedQueryAcousticScore.
   */
  float getIntendedQueryAcousticScore();

  /**
   * <code>optional bool is_speaker_detected = 6;</code>
   * @return Whether the isSpeakerDetected field is set.
   */
  boolean hasIsSpeakerDetected();
  /**
   * <code>optional bool is_speaker_detected = 6;</code>
   * @return The isSpeakerDetected.
   */
  boolean getIsSpeakerDetected();

  /**
   * <code>optional .speech.training_cache.EkhoMetadata audio_metadata = 7;</code>
   * @return Whether the audioMetadata field is set.
   */
  boolean hasAudioMetadata();
  /**
   * <code>optional .speech.training_cache.EkhoMetadata audio_metadata = 7;</code>
   * @return The audioMetadata.
   */
  com.google.speech.trainingcache.EkhoMetadata getAudioMetadata();
  /**
   * <code>optional .speech.training_cache.EkhoMetadata audio_metadata = 7;</code>
   */
  com.google.speech.trainingcache.EkhoMetadataOrBuilder getAudioMetadataOrBuilder();
}
