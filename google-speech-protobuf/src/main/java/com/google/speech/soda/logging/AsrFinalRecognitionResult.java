// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.AsrFinalRecognitionResult}
 */
public final class AsrFinalRecognitionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.AsrFinalRecognitionResult)
    AsrFinalRecognitionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsrFinalRecognitionResult.newBuilder() to construct.
  private AsrFinalRecognitionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsrFinalRecognitionResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsrFinalRecognitionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.AsrFinalRecognitionResult.class, com.google.speech.soda.logging.AsrFinalRecognitionResult.Builder.class);
  }

  private int bitField0_;
  public static final int TIMING_METRICS_FIELD_NUMBER = 1;
  private com.google.speech.soda.logging.AsrTimingMetrics timingMetrics_;
  /**
   * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
   * @return Whether the timingMetrics field is set.
   */
  @java.lang.Override
  public boolean hasTimingMetrics() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
   * @return The timingMetrics.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.AsrTimingMetrics getTimingMetrics() {
    return timingMetrics_ == null ? com.google.speech.soda.logging.AsrTimingMetrics.getDefaultInstance() : timingMetrics_;
  }
  /**
   * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.AsrTimingMetricsOrBuilder getTimingMetricsOrBuilder() {
    return timingMetrics_ == null ? com.google.speech.soda.logging.AsrTimingMetrics.getDefaultInstance() : timingMetrics_;
  }

  public static final int SPEAKER_ID_RESULT_FIELD_NUMBER = 2;
  private com.google.speech.soda.logging.SpeakerIdResult speakerIdResult_;
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
   * @return Whether the speakerIdResult field is set.
   */
  @java.lang.Override
  public boolean hasSpeakerIdResult() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
   * @return The speakerIdResult.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.SpeakerIdResult getSpeakerIdResult() {
    return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
  }
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.SpeakerIdResultOrBuilder getSpeakerIdResultOrBuilder() {
    return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
  }

  public static final int TRIGGER_TYPE_FIELD_NUMBER = 3;
  private int triggerType_;
  /**
   * <code>optional int32 trigger_type = 3;</code>
   * @return Whether the triggerType field is set.
   */
  @java.lang.Override
  public boolean hasTriggerType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 trigger_type = 3;</code>
   * @return The triggerType.
   */
  @java.lang.Override
  public int getTriggerType() {
    return triggerType_;
  }

  public static final int UNICODE_LENGTH_FIELD_NUMBER = 4;
  private int unicodeLength_;
  /**
   * <code>optional int32 unicode_length = 4;</code>
   * @return Whether the unicodeLength field is set.
   */
  @java.lang.Override
  public boolean hasUnicodeLength() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int32 unicode_length = 4;</code>
   * @return The unicodeLength.
   */
  @java.lang.Override
  public int getUnicodeLength() {
    return unicodeLength_;
  }

  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.AsrFinalRecognitionResult parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.AsrFinalRecognitionResult prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.AsrFinalRecognitionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.AsrFinalRecognitionResult)
      com.google.speech.soda.logging.AsrFinalRecognitionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.AsrFinalRecognitionResult.class, com.google.speech.soda.logging.AsrFinalRecognitionResult.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.AsrFinalRecognitionResult.newBuilder()
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
        getTimingMetricsFieldBuilder();
        getSpeakerIdResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timingMetricsBuilder_ == null) {
        timingMetrics_ = null;
      } else {
        timingMetricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = null;
      } else {
        speakerIdResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      triggerType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      unicodeLength_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_AsrFinalRecognitionResult_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.AsrFinalRecognitionResult getDefaultInstanceForType() {
      return com.google.speech.soda.logging.AsrFinalRecognitionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.AsrFinalRecognitionResult build() {
      com.google.speech.soda.logging.AsrFinalRecognitionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.AsrFinalRecognitionResult buildPartial() {
      com.google.speech.soda.logging.AsrFinalRecognitionResult result = new com.google.speech.soda.logging.AsrFinalRecognitionResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (timingMetricsBuilder_ == null) {
          result.timingMetrics_ = timingMetrics_;
        } else {
          result.timingMetrics_ = timingMetricsBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (speakerIdResultBuilder_ == null) {
          result.speakerIdResult_ = speakerIdResult_;
        } else {
          result.speakerIdResult_ = speakerIdResultBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.triggerType_ = triggerType_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.unicodeLength_ = unicodeLength_;
        to_bitField0_ |= 0x00000008;
      }
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

    private com.google.speech.soda.logging.AsrTimingMetrics timingMetrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.AsrTimingMetrics, com.google.speech.soda.logging.AsrTimingMetrics.Builder, com.google.speech.soda.logging.AsrTimingMetricsOrBuilder> timingMetricsBuilder_;
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     * @return Whether the timingMetrics field is set.
     */
    public boolean hasTimingMetrics() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     * @return The timingMetrics.
     */
    public com.google.speech.soda.logging.AsrTimingMetrics getTimingMetrics() {
      if (timingMetricsBuilder_ == null) {
        return timingMetrics_ == null ? com.google.speech.soda.logging.AsrTimingMetrics.getDefaultInstance() : timingMetrics_;
      } else {
        return timingMetricsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public Builder setTimingMetrics(com.google.speech.soda.logging.AsrTimingMetrics value) {
      if (timingMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timingMetrics_ = value;
        onChanged();
      } else {
        timingMetricsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public Builder setTimingMetrics(
        com.google.speech.soda.logging.AsrTimingMetrics.Builder builderForValue) {
      if (timingMetricsBuilder_ == null) {
        timingMetrics_ = builderForValue.build();
        onChanged();
      } else {
        timingMetricsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public Builder mergeTimingMetrics(com.google.speech.soda.logging.AsrTimingMetrics value) {
      if (timingMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            timingMetrics_ != null &&
            timingMetrics_ != com.google.speech.soda.logging.AsrTimingMetrics.getDefaultInstance()) {
          timingMetrics_ =
            com.google.speech.soda.logging.AsrTimingMetrics.newBuilder(timingMetrics_).mergeFrom(value).buildPartial();
        } else {
          timingMetrics_ = value;
        }
        onChanged();
      } else {
        timingMetricsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public Builder clearTimingMetrics() {
      if (timingMetricsBuilder_ == null) {
        timingMetrics_ = null;
        onChanged();
      } else {
        timingMetricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public com.google.speech.soda.logging.AsrTimingMetrics.Builder getTimingMetricsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimingMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    public com.google.speech.soda.logging.AsrTimingMetricsOrBuilder getTimingMetricsOrBuilder() {
      if (timingMetricsBuilder_ != null) {
        return timingMetricsBuilder_.getMessageOrBuilder();
      } else {
        return timingMetrics_ == null ?
            com.google.speech.soda.logging.AsrTimingMetrics.getDefaultInstance() : timingMetrics_;
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.AsrTimingMetrics timing_metrics = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.AsrTimingMetrics, com.google.speech.soda.logging.AsrTimingMetrics.Builder, com.google.speech.soda.logging.AsrTimingMetricsOrBuilder> 
        getTimingMetricsFieldBuilder() {
      if (timingMetricsBuilder_ == null) {
        timingMetricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.AsrTimingMetrics, com.google.speech.soda.logging.AsrTimingMetrics.Builder, com.google.speech.soda.logging.AsrTimingMetricsOrBuilder>(
                getTimingMetrics(),
                getParentForChildren(),
                isClean());
        timingMetrics_ = null;
      }
      return timingMetricsBuilder_;
    }

    private com.google.speech.soda.logging.SpeakerIdResult speakerIdResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder> speakerIdResultBuilder_;
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     * @return Whether the speakerIdResult field is set.
     */
    public boolean hasSpeakerIdResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     * @return The speakerIdResult.
     */
    public com.google.speech.soda.logging.SpeakerIdResult getSpeakerIdResult() {
      if (speakerIdResultBuilder_ == null) {
        return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
      } else {
        return speakerIdResultBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public Builder setSpeakerIdResult(com.google.speech.soda.logging.SpeakerIdResult value) {
      if (speakerIdResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        speakerIdResult_ = value;
        onChanged();
      } else {
        speakerIdResultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public Builder setSpeakerIdResult(
        com.google.speech.soda.logging.SpeakerIdResult.Builder builderForValue) {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = builderForValue.build();
        onChanged();
      } else {
        speakerIdResultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public Builder mergeSpeakerIdResult(com.google.speech.soda.logging.SpeakerIdResult value) {
      if (speakerIdResultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            speakerIdResult_ != null &&
            speakerIdResult_ != com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance()) {
          speakerIdResult_ =
            com.google.speech.soda.logging.SpeakerIdResult.newBuilder(speakerIdResult_).mergeFrom(value).buildPartial();
        } else {
          speakerIdResult_ = value;
        }
        onChanged();
      } else {
        speakerIdResultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public Builder clearSpeakerIdResult() {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = null;
        onChanged();
      } else {
        speakerIdResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public com.google.speech.soda.logging.SpeakerIdResult.Builder getSpeakerIdResultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSpeakerIdResultFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    public com.google.speech.soda.logging.SpeakerIdResultOrBuilder getSpeakerIdResultOrBuilder() {
      if (speakerIdResultBuilder_ != null) {
        return speakerIdResultBuilder_.getMessageOrBuilder();
      } else {
        return speakerIdResult_ == null ?
            com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder> 
        getSpeakerIdResultFieldBuilder() {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder>(
                getSpeakerIdResult(),
                getParentForChildren(),
                isClean());
        speakerIdResult_ = null;
      }
      return speakerIdResultBuilder_;
    }

    private int triggerType_ ;
    /**
     * <code>optional int32 trigger_type = 3;</code>
     * @return Whether the triggerType field is set.
     */
    @java.lang.Override
    public boolean hasTriggerType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 trigger_type = 3;</code>
     * @return The triggerType.
     */
    @java.lang.Override
    public int getTriggerType() {
      return triggerType_;
    }
    /**
     * <code>optional int32 trigger_type = 3;</code>
     * @param value The triggerType to set.
     * @return This builder for chaining.
     */
    public Builder setTriggerType(int value) {
      bitField0_ |= 0x00000004;
      triggerType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 trigger_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTriggerType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      triggerType_ = 0;
      onChanged();
      return this;
    }

    private int unicodeLength_ ;
    /**
     * <code>optional int32 unicode_length = 4;</code>
     * @return Whether the unicodeLength field is set.
     */
    @java.lang.Override
    public boolean hasUnicodeLength() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 unicode_length = 4;</code>
     * @return The unicodeLength.
     */
    @java.lang.Override
    public int getUnicodeLength() {
      return unicodeLength_;
    }
    /**
     * <code>optional int32 unicode_length = 4;</code>
     * @param value The unicodeLength to set.
     * @return This builder for chaining.
     */
    public Builder setUnicodeLength(int value) {
      bitField0_ |= 0x00000008;
      unicodeLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 unicode_length = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnicodeLength() {
      bitField0_ = (bitField0_ & ~0x00000008);
      unicodeLength_ = 0;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.AsrFinalRecognitionResult)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.AsrFinalRecognitionResult)
  private static final com.google.speech.soda.logging.AsrFinalRecognitionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.AsrFinalRecognitionResult();
  }

  public static com.google.speech.soda.logging.AsrFinalRecognitionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AsrFinalRecognitionResult>
      PARSER = new com.google.protobuf.AbstractParser<AsrFinalRecognitionResult>() {
    @java.lang.Override
    public AsrFinalRecognitionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<AsrFinalRecognitionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsrFinalRecognitionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.AsrFinalRecognitionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
