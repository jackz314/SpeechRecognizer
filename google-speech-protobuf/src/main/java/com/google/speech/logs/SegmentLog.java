// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.SegmentLog}
 */
public final class SegmentLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.SegmentLog)
    SegmentLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SegmentLog.newBuilder() to construct.
  private SegmentLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SegmentLog() {
    olabelStr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SegmentLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_SegmentLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_SegmentLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.SegmentLog.class, com.google.speech.logs.SegmentLog.Builder.class);
  }

  private int bitField0_;
  public static final int START_FRAME_FIELD_NUMBER = 1;
  private int startFrame_;
  /**
   * <code>optional int32 start_frame = 1;</code>
   * @return Whether the startFrame field is set.
   */
  @java.lang.Override
  public boolean hasStartFrame() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 start_frame = 1;</code>
   * @return The startFrame.
   */
  @java.lang.Override
  public int getStartFrame() {
    return startFrame_;
  }

  public static final int END_FRAME_FIELD_NUMBER = 2;
  private int endFrame_;
  /**
   * <code>optional int32 end_frame = 2;</code>
   * @return Whether the endFrame field is set.
   */
  @java.lang.Override
  public boolean hasEndFrame() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 end_frame = 2;</code>
   * @return The endFrame.
   */
  @java.lang.Override
  public int getEndFrame() {
    return endFrame_;
  }

  public static final int OLABEL_STR_FIELD_NUMBER = 3;
  private volatile java.lang.Object olabelStr_;
  /**
   * <code>optional string olabel_str = 3;</code>
   * @return Whether the olabelStr field is set.
   */
  @java.lang.Override
  public boolean hasOlabelStr() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string olabel_str = 3;</code>
   * @return The olabelStr.
   */
  @java.lang.Override
  public java.lang.String getOlabelStr() {
    java.lang.Object ref = olabelStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        olabelStr_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string olabel_str = 3;</code>
   * @return The bytes for olabelStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOlabelStrBytes() {
    java.lang.Object ref = olabelStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      olabelStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.google.speech.logs.SegmentLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.SegmentLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.SegmentLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.SegmentLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.SegmentLog prototype) {
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
   * Protobuf type {@code speech.logs.SegmentLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.SegmentLog)
      com.google.speech.logs.SegmentLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_SegmentLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_SegmentLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.SegmentLog.class, com.google.speech.logs.SegmentLog.Builder.class);
    }

    // Construct using com.google.speech.logs.SegmentLog.newBuilder()
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
      startFrame_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      endFrame_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      olabelStr_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_SegmentLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.SegmentLog getDefaultInstanceForType() {
      return com.google.speech.logs.SegmentLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.SegmentLog build() {
      com.google.speech.logs.SegmentLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.SegmentLog buildPartial() {
      com.google.speech.logs.SegmentLog result = new com.google.speech.logs.SegmentLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startFrame_ = startFrame_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endFrame_ = endFrame_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.olabelStr_ = olabelStr_;
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

    private int startFrame_ ;
    /**
     * <code>optional int32 start_frame = 1;</code>
     * @return Whether the startFrame field is set.
     */
    @java.lang.Override
    public boolean hasStartFrame() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 start_frame = 1;</code>
     * @return The startFrame.
     */
    @java.lang.Override
    public int getStartFrame() {
      return startFrame_;
    }
    /**
     * <code>optional int32 start_frame = 1;</code>
     * @param value The startFrame to set.
     * @return This builder for chaining.
     */
    public Builder setStartFrame(int value) {
      bitField0_ |= 0x00000001;
      startFrame_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 start_frame = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartFrame() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startFrame_ = 0;
      onChanged();
      return this;
    }

    private int endFrame_ ;
    /**
     * <code>optional int32 end_frame = 2;</code>
     * @return Whether the endFrame field is set.
     */
    @java.lang.Override
    public boolean hasEndFrame() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 end_frame = 2;</code>
     * @return The endFrame.
     */
    @java.lang.Override
    public int getEndFrame() {
      return endFrame_;
    }
    /**
     * <code>optional int32 end_frame = 2;</code>
     * @param value The endFrame to set.
     * @return This builder for chaining.
     */
    public Builder setEndFrame(int value) {
      bitField0_ |= 0x00000002;
      endFrame_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 end_frame = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndFrame() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endFrame_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object olabelStr_ = "";
    /**
     * <code>optional string olabel_str = 3;</code>
     * @return Whether the olabelStr field is set.
     */
    public boolean hasOlabelStr() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string olabel_str = 3;</code>
     * @return The olabelStr.
     */
    public java.lang.String getOlabelStr() {
      java.lang.Object ref = olabelStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          olabelStr_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string olabel_str = 3;</code>
     * @return The bytes for olabelStr.
     */
    public com.google.protobuf.ByteString
        getOlabelStrBytes() {
      java.lang.Object ref = olabelStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        olabelStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string olabel_str = 3;</code>
     * @param value The olabelStr to set.
     * @return This builder for chaining.
     */
    public Builder setOlabelStr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      olabelStr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string olabel_str = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOlabelStr() {
      bitField0_ = (bitField0_ & ~0x00000004);
      olabelStr_ = getDefaultInstance().getOlabelStr();
      onChanged();
      return this;
    }
    /**
     * <code>optional string olabel_str = 3;</code>
     * @param value The bytes for olabelStr to set.
     * @return This builder for chaining.
     */
    public Builder setOlabelStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      olabelStr_ = value;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.SegmentLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.SegmentLog)
  private static final com.google.speech.logs.SegmentLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.SegmentLog();
  }

  public static com.google.speech.logs.SegmentLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SegmentLog>
      PARSER = new com.google.protobuf.AbstractParser<SegmentLog>() {
    @java.lang.Override
    public SegmentLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<SegmentLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SegmentLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.SegmentLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

