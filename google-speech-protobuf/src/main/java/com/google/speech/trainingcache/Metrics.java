// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/metrics.proto

package com.google.speech.trainingcache;

public final class Metrics {
  private Metrics() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_Histogram_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_Histogram_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_Histogram_BucketsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_Histogram_BucketsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_EventMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_EventMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_EventTypeMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_EventTypeMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_CacheMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_CacheMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_CleanupCycleSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_CleanupCycleSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_OperationLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_OperationLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_EventWrittenLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_EventWrittenLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_CounterLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_CounterLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_training_cache_LogBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_training_cache_LogBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)speech/training_cache/proto/metrics.pr" +
      "oto\022\025speech.training_cache\032,speech/train" +
      "ing_cache/proto/event_type.proto\"{\n\tHist" +
      "ogram\022>\n\007buckets\030\001 \003(\0132-.speech.training" +
      "_cache.Histogram.BucketsEntry\032.\n\014Buckets" +
      "Entry\022\013\n\003key\030\001 \001(\003\022\r\n\005value\030\002 \001(\003:\0028\001\"}\n" +
      "\014EventMetrics\022\022\n\nnum_events\030\001 \001(\003\022\032\n\022num" +
      "_bytes_in_total\030\002 \001(\003\022=\n\023num_bytes_histo" +
      "gram\030\003 \001(\0132 .speech.training_cache.Histo" +
      "gram\"~\n\020EventTypeMetrics\0224\n\nevent_type\030\001" +
      " \001(\0162 .speech.training_cache.EventType\0224" +
      "\n\007metrics\030\002 \001(\0132#.speech.training_cache." +
      "EventMetrics\"\212\003\n\014CacheMetrics\022\035\n\025policy_" +
      "config_version\030\001 \001(\005\022?\n\022all_events_metri" +
      "cs\030\t \001(\0132#.speech.training_cache.EventMe" +
      "trics\022C\n\022event_type_metrics\030\002 \003(\0132\'.spee" +
      "ch.training_cache.EventTypeMetrics\022\"\n\032nu" +
      "m_events_cached_lifetime\030\003 \001(\003\022#\n\033num_ev" +
      "ents_deleted_lifetime\030\004 \001(\003\022!\n\031num_bytes" +
      "_cached_lifetime\030\005 \001(\003\022\"\n\032num_bytes_dele" +
      "ted_lifetime\030\006 \001(\003\022!\n\031num_files_cached_l" +
      "ifetime\030\007 \001(\003\022\"\n\032num_files_deleted_lifet" +
      "ime\030\010 \001(\003\"\262\002\n\023CleanupCycleSummary\022\031\n\021num" +
      "_events_cached\030\001 \001(\003\022\032\n\022num_events_delet" +
      "ed\030\002 \001(\003\022\030\n\020num_bytes_cached\030\003 \001(\003\022\031\n\021nu" +
      "m_bytes_deleted\030\004 \001(\003\022\030\n\020num_files_cache" +
      "d\030\005 \001(\003\022\031\n\021num_files_deleted\030\006 \001(\003\022D\n\032tt" +
      "l_overdues_sec_histogram\030\010 \001(\0132 .speech." +
      "training_cache.Histogram\022\031\n\021cleanup_time" +
      "_usec\030\t \001(\003\022\031\n\021cycle_length_usec\030\n \001(\003\"R" +
      "\n\014OperationLog\022\014\n\004name\030\001 \001(\t\022\016\n\006status\030\002" +
      " \001(\t\022\020\n\010is_error\030\003 \001(\010\022\022\n\nlatency_ms\030\004 \001" +
      "(\003\"\267\001\n\017EventWrittenLog\0224\n\nevent_type\030\001 \001" +
      "(\0162 .speech.training_cache.EventType\022\022\n\n" +
      "event_size\030\002 \001(\005\022\021\n\tfile_size\030\003 \001(\005\022\027\n\017b" +
      "uffer_delay_ms\030\004 \001(\003\022\030\n\020write_latency_ms" +
      "\030\005 \001(\003\022\024\n\014is_overwrite\030\006 \001(\010\":\n\nCounterL" +
      "og\022\014\n\004name\030\001 \001(\t\022\013\n\003key\030\002 \001(\003\022\021\n\tincreme" +
      "nt\030\003 \001(\003\"\304\001\n\010LogBatch\022;\n\016operation_logs\030" +
      "\001 \003(\0132#.speech.training_cache.OperationL" +
      "og\022B\n\022event_written_logs\030\002 \003(\0132&.speech." +
      "training_cache.EventWrittenLog\0227\n\014counte" +
      "r_logs\030\003 \003(\0132!.speech.training_cache.Cou" +
      "nterLogB%\n\037com.google.speech.trainingcac" +
      "heH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.trainingcache.EventTypeOuterClass.getDescriptor(),
        });
    internal_static_speech_training_cache_Histogram_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_training_cache_Histogram_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_Histogram_descriptor,
        new java.lang.String[] { "Buckets", });
    internal_static_speech_training_cache_Histogram_BucketsEntry_descriptor =
      internal_static_speech_training_cache_Histogram_descriptor.getNestedTypes().get(0);
    internal_static_speech_training_cache_Histogram_BucketsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_Histogram_BucketsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_speech_training_cache_EventMetrics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_speech_training_cache_EventMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_EventMetrics_descriptor,
        new java.lang.String[] { "NumEvents", "NumBytesInTotal", "NumBytesHistogram", });
    internal_static_speech_training_cache_EventTypeMetrics_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_speech_training_cache_EventTypeMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_EventTypeMetrics_descriptor,
        new java.lang.String[] { "EventType", "Metrics", });
    internal_static_speech_training_cache_CacheMetrics_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_speech_training_cache_CacheMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_CacheMetrics_descriptor,
        new java.lang.String[] { "PolicyConfigVersion", "AllEventsMetrics", "EventTypeMetrics", "NumEventsCachedLifetime", "NumEventsDeletedLifetime", "NumBytesCachedLifetime", "NumBytesDeletedLifetime", "NumFilesCachedLifetime", "NumFilesDeletedLifetime", });
    internal_static_speech_training_cache_CleanupCycleSummary_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_speech_training_cache_CleanupCycleSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_CleanupCycleSummary_descriptor,
        new java.lang.String[] { "NumEventsCached", "NumEventsDeleted", "NumBytesCached", "NumBytesDeleted", "NumFilesCached", "NumFilesDeleted", "TtlOverduesSecHistogram", "CleanupTimeUsec", "CycleLengthUsec", });
    internal_static_speech_training_cache_OperationLog_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_speech_training_cache_OperationLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_OperationLog_descriptor,
        new java.lang.String[] { "Name", "Status", "IsError", "LatencyMs", });
    internal_static_speech_training_cache_EventWrittenLog_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_speech_training_cache_EventWrittenLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_EventWrittenLog_descriptor,
        new java.lang.String[] { "EventType", "EventSize", "FileSize", "BufferDelayMs", "WriteLatencyMs", "IsOverwrite", });
    internal_static_speech_training_cache_CounterLog_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_speech_training_cache_CounterLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_CounterLog_descriptor,
        new java.lang.String[] { "Name", "Key", "Increment", });
    internal_static_speech_training_cache_LogBatch_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_speech_training_cache_LogBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_training_cache_LogBatch_descriptor,
        new java.lang.String[] { "OperationLogs", "EventWrittenLogs", "CounterLogs", });
    com.google.speech.trainingcache.EventTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
