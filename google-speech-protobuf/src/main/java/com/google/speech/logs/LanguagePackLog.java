// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.LanguagePackLog}
 */
public final class LanguagePackLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.LanguagePackLog)
    LanguagePackLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguagePackLog.newBuilder() to construct.
  private LanguagePackLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguagePackLog() {
    locale_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanguagePackLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_LanguagePackLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_LanguagePackLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.LanguagePackLog.class, com.google.speech.logs.LanguagePackLog.Builder.class);
  }

  private int bitField0_;
  public static final int LOCALE_FIELD_NUMBER = 1;
  private volatile java.lang.Object locale_;
  /**
   * <code>optional string locale = 1 [deprecated = true];</code>
   * @return Whether the locale field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasLocale() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string locale = 1 [deprecated = true];</code>
   * @return The locale.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getLocale() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        locale_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string locale = 1 [deprecated = true];</code>
   * @return The bytes for locale.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getLocaleBytes() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>optional string version = 2;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        version_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECOGNIZER_MODEL_VERSION_FIELD_NUMBER = 3;
  private int recognizerModelVersion_;
  /**
   * <code>optional int32 recognizer_model_version = 3;</code>
   * @return Whether the recognizerModelVersion field is set.
   */
  @java.lang.Override
  public boolean hasRecognizerModelVersion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 recognizer_model_version = 3;</code>
   * @return The recognizerModelVersion.
   */
  @java.lang.Override
  public int getRecognizerModelVersion() {
    return recognizerModelVersion_;
  }

  public static com.google.speech.logs.LanguagePackLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.LanguagePackLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LanguagePackLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.LanguagePackLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.LanguagePackLog prototype) {
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
   * Protobuf type {@code speech.logs.LanguagePackLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.LanguagePackLog)
      com.google.speech.logs.LanguagePackLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_LanguagePackLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_LanguagePackLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.LanguagePackLog.class, com.google.speech.logs.LanguagePackLog.Builder.class);
    }

    // Construct using com.google.speech.logs.LanguagePackLog.newBuilder()
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
      locale_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      recognizerModelVersion_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_LanguagePackLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.LanguagePackLog getDefaultInstanceForType() {
      return com.google.speech.logs.LanguagePackLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.LanguagePackLog build() {
      com.google.speech.logs.LanguagePackLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.LanguagePackLog buildPartial() {
      com.google.speech.logs.LanguagePackLog result = new com.google.speech.logs.LanguagePackLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.locale_ = locale_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.version_ = version_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.recognizerModelVersion_ = recognizerModelVersion_;
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

    private java.lang.Object locale_ = "";
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @return Whether the locale field is set.
     */
    @java.lang.Deprecated public boolean hasLocale() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @return The locale.
     */
    @java.lang.Deprecated public java.lang.String getLocale() {
      java.lang.Object ref = locale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          locale_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @return The bytes for locale.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getLocaleBytes() {
      java.lang.Object ref = locale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @param value The locale to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setLocale(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      locale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearLocale() {
      bitField0_ = (bitField0_ & ~0x00000001);
      locale_ = getDefaultInstance().getLocale();
      onChanged();
      return this;
    }
    /**
     * <code>optional string locale = 1 [deprecated = true];</code>
     * @param value The bytes for locale to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      locale_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>optional string version = 2;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          version_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      version_ = value;
      onChanged();
      return this;
    }

    private int recognizerModelVersion_ ;
    /**
     * <code>optional int32 recognizer_model_version = 3;</code>
     * @return Whether the recognizerModelVersion field is set.
     */
    @java.lang.Override
    public boolean hasRecognizerModelVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 recognizer_model_version = 3;</code>
     * @return The recognizerModelVersion.
     */
    @java.lang.Override
    public int getRecognizerModelVersion() {
      return recognizerModelVersion_;
    }
    /**
     * <code>optional int32 recognizer_model_version = 3;</code>
     * @param value The recognizerModelVersion to set.
     * @return This builder for chaining.
     */
    public Builder setRecognizerModelVersion(int value) {
      bitField0_ |= 0x00000004;
      recognizerModelVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 recognizer_model_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecognizerModelVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      recognizerModelVersion_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.LanguagePackLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.LanguagePackLog)
  private static final com.google.speech.logs.LanguagePackLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.LanguagePackLog();
  }

  public static com.google.speech.logs.LanguagePackLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LanguagePackLog>
      PARSER = new com.google.protobuf.AbstractParser<LanguagePackLog>() {
    @java.lang.Override
    public LanguagePackLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<LanguagePackLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguagePackLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.LanguagePackLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

