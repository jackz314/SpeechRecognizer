// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/client_event.proto

package com.google.speech.trainingcache;

public final class ClientEventOuterClass {
  private ClientEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_ClientEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_ClientEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.speech/training_cache/proto/client_eve" +
      "nt.proto\022\025speech.training_cache\032,speech/" +
      "training_cache/proto/event_type.proto\032,s" +
      "peech/training_cache/proto/extensions.pr" +
      "oto\032*speech/training_cache/proto/metadat" +
      "a.proto\"\213\001\n\013ClientEvent\0225\n\010metadata\030\001 \001(" +
      "\0132#.speech.training_cache.EkhoMetadata\0224" +
      "\n\nevent_type\030\002 \001(\0162 .speech.training_cac" +
      "he.EventType\022\017\n\007payload\030\003 \001(\014B%\n\037com.goo" +
      "gle.speech.trainingcacheH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.trainingcache.EventTypeOuterClass.getDescriptor(),
          speech.training_cache.Extensions.getDescriptor(),
          com.google.speech.trainingcache.Metadata.getDescriptor(),
        });
    internal_static_speech_training_cache_ClientEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_training_cache_ClientEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_ClientEvent_descriptor,
        new java.lang.String[] { "Metadata", "EventType", "Payload", });
    com.google.speech.trainingcache.EventTypeOuterClass.getDescriptor();
    speech.training_cache.Extensions.getDescriptor();
    com.google.speech.trainingcache.Metadata.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
