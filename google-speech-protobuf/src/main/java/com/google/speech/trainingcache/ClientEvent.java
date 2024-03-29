// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/client_event.proto

package com.google.speech.trainingcache;

/**
 * Protobuf type {@code speech.training_cache.ClientEvent}
 */
public final class ClientEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.training_cache.ClientEvent)
    ClientEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientEvent.newBuilder() to construct.
  private ClientEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientEvent() {
    eventType_ = 0;
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.trainingcache.ClientEventOuterClass.internal_static_speech_training_cache_ClientEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.trainingcache.ClientEventOuterClass.internal_static_speech_training_cache_ClientEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.trainingcache.ClientEvent.class, com.google.speech.trainingcache.ClientEvent.Builder.class);
  }

  private int bitField0_;
  public static final int METADATA_FIELD_NUMBER = 1;
  private com.google.speech.trainingcache.EkhoMetadata metadata_;
  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.speech.trainingcache.EkhoMetadata getMetadata() {
    return metadata_ == null ? com.google.speech.trainingcache.EkhoMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.EkhoMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.google.speech.trainingcache.EkhoMetadata.getDefaultInstance() : metadata_;
  }

  public static final int EVENT_TYPE_FIELD_NUMBER = 2;
  private int eventType_;
  /**
   * <code>optional .speech.training_cache.EventType event_type = 2;</code>
   * @return Whether the eventType field is set.
   */
  @java.lang.Override public boolean hasEventType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .speech.training_cache.EventType event_type = 2;</code>
   * @return The eventType.
   */
  @java.lang.Override public com.google.speech.trainingcache.EventType getEventType() {
    @SuppressWarnings("deprecation")
    com.google.speech.trainingcache.EventType result = com.google.speech.trainingcache.EventType.valueOf(eventType_);
    return result == null ? com.google.speech.trainingcache.EventType.UNKNOWN : result;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>optional bytes payload = 3;</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional bytes payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.ClientEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.ClientEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.ClientEvent parseFrom(
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
  public static Builder newBuilder(com.google.speech.trainingcache.ClientEvent prototype) {
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
   * Protobuf type {@code speech.training_cache.ClientEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.training_cache.ClientEvent)
      com.google.speech.trainingcache.ClientEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.trainingcache.ClientEventOuterClass.internal_static_speech_training_cache_ClientEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.trainingcache.ClientEventOuterClass.internal_static_speech_training_cache_ClientEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.trainingcache.ClientEvent.class, com.google.speech.trainingcache.ClientEvent.Builder.class);
    }

    // Construct using com.google.speech.trainingcache.ClientEvent.newBuilder()
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
        getMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      eventType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.trainingcache.ClientEventOuterClass.internal_static_speech_training_cache_ClientEvent_descriptor;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.ClientEvent getDefaultInstanceForType() {
      return com.google.speech.trainingcache.ClientEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.trainingcache.ClientEvent build() {
      com.google.speech.trainingcache.ClientEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.ClientEvent buildPartial() {
      com.google.speech.trainingcache.ClientEvent result = new com.google.speech.trainingcache.ClientEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.eventType_ = eventType_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.payload_ = payload_;
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

    private com.google.speech.trainingcache.EkhoMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.trainingcache.EkhoMetadata, com.google.speech.trainingcache.EkhoMetadata.Builder, com.google.speech.trainingcache.EkhoMetadataOrBuilder> metadataBuilder_;
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     * @return The metadata.
     */
    public com.google.speech.trainingcache.EkhoMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.google.speech.trainingcache.EkhoMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public Builder setMetadata(com.google.speech.trainingcache.EkhoMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public Builder setMetadata(
        com.google.speech.trainingcache.EkhoMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public Builder mergeMetadata(com.google.speech.trainingcache.EkhoMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            metadata_ != null &&
            metadata_ != com.google.speech.trainingcache.EkhoMetadata.getDefaultInstance()) {
          metadata_ =
            com.google.speech.trainingcache.EkhoMetadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public com.google.speech.trainingcache.EkhoMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    public com.google.speech.trainingcache.EkhoMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.google.speech.trainingcache.EkhoMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>optional .speech.training_cache.EkhoMetadata metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.trainingcache.EkhoMetadata, com.google.speech.trainingcache.EkhoMetadata.Builder, com.google.speech.trainingcache.EkhoMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.trainingcache.EkhoMetadata, com.google.speech.trainingcache.EkhoMetadata.Builder, com.google.speech.trainingcache.EkhoMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private int eventType_ = 0;
    /**
     * <code>optional .speech.training_cache.EventType event_type = 2;</code>
     * @return Whether the eventType field is set.
     */
    @java.lang.Override public boolean hasEventType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .speech.training_cache.EventType event_type = 2;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.google.speech.trainingcache.EventType getEventType() {
      @SuppressWarnings("deprecation")
      com.google.speech.trainingcache.EventType result = com.google.speech.trainingcache.EventType.valueOf(eventType_);
      return result == null ? com.google.speech.trainingcache.EventType.UNKNOWN : result;
    }
    /**
     * <code>optional .speech.training_cache.EventType event_type = 2;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.google.speech.trainingcache.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .speech.training_cache.EventType event_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes payload = 3;</code>
     * @return Whether the payload field is set.
     */
    @java.lang.Override
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      payload_ = getDefaultInstance().getPayload();
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


    // @@protoc_insertion_point(builder_scope:speech.training_cache.ClientEvent)
  }

  // @@protoc_insertion_point(class_scope:speech.training_cache.ClientEvent)
  private static final com.google.speech.trainingcache.ClientEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.trainingcache.ClientEvent();
  }

  public static com.google.speech.trainingcache.ClientEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ClientEvent>
      PARSER = new com.google.protobuf.AbstractParser<ClientEvent>() {
    @java.lang.Override
    public ClientEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.trainingcache.ClientEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

