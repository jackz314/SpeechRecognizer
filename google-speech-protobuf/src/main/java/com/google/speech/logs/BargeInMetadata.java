// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.BargeInMetadata}
 */
public final class BargeInMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.BargeInMetadata)
    BargeInMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BargeInMetadata.newBuilder() to construct.
  private BargeInMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BargeInMetadata() {
    erasedAudioType_ = 1;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BargeInMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_BargeInMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_BargeInMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.BargeInMetadata.class, com.google.speech.logs.BargeInMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int ERASED_AUDIO_TYPE_FIELD_NUMBER = 1;
  private int erasedAudioType_;
  /**
   * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
   * @return Whether the erasedAudioType field is set.
   */
  @java.lang.Override public boolean hasErasedAudioType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
   * @return The erasedAudioType.
   */
  @java.lang.Override public com.google.speech.logs.BargeInErasedAudioType getErasedAudioType() {
    @SuppressWarnings("deprecation")
    com.google.speech.logs.BargeInErasedAudioType result = com.google.speech.logs.BargeInErasedAudioType.valueOf(erasedAudioType_);
    return result == null ? com.google.speech.logs.BargeInErasedAudioType.TTS : result;
  }

  public static final int IS_LATCHED_FIELD_NUMBER = 2;
  private boolean isLatched_;
  /**
   * <code>optional bool is_latched = 2;</code>
   * @return Whether the isLatched field is set.
   */
  @java.lang.Override
  public boolean hasIsLatched() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool is_latched = 2;</code>
   * @return The isLatched.
   */
  @java.lang.Override
  public boolean getIsLatched() {
    return isLatched_;
  }

  public static com.google.speech.logs.BargeInMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.BargeInMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.BargeInMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.BargeInMetadata parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.BargeInMetadata prototype) {
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
   * Protobuf type {@code speech.logs.BargeInMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.BargeInMetadata)
      com.google.speech.logs.BargeInMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_BargeInMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_BargeInMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.BargeInMetadata.class, com.google.speech.logs.BargeInMetadata.Builder.class);
    }

    // Construct using com.google.speech.logs.BargeInMetadata.newBuilder()
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
      erasedAudioType_ = 1;
      bitField0_ = (bitField0_ & ~0x00000001);
      isLatched_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_BargeInMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.BargeInMetadata getDefaultInstanceForType() {
      return com.google.speech.logs.BargeInMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.BargeInMetadata build() {
      com.google.speech.logs.BargeInMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.BargeInMetadata buildPartial() {
      com.google.speech.logs.BargeInMetadata result = new com.google.speech.logs.BargeInMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.erasedAudioType_ = erasedAudioType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isLatched_ = isLatched_;
        to_bitField0_ |= 0x00000002;
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

    private int erasedAudioType_ = 1;
    /**
     * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
     * @return Whether the erasedAudioType field is set.
     */
    @java.lang.Override public boolean hasErasedAudioType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
     * @return The erasedAudioType.
     */
    @java.lang.Override
    public com.google.speech.logs.BargeInErasedAudioType getErasedAudioType() {
      @SuppressWarnings("deprecation")
      com.google.speech.logs.BargeInErasedAudioType result = com.google.speech.logs.BargeInErasedAudioType.valueOf(erasedAudioType_);
      return result == null ? com.google.speech.logs.BargeInErasedAudioType.TTS : result;
    }
    /**
     * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
     * @param value The erasedAudioType to set.
     * @return This builder for chaining.
     */
    public Builder setErasedAudioType(com.google.speech.logs.BargeInErasedAudioType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      erasedAudioType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .speech.logs.BargeInErasedAudioType erased_audio_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearErasedAudioType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      erasedAudioType_ = 1;
      onChanged();
      return this;
    }

    private boolean isLatched_ ;
    /**
     * <code>optional bool is_latched = 2;</code>
     * @return Whether the isLatched field is set.
     */
    @java.lang.Override
    public boolean hasIsLatched() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool is_latched = 2;</code>
     * @return The isLatched.
     */
    @java.lang.Override
    public boolean getIsLatched() {
      return isLatched_;
    }
    /**
     * <code>optional bool is_latched = 2;</code>
     * @param value The isLatched to set.
     * @return This builder for chaining.
     */
    public Builder setIsLatched(boolean value) {
      bitField0_ |= 0x00000002;
      isLatched_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_latched = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLatched() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isLatched_ = false;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.BargeInMetadata)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.BargeInMetadata)
  private static final com.google.speech.logs.BargeInMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.BargeInMetadata();
  }

  public static com.google.speech.logs.BargeInMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BargeInMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BargeInMetadata>() {
    @java.lang.Override
    public BargeInMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BargeInMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BargeInMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.BargeInMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

