// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/session.proto

package com.google.speech.trainingcache;

public final class SessionOuterClass {
  private SessionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_Session_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)speech/training_cache/proto/session.pr" +
      "oto\022\025speech.training_cache\032,speech/train" +
      "ing_cache/proto/extensions.proto\032*speech" +
      "/training_cache/proto/metadata.proto\032-sp" +
      "eech/training_cache/proto/session_tag.pr" +
      "oto\"\302\001\n\007Session\0225\n\010metadata\030\001 \001(\0132#.spee" +
      "ch.training_cache.EkhoMetadata\022\025\n\rend_ti" +
      "me_usec\030\002 \001(\003\022\022\n\nnum_events\030\003 \001(\005\022\034\n\024las" +
      "t_event_time_usec\030\004 \001(\003\0227\n\003tag\030\005 \001(\0162!.s" +
      "peech.training_cache.SessionTag:\007DEFAULT" +
      "B%\n\037com.google.speech.trainingcacheH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          speech.training_cache.Extensions.getDescriptor(),
          com.google.speech.trainingcache.Metadata.getDescriptor(),
          com.google.speech.trainingcache.SessionTagOuterClass.getDescriptor(),
        });
    internal_static_speech_training_cache_Session_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_training_cache_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_Session_descriptor,
        new java.lang.String[] { "Metadata", "EndTimeUsec", "NumEvents", "LastEventTimeUsec", "Tag", });
    speech.training_cache.Extensions.getDescriptor();
    com.google.speech.trainingcache.Metadata.getDescriptor();
    com.google.speech.trainingcache.SessionTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
