// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

/**
 * Protobuf type {@code speech.logs.timeline.InputEvent}
 */
public final class InputEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.timeline.InputEvent)
    InputEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputEvent.newBuilder() to construct.
  private InputEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputEvent() {
    event_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InputEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_InputEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_InputEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.timeline.InputEvent.class, com.google.speech.logs.timeline.InputEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code speech.logs.timeline.InputEvent.Event}
   */
  public enum Event
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INITIAL_REQUEST_RECEIVED = 0;</code>
     */
    INITIAL_REQUEST_RECEIVED(0),
    /**
     * <code>PINHOLE_PARAM_UPDATE = 1;</code>
     */
    PINHOLE_PARAM_UPDATE(1),
    ;

    /**
     * <code>INITIAL_REQUEST_RECEIVED = 0;</code>
     */
    public static final int INITIAL_REQUEST_RECEIVED_VALUE = 0;
    /**
     * <code>PINHOLE_PARAM_UPDATE = 1;</code>
     */
    public static final int PINHOLE_PARAM_UPDATE_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Event valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Event forNumber(int value) {
      switch (value) {
        case 0: return INITIAL_REQUEST_RECEIVED;
        case 1: return PINHOLE_PARAM_UPDATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Event>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Event> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Event>() {
            public Event findValueByNumber(int number) {
              return Event.forNumber(number);
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
      return com.google.speech.logs.timeline.InputEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Event[] VALUES = values();

    public static Event valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Event(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:speech.logs.timeline.InputEvent.Event)
  }

  private int bitField0_;
  public static final int EVENT_FIELD_NUMBER = 1;
  private int event_;
  /**
   * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override public boolean hasEvent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
   * @return The event.
   */
  @java.lang.Override public com.google.speech.logs.timeline.InputEvent.Event getEvent() {
    @SuppressWarnings("deprecation")
    com.google.speech.logs.timeline.InputEvent.Event result = com.google.speech.logs.timeline.InputEvent.Event.valueOf(event_);
    return result == null ? com.google.speech.logs.timeline.InputEvent.Event.INITIAL_REQUEST_RECEIVED : result;
  }

  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.InputEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.InputEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.InputEvent parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.timeline.InputEvent prototype) {
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
   * Protobuf type {@code speech.logs.timeline.InputEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.timeline.InputEvent)
      com.google.speech.logs.timeline.InputEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_InputEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_InputEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.timeline.InputEvent.class, com.google.speech.logs.timeline.InputEvent.Builder.class);
    }

    // Construct using com.google.speech.logs.timeline.InputEvent.newBuilder()
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
      event_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_InputEvent_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.InputEvent getDefaultInstanceForType() {
      return com.google.speech.logs.timeline.InputEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.InputEvent build() {
      com.google.speech.logs.timeline.InputEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.InputEvent buildPartial() {
      com.google.speech.logs.timeline.InputEvent result = new com.google.speech.logs.timeline.InputEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.event_ = event_;
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

    private int event_ = 0;
    /**
     * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
     * @return Whether the event field is set.
     */
    @java.lang.Override public boolean hasEvent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
     * @return The event.
     */
    @java.lang.Override
    public com.google.speech.logs.timeline.InputEvent.Event getEvent() {
      @SuppressWarnings("deprecation")
      com.google.speech.logs.timeline.InputEvent.Event result = com.google.speech.logs.timeline.InputEvent.Event.valueOf(event_);
      return result == null ? com.google.speech.logs.timeline.InputEvent.Event.INITIAL_REQUEST_RECEIVED : result;
    }
    /**
     * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(com.google.speech.logs.timeline.InputEvent.Event value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      event_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .speech.logs.timeline.InputEvent.Event event = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      event_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.timeline.InputEvent)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.timeline.InputEvent)
  private static final com.google.speech.logs.timeline.InputEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.timeline.InputEvent();
  }

  public static com.google.speech.logs.timeline.InputEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<InputEvent>
      PARSER = new com.google.protobuf.AbstractParser<InputEvent>() {
    @java.lang.Override
    public InputEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<InputEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.timeline.InputEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

