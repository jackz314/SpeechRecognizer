// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

/**
 * Protobuf type {@code logs.proto.speech.soda.SodaEventLog}
 */
public final class SodaEventLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logs.proto.speech.soda.SodaEventLog)
    SodaEventLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SodaEventLog.newBuilder() to construct.
  private SodaEventLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SodaEventLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SodaEventLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SodaEventLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SodaEventLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.soda.logging.SodaEventLog.class, com.google.speech.soda.logging.SodaEventLog.Builder.class);
  }

  private int bitField0_;
  private int eventCase_ = 0;
  private java.lang.Object event_;
  public enum EventCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INIT_EVENT_LOG(2),
    HOTWORD_EVENT(3),
    ON_DEVICE_ASR_EVENT(4),
    HYBRID_ASR_EVENT(5),
    EVENT_NOT_SET(0);
    private final int value;
    private EventCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventCase forNumber(int value) {
      switch (value) {
        case 2: return INIT_EVENT_LOG;
        case 3: return HOTWORD_EVENT;
        case 4: return ON_DEVICE_ASR_EVENT;
        case 5: return HYBRID_ASR_EVENT;
        case 0: return EVENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EventCase
  getEventCase() {
    return EventCase.forNumber(
        eventCase_);
  }

  public static final int INIT_EVENT_LOG_FIELD_NUMBER = 2;
  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   * @return Whether the initEventLog field is set.
   */
  @java.lang.Override
  public boolean hasInitEventLog() {
    return eventCase_ == 2;
  }
  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   * @return The initEventLog.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.InitEventLog getInitEventLog() {
    if (eventCase_ == 2) {
       return (com.google.speech.soda.logging.InitEventLog) event_;
    }
    return com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
  }
  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.InitEventLogOrBuilder getInitEventLogOrBuilder() {
    if (eventCase_ == 2) {
       return (com.google.speech.soda.logging.InitEventLog) event_;
    }
    return com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
  }

  public static final int HOTWORD_EVENT_FIELD_NUMBER = 3;
  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   * @return Whether the hotwordEvent field is set.
   */
  @java.lang.Override
  public boolean hasHotwordEvent() {
    return eventCase_ == 3;
  }
  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   * @return The hotwordEvent.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordEventLog getHotwordEvent() {
    if (eventCase_ == 3) {
       return (com.google.speech.soda.logging.HotwordEventLog) event_;
    }
    return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
  }
  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HotwordEventLogOrBuilder getHotwordEventOrBuilder() {
    if (eventCase_ == 3) {
       return (com.google.speech.soda.logging.HotwordEventLog) event_;
    }
    return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
  }

  public static final int ON_DEVICE_ASR_EVENT_FIELD_NUMBER = 4;
  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   * @return Whether the onDeviceAsrEvent field is set.
   */
  @java.lang.Override
  public boolean hasOnDeviceAsrEvent() {
    return eventCase_ == 4;
  }
  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   * @return The onDeviceAsrEvent.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.OnDeviceAsrEventLog getOnDeviceAsrEvent() {
    if (eventCase_ == 4) {
       return (com.google.speech.soda.logging.OnDeviceAsrEventLog) event_;
    }
    return com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
  }
  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder getOnDeviceAsrEventOrBuilder() {
    if (eventCase_ == 4) {
       return (com.google.speech.soda.logging.OnDeviceAsrEventLog) event_;
    }
    return com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
  }

  public static final int HYBRID_ASR_EVENT_FIELD_NUMBER = 5;
  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   * @return Whether the hybridAsrEvent field is set.
   */
  @java.lang.Override
  public boolean hasHybridAsrEvent() {
    return eventCase_ == 5;
  }
  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   * @return The hybridAsrEvent.
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HybridAsrEventLog getHybridAsrEvent() {
    if (eventCase_ == 5) {
       return (com.google.speech.soda.logging.HybridAsrEventLog) event_;
    }
    return com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
  }
  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   */
  @java.lang.Override
  public com.google.speech.soda.logging.HybridAsrEventLogOrBuilder getHybridAsrEventOrBuilder() {
    if (eventCase_ == 5) {
       return (com.google.speech.soda.logging.HybridAsrEventLog) event_;
    }
    return com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
  }

  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.soda.logging.SodaEventLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.soda.logging.SodaEventLog prototype) {
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
   * Protobuf type {@code logs.proto.speech.soda.SodaEventLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logs.proto.speech.soda.SodaEventLog)
      com.google.speech.soda.logging.SodaEventLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SodaEventLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SodaEventLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.soda.logging.SodaEventLog.class, com.google.speech.soda.logging.SodaEventLog.Builder.class);
    }

    // Construct using com.google.speech.soda.logging.SodaEventLog.newBuilder()
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
      eventCase_ = 0;
      event_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.soda.logging.SodaEventLogOuterClass.internal_static_logs_proto_speech_soda_SodaEventLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SodaEventLog getDefaultInstanceForType() {
      return com.google.speech.soda.logging.SodaEventLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SodaEventLog build() {
      com.google.speech.soda.logging.SodaEventLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.soda.logging.SodaEventLog buildPartial() {
      com.google.speech.soda.logging.SodaEventLog result = new com.google.speech.soda.logging.SodaEventLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (eventCase_ == 2) {
        if (initEventLogBuilder_ == null) {
          result.event_ = event_;
        } else {
          result.event_ = initEventLogBuilder_.build();
        }
      }
      if (eventCase_ == 3) {
        if (hotwordEventBuilder_ == null) {
          result.event_ = event_;
        } else {
          result.event_ = hotwordEventBuilder_.build();
        }
      }
      if (eventCase_ == 4) {
        if (onDeviceAsrEventBuilder_ == null) {
          result.event_ = event_;
        } else {
          result.event_ = onDeviceAsrEventBuilder_.build();
        }
      }
      if (eventCase_ == 5) {
        if (hybridAsrEventBuilder_ == null) {
          result.event_ = event_;
        } else {
          result.event_ = hybridAsrEventBuilder_.build();
        }
      }
      result.bitField0_ = to_bitField0_;
      result.eventCase_ = eventCase_;
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
    private int eventCase_ = 0;
    private java.lang.Object event_;
    public EventCase
        getEventCase() {
      return EventCase.forNumber(
          eventCase_);
    }

    public Builder clearEvent() {
      eventCase_ = 0;
      event_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.InitEventLog, com.google.speech.soda.logging.InitEventLog.Builder, com.google.speech.soda.logging.InitEventLogOrBuilder> initEventLogBuilder_;
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     * @return Whether the initEventLog field is set.
     */
    @java.lang.Override
    public boolean hasInitEventLog() {
      return eventCase_ == 2;
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     * @return The initEventLog.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.InitEventLog getInitEventLog() {
      if (initEventLogBuilder_ == null) {
        if (eventCase_ == 2) {
          return (com.google.speech.soda.logging.InitEventLog) event_;
        }
        return com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
      } else {
        if (eventCase_ == 2) {
          return initEventLogBuilder_.getMessage();
        }
        return com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    public Builder setInitEventLog(com.google.speech.soda.logging.InitEventLog value) {
      if (initEventLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        initEventLogBuilder_.setMessage(value);
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    public Builder setInitEventLog(
        com.google.speech.soda.logging.InitEventLog.Builder builderForValue) {
      if (initEventLogBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        initEventLogBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    public Builder mergeInitEventLog(com.google.speech.soda.logging.InitEventLog value) {
      if (initEventLogBuilder_ == null) {
        if (eventCase_ == 2 &&
            event_ != com.google.speech.soda.logging.InitEventLog.getDefaultInstance()) {
          event_ = com.google.speech.soda.logging.InitEventLog.newBuilder((com.google.speech.soda.logging.InitEventLog) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 2) {
          initEventLogBuilder_.mergeFrom(value);
        }
        initEventLogBuilder_.setMessage(value);
      }
      eventCase_ = 2;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    public Builder clearInitEventLog() {
      if (initEventLogBuilder_ == null) {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
        }
        initEventLogBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    public com.google.speech.soda.logging.InitEventLog.Builder getInitEventLogBuilder() {
      return getInitEventLogFieldBuilder().getBuilder();
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    @java.lang.Override
    public com.google.speech.soda.logging.InitEventLogOrBuilder getInitEventLogOrBuilder() {
      if ((eventCase_ == 2) && (initEventLogBuilder_ != null)) {
        return initEventLogBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 2) {
          return (com.google.speech.soda.logging.InitEventLog) event_;
        }
        return com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.InitEventLog, com.google.speech.soda.logging.InitEventLog.Builder, com.google.speech.soda.logging.InitEventLogOrBuilder> 
        getInitEventLogFieldBuilder() {
      if (initEventLogBuilder_ == null) {
        if (!(eventCase_ == 2)) {
          event_ = com.google.speech.soda.logging.InitEventLog.getDefaultInstance();
        }
        initEventLogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.InitEventLog, com.google.speech.soda.logging.InitEventLog.Builder, com.google.speech.soda.logging.InitEventLogOrBuilder>(
                (com.google.speech.soda.logging.InitEventLog) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 2;
      onChanged();;
      return initEventLogBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HotwordEventLog, com.google.speech.soda.logging.HotwordEventLog.Builder, com.google.speech.soda.logging.HotwordEventLogOrBuilder> hotwordEventBuilder_;
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     * @return Whether the hotwordEvent field is set.
     */
    @java.lang.Override
    public boolean hasHotwordEvent() {
      return eventCase_ == 3;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     * @return The hotwordEvent.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HotwordEventLog getHotwordEvent() {
      if (hotwordEventBuilder_ == null) {
        if (eventCase_ == 3) {
          return (com.google.speech.soda.logging.HotwordEventLog) event_;
        }
        return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
      } else {
        if (eventCase_ == 3) {
          return hotwordEventBuilder_.getMessage();
        }
        return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    public Builder setHotwordEvent(com.google.speech.soda.logging.HotwordEventLog value) {
      if (hotwordEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        hotwordEventBuilder_.setMessage(value);
      }
      eventCase_ = 3;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    public Builder setHotwordEvent(
        com.google.speech.soda.logging.HotwordEventLog.Builder builderForValue) {
      if (hotwordEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        hotwordEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 3;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    public Builder mergeHotwordEvent(com.google.speech.soda.logging.HotwordEventLog value) {
      if (hotwordEventBuilder_ == null) {
        if (eventCase_ == 3 &&
            event_ != com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance()) {
          event_ = com.google.speech.soda.logging.HotwordEventLog.newBuilder((com.google.speech.soda.logging.HotwordEventLog) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 3) {
          hotwordEventBuilder_.mergeFrom(value);
        }
        hotwordEventBuilder_.setMessage(value);
      }
      eventCase_ = 3;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    public Builder clearHotwordEvent() {
      if (hotwordEventBuilder_ == null) {
        if (eventCase_ == 3) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 3) {
          eventCase_ = 0;
          event_ = null;
        }
        hotwordEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    public com.google.speech.soda.logging.HotwordEventLog.Builder getHotwordEventBuilder() {
      return getHotwordEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HotwordEventLogOrBuilder getHotwordEventOrBuilder() {
      if ((eventCase_ == 3) && (hotwordEventBuilder_ != null)) {
        return hotwordEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 3) {
          return (com.google.speech.soda.logging.HotwordEventLog) event_;
        }
        return com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HotwordEventLog, com.google.speech.soda.logging.HotwordEventLog.Builder, com.google.speech.soda.logging.HotwordEventLogOrBuilder> 
        getHotwordEventFieldBuilder() {
      if (hotwordEventBuilder_ == null) {
        if (!(eventCase_ == 3)) {
          event_ = com.google.speech.soda.logging.HotwordEventLog.getDefaultInstance();
        }
        hotwordEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.HotwordEventLog, com.google.speech.soda.logging.HotwordEventLog.Builder, com.google.speech.soda.logging.HotwordEventLogOrBuilder>(
                (com.google.speech.soda.logging.HotwordEventLog) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 3;
      onChanged();;
      return hotwordEventBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.OnDeviceAsrEventLog, com.google.speech.soda.logging.OnDeviceAsrEventLog.Builder, com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder> onDeviceAsrEventBuilder_;
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     * @return Whether the onDeviceAsrEvent field is set.
     */
    @java.lang.Override
    public boolean hasOnDeviceAsrEvent() {
      return eventCase_ == 4;
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     * @return The onDeviceAsrEvent.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.OnDeviceAsrEventLog getOnDeviceAsrEvent() {
      if (onDeviceAsrEventBuilder_ == null) {
        if (eventCase_ == 4) {
          return (com.google.speech.soda.logging.OnDeviceAsrEventLog) event_;
        }
        return com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
      } else {
        if (eventCase_ == 4) {
          return onDeviceAsrEventBuilder_.getMessage();
        }
        return com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    public Builder setOnDeviceAsrEvent(com.google.speech.soda.logging.OnDeviceAsrEventLog value) {
      if (onDeviceAsrEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        onDeviceAsrEventBuilder_.setMessage(value);
      }
      eventCase_ = 4;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    public Builder setOnDeviceAsrEvent(
        com.google.speech.soda.logging.OnDeviceAsrEventLog.Builder builderForValue) {
      if (onDeviceAsrEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        onDeviceAsrEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 4;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    public Builder mergeOnDeviceAsrEvent(com.google.speech.soda.logging.OnDeviceAsrEventLog value) {
      if (onDeviceAsrEventBuilder_ == null) {
        if (eventCase_ == 4 &&
            event_ != com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance()) {
          event_ = com.google.speech.soda.logging.OnDeviceAsrEventLog.newBuilder((com.google.speech.soda.logging.OnDeviceAsrEventLog) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 4) {
          onDeviceAsrEventBuilder_.mergeFrom(value);
        }
        onDeviceAsrEventBuilder_.setMessage(value);
      }
      eventCase_ = 4;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    public Builder clearOnDeviceAsrEvent() {
      if (onDeviceAsrEventBuilder_ == null) {
        if (eventCase_ == 4) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 4) {
          eventCase_ = 0;
          event_ = null;
        }
        onDeviceAsrEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    public com.google.speech.soda.logging.OnDeviceAsrEventLog.Builder getOnDeviceAsrEventBuilder() {
      return getOnDeviceAsrEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    @java.lang.Override
    public com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder getOnDeviceAsrEventOrBuilder() {
      if ((eventCase_ == 4) && (onDeviceAsrEventBuilder_ != null)) {
        return onDeviceAsrEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 4) {
          return (com.google.speech.soda.logging.OnDeviceAsrEventLog) event_;
        }
        return com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.OnDeviceAsrEventLog, com.google.speech.soda.logging.OnDeviceAsrEventLog.Builder, com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder> 
        getOnDeviceAsrEventFieldBuilder() {
      if (onDeviceAsrEventBuilder_ == null) {
        if (!(eventCase_ == 4)) {
          event_ = com.google.speech.soda.logging.OnDeviceAsrEventLog.getDefaultInstance();
        }
        onDeviceAsrEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.OnDeviceAsrEventLog, com.google.speech.soda.logging.OnDeviceAsrEventLog.Builder, com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder>(
                (com.google.speech.soda.logging.OnDeviceAsrEventLog) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 4;
      onChanged();;
      return onDeviceAsrEventBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HybridAsrEventLog, com.google.speech.soda.logging.HybridAsrEventLog.Builder, com.google.speech.soda.logging.HybridAsrEventLogOrBuilder> hybridAsrEventBuilder_;
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     * @return Whether the hybridAsrEvent field is set.
     */
    @java.lang.Override
    public boolean hasHybridAsrEvent() {
      return eventCase_ == 5;
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     * @return The hybridAsrEvent.
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HybridAsrEventLog getHybridAsrEvent() {
      if (hybridAsrEventBuilder_ == null) {
        if (eventCase_ == 5) {
          return (com.google.speech.soda.logging.HybridAsrEventLog) event_;
        }
        return com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
      } else {
        if (eventCase_ == 5) {
          return hybridAsrEventBuilder_.getMessage();
        }
        return com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    public Builder setHybridAsrEvent(com.google.speech.soda.logging.HybridAsrEventLog value) {
      if (hybridAsrEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        hybridAsrEventBuilder_.setMessage(value);
      }
      eventCase_ = 5;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    public Builder setHybridAsrEvent(
        com.google.speech.soda.logging.HybridAsrEventLog.Builder builderForValue) {
      if (hybridAsrEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        hybridAsrEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 5;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    public Builder mergeHybridAsrEvent(com.google.speech.soda.logging.HybridAsrEventLog value) {
      if (hybridAsrEventBuilder_ == null) {
        if (eventCase_ == 5 &&
            event_ != com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance()) {
          event_ = com.google.speech.soda.logging.HybridAsrEventLog.newBuilder((com.google.speech.soda.logging.HybridAsrEventLog) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 5) {
          hybridAsrEventBuilder_.mergeFrom(value);
        }
        hybridAsrEventBuilder_.setMessage(value);
      }
      eventCase_ = 5;
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    public Builder clearHybridAsrEvent() {
      if (hybridAsrEventBuilder_ == null) {
        if (eventCase_ == 5) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 5) {
          eventCase_ = 0;
          event_ = null;
        }
        hybridAsrEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    public com.google.speech.soda.logging.HybridAsrEventLog.Builder getHybridAsrEventBuilder() {
      return getHybridAsrEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    @java.lang.Override
    public com.google.speech.soda.logging.HybridAsrEventLogOrBuilder getHybridAsrEventOrBuilder() {
      if ((eventCase_ == 5) && (hybridAsrEventBuilder_ != null)) {
        return hybridAsrEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 5) {
          return (com.google.speech.soda.logging.HybridAsrEventLog) event_;
        }
        return com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
      }
    }
    /**
     * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.soda.logging.HybridAsrEventLog, com.google.speech.soda.logging.HybridAsrEventLog.Builder, com.google.speech.soda.logging.HybridAsrEventLogOrBuilder> 
        getHybridAsrEventFieldBuilder() {
      if (hybridAsrEventBuilder_ == null) {
        if (!(eventCase_ == 5)) {
          event_ = com.google.speech.soda.logging.HybridAsrEventLog.getDefaultInstance();
        }
        hybridAsrEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.soda.logging.HybridAsrEventLog, com.google.speech.soda.logging.HybridAsrEventLog.Builder, com.google.speech.soda.logging.HybridAsrEventLogOrBuilder>(
                (com.google.speech.soda.logging.HybridAsrEventLog) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 5;
      onChanged();;
      return hybridAsrEventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:logs.proto.speech.soda.SodaEventLog)
  }

  // @@protoc_insertion_point(class_scope:logs.proto.speech.soda.SodaEventLog)
  private static final com.google.speech.soda.logging.SodaEventLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.soda.logging.SodaEventLog();
  }

  public static com.google.speech.soda.logging.SodaEventLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SodaEventLog>
      PARSER = new com.google.protobuf.AbstractParser<SodaEventLog>() {
    @java.lang.Override
    public SodaEventLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<SodaEventLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SodaEventLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.soda.logging.SodaEventLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
