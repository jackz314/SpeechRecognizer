// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/i18n/lm/punctuation/text_segmentation/basic_text_segmenter_config.proto

package speech_formatting;

public final class BasicTextSegmenterConfigOuterClass {
  private BasicTextSegmenterConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_formatting_BasicTextSegmenterConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_formatting_BasicTextSegmenterConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNspeech/i18n/lm/punctuation/text_segmen" +
      "tation/basic_text_segmenter_config.proto" +
      "\022\021speech_formatting\"\363\001\n\030BasicTextSegment" +
      "erConfig\022\035\n\025supported_punctuation\030\001 \003(\t\022" +
      "#\n\033end_of_sentence_punctuation\030\002 \003(\t\022I\n\n" +
      "segment_by\030\003 \001(\01625.speech_formatting.Bas" +
      "icTextSegmenterConfig.SegmentBy\"H\n\tSegme" +
      "ntBy\022\r\n\tUNDEFINED\020\000\022\025\n\021SIMPLE_WHITESPACE" +
      "\020\001\022\025\n\021UNICODE_CHARACTER\020\002B\004H\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_speech_formatting_BasicTextSegmenterConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_formatting_BasicTextSegmenterConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_formatting_BasicTextSegmenterConfig_descriptor,
        new java.lang.String[] { "SupportedPunctuation", "EndOfSentencePunctuation", "SegmentBy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
