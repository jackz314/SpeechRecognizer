// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.HotwordTriggeredEvent}
 */
public final class HotwordTriggeredEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.HotwordTriggeredEvent)
    HotwordTriggeredEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotwordTriggeredEvent.newBuilder() to construct.
  private HotwordTriggeredEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotwordTriggeredEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotwordTriggeredEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.HotwordTriggeredEvent.class, com.google.speech.soda.logging.HotwordTriggeredEvent.Builder.class);
  }

  private int bitField0_;
  public static final int SPEAKER_ID_RESULT_FIELD_NUMBER = 1;
  private com.google.speech.soda.logging.SpeakerIdResult speakerIdResult_;
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
   * @return Whether the speakerIdResult field is set.
   */
  @java.lang.Override
  public boolean hasSpeakerIdResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
   * @return The speakerIdResult.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.SpeakerIdResult getSpeakerIdResult() {
    return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
  }
  /**
   * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.SpeakerIdResultOrBuilder getSpeakerIdResultOrBuilder() {
    return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
  }

  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordTriggeredEvent parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.HotwordTriggeredEvent prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.HotwordTriggeredEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.HotwordTriggeredEvent)
      com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.HotwordTriggeredEvent.class, com.google.speech.soda.logging.HotwordTriggeredEvent.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.HotwordTriggeredEvent.newBuilder()
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
        getSpeakerIdResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = null;
      } else {
        speakerIdResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordTriggeredEvent_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordTriggeredEvent getDefaultInstanceForType() {
      return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordTriggeredEvent build() {
      com.google.speech.soda.logging.HotwordTriggeredEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordTriggeredEvent buildPartial() {
      com.google.speech.soda.logging.HotwordTriggeredEvent result = new com.google.speech.soda.logging.HotwordTriggeredEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (speakerIdResultBuilder_ == null) {
          result.speakerIdResult_ = speakerIdResult_;
        } else {
          result.speakerIdResult_ = speakerIdResultBuilder_.build();
        }
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

    private com.google.speech.soda.logging.SpeakerIdResult speakerIdResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder> speakerIdResultBuilder_;
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     * @return Whether the speakerIdResult field is set.
     */
    public boolean hasSpeakerIdResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     * @return The speakerIdResult.
     */
    public com.google.speech.soda.logging.SpeakerIdResult getSpeakerIdResult() {
      if (speakerIdResultBuilder_ == null) {
        return speakerIdResult_ == null ? com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
      } else {
        return speakerIdResultBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public Builder setSpeakerIdResult(com.google.speech.soda.logging.SpeakerIdResult value) {
      if (speakerIdResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        speakerIdResult_ = value;
        onChanged();
      } else {
        speakerIdResultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public Builder setSpeakerIdResult(
        com.google.speech.soda.logging.SpeakerIdResult.Builder builderForValue) {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = builderForValue.build();
        onChanged();
      } else {
        speakerIdResultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public Builder mergeSpeakerIdResult(com.google.speech.soda.logging.SpeakerIdResult value) {
      if (speakerIdResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            speakerIdResult_ != null &&
            speakerIdResult_ != com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance()) {
          speakerIdResult_ =
            com.google.speech.soda.logging.SpeakerIdResult.newBuilder(speakerIdResult_).mergeFrom(value).buildPartial();
        } else {
          speakerIdResult_ = value;
        }
        onChanged();
      } else {
        speakerIdResultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public Builder clearSpeakerIdResult() {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResult_ = null;
        onChanged();
      } else {
        speakerIdResultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public com.google.speech.soda.logging.SpeakerIdResult.Builder getSpeakerIdResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpeakerIdResultFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    public com.google.speech.soda.logging.SpeakerIdResultOrBuilder getSpeakerIdResultOrBuilder() {
      if (speakerIdResultBuilder_ != null) {
        return speakerIdResultBuilder_.getMessageOrBuilder();
      } else {
        return speakerIdResult_ == null ?
            com.google.speech.soda.logging.SpeakerIdResult.getDefaultInstance() : speakerIdResult_;
      }
    }
    /**
     * <code>optional .logs.proto.speech.soda.SpeakerIdResult speaker_id_result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder> 
        getSpeakerIdResultFieldBuilder() {
      if (speakerIdResultBuilder_ == null) {
        speakerIdResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.SpeakerIdResult, com.google.speech.soda.logging.SpeakerIdResult.Builder, com.google.speech.soda.logging.SpeakerIdResultOrBuilder>(
                getSpeakerIdResult(),
                getParentForChildren(),
                isClean());
        speakerIdResult_ = null;
      }
      return speakerIdResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.HotwordTriggeredEvent)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.HotwordTriggeredEvent)
  private static final com.google.speech.soda.logging.HotwordTriggeredEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.HotwordTriggeredEvent();
  }

  public static com.google.speech.soda.logging.HotwordTriggeredEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HotwordTriggeredEvent>
      PARSER = new com.google.protobuf.AbstractParser<HotwordTriggeredEvent>() {
    @java.lang.Override
    public HotwordTriggeredEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotwordTriggeredEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotwordTriggeredEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.HotwordTriggeredEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
