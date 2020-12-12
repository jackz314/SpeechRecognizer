// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.OnDeviceAsrLogConfig}
 */
public final class OnDeviceAsrLogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.OnDeviceAsrLogConfig)
    OnDeviceAsrLogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnDeviceAsrLogConfig.newBuilder() to construct.
  private OnDeviceAsrLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnDeviceAsrLogConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnDeviceAsrLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_OnDeviceAsrLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_OnDeviceAsrLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.OnDeviceAsrLogConfig.class, com.google.speech.soda.logging.OnDeviceAsrLogConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 1;</code>
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int LANGUAGE_PACK_INFO_FIELD_NUMBER = 2;
  private com.google.speech.soda.logging.LanguagePackInfo languagePackInfo_;
  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   * @return Whether the languagePackInfo field is set.
   */
  @java.lang.Override
  public boolean hasLanguagePackInfo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   * @return The languagePackInfo.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.LanguagePackInfo getLanguagePackInfo() {
    return languagePackInfo_ == null ? com.google.speech.soda.logging.LanguagePackInfo.getDefaultInstance() : languagePackInfo_;
  }
  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.LanguagePackInfoOrBuilder getLanguagePackInfoOrBuilder() {
    return languagePackInfo_ == null ? com.google.speech.soda.logging.LanguagePackInfo.getDefaultInstance() : languagePackInfo_;
  }

  public static final int APPLICATION_DOMAIN_FIELD_NUMBER = 3;
  private int applicationDomain_;
  /**
   * <code>optional int32 application_domain = 3;</code>
   * @return Whether the applicationDomain field is set.
   */
  @java.lang.Override
  public boolean hasApplicationDomain() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 application_domain = 3;</code>
   * @return The applicationDomain.
   */
  @java.lang.Override
  public int getApplicationDomain() {
    return applicationDomain_;
  }

  public static final int LONGFORM_ENABLED_FIELD_NUMBER = 4;
  private boolean longformEnabled_;
  /**
   * <code>optional bool longform_enabled = 4;</code>
   * @return Whether the longformEnabled field is set.
   */
  @java.lang.Override
  public boolean hasLongformEnabled() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional bool longform_enabled = 4;</code>
   * @return The longformEnabled.
   */
  @java.lang.Override
  public boolean getLongformEnabled() {
    return longformEnabled_;
  }

  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.OnDeviceAsrLogConfig prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.OnDeviceAsrLogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.OnDeviceAsrLogConfig)
      com.google.speech.soda.logging.OnDeviceAsrLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_OnDeviceAsrLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_OnDeviceAsrLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.OnDeviceAsrLogConfig.class, com.google.speech.soda.logging.OnDeviceAsrLogConfig.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.OnDeviceAsrLogConfig.newBuilder()
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
        getLanguagePackInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (languagePackInfoBuilder_ == null) {
        languagePackInfo_ = null;
      } else {
        languagePackInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      applicationDomain_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      longformEnabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_OnDeviceAsrLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.OnDeviceAsrLogConfig getDefaultInstanceForType() {
      return com.google.speech.soda.logging.OnDeviceAsrLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.OnDeviceAsrLogConfig build() {
      com.google.speech.soda.logging.OnDeviceAsrLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.OnDeviceAsrLogConfig buildPartial() {
      com.google.speech.soda.logging.OnDeviceAsrLogConfig result = new com.google.speech.soda.logging.OnDeviceAsrLogConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (languagePackInfoBuilder_ == null) {
          result.languagePackInfo_ = languagePackInfo_;
        } else {
          result.languagePackInfo_ = languagePackInfoBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.applicationDomain_ = applicationDomain_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.longformEnabled_ = longformEnabled_;
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

    private boolean enabled_ ;
    /**
     * <code>optional bool enabled = 1;</code>
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      bitField0_ |= 0x00000001;
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.speech.soda.logging.LanguagePackInfo languagePackInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.LanguagePackInfo, com.google.speech.soda.logging.LanguagePackInfo.Builder, com.google.speech.soda.logging.LanguagePackInfoOrBuilder> languagePackInfoBuilder_;
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     * @return Whether the languagePackInfo field is set.
     */
    public boolean hasLanguagePackInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     * @return The languagePackInfo.
     */
    public com.google.speech.soda.logging.LanguagePackInfo getLanguagePackInfo() {
      if (languagePackInfoBuilder_ == null) {
        return languagePackInfo_ == null ? com.google.speech.soda.logging.LanguagePackInfo.getDefaultInstance() : languagePackInfo_;
      } else {
        return languagePackInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public Builder setLanguagePackInfo(com.google.speech.soda.logging.LanguagePackInfo value) {
      if (languagePackInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        languagePackInfo_ = value;
        onChanged();
      } else {
        languagePackInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public Builder setLanguagePackInfo(
        com.google.speech.soda.logging.LanguagePackInfo.Builder builderForValue) {
      if (languagePackInfoBuilder_ == null) {
        languagePackInfo_ = builderForValue.build();
        onChanged();
      } else {
        languagePackInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public Builder mergeLanguagePackInfo(com.google.speech.soda.logging.LanguagePackInfo value) {
      if (languagePackInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            languagePackInfo_ != null &&
            languagePackInfo_ != com.google.speech.soda.logging.LanguagePackInfo.getDefaultInstance()) {
          languagePackInfo_ =
            com.google.speech.soda.logging.LanguagePackInfo.newBuilder(languagePackInfo_).mergeFrom(value).buildPartial();
        } else {
          languagePackInfo_ = value;
        }
        onChanged();
      } else {
        languagePackInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public Builder clearLanguagePackInfo() {
      if (languagePackInfoBuilder_ == null) {
        languagePackInfo_ = null;
        onChanged();
      } else {
        languagePackInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public com.google.speech.soda.logging.LanguagePackInfo.Builder getLanguagePackInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLanguagePackInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    public com.google.speech.soda.logging.LanguagePackInfoOrBuilder getLanguagePackInfoOrBuilder() {
      if (languagePackInfoBuilder_ != null) {
        return languagePackInfoBuilder_.getMessageOrBuilder();
      } else {
        return languagePackInfo_ == null ?
            com.google.speech.soda.logging.LanguagePackInfo.getDefaultInstance() : languagePackInfo_;
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.LanguagePackInfo, com.google.speech.soda.logging.LanguagePackInfo.Builder, com.google.speech.soda.logging.LanguagePackInfoOrBuilder> 
        getLanguagePackInfoFieldBuilder() {
      if (languagePackInfoBuilder_ == null) {
        languagePackInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.LanguagePackInfo, com.google.speech.soda.logging.LanguagePackInfo.Builder, com.google.speech.soda.logging.LanguagePackInfoOrBuilder>(
                getLanguagePackInfo(),
                getParentForChildren(),
                isClean());
        languagePackInfo_ = null;
      }
      return languagePackInfoBuilder_;
    }

    private int applicationDomain_ ;
    /**
     * <code>optional int32 application_domain = 3;</code>
     * @return Whether the applicationDomain field is set.
     */
    @java.lang.Override
    public boolean hasApplicationDomain() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 application_domain = 3;</code>
     * @return The applicationDomain.
     */
    @java.lang.Override
    public int getApplicationDomain() {
      return applicationDomain_;
    }
    /**
     * <code>optional int32 application_domain = 3;</code>
     * @param value The applicationDomain to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationDomain(int value) {
      bitField0_ |= 0x00000004;
      applicationDomain_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 application_domain = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationDomain() {
      bitField0_ = (bitField0_ & ~0x00000004);
      applicationDomain_ = 0;
      onChanged();
      return this;
    }

    private boolean longformEnabled_ ;
    /**
     * <code>optional bool longform_enabled = 4;</code>
     * @return Whether the longformEnabled field is set.
     */
    @java.lang.Override
    public boolean hasLongformEnabled() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool longform_enabled = 4;</code>
     * @return The longformEnabled.
     */
    @java.lang.Override
    public boolean getLongformEnabled() {
      return longformEnabled_;
    }
    /**
     * <code>optional bool longform_enabled = 4;</code>
     * @param value The longformEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setLongformEnabled(boolean value) {
      bitField0_ |= 0x00000008;
      longformEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool longform_enabled = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongformEnabled() {
      bitField0_ = (bitField0_ & ~0x00000008);
      longformEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.OnDeviceAsrLogConfig)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.OnDeviceAsrLogConfig)
  private static final com.google.speech.soda.logging.OnDeviceAsrLogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.OnDeviceAsrLogConfig();
  }

  public static com.google.speech.soda.logging.OnDeviceAsrLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<OnDeviceAsrLogConfig>
      PARSER = new com.google.protobuf.AbstractParser<OnDeviceAsrLogConfig>() {
    @java.lang.Override
    public OnDeviceAsrLogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<OnDeviceAsrLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnDeviceAsrLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.OnDeviceAsrLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
