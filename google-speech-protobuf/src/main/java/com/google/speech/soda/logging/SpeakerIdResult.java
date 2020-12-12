// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.SpeakerIdResult}
 */
public final class SpeakerIdResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.SpeakerIdResult)
    SpeakerIdResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeakerIdResult.newBuilder() to construct.
  private SpeakerIdResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeakerIdResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpeakerIdResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SpeakerIdResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.SpeakerIdResult.class, com.google.speech.soda.logging.SpeakerIdResult.Builder.class);
  }

  private int bitField0_;
  public static final int SPEAKER_PROFILE_COUNT_FIELD_NUMBER = 1;
  private int speakerProfileCount_;
  /**
   * <code>optional int32 speaker_profile_count = 1;</code>
   * @return Whether the speakerProfileCount field is set.
   */
  @java.lang.Override
  public boolean hasSpeakerProfileCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 speaker_profile_count = 1;</code>
   * @return The speakerProfileCount.
   */
  @java.lang.Override
  public int getSpeakerProfileCount() {
    return speakerProfileCount_;
  }

  public static final int TOP_SPEAKER_LABEL_FIELD_NUMBER = 2;
  private int topSpeakerLabel_;
  /**
   * <code>optional int32 top_speaker_label = 2;</code>
   * @return Whether the topSpeakerLabel field is set.
   */
  @java.lang.Override
  public boolean hasTopSpeakerLabel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 top_speaker_label = 2;</code>
   * @return The topSpeakerLabel.
   */
  @java.lang.Override
  public int getTopSpeakerLabel() {
    return topSpeakerLabel_;
  }

  public static final int TOP_SPEAKER_SCORE_FIELD_NUMBER = 3;
  private float topSpeakerScore_;
  /**
   * <code>optional float top_speaker_score = 3;</code>
   * @return Whether the topSpeakerScore field is set.
   */
  @java.lang.Override
  public boolean hasTopSpeakerScore() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional float top_speaker_score = 3;</code>
   * @return The topSpeakerScore.
   */
  @java.lang.Override
  public float getTopSpeakerScore() {
    return topSpeakerScore_;
  }

  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SpeakerIdResult parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.SpeakerIdResult prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.SpeakerIdResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.SpeakerIdResult)
      com.google.speech.soda.logging.SpeakerIdResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SpeakerIdResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.SpeakerIdResult.class, com.google.speech.soda.logging.SpeakerIdResult.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.SpeakerIdResult.newBuilder()
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
      speakerProfileCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      topSpeakerLabel_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      topSpeakerScore_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SpeakerIdResult_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SpeakerIdResult getDefaultInstanceForType() {
      return com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SpeakerIdResult build() {
      com.google.speech.soda.logging.SpeakerIdResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SpeakerIdResult buildPartial() {
      com.google.speech.soda.logging.SpeakerIdResult result = new com.google.speech.soda.logging.SpeakerIdResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.speakerProfileCount_ = speakerProfileCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topSpeakerLabel_ = topSpeakerLabel_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.topSpeakerScore_ = topSpeakerScore_;
        to_bitField0_ |= 0x00000004;
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

    private int speakerProfileCount_ ;
    /**
     * <code>optional int32 speaker_profile_count = 1;</code>
     * @return Whether the speakerProfileCount field is set.
     */
    @java.lang.Override
    public boolean hasSpeakerProfileCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 speaker_profile_count = 1;</code>
     * @return The speakerProfileCount.
     */
    @java.lang.Override
    public int getSpeakerProfileCount() {
      return speakerProfileCount_;
    }
    /**
     * <code>optional int32 speaker_profile_count = 1;</code>
     * @param value The speakerProfileCount to set.
     * @return This builder for chaining.
     */
    public Builder setSpeakerProfileCount(int value) {
      bitField0_ |= 0x00000001;
      speakerProfileCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 speaker_profile_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpeakerProfileCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      speakerProfileCount_ = 0;
      onChanged();
      return this;
    }

    private int topSpeakerLabel_ ;
    /**
     * <code>optional int32 top_speaker_label = 2;</code>
     * @return Whether the topSpeakerLabel field is set.
     */
    @java.lang.Override
    public boolean hasTopSpeakerLabel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 top_speaker_label = 2;</code>
     * @return The topSpeakerLabel.
     */
    @java.lang.Override
    public int getTopSpeakerLabel() {
      return topSpeakerLabel_;
    }
    /**
     * <code>optional int32 top_speaker_label = 2;</code>
     * @param value The topSpeakerLabel to set.
     * @return This builder for chaining.
     */
    public Builder setTopSpeakerLabel(int value) {
      bitField0_ |= 0x00000002;
      topSpeakerLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 top_speaker_label = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopSpeakerLabel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      topSpeakerLabel_ = 0;
      onChanged();
      return this;
    }

    private float topSpeakerScore_ ;
    /**
     * <code>optional float top_speaker_score = 3;</code>
     * @return Whether the topSpeakerScore field is set.
     */
    @java.lang.Override
    public boolean hasTopSpeakerScore() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float top_speaker_score = 3;</code>
     * @return The topSpeakerScore.
     */
    @java.lang.Override
    public float getTopSpeakerScore() {
      return topSpeakerScore_;
    }
    /**
     * <code>optional float top_speaker_score = 3;</code>
     * @param value The topSpeakerScore to set.
     * @return This builder for chaining.
     */
    public Builder setTopSpeakerScore(float value) {
      bitField0_ |= 0x00000004;
      topSpeakerScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float top_speaker_score = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopSpeakerScore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      topSpeakerScore_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.SpeakerIdResult)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.SpeakerIdResult)
  private static final com.google.speech.soda.logging.SpeakerIdResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.SpeakerIdResult();
  }

  public static com.google.speech.soda.logging.SpeakerIdResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SpeakerIdResult>
      PARSER = new com.google.protobuf.AbstractParser<SpeakerIdResult>() {
    @java.lang.Override
    public SpeakerIdResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeakerIdResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeakerIdResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.SpeakerIdResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
