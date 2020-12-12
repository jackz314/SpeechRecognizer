// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.HotwordLogConfig}
 */
public final class HotwordLogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.HotwordLogConfig)
    HotwordLogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotwordLogConfig.newBuilder() to construct.
  private HotwordLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotwordLogConfig() {
    hotwordModelInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotwordLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.HotwordLogConfig.class, com.google.speech.soda.logging.HotwordLogConfig.Builder.class);
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

  public static final int HOTWORD_MODEL_INFO_FIELD_NUMBER = 2;
  private java.util.List<com.google.speech.soda.logging.HotwordModelInfo> hotwordModelInfo_;
  /**
   * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.soda.logging.HotwordModelInfo> getHotwordModelInfoList() {
    return hotwordModelInfo_;
  }
  /**
   * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.soda.logging.HotwordModelInfoOrBuilder> 
      getHotwordModelInfoOrBuilderList() {
    return hotwordModelInfo_;
  }
  /**
   * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
   */
  @java.lang.Override
  public int getHotwordModelInfoCount() {
    return hotwordModelInfo_.size();
  }
  /**
   * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordModelInfo getHotwordModelInfo(int index) {
    return hotwordModelInfo_.get(index);
  }
  /**
   * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordModelInfoOrBuilder getHotwordModelInfoOrBuilder(
      int index) {
    return hotwordModelInfo_.get(index);
  }

  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordLogConfig parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.HotwordLogConfig prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.HotwordLogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.HotwordLogConfig)
      com.google.speech.soda.logging.HotwordLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.HotwordLogConfig.class, com.google.speech.soda.logging.HotwordLogConfig.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.HotwordLogConfig.newBuilder()
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
        getHotwordModelInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (hotwordModelInfoBuilder_ == null) {
        hotwordModelInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        hotwordModelInfoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogConfigOuterClass.internal_static_logs_proto_speech_soda_HotwordLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordLogConfig getDefaultInstanceForType() {
      return com.google.speech.soda.logging.HotwordLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordLogConfig build() {
      com.google.speech.soda.logging.HotwordLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordLogConfig buildPartial() {
      com.google.speech.soda.logging.HotwordLogConfig result = new com.google.speech.soda.logging.HotwordLogConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (hotwordModelInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          hotwordModelInfo_ = java.util.Collections.unmodifiableList(hotwordModelInfo_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.hotwordModelInfo_ = hotwordModelInfo_;
      } else {
        result.hotwordModelInfo_ = hotwordModelInfoBuilder_.build();
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

    private java.util.List<com.google.speech.soda.logging.HotwordModelInfo> hotwordModelInfo_ =
      java.util.Collections.emptyList();
    private void ensureHotwordModelInfoIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        hotwordModelInfo_ = new java.util.ArrayList<com.google.speech.soda.logging.HotwordModelInfo>(hotwordModelInfo_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.soda.logging.HotwordModelInfo, com.google.speech.soda.logging.HotwordModelInfo.Builder, com.google.speech.soda.logging.HotwordModelInfoOrBuilder> hotwordModelInfoBuilder_;

    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public java.util.List<com.google.speech.soda.logging.HotwordModelInfo> getHotwordModelInfoList() {
      if (hotwordModelInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hotwordModelInfo_);
      } else {
        return hotwordModelInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public int getHotwordModelInfoCount() {
      if (hotwordModelInfoBuilder_ == null) {
        return hotwordModelInfo_.size();
      } else {
        return hotwordModelInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public com.google.speech.soda.logging.HotwordModelInfo getHotwordModelInfo(int index) {
      if (hotwordModelInfoBuilder_ == null) {
        return hotwordModelInfo_.get(index);
      } else {
        return hotwordModelInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder setHotwordModelInfo(
        int index, com.google.speech.soda.logging.HotwordModelInfo value) {
      if (hotwordModelInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.set(index, value);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder setHotwordModelInfo(
        int index, com.google.speech.soda.logging.HotwordModelInfo.Builder builderForValue) {
      if (hotwordModelInfoBuilder_ == null) {
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        hotwordModelInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder addHotwordModelInfo(com.google.speech.soda.logging.HotwordModelInfo value) {
      if (hotwordModelInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.add(value);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder addHotwordModelInfo(
        int index, com.google.speech.soda.logging.HotwordModelInfo value) {
      if (hotwordModelInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.add(index, value);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder addHotwordModelInfo(
        com.google.speech.soda.logging.HotwordModelInfo.Builder builderForValue) {
      if (hotwordModelInfoBuilder_ == null) {
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.add(builderForValue.build());
        onChanged();
      } else {
        hotwordModelInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder addHotwordModelInfo(
        int index, com.google.speech.soda.logging.HotwordModelInfo.Builder builderForValue) {
      if (hotwordModelInfoBuilder_ == null) {
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        hotwordModelInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder addAllHotwordModelInfo(
        java.lang.Iterable<? extends com.google.speech.soda.logging.HotwordModelInfo> values) {
      if (hotwordModelInfoBuilder_ == null) {
        ensureHotwordModelInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hotwordModelInfo_);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder clearHotwordModelInfo() {
      if (hotwordModelInfoBuilder_ == null) {
        hotwordModelInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public Builder removeHotwordModelInfo(int index) {
      if (hotwordModelInfoBuilder_ == null) {
        ensureHotwordModelInfoIsMutable();
        hotwordModelInfo_.remove(index);
        onChanged();
      } else {
        hotwordModelInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public com.google.speech.soda.logging.HotwordModelInfo.Builder getHotwordModelInfoBuilder(
        int index) {
      return getHotwordModelInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public com.google.speech.soda.logging.HotwordModelInfoOrBuilder getHotwordModelInfoOrBuilder(
        int index) {
      if (hotwordModelInfoBuilder_ == null) {
        return hotwordModelInfo_.get(index);  } else {
        return hotwordModelInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public java.util.List<? extends com.google.speech.soda.logging.HotwordModelInfoOrBuilder> 
         getHotwordModelInfoOrBuilderList() {
      if (hotwordModelInfoBuilder_ != null) {
        return hotwordModelInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hotwordModelInfo_);
      }
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public com.google.speech.soda.logging.HotwordModelInfo.Builder addHotwordModelInfoBuilder() {
      return getHotwordModelInfoFieldBuilder().addBuilder(
          com.google.speech.soda.logging.HotwordModelInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public com.google.speech.soda.logging.HotwordModelInfo.Builder addHotwordModelInfoBuilder(
        int index) {
      return getHotwordModelInfoFieldBuilder().addBuilder(
          index, com.google.speech.soda.logging.HotwordModelInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .logs.proto.speech.soda.HotwordModelInfo hotword_model_info = 2;</code>
     */
    public java.util.List<com.google.speech.soda.logging.HotwordModelInfo.Builder> 
         getHotwordModelInfoBuilderList() {
      return getHotwordModelInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.soda.logging.HotwordModelInfo, com.google.speech.soda.logging.HotwordModelInfo.Builder, com.google.speech.soda.logging.HotwordModelInfoOrBuilder> 
        getHotwordModelInfoFieldBuilder() {
      if (hotwordModelInfoBuilder_ == null) {
        hotwordModelInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.soda.logging.HotwordModelInfo, com.google.speech.soda.logging.HotwordModelInfo.Builder, com.google.speech.soda.logging.HotwordModelInfoOrBuilder>(
                hotwordModelInfo_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        hotwordModelInfo_ = null;
      }
      return hotwordModelInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.HotwordLogConfig)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.HotwordLogConfig)
  private static final com.google.speech.soda.logging.HotwordLogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.HotwordLogConfig();
  }

  public static com.google.speech.soda.logging.HotwordLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HotwordLogConfig>
      PARSER = new com.google.protobuf.AbstractParser<HotwordLogConfig>() {
    @java.lang.Override
    public HotwordLogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotwordLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotwordLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.HotwordLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

