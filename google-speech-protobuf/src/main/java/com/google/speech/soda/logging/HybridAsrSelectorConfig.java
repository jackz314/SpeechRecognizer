// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.HybridAsrSelectorConfig}
 */
public final class HybridAsrSelectorConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.HybridAsrSelectorConfig)
    HybridAsrSelectorConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HybridAsrSelectorConfig.newBuilder() to construct.
  private HybridAsrSelectorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HybridAsrSelectorConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HybridAsrSelectorConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.HybridAsrSelectorConfig.class, com.google.speech.soda.logging.HybridAsrSelectorConfig.Builder.class);
  }

  private int bitField0_;
  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_;
  /**
   * <code>optional int32 mode = 1;</code>
   * @return Whether the mode field is set.
   */
  @java.lang.Override
  public boolean hasMode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 mode = 1;</code>
   * @return The mode.
   */
  @java.lang.Override
  public int getMode() {
    return mode_;
  }

  public static final int ON_DEVICE_CONFIDENCE_THRESHOLD_FIELD_NUMBER = 2;
  private float onDeviceConfidenceThreshold_;
  /**
   * <code>optional float on_device_confidence_threshold = 2;</code>
   * @return Whether the onDeviceConfidenceThreshold field is set.
   */
  @java.lang.Override
  public boolean hasOnDeviceConfidenceThreshold() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional float on_device_confidence_threshold = 2;</code>
   * @return The onDeviceConfidenceThreshold.
   */
  @java.lang.Override
  public float getOnDeviceConfidenceThreshold() {
    return onDeviceConfidenceThreshold_;
  }

  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HybridAsrSelectorConfig parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.HybridAsrSelectorConfig prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.HybridAsrSelectorConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.HybridAsrSelectorConfig)
      com.google.speech.soda.logging.HybridAsrSelectorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.HybridAsrSelectorConfig.class, com.google.speech.soda.logging.HybridAsrSelectorConfig.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.HybridAsrSelectorConfig.newBuilder()
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
      mode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      onDeviceConfidenceThreshold_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HybridAsrSelectorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HybridAsrSelectorConfig getDefaultInstanceForType() {
      return com.google.speech.soda.logging.HybridAsrSelectorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HybridAsrSelectorConfig build() {
      com.google.speech.soda.logging.HybridAsrSelectorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HybridAsrSelectorConfig buildPartial() {
      com.google.speech.soda.logging.HybridAsrSelectorConfig result = new com.google.speech.soda.logging.HybridAsrSelectorConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode_ = mode_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.onDeviceConfidenceThreshold_ = onDeviceConfidenceThreshold_;
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

    private int mode_ ;
    /**
     * <code>optional int32 mode = 1;</code>
     * @return Whether the mode field is set.
     */
    @java.lang.Override
    public boolean hasMode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 mode = 1;</code>
     * @return The mode.
     */
    @java.lang.Override
    public int getMode() {
      return mode_;
    }
    /**
     * <code>optional int32 mode = 1;</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(int value) {
      bitField0_ |= 0x00000001;
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
      onChanged();
      return this;
    }

    private float onDeviceConfidenceThreshold_ ;
    /**
     * <code>optional float on_device_confidence_threshold = 2;</code>
     * @return Whether the onDeviceConfidenceThreshold field is set.
     */
    @java.lang.Override
    public boolean hasOnDeviceConfidenceThreshold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float on_device_confidence_threshold = 2;</code>
     * @return The onDeviceConfidenceThreshold.
     */
    @java.lang.Override
    public float getOnDeviceConfidenceThreshold() {
      return onDeviceConfidenceThreshold_;
    }
    /**
     * <code>optional float on_device_confidence_threshold = 2;</code>
     * @param value The onDeviceConfidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setOnDeviceConfidenceThreshold(float value) {
      bitField0_ |= 0x00000002;
      onDeviceConfidenceThreshold_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float on_device_confidence_threshold = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnDeviceConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      onDeviceConfidenceThreshold_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.HybridAsrSelectorConfig)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.HybridAsrSelectorConfig)
  private static final com.google.speech.soda.logging.HybridAsrSelectorConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.HybridAsrSelectorConfig();
  }

  public static com.google.speech.soda.logging.HybridAsrSelectorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HybridAsrSelectorConfig>
      PARSER = new com.google.protobuf.AbstractParser<HybridAsrSelectorConfig>() {
    @java.lang.Override
    public HybridAsrSelectorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<HybridAsrSelectorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HybridAsrSelectorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.HybridAsrSelectorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

