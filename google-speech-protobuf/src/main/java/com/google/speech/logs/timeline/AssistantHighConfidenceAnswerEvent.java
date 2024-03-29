// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

/**
 * Protobuf type {@code speech.logs.timeline.AssistantHighConfidenceAnswerEvent}
 */
public final class AssistantHighConfidenceAnswerEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.timeline.AssistantHighConfidenceAnswerEvent)
    AssistantHighConfidenceAnswerEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssistantHighConfidenceAnswerEvent.newBuilder() to construct.
  private AssistantHighConfidenceAnswerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssistantHighConfidenceAnswerEvent() {
    recognitionResult_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssistantHighConfidenceAnswerEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AssistantHighConfidenceAnswerEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AssistantHighConfidenceAnswerEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.class, com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.Builder.class);
  }

  private int bitField0_;
  public static final int RECOGNITION_RESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object recognitionResult_;
  /**
   * <code>optional string recognition_result = 1;</code>
   * @return Whether the recognitionResult field is set.
   */
  @java.lang.Override
  public boolean hasRecognitionResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string recognition_result = 1;</code>
   * @return The recognitionResult.
   */
  @java.lang.Override
  public java.lang.String getRecognitionResult() {
    java.lang.Object ref = recognitionResult_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        recognitionResult_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string recognition_result = 1;</code>
   * @return The bytes for recognitionResult.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecognitionResultBytes() {
    java.lang.Object ref = recognitionResult_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recognitionResult_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code speech.logs.timeline.AssistantHighConfidenceAnswerEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.timeline.AssistantHighConfidenceAnswerEvent)
      com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AssistantHighConfidenceAnswerEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AssistantHighConfidenceAnswerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.class, com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.Builder.class);
    }

    // Construct using com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      recognitionResult_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AssistantHighConfidenceAnswerEvent_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent getDefaultInstanceForType() {
      return com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent build() {
      com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent buildPartial() {
      com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent result = new com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.recognitionResult_ = recognitionResult_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.lang.Object recognitionResult_ = "";
    /**
     * <code>optional string recognition_result = 1;</code>
     * @return Whether the recognitionResult field is set.
     */
    public boolean hasRecognitionResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string recognition_result = 1;</code>
     * @return The recognitionResult.
     */
    public java.lang.String getRecognitionResult() {
      java.lang.Object ref = recognitionResult_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          recognitionResult_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string recognition_result = 1;</code>
     * @return The bytes for recognitionResult.
     */
    public com.google.protobuf.ByteString
        getRecognitionResultBytes() {
      java.lang.Object ref = recognitionResult_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recognitionResult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string recognition_result = 1;</code>
     * @param value The recognitionResult to set.
     * @return This builder for chaining.
     */
    public Builder setRecognitionResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      recognitionResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string recognition_result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecognitionResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recognitionResult_ = getDefaultInstance().getRecognitionResult();
      onChanged();
      return this;
    }
    /**
     * <code>optional string recognition_result = 1;</code>
     * @param value The bytes for recognitionResult to set.
     * @return This builder for chaining.
     */
    public Builder setRecognitionResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      recognitionResult_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:speech.logs.timeline.AssistantHighConfidenceAnswerEvent)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.timeline.AssistantHighConfidenceAnswerEvent)
  private static final com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent();
  }

  public static com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AssistantHighConfidenceAnswerEvent>
      PARSER = new com.google.protobuf.AbstractParser<AssistantHighConfidenceAnswerEvent>() {
    @java.lang.Override
    public AssistantHighConfidenceAnswerEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AssistantHighConfidenceAnswerEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssistantHighConfidenceAnswerEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.timeline.AssistantHighConfidenceAnswerEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

