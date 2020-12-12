// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/speakerid/torrente_speaker_profile.proto

package com.google.speech.recognizer.speakerid;

public interface TorrenteSpeakerModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:greco.TorrenteSpeakerModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string verifier_name = 1;</code>
   * @return Whether the verifierName field is set.
   */
  boolean hasVerifierName();
  /**
   * <code>optional string verifier_name = 1;</code>
   * @return The verifierName.
   */
  java.lang.String getVerifierName();
  /**
   * <code>optional string verifier_name = 1;</code>
   * @return The bytes for verifierName.
   */
  com.google.protobuf.ByteString
      getVerifierNameBytes();

  /**
   * <code>optional int64 num_training_utterances_used = 4;</code>
   * @return Whether the numTrainingUtterancesUsed field is set.
   */
  boolean hasNumTrainingUtterancesUsed();
  /**
   * <code>optional int64 num_training_utterances_used = 4;</code>
   * @return The numTrainingUtterancesUsed.
   */
  long getNumTrainingUtterancesUsed();

  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   * @return Whether the ivectorParams field is set.
   */
  boolean hasIvectorParams();
  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   * @return The ivectorParams.
   */
  greco.Ivector.IvecModelProto getIvectorParams();
  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   */
  greco.Ivector.IvecModelProtoOrBuilder getIvectorParamsOrBuilder();

  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   * @return Whether the dvectorParams field is set.
   */
  boolean hasDvectorParams();
  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   * @return The dvectorParams.
   */
  greco.Dvector.DvecModelProto getDvectorParams();
  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   */
  greco.Dvector.DvecModelProtoOrBuilder getDvectorParamsOrBuilder();

  public com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.ModelParamsCase getModelParamsCase();
}