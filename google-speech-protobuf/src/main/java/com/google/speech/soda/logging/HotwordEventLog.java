// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.HotwordEventLog}
 */
public final class HotwordEventLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.HotwordEventLog)
    HotwordEventLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotwordEventLog.newBuilder() to construct.
  private HotwordEventLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotwordEventLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotwordEventLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordEventLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.HotwordEventLog.class, com.google.speech.soda.logging.HotwordEventLog.Builder.class);
  }

  private int bitField0_;
  private int hotwordEventCase_ = 0;
  private java.lang.Object hotwordEvent_;
  public enum HotwordEventCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HOTWORD_TRIGGERED_EVENT(1),
    HOTWORDEVENT_NOT_SET(0);
    private final int value;
    private HotwordEventCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HotwordEventCase valueOf(int value) {
      return forNumber(value);
    }

    public static HotwordEventCase forNumber(int value) {
      switch (value) {
        case 1: return HOTWORD_TRIGGERED_EVENT;
        case 0: return HOTWORDEVENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public HotwordEventCase
  getHotwordEventCase() {
    return HotwordEventCase.forNumber(
        hotwordEventCase_);
  }

  public static final int HOTWORD_TRIGGERED_EVENT_FIELD_NUMBER = 1;
  /**
   * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
   * @return Whether the hotwordTriggeredEvent field is set.
   */
  @java.lang.Override
  public boolean hasHotwordTriggeredEvent() {
    return hotwordEventCase_ == 1;
  }
  /**
   * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
   * @return The hotwordTriggeredEvent.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordTriggeredEvent getHotwordTriggeredEvent() {
    if (hotwordEventCase_ == 1) {
       return (com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_;
    }
    return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
  }
  /**
   * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder getHotwordTriggeredEventOrBuilder() {
    if (hotwordEventCase_ == 1) {
       return (com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_;
    }
    return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
  }

  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.HotwordEventLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.HotwordEventLog prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.HotwordEventLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.HotwordEventLog)
      com.google.speech.soda.logging.HotwordEventLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordEventLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.HotwordEventLog.class, com.google.speech.soda.logging.HotwordEventLog.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.HotwordEventLog.newBuilder()
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
      hotwordEventCase_ = 0;
      hotwordEvent_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_HotwordEventLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordEventLog getDefaultInstanceForType() {
      return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordEventLog build() {
      com.google.speech.soda.logging.HotwordEventLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.HotwordEventLog buildPartial() {
      com.google.speech.soda.logging.HotwordEventLog result = new com.google.speech.soda.logging.HotwordEventLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (hotwordEventCase_ == 1) {
        if (hotwordTriggeredEventBuilder_ == null) {
          result.hotwordEvent_ = hotwordEvent_;
        } else {
          result.hotwordEvent_ = hotwordTriggeredEventBuilder_.build();
        }
      }
      result.bitField0_ = to_bitField0_;
      result.hotwordEventCase_ = hotwordEventCase_;
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
    private int hotwordEventCase_ = 0;
    private java.lang.Object hotwordEvent_;
    public HotwordEventCase
        getHotwordEventCase() {
      return HotwordEventCase.forNumber(
          hotwordEventCase_);
    }

    public Builder clearHotwordEvent() {
      hotwordEventCase_ = 0;
      hotwordEvent_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HotwordTriggeredEvent, com.google.speech.soda.logging.HotwordTriggeredEvent.Builder, com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder> hotwordTriggeredEventBuilder_;
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     * @return Whether the hotwordTriggeredEvent field is set.
     */
    @java.lang.Override
    public boolean hasHotwordTriggeredEvent() {
      return hotwordEventCase_ == 1;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     * @return The hotwordTriggeredEvent.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HotwordTriggeredEvent getHotwordTriggeredEvent() {
      if (hotwordTriggeredEventBuilder_ == null) {
        if (hotwordEventCase_ == 1) {
          return (com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_;
        }
        return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
      } else {
        if (hotwordEventCase_ == 1) {
          return hotwordTriggeredEventBuilder_.getMessage();
        }
        return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    public Builder setHotwordTriggeredEvent(com.google.speech.soda.logging.HotwordTriggeredEvent value) {
      if (hotwordTriggeredEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hotwordEvent_ = value;
        onChanged();
      } else {
        hotwordTriggeredEventBuilder_.setMessage(value);
      }
      hotwordEventCase_ = 1;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    public Builder setHotwordTriggeredEvent(
        com.google.speech.soda.logging.HotwordTriggeredEvent.Builder builderForValue) {
      if (hotwordTriggeredEventBuilder_ == null) {
        hotwordEvent_ = builderForValue.build();
        onChanged();
      } else {
        hotwordTriggeredEventBuilder_.setMessage(builderForValue.build());
      }
      hotwordEventCase_ = 1;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    public Builder mergeHotwordTriggeredEvent(com.google.speech.soda.logging.HotwordTriggeredEvent value) {
      if (hotwordTriggeredEventBuilder_ == null) {
        if (hotwordEventCase_ == 1 &&
            hotwordEvent_ != com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance()) {
          hotwordEvent_ = com.google.speech.soda.logging.HotwordTriggeredEvent.newBuilder((com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_)
              .mergeFrom(value).buildPartial();
        } else {
          hotwordEvent_ = value;
        }
        onChanged();
      } else {
        if (hotwordEventCase_ == 1) {
          hotwordTriggeredEventBuilder_.mergeFrom(value);
        }
        hotwordTriggeredEventBuilder_.setMessage(value);
      }
      hotwordEventCase_ = 1;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    public Builder clearHotwordTriggeredEvent() {
      if (hotwordTriggeredEventBuilder_ == null) {
        if (hotwordEventCase_ == 1) {
          hotwordEventCase_ = 0;
          hotwordEvent_ = null;
          onChanged();
        }
      } else {
        if (hotwordEventCase_ == 1) {
          hotwordEventCase_ = 0;
          hotwordEvent_ = null;
        }
        hotwordTriggeredEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    public com.google.speech.soda.logging.HotwordTriggeredEvent.Builder getHotwordTriggeredEventBuilder() {
      return getHotwordTriggeredEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder getHotwordTriggeredEventOrBuilder() {
      if ((hotwordEventCase_ == 1) && (hotwordTriggeredEventBuilder_ != null)) {
        return hotwordTriggeredEventBuilder_.getMessageOrBuilder();
      } else {
        if (hotwordEventCase_ == 1) {
          return (com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_;
        }
        return com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordTriggeredEvent hotword_triggered_event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HotwordTriggeredEvent, com.google.speech.soda.logging.HotwordTriggeredEvent.Builder, com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder> 
        getHotwordTriggeredEventFieldBuilder() {
      if (hotwordTriggeredEventBuilder_ == null) {
        if (!(hotwordEventCase_ == 1)) {
          hotwordEvent_ = com.google.speech.soda.logging.HotwordTriggeredEvent.getDefaultInstance();
        }
        hotwordTriggeredEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.HotwordTriggeredEvent, com.google.speech.soda.logging.HotwordTriggeredEvent.Builder, com.google.speech.soda.logging.HotwordTriggeredEventOrBuilder>(
                (com.google.speech.soda.logging.HotwordTriggeredEvent) hotwordEvent_,
                getParentForChildren(),
                isClean());
        hotwordEvent_ = null;
      }
      hotwordEventCase_ = 1;
      onChanged();;
      return hotwordTriggeredEventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.HotwordEventLog)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.HotwordEventLog)
  private static final com.google.speech.soda.logging.HotwordEventLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.HotwordEventLog();
  }

  public static com.google.speech.soda.logging.HotwordEventLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HotwordEventLog>
      PARSER = new com.google.protobuf.AbstractParser<HotwordEventLog>() {
    @java.lang.Override
    public HotwordEventLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotwordEventLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotwordEventLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.HotwordEventLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

