// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.E2EDynamicClassTwiddlerLog}
 */
public final class E2EDynamicClassTwiddlerLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.E2EDynamicClassTwiddlerLog)
    E2EDynamicClassTwiddlerLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use E2EDynamicClassTwiddlerLog.newBuilder() to construct.
  private E2EDynamicClassTwiddlerLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private E2EDynamicClassTwiddlerLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new E2EDynamicClassTwiddlerLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_E2EDynamicClassTwiddlerLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_E2EDynamicClassTwiddlerLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.E2EDynamicClassTwiddlerLog.class, com.google.speech.logs.E2EDynamicClassTwiddlerLog.Builder.class);
  }

  private int bitField0_;
  public static final int REPLACE_LATENCY_MS_FIELD_NUMBER = 1;
  private int replaceLatencyMs_;
  /**
   * <code>optional int32 replace_latency_ms = 1;</code>
   * @return Whether the replaceLatencyMs field is set.
   */
  @java.lang.Override
  public boolean hasReplaceLatencyMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 replace_latency_ms = 1;</code>
   * @return The replaceLatencyMs.
   */
  @java.lang.Override
  public int getReplaceLatencyMs() {
    return replaceLatencyMs_;
  }

  public static final int COMPLETE_TWIDDLER_LATENCY_MS_FIELD_NUMBER = 2;
  private int completeTwiddlerLatencyMs_;
  /**
   * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
   * @return Whether the completeTwiddlerLatencyMs field is set.
   */
  @java.lang.Override
  public boolean hasCompleteTwiddlerLatencyMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
   * @return The completeTwiddlerLatencyMs.
   */
  @java.lang.Override
  public int getCompleteTwiddlerLatencyMs() {
    return completeTwiddlerLatencyMs_;
  }

  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.E2EDynamicClassTwiddlerLog prototype) {
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
   * Protobuf type {@code speech.logs.E2EDynamicClassTwiddlerLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.E2EDynamicClassTwiddlerLog)
      com.google.speech.logs.E2EDynamicClassTwiddlerLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_E2EDynamicClassTwiddlerLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_E2EDynamicClassTwiddlerLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.E2EDynamicClassTwiddlerLog.class, com.google.speech.logs.E2EDynamicClassTwiddlerLog.Builder.class);
    }

    // Construct using com.google.speech.logs.E2EDynamicClassTwiddlerLog.newBuilder()
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
      replaceLatencyMs_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      completeTwiddlerLatencyMs_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_E2EDynamicClassTwiddlerLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.E2EDynamicClassTwiddlerLog getDefaultInstanceForType() {
      return com.google.speech.logs.E2EDynamicClassTwiddlerLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.E2EDynamicClassTwiddlerLog build() {
      com.google.speech.logs.E2EDynamicClassTwiddlerLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.E2EDynamicClassTwiddlerLog buildPartial() {
      com.google.speech.logs.E2EDynamicClassTwiddlerLog result = new com.google.speech.logs.E2EDynamicClassTwiddlerLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.replaceLatencyMs_ = replaceLatencyMs_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.completeTwiddlerLatencyMs_ = completeTwiddlerLatencyMs_;
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

    private int replaceLatencyMs_ ;
    /**
     * <code>optional int32 replace_latency_ms = 1;</code>
     * @return Whether the replaceLatencyMs field is set.
     */
    @java.lang.Override
    public boolean hasReplaceLatencyMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 replace_latency_ms = 1;</code>
     * @return The replaceLatencyMs.
     */
    @java.lang.Override
    public int getReplaceLatencyMs() {
      return replaceLatencyMs_;
    }
    /**
     * <code>optional int32 replace_latency_ms = 1;</code>
     * @param value The replaceLatencyMs to set.
     * @return This builder for chaining.
     */
    public Builder setReplaceLatencyMs(int value) {
      bitField0_ |= 0x00000001;
      replaceLatencyMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 replace_latency_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplaceLatencyMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      replaceLatencyMs_ = 0;
      onChanged();
      return this;
    }

    private int completeTwiddlerLatencyMs_ ;
    /**
     * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
     * @return Whether the completeTwiddlerLatencyMs field is set.
     */
    @java.lang.Override
    public boolean hasCompleteTwiddlerLatencyMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
     * @return The completeTwiddlerLatencyMs.
     */
    @java.lang.Override
    public int getCompleteTwiddlerLatencyMs() {
      return completeTwiddlerLatencyMs_;
    }
    /**
     * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
     * @param value The completeTwiddlerLatencyMs to set.
     * @return This builder for chaining.
     */
    public Builder setCompleteTwiddlerLatencyMs(int value) {
      bitField0_ |= 0x00000002;
      completeTwiddlerLatencyMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 complete_twiddler_latency_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompleteTwiddlerLatencyMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      completeTwiddlerLatencyMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.E2EDynamicClassTwiddlerLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.E2EDynamicClassTwiddlerLog)
  private static final com.google.speech.logs.E2EDynamicClassTwiddlerLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.E2EDynamicClassTwiddlerLog();
  }

  public static com.google.speech.logs.E2EDynamicClassTwiddlerLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<E2EDynamicClassTwiddlerLog>
      PARSER = new com.google.protobuf.AbstractParser<E2EDynamicClassTwiddlerLog>() {
    @java.lang.Override
    public E2EDynamicClassTwiddlerLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<E2EDynamicClassTwiddlerLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<E2EDynamicClassTwiddlerLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.E2EDynamicClassTwiddlerLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

