// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.HotwordModelInfo}
 */
public final class HotwordModelInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.HotwordModelInfo)
    HotwordModelInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotwordModelInfo.newBuilder() to construct.
  private HotwordModelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotwordModelInfo() {
    hotwordId_ = 0;
    modelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotwordModelInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordModelInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordModelInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.HotwordModelInfo.class, com.google.speech.soda.logging.HotwordModelInfo.Builder.class);
  }

  /**
   * Protobuf enum {@code logs.proto.speech.soda.HotwordModelInfo.HotwordId}
   */
  public enum HotwordId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>HOTWORD = 1;</code>
     */
    HOTWORD(1),
    /**
     * <code>STOPWORD = 2;</code>
     */
    STOPWORD(2),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>HOTWORD = 1;</code>
     */
    public static final int HOTWORD_VALUE = 1;
    /**
     * <code>STOPWORD = 2;</code>
     */
    public static final int STOPWORD_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HotwordId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HotwordId forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return HOTWORD;
        case 2: return STOPWORD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HotwordId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HotwordId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HotwordId>() {
            public HotwordId findValueByNumber(int number) {
              return HotwordId.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.speech.soda.logging.HotwordModelInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final HotwordId[] VALUES = values();

    public static HotwordId valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HotwordId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:logs.proto.speech.soda.HotwordModelInfo.HotwordId)
  }

  private int bitField0_;
  public static final int HOTWORD_ID_FIELD_NUMBER = 1;
  private int hotwordId_;
  /**
   * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
   * @return Whether the hotwordId field is set.
   */
  @java.lang.Override public boolean hasHotwordId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
   * @return The hotwordId.
   */
  @java.lang.Override public com.google.speech.soda.logging.HotwordModelInfo.HotwordId getHotwordId() {
    @SuppressWarnings("deprecation")
    com.google.speech.soda.logging.HotwordModelInfo.HotwordId result = com.google.speech.soda.logging.HotwordModelInfo.HotwordId.valueOf(hotwordId_);
    return result == null ? com.google.speech.soda.logging.HotwordModelInfo.HotwordId.UNKNOWN : result;
  }

  public static final int MODEL_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object modelId_;
  /**
   * <code>optional string model_id = 2;</code>
   * @return Whether the modelId field is set.
   */
  @java.lang.Override
  public boolean hasModelId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string model_id = 2;</code>
   * @return The modelId.
   */
  @java.lang.Override
  public java.lang.String getModelId() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        modelId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string model_id = 2;</code>
   * @return The bytes for modelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelIdBytes() {
    java.lang.Object ref = modelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordModelInfo parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.HotwordModelInfo prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.HotwordModelInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.HotwordModelInfo)
      com.google.speech.soda.logging.HotwordModelInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordModelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordModelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.HotwordModelInfo.class, com.google.speech.soda.logging.HotwordModelInfo.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.HotwordModelInfo.newBuilder()
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
      hotwordId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      modelId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordModelInfo_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordModelInfo getDefaultInstanceForType() {
      return com.google.speech.soda.logging.HotwordModelInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordModelInfo build() {
      com.google.speech.soda.logging.HotwordModelInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordModelInfo buildPartial() {
      com.google.speech.soda.logging.HotwordModelInfo result = new com.google.speech.soda.logging.HotwordModelInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.hotwordId_ = hotwordId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.modelId_ = modelId_;
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

    private int hotwordId_ = 0;
    /**
     * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
     * @return Whether the hotwordId field is set.
     */
    @java.lang.Override public boolean hasHotwordId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
     * @return The hotwordId.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HotwordModelInfo.HotwordId getHotwordId() {
      @SuppressWarnings("deprecation")
      com.google.speech.soda.logging.HotwordModelInfo.HotwordId result = com.google.speech.soda.logging.HotwordModelInfo.HotwordId.valueOf(hotwordId_);
      return result == null ? com.google.speech.soda.logging.HotwordModelInfo.HotwordId.UNKNOWN : result;
    }
    /**
     * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
     * @param value The hotwordId to set.
     * @return This builder for chaining.
     */
    public Builder setHotwordId(com.google.speech.soda.logging.HotwordModelInfo.HotwordId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      hotwordId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.HotwordModelInfo.HotwordId hotword_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHotwordId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hotwordId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object modelId_ = "";
    /**
     * <code>optional string model_id = 2;</code>
     * @return Whether the modelId field is set.
     */
    public boolean hasModelId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string model_id = 2;</code>
     * @return The modelId.
     */
    public java.lang.String getModelId() {
      java.lang.Object ref = modelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          modelId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string model_id = 2;</code>
     * @return The bytes for modelId.
     */
    public com.google.protobuf.ByteString
        getModelIdBytes() {
      java.lang.Object ref = modelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string model_id = 2;</code>
     * @param value The modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      modelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string model_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      modelId_ = getDefaultInstance().getModelId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string model_id = 2;</code>
     * @param value The bytes for modelId to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      modelId_ = value;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.HotwordModelInfo)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.HotwordModelInfo)
  private static final com.google.speech.soda.logging.HotwordModelInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.HotwordModelInfo();
  }

  public static com.google.speech.soda.logging.HotwordModelInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HotwordModelInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotwordModelInfo>() {
    @java.lang.Override
    public HotwordModelInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotwordModelInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotwordModelInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.HotwordModelInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

