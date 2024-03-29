// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public final class SodaEventLogOuterClass {
  private SodaEventLogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_SodaLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_SodaLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_SodaEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_SodaEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_InitEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_InitEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HotwordEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_OnDeviceAsrEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_OnDeviceAsrEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_SpeakerIdResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_AsrTimingMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_AsrTimingMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HybridAsrRecognitionEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HybridAsrRecognitionEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HybridAsrSessionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HybridAsrSessionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logs_proto_speech_soda_HybridAsrEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logs_proto_speech_soda_HybridAsrEventLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+logs/proto/speech/soda/soda_event_log." +
      "proto\022\026logs.proto.speech.soda\0322logs/prot" +
      "o/speech/soda/soda_event_log_config.prot" +
      "o\"\203\001\n\007SodaLog\022?\n\013soda_config\030\001 \001(\0132*.log" +
      "s.proto.speech.soda.SodaEventLogConfig\0227" +
      "\n\tevent_log\030\002 \001(\0132$.logs.proto.speech.so" +
      "da.SodaEventLog\"\254\002\n\014SodaEventLog\022>\n\016init" +
      "_event_log\030\002 \001(\0132$.logs.proto.speech.sod" +
      "a.InitEventLogH\000\022@\n\rhotword_event\030\003 \001(\0132" +
      "\'.logs.proto.speech.soda.HotwordEventLog" +
      "H\000\022J\n\023on_device_asr_event\030\004 \001(\0132+.logs.p" +
      "roto.speech.soda.OnDeviceAsrEventLogH\000\022E" +
      "\n\020hybrid_asr_event\030\005 \001(\0132).logs.proto.sp" +
      "eech.soda.HybridAsrEventLogH\000B\007\n\005event\"?" +
      "\n\014InitEventLog\022\030\n\020init_duration_ms\030\001 \001(\003" +
      "\022\025\n\rconfig_status\030\002 \001(\005\"[\n\025HotwordTrigge" +
      "redEvent\022B\n\021speaker_id_result\030\001 \001(\0132\'.lo" +
      "gs.proto.speech.soda.SpeakerIdResult\"t\n\017" +
      "HotwordEventLog\022P\n\027hotword_triggered_eve" +
      "nt\030\001 \001(\0132-.logs.proto.speech.soda.Hotwor" +
      "dTriggeredEventH\000B\017\n\rhotword_event\"\317\001\n\031A" +
      "srFinalRecognitionResult\022@\n\016timing_metri" +
      "cs\030\001 \001(\0132(.logs.proto.speech.soda.AsrTim" +
      "ingMetrics\022B\n\021speaker_id_result\030\002 \001(\0132\'." +
      "logs.proto.speech.soda.SpeakerIdResult\022\024" +
      "\n\014trigger_type\030\003 \001(\005\022\026\n\016unicode_length\030\004" +
      " \001(\005\"\203\001\n\023OnDeviceAsrEventLog\022U\n\030final_re" +
      "cognition_result\030\001 \001(\01321.logs.proto.spee" +
      "ch.soda.AsrFinalRecognitionResultH\000B\025\n\023o" +
      "n_device_asr_event\"f\n\017SpeakerIdResult\022\035\n" +
      "\025speaker_profile_count\030\001 \001(\005\022\031\n\021top_spea" +
      "ker_label\030\002 \001(\005\022\031\n\021top_speaker_score\030\003 \001" +
      "(\002\"\211\001\n\020AsrTimingMetrics\022\035\n\025event_start_t" +
      "ime_usec\030\001 \001(\003\022\033\n\023event_end_time_usec\030\002 " +
      "\001(\003\022\025\n\rpreamble_msec\030\003 \001(\003\022\"\n\032estimated_" +
      "eos_latency_msec\030\004 \001(\003\"O\n\027HybridAsrSelec" +
      "torConfig\022\014\n\004mode\030\001 \001(\005\022&\n\036on_device_con" +
      "fidence_threshold\030\002 \001(\002\"\315\001\n\031HybridAsrRec" +
      "ognitionEvent\022D\n\004type\030\001 \001(\01626.logs.proto" +
      ".speech.soda.HybridAsrRecognitionEvent.T" +
      "ype\022\031\n\021hypothesis_length\030\002 \001(\005\022\024\n\014timest" +
      "amp_ms\030\003 \001(\003\"9\n\004Type\022\013\n\007UNKNOWN\020\000\022\013\n\007PAR" +
      "TIAL\020\001\022\014\n\010PREFETCH\020\002\022\t\n\005FINAL\020\003\"\317\003\n\026Hybr" +
      "idAsrSessionResult\022O\n\024last_on_device_eve" +
      "nt\030\001 \001(\01321.logs.proto.speech.soda.Hybrid" +
      "AsrRecognitionEvent\022L\n\021last_server_event" +
      "\030\002 \001(\01321.logs.proto.speech.soda.HybridAs" +
      "rRecognitionEvent\022C\n\016partial_source\030\003 \001(" +
      "\0162+.logs.proto.speech.soda.HybridAsrSour" +
      "ceType\022D\n\017prefetch_source\030\004 \001(\0162+.logs.p" +
      "roto.speech.soda.HybridAsrSourceType\022A\n\014" +
      "final_source\030\005 \001(\0162+.logs.proto.speech.s" +
      "oda.HybridAsrSourceType\022H\n\017selector_conf" +
      "ig\030\006 \001(\0132/.logs.proto.speech.soda.Hybrid" +
      "AsrSelectorConfig\"q\n\021HybridAsrEventLog\022H" +
      "\n\016session_result\030\001 \001(\0132..logs.proto.spee" +
      "ch.soda.HybridAsrSessionResultH\000B\022\n\020hybr" +
      "id_asr_event*=\n\023HybridAsrSourceType\022\013\n\007U" +
      "NKNOWN\020\000\022\r\n\tON_DEVICE\020\001\022\n\n\006SERVER\020\002B$\n\036c" +
      "om.google.speech.soda.loggingH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.soda.logging.SodaEventLogConfigOuterClass.getDescriptor(),
        });
    internal_static_logs_proto_speech_soda_SodaLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_logs_proto_speech_soda_SodaLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_SodaLog_descriptor,
        new java.lang.String[] { "SodaConfig", "EventLog", });
    internal_static_logs_proto_speech_soda_SodaEventLog_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_logs_proto_speech_soda_SodaEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_SodaEventLog_descriptor,
        new java.lang.String[] { "InitEventLog", "HotwordEvent", "OnDeviceAsrEvent", "HybridAsrEvent", "Event", });
    internal_static_logs_proto_speech_soda_InitEventLog_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_logs_proto_speech_soda_InitEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_InitEventLog_descriptor,
        new java.lang.String[] { "InitDurationMs", "ConfigStatus", });
    internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor,
        new java.lang.String[] { "SpeakerIdResult", });
    internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_logs_proto_speech_soda_HotwordEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor,
        new java.lang.String[] { "HotwordTriggeredEvent", "HotwordEvent", });
    internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor,
        new java.lang.String[] { "TimingMetrics", "SpeakerIdResult", "TriggerType", "UnicodeLength", });
    internal_static_logs_proto_speech_soda_OnDeviceAsrEventLog_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_logs_proto_speech_soda_OnDeviceAsrEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_OnDeviceAsrEventLog_descriptor,
        new java.lang.String[] { "FinalRecognitionResult", "OnDeviceAsrEvent", });
    internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_logs_proto_speech_soda_SpeakerIdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor,
        new java.lang.String[] { "SpeakerProfileCount", "TopSpeakerLabel", "TopSpeakerScore", });
    internal_static_logs_proto_speech_soda_AsrTimingMetrics_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_logs_proto_speech_soda_AsrTimingMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_AsrTimingMetrics_descriptor,
        new java.lang.String[] { "EventStartTimeUsec", "EventEndTimeUsec", "PreambleMsec", "EstimatedEosLatencyMsec", });
    internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor,
        new java.lang.String[] { "Mode", "OnDeviceConfidenceThreshold", });
    internal_static_logs_proto_speech_soda_HybridAsrRecognitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_logs_proto_speech_soda_HybridAsrRecognitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HybridAsrRecognitionEvent_descriptor,
        new java.lang.String[] { "Type", "HypothesisLength", "TimestampMs", });
    internal_static_logs_proto_speech_soda_HybridAsrSessionResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_logs_proto_speech_soda_HybridAsrSessionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HybridAsrSessionResult_descriptor,
        new java.lang.String[] { "LastOnDeviceEvent", "LastServerEvent", "PartialSource", "PrefetchSource", "FinalSource", "SelectorConfig", });
    internal_static_logs_proto_speech_soda_HybridAsrEventLog_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_logs_proto_speech_soda_HybridAsrEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logs_proto_speech_soda_HybridAsrEventLog_descriptor,
        new java.lang.String[] { "SessionResult", "HybridAsrEvent", });
    com.google.speech.soda.logging.SodaEventLogConfigOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
