// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.AlignmentProtoLog}
 */
public final class AlignmentProtoLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.AlignmentProtoLog)
    AlignmentProtoLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlignmentProtoLog.newBuilder() to construct.
  private AlignmentProtoLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlignmentProtoLog() {
    segment_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlignmentProtoLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlignmentProtoLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlignmentProtoLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.AlignmentProtoLog.class, com.google.speech.logs.AlignmentProtoLog.Builder.class);
  }

  private int bitField0_;
  public static final int FRAME_DURATION_IN_SECONDS_FIELD_NUMBER = 1;
  private float frameDurationInSeconds_;
  /**
   * <code>optional float frame_duration_in_seconds = 1;</code>
   * @return Whether the frameDurationInSeconds field is set.
   */
  @java.lang.Override
  public boolean hasFrameDurationInSeconds() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional float frame_duration_in_seconds = 1;</code>
   * @return The frameDurationInSeconds.
   */
  @java.lang.Override
  public float getFrameDurationInSeconds() {
    return frameDurationInSeconds_;
  }

  public static final int SEGMENT_FIELD_NUMBER = 2;
  private java.util.List<com.google.speech.logs.SegmentLog> segment_;
  /**
   * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.logs.SegmentLog> getSegmentList() {
    return segment_;
  }
  /**
   * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.logs.SegmentLogOrBuilder> 
      getSegmentOrBuilderList() {
    return segment_;
  }
  /**
   * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
   */
  @java.lang.Override
  public int getSegmentCount() {
    return segment_.size();
  }
  /**
   * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.SegmentLog getSegment(int index) {
    return segment_.get(index);
  }
  /**
   * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.SegmentLogOrBuilder getSegmentOrBuilder(
      int index) {
    return segment_.get(index);
  }

  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlignmentProtoLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.AlignmentProtoLog prototype) {
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
   * Protobuf type {@code speech.logs.AlignmentProtoLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.AlignmentProtoLog)
      com.google.speech.logs.AlignmentProtoLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlignmentProtoLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlignmentProtoLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.AlignmentProtoLog.class, com.google.speech.logs.AlignmentProtoLog.Builder.class);
    }

    // Construct using com.google.speech.logs.AlignmentProtoLog.newBuilder()
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
        getSegmentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      frameDurationInSeconds_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (segmentBuilder_ == null) {
        segment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        segmentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlignmentProtoLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.AlignmentProtoLog getDefaultInstanceForType() {
      return com.google.speech.logs.AlignmentProtoLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.AlignmentProtoLog build() {
      com.google.speech.logs.AlignmentProtoLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.AlignmentProtoLog buildPartial() {
      com.google.speech.logs.AlignmentProtoLog result = new com.google.speech.logs.AlignmentProtoLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.frameDurationInSeconds_ = frameDurationInSeconds_;
        to_bitField0_ |= 0x00000001;
      }
      if (segmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          segment_ = java.util.Collections.unmodifiableList(segment_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.segment_ = segment_;
      } else {
        result.segment_ = segmentBuilder_.build();
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

    private float frameDurationInSeconds_ ;
    /**
     * <code>optional float frame_duration_in_seconds = 1;</code>
     * @return Whether the frameDurationInSeconds field is set.
     */
    @java.lang.Override
    public boolean hasFrameDurationInSeconds() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional float frame_duration_in_seconds = 1;</code>
     * @return The frameDurationInSeconds.
     */
    @java.lang.Override
    public float getFrameDurationInSeconds() {
      return frameDurationInSeconds_;
    }
    /**
     * <code>optional float frame_duration_in_seconds = 1;</code>
     * @param value The frameDurationInSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setFrameDurationInSeconds(float value) {
      bitField0_ |= 0x00000001;
      frameDurationInSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float frame_duration_in_seconds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrameDurationInSeconds() {
      bitField0_ = (bitField0_ & ~0x00000001);
      frameDurationInSeconds_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<com.google.speech.logs.SegmentLog> segment_ =
      java.util.Collections.emptyList();
    private void ensureSegmentIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        segment_ = new java.util.ArrayList<com.google.speech.logs.SegmentLog>(segment_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.SegmentLog, com.google.speech.logs.SegmentLog.Builder, com.google.speech.logs.SegmentLogOrBuilder> segmentBuilder_;

    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public java.util.List<com.google.speech.logs.SegmentLog> getSegmentList() {
      if (segmentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(segment_);
      } else {
        return segmentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public int getSegmentCount() {
      if (segmentBuilder_ == null) {
        return segment_.size();
      } else {
        return segmentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public com.google.speech.logs.SegmentLog getSegment(int index) {
      if (segmentBuilder_ == null) {
        return segment_.get(index);
      } else {
        return segmentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder setSegment(
        int index, com.google.speech.logs.SegmentLog value) {
      if (segmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentIsMutable();
        segment_.set(index, value);
        onChanged();
      } else {
        segmentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder setSegment(
        int index, com.google.speech.logs.SegmentLog.Builder builderForValue) {
      if (segmentBuilder_ == null) {
        ensureSegmentIsMutable();
        segment_.set(index, builderForValue.build());
        onChanged();
      } else {
        segmentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder addSegment(com.google.speech.logs.SegmentLog value) {
      if (segmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentIsMutable();
        segment_.add(value);
        onChanged();
      } else {
        segmentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder addSegment(
        int index, com.google.speech.logs.SegmentLog value) {
      if (segmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentIsMutable();
        segment_.add(index, value);
        onChanged();
      } else {
        segmentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder addSegment(
        com.google.speech.logs.SegmentLog.Builder builderForValue) {
      if (segmentBuilder_ == null) {
        ensureSegmentIsMutable();
        segment_.add(builderForValue.build());
        onChanged();
      } else {
        segmentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder addSegment(
        int index, com.google.speech.logs.SegmentLog.Builder builderForValue) {
      if (segmentBuilder_ == null) {
        ensureSegmentIsMutable();
        segment_.add(index, builderForValue.build());
        onChanged();
      } else {
        segmentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder addAllSegment(
        java.lang.Iterable<? extends com.google.speech.logs.SegmentLog> values) {
      if (segmentBuilder_ == null) {
        ensureSegmentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, segment_);
        onChanged();
      } else {
        segmentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder clearSegment() {
      if (segmentBuilder_ == null) {
        segment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        segmentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public Builder removeSegment(int index) {
      if (segmentBuilder_ == null) {
        ensureSegmentIsMutable();
        segment_.remove(index);
        onChanged();
      } else {
        segmentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public com.google.speech.logs.SegmentLog.Builder getSegmentBuilder(
        int index) {
      return getSegmentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public com.google.speech.logs.SegmentLogOrBuilder getSegmentOrBuilder(
        int index) {
      if (segmentBuilder_ == null) {
        return segment_.get(index);  } else {
        return segmentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public java.util.List<? extends com.google.speech.logs.SegmentLogOrBuilder> 
         getSegmentOrBuilderList() {
      if (segmentBuilder_ != null) {
        return segmentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(segment_);
      }
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public com.google.speech.logs.SegmentLog.Builder addSegmentBuilder() {
      return getSegmentFieldBuilder().addBuilder(
          com.google.speech.logs.SegmentLog.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public com.google.speech.logs.SegmentLog.Builder addSegmentBuilder(
        int index) {
      return getSegmentFieldBuilder().addBuilder(
          index, com.google.speech.logs.SegmentLog.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.SegmentLog segment = 2;</code>
     */
    public java.util.List<com.google.speech.logs.SegmentLog.Builder> 
         getSegmentBuilderList() {
      return getSegmentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.SegmentLog, com.google.speech.logs.SegmentLog.Builder, com.google.speech.logs.SegmentLogOrBuilder> 
        getSegmentFieldBuilder() {
      if (segmentBuilder_ == null) {
        segmentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.logs.SegmentLog, com.google.speech.logs.SegmentLog.Builder, com.google.speech.logs.SegmentLogOrBuilder>(
                segment_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        segment_ = null;
      }
      return segmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.AlignmentProtoLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.AlignmentProtoLog)
  private static final com.google.speech.logs.AlignmentProtoLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.AlignmentProtoLog();
  }

  public static com.google.speech.logs.AlignmentProtoLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AlignmentProtoLog>
      PARSER = new com.google.protobuf.AbstractParser<AlignmentProtoLog>() {
    @java.lang.Override
    public AlignmentProtoLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlignmentProtoLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlignmentProtoLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.AlignmentProtoLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

