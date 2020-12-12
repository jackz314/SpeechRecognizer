// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/logs/backend_recognizer_event_wrapper.proto

package greco;

public final class BackendRecognizerEventWrapperOuterClass {
  private BackendRecognizerEventWrapperOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.logId);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BackendRecognizerEventWrapperOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.BackendRecognizerEventWrapper)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 timestamp_ms = 1;</code>
     * @return Whether the timestampMs field is set.
     */
    boolean hasTimestampMs();
    /**
     * <code>optional int64 timestamp_ms = 1;</code>
     * @return The timestampMs.
     */
    long getTimestampMs();

    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     * @return Whether the event field is set.
     */
    boolean hasEvent();
    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     * @return The event.
     */
    com.google.speech.logs.timeline.BackendRecognizerEvent getEvent();
    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     */
    com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder getEventOrBuilder();
  }
  /**
   * Protobuf type {@code greco.BackendRecognizerEventWrapper}
   */
  public static final class BackendRecognizerEventWrapper extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.BackendRecognizerEventWrapper)
      BackendRecognizerEventWrapperOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BackendRecognizerEventWrapper.newBuilder() to construct.
    private BackendRecognizerEventWrapper(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BackendRecognizerEventWrapper() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BackendRecognizerEventWrapper();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.BackendRecognizerEventWrapperOuterClass.internal_static_greco_BackendRecognizerEventWrapper_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.BackendRecognizerEventWrapperOuterClass.internal_static_greco_BackendRecognizerEventWrapper_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.class, greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.Builder.class);
    }

    private int bitField0_;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
    private long timestampMs_;
    /**
     * <code>optional int64 timestamp_ms = 1;</code>
     * @return Whether the timestampMs field is set.
     */
    @java.lang.Override
    public boolean hasTimestampMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 timestamp_ms = 1;</code>
     * @return The timestampMs.
     */
    @java.lang.Override
    public long getTimestampMs() {
      return timestampMs_;
    }

    public static final int EVENT_FIELD_NUMBER = 2;
    private com.google.speech.logs.timeline.BackendRecognizerEvent event_;
    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     * @return Whether the event field is set.
     */
    @java.lang.Override
    public boolean hasEvent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     * @return The event.
     */
    @java.lang.Override
    public com.google.speech.logs.timeline.BackendRecognizerEvent getEvent() {
      return event_ == null ? com.google.speech.logs.timeline.BackendRecognizerEvent.getDefaultInstance() : event_;
    }
    /**
     * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
     */
    @java.lang.Override
    public com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder getEventOrBuilder() {
      return event_ == null ? com.google.speech.logs.timeline.BackendRecognizerEvent.getDefaultInstance() : event_;
    }

    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper parseFrom(
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
    public static Builder newBuilder(greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper prototype) {
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
     * Protobuf type {@code greco.BackendRecognizerEventWrapper}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.BackendRecognizerEventWrapper)
        greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.BackendRecognizerEventWrapperOuterClass.internal_static_greco_BackendRecognizerEventWrapper_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.BackendRecognizerEventWrapperOuterClass.internal_static_greco_BackendRecognizerEventWrapper_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.class, greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.Builder.class);
      }

      // Construct using greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.newBuilder()
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
          getEventFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        timestampMs_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (eventBuilder_ == null) {
          event_ = null;
        } else {
          eventBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.BackendRecognizerEventWrapperOuterClass.internal_static_greco_BackendRecognizerEventWrapper_descriptor;
      }

      @java.lang.Override
      public greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper getDefaultInstanceForType() {
        return greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.getDefaultInstance();
      }

      @java.lang.Override
      public greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper build() {
        greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper buildPartial() {
        greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper result = new greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestampMs_ = timestampMs_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (eventBuilder_ == null) {
            result.event_ = event_;
          } else {
            result.event_ = eventBuilder_.build();
          }
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

      private long timestampMs_ ;
      /**
       * <code>optional int64 timestamp_ms = 1;</code>
       * @return Whether the timestampMs field is set.
       */
      @java.lang.Override
      public boolean hasTimestampMs() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int64 timestamp_ms = 1;</code>
       * @return The timestampMs.
       */
      @java.lang.Override
      public long getTimestampMs() {
        return timestampMs_;
      }
      /**
       * <code>optional int64 timestamp_ms = 1;</code>
       * @param value The timestampMs to set.
       * @return This builder for chaining.
       */
      public Builder setTimestampMs(long value) {
        bitField0_ |= 0x00000001;
        timestampMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 timestamp_ms = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestampMs() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestampMs_ = 0L;
        onChanged();
        return this;
      }

      private com.google.speech.logs.timeline.BackendRecognizerEvent event_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.speech.logs.timeline.BackendRecognizerEvent, com.google.speech.logs.timeline.BackendRecognizerEvent.Builder, com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder> eventBuilder_;
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       * @return Whether the event field is set.
       */
      public boolean hasEvent() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       * @return The event.
       */
      public com.google.speech.logs.timeline.BackendRecognizerEvent getEvent() {
        if (eventBuilder_ == null) {
          return event_ == null ? com.google.speech.logs.timeline.BackendRecognizerEvent.getDefaultInstance() : event_;
        } else {
          return eventBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public Builder setEvent(com.google.speech.logs.timeline.BackendRecognizerEvent value) {
        if (eventBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          eventBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public Builder setEvent(
          com.google.speech.logs.timeline.BackendRecognizerEvent.Builder builderForValue) {
        if (eventBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          eventBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public Builder mergeEvent(com.google.speech.logs.timeline.BackendRecognizerEvent value) {
        if (eventBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              event_ != null &&
              event_ != com.google.speech.logs.timeline.BackendRecognizerEvent.getDefaultInstance()) {
            event_ =
              com.google.speech.logs.timeline.BackendRecognizerEvent.newBuilder(event_).mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          eventBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public Builder clearEvent() {
        if (eventBuilder_ == null) {
          event_ = null;
          onChanged();
        } else {
          eventBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public com.google.speech.logs.timeline.BackendRecognizerEvent.Builder getEventBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getEventFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      public com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder getEventOrBuilder() {
        if (eventBuilder_ != null) {
          return eventBuilder_.getMessageOrBuilder();
        } else {
          return event_ == null ?
              com.google.speech.logs.timeline.BackendRecognizerEvent.getDefaultInstance() : event_;
        }
      }
      /**
       * <code>optional .speech.logs.timeline.BackendRecognizerEvent event = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.speech.logs.timeline.BackendRecognizerEvent, com.google.speech.logs.timeline.BackendRecognizerEvent.Builder, com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder> 
          getEventFieldBuilder() {
        if (eventBuilder_ == null) {
          eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.speech.logs.timeline.BackendRecognizerEvent, com.google.speech.logs.timeline.BackendRecognizerEvent.Builder, com.google.speech.logs.timeline.BackendRecognizerEventOrBuilder>(
                  getEvent(),
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        return eventBuilder_;
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


      // @@protoc_insertion_point(builder_scope:greco.BackendRecognizerEventWrapper)
    }

    // @@protoc_insertion_point(class_scope:greco.BackendRecognizerEventWrapper)
    private static final greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper();
    }

    public static greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<BackendRecognizerEventWrapper>
        PARSER = new com.google.protobuf.AbstractParser<BackendRecognizerEventWrapper>() {
      @java.lang.Override
      public BackendRecognizerEventWrapper parsePartialFrom(
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

    public static com.google.protobuf.Parser<BackendRecognizerEventWrapper> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BackendRecognizerEventWrapper> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int LOG_ID_FIELD_NUMBER = 62700943;
    /**
     * <code>extend .greco.Loggable { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.LoggableOuterClass.Loggable,
        greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper> logId = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.getDefaultInstance(),
          0,
          greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.class,
          greco.BackendRecognizerEventWrapperOuterClass.BackendRecognizerEventWrapper.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_BackendRecognizerEventWrapper_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_BackendRecognizerEventWrapper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9speech/greco3/logs/backend_recognizer_" +
      "event_wrapper.proto\022\005greco\032.logs/proto/s" +
      "peech/service/timeline_event.proto\032!spee" +
      "ch/greco3/core/loggable.proto\"\274\001\n\035Backen" +
      "dRecognizerEventWrapper\022\024\n\014timestamp_ms\030" +
      "\001 \001(\003\022;\n\005event\030\002 \001(\0132,.speech.logs.timel" +
      "ine.BackendRecognizerEvent2H\n\006log_id\022\017.g" +
      "reco.Loggable\030\217\373\362\035 \001(\0132$.greco.BackendRe" +
      "cognizerEventWrapperB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.logs.timeline.TimelineEventOuterClass.getDescriptor(),
          greco.LoggableOuterClass.getDescriptor(),
        });
    internal_static_greco_BackendRecognizerEventWrapper_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_BackendRecognizerEventWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_BackendRecognizerEventWrapper_descriptor,
        new java.lang.String[] { "TimestampMs", "Event", });
    com.google.speech.logs.timeline.TimelineEventOuterClass.getDescriptor();
    greco.LoggableOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
