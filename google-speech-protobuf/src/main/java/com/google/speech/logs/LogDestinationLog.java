// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/s3_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.LogDestinationLog}
 */
public final class LogDestinationLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.LogDestinationLog)
    LogDestinationLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogDestinationLog.newBuilder() to construct.
  private LogDestinationLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogDestinationLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogDestinationLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.S3OuterClass.internal_static_speech_logs_LogDestinationLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.S3OuterClass.internal_static_speech_logs_LogDestinationLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.LogDestinationLog.class, com.google.speech.logs.LogDestinationLog.Builder.class);
  }

  private int bitField0_;
  public static final int IS_AUDIO_HISTORY_LOGGED_FIELD_NUMBER = 1;
  private boolean isAudioHistoryLogged_;
  /**
   * <code>optional bool is_audio_history_logged = 1;</code>
   * @return Whether the isAudioHistoryLogged field is set.
   */
  @java.lang.Override
  public boolean hasIsAudioHistoryLogged() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool is_audio_history_logged = 1;</code>
   * @return The isAudioHistoryLogged.
   */
  @java.lang.Override
  public boolean getIsAudioHistoryLogged() {
    return isAudioHistoryLogged_;
  }

  public static com.google.speech.logs.LogDestinationLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.LogDestinationLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LogDestinationLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LogDestinationLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.LogDestinationLog prototype) {
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
   * Protobuf type {@code speech.logs.LogDestinationLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.LogDestinationLog)
      com.google.speech.logs.LogDestinationLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.S3OuterClass.internal_static_speech_logs_LogDestinationLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.S3OuterClass.internal_static_speech_logs_LogDestinationLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.LogDestinationLog.class, com.google.speech.logs.LogDestinationLog.Builder.class);
    }

    // Construct using com.google.speech.logs.LogDestinationLog.newBuilder()
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
      isAudioHistoryLogged_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.S3OuterClass.internal_static_speech_logs_LogDestinationLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.LogDestinationLog getDefaultInstanceForType() {
      return com.google.speech.logs.LogDestinationLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.LogDestinationLog build() {
      com.google.speech.logs.LogDestinationLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.LogDestinationLog buildPartial() {
      com.google.speech.logs.LogDestinationLog result = new com.google.speech.logs.LogDestinationLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isAudioHistoryLogged_ = isAudioHistoryLogged_;
        to_bitField0_ |= 0x00000001;
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

    private boolean isAudioHistoryLogged_ ;
    /**
     * <code>optional bool is_audio_history_logged = 1;</code>
     * @return Whether the isAudioHistoryLogged field is set.
     */
    @java.lang.Override
    public boolean hasIsAudioHistoryLogged() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool is_audio_history_logged = 1;</code>
     * @return The isAudioHistoryLogged.
     */
    @java.lang.Override
    public boolean getIsAudioHistoryLogged() {
      return isAudioHistoryLogged_;
    }
    /**
     * <code>optional bool is_audio_history_logged = 1;</code>
     * @param value The isAudioHistoryLogged to set.
     * @return This builder for chaining.
     */
    public Builder setIsAudioHistoryLogged(boolean value) {
      bitField0_ |= 0x00000001;
      isAudioHistoryLogged_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_audio_history_logged = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAudioHistoryLogged() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isAudioHistoryLogged_ = false;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.LogDestinationLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.LogDestinationLog)
  private static final com.google.speech.logs.LogDestinationLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.LogDestinationLog();
  }

  public static com.google.speech.logs.LogDestinationLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LogDestinationLog>
      PARSER = new com.google.protobuf.AbstractParser<LogDestinationLog>() {
    @java.lang.Override
    public LogDestinationLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogDestinationLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogDestinationLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.LogDestinationLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

