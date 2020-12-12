// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/recognition_info.proto

package com.google.speech.trainingcache;

public final class RecognitionInfoOuterClass {
  private RecognitionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_RecognitionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_RecognitionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_ServerRecognitionInfoPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_ServerRecognitionInfoPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_OpaTriggerTypePayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_OpaTriggerTypePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2speech/training_cache/proto/recognitio" +
      "n_info.proto\022\025speech.training_cache\032,spe" +
      "ech/training_cache/proto/extensions.prot" +
      "o\032*speech/training_cache/proto/metadata." +
      "proto\032:speech/training_cache/proto/recog" +
      "nition_trigger_type.proto\"\300\002\n\017Recognitio" +
      "nInfo\0225\n\010metadata\030\001 \001(\0132#.speech.trainin" +
      "g_cache.EkhoMetadata\022C\n\014trigger_type\030\002 \001" +
      "(\0162-.speech.training_cache.RecognitionTr" +
      "iggerType\022\022\n\nhypothesis\030\003 \003(\t\022\034\n\024intende" +
      "d_query_score\030\004 \001(\002\022%\n\035intended_query_ac" +
      "oustic_score\030\005 \001(\002\022\033\n\023is_speaker_detecte" +
      "d\030\006 \001(\010\022;\n\016audio_metadata\030\007 \001(\0132#.speech" +
      ".training_cache.EkhoMetadata\"{\n\034ServerRe" +
      "cognitionInfoPayload\022 \n\030has_nonspeech_hy" +
      "pothesis\030\001 \001(\010\022!\n\031nonspeech_hypothesis_r" +
      "ank\030\002 \001(\005\022\026\n\016num_hypotheses\030\003 \001(\005\"1\n\025Opa" +
      "TriggerTypePayload\022\030\n\020opa_trigger_type\030\001" +
      " \001(\005B%\n\037com.google.speech.trainingcacheH" +
      "\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          speech.training_cache.Extensions.getDescriptor(),
          com.google.speech.trainingcache.Metadata.getDescriptor(),
          speech.training_cache.RecognitionTriggerTypeOuterClass.getDescriptor(),
        });
    internal_static_speech_training_cache_RecognitionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_training_cache_RecognitionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_RecognitionInfo_descriptor,
        new java.lang.String[] { "Metadata", "TriggerType", "Hypothesis", "IntendedQueryScore", "IntendedQueryAcousticScore", "IsSpeakerDetected", "AudioMetadata", });
    internal_static_speech_training_cache_ServerRecognitionInfoPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_speech_training_cache_ServerRecognitionInfoPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_ServerRecognitionInfoPayload_descriptor,
        new java.lang.String[] { "HasNonspeechHypothesis", "NonspeechHypothesisRank", "NumHypotheses", });
    internal_static_speech_training_cache_OpaTriggerTypePayload_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_speech_training_cache_OpaTriggerTypePayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_OpaTriggerTypePayload_descriptor,
        new java.lang.String[] { "OpaTriggerType", });
    speech.training_cache.Extensions.getDescriptor();
    com.google.speech.trainingcache.Metadata.getDescriptor();
    speech.training_cache.RecognitionTriggerTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}