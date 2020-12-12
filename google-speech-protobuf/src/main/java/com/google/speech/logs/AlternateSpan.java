// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.AlternateSpan}
 */
public final class AlternateSpan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.AlternateSpan)
    AlternateSpanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlternateSpan.newBuilder() to construct.
  private AlternateSpan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlternateSpan() {
    alternates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlternateSpan();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlternateSpan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlternateSpan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.AlternateSpan.class, com.google.speech.logs.AlternateSpan.Builder.class);
  }

  private int bitField0_;
  public static final int START_FIELD_NUMBER = 1;
  private int start_;
  /**
   * <code>optional int32 start = 1;</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public int getStart() {
    return start_;
  }

  public static final int LENGTH_FIELD_NUMBER = 2;
  private int length_;
  /**
   * <code>optional int32 length = 2;</code>
   * @return Whether the length field is set.
   */
  @java.lang.Override
  public boolean hasLength() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 length = 2;</code>
   * @return The length.
   */
  @java.lang.Override
  public int getLength() {
    return length_;
  }

  public static final int ALTERNATES_FIELD_NUMBER = 3;
  private java.util.List<com.google.speech.logs.Alternate> alternates_;
  /**
   * <code>repeated .speech.logs.Alternate alternates = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.logs.Alternate> getAlternatesList() {
    return alternates_;
  }
  /**
   * <code>repeated .speech.logs.Alternate alternates = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.logs.AlternateOrBuilder> 
      getAlternatesOrBuilderList() {
    return alternates_;
  }
  /**
   * <code>repeated .speech.logs.Alternate alternates = 3;</code>
   */
  @java.lang.Override
  public int getAlternatesCount() {
    return alternates_.size();
  }
  /**
   * <code>repeated .speech.logs.Alternate alternates = 3;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.Alternate getAlternates(int index) {
    return alternates_.get(index);
  }
  /**
   * <code>repeated .speech.logs.Alternate alternates = 3;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.AlternateOrBuilder getAlternatesOrBuilder(
      int index) {
    return alternates_.get(index);
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 4;
  private float confidence_;
  /**
   * <code>optional float confidence = 4;</code>
   * @return Whether the confidence field is set.
   */
  @java.lang.Override
  public boolean hasConfidence() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional float confidence = 4;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
  }

  public static com.google.speech.logs.AlternateSpan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.AlternateSpan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlternateSpan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.AlternateSpan parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.AlternateSpan prototype) {
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
   * Protobuf type {@code speech.logs.AlternateSpan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.AlternateSpan)
      com.google.speech.logs.AlternateSpanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlternateSpan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlternateSpan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.AlternateSpan.class, com.google.speech.logs.AlternateSpan.Builder.class);
    }

    // Construct using com.google.speech.logs.AlternateSpan.newBuilder()
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
        getAlternatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      start_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      length_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (alternatesBuilder_ == null) {
        alternates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        alternatesBuilder_.clear();
      }
      confidence_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_AlternateSpan_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.AlternateSpan getDefaultInstanceForType() {
      return com.google.speech.logs.AlternateSpan.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.AlternateSpan build() {
      com.google.speech.logs.AlternateSpan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.AlternateSpan buildPartial() {
      com.google.speech.logs.AlternateSpan result = new com.google.speech.logs.AlternateSpan(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = start_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.length_ = length_;
        to_bitField0_ |= 0x00000002;
      }
      if (alternatesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          alternates_ = java.util.Collections.unmodifiableList(alternates_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.alternates_ = alternates_;
      } else {
        result.alternates_ = alternatesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.confidence_ = confidence_;
        to_bitField0_ |= 0x00000004;
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

    private int start_ ;
    /**
     * <code>optional int32 start = 1;</code>
     * @return Whether the start field is set.
     */
    @java.lang.Override
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public int getStart() {
      return start_;
    }
    /**
     * <code>optional int32 start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(int value) {
      bitField0_ |= 0x00000001;
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = 0;
      onChanged();
      return this;
    }

    private int length_ ;
    /**
     * <code>optional int32 length = 2;</code>
     * @return Whether the length field is set.
     */
    @java.lang.Override
    public boolean hasLength() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 length = 2;</code>
     * @return The length.
     */
    @java.lang.Override
    public int getLength() {
      return length_;
    }
    /**
     * <code>optional int32 length = 2;</code>
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(int value) {
      bitField0_ |= 0x00000002;
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 length = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      length_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.speech.logs.Alternate> alternates_ =
      java.util.Collections.emptyList();
    private void ensureAlternatesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        alternates_ = new java.util.ArrayList<com.google.speech.logs.Alternate>(alternates_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.Alternate, com.google.speech.logs.Alternate.Builder, com.google.speech.logs.AlternateOrBuilder> alternatesBuilder_;

    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public java.util.List<com.google.speech.logs.Alternate> getAlternatesList() {
      if (alternatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alternates_);
      } else {
        return alternatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public int getAlternatesCount() {
      if (alternatesBuilder_ == null) {
        return alternates_.size();
      } else {
        return alternatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public com.google.speech.logs.Alternate getAlternates(int index) {
      if (alternatesBuilder_ == null) {
        return alternates_.get(index);
      } else {
        return alternatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder setAlternates(
        int index, com.google.speech.logs.Alternate value) {
      if (alternatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternatesIsMutable();
        alternates_.set(index, value);
        onChanged();
      } else {
        alternatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder setAlternates(
        int index, com.google.speech.logs.Alternate.Builder builderForValue) {
      if (alternatesBuilder_ == null) {
        ensureAlternatesIsMutable();
        alternates_.set(index, builderForValue.build());
        onChanged();
      } else {
        alternatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder addAlternates(com.google.speech.logs.Alternate value) {
      if (alternatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternatesIsMutable();
        alternates_.add(value);
        onChanged();
      } else {
        alternatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder addAlternates(
        int index, com.google.speech.logs.Alternate value) {
      if (alternatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternatesIsMutable();
        alternates_.add(index, value);
        onChanged();
      } else {
        alternatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder addAlternates(
        com.google.speech.logs.Alternate.Builder builderForValue) {
      if (alternatesBuilder_ == null) {
        ensureAlternatesIsMutable();
        alternates_.add(builderForValue.build());
        onChanged();
      } else {
        alternatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder addAlternates(
        int index, com.google.speech.logs.Alternate.Builder builderForValue) {
      if (alternatesBuilder_ == null) {
        ensureAlternatesIsMutable();
        alternates_.add(index, builderForValue.build());
        onChanged();
      } else {
        alternatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder addAllAlternates(
        java.lang.Iterable<? extends com.google.speech.logs.Alternate> values) {
      if (alternatesBuilder_ == null) {
        ensureAlternatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alternates_);
        onChanged();
      } else {
        alternatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder clearAlternates() {
      if (alternatesBuilder_ == null) {
        alternates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        alternatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public Builder removeAlternates(int index) {
      if (alternatesBuilder_ == null) {
        ensureAlternatesIsMutable();
        alternates_.remove(index);
        onChanged();
      } else {
        alternatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public com.google.speech.logs.Alternate.Builder getAlternatesBuilder(
        int index) {
      return getAlternatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public com.google.speech.logs.AlternateOrBuilder getAlternatesOrBuilder(
        int index) {
      if (alternatesBuilder_ == null) {
        return alternates_.get(index);  } else {
        return alternatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public java.util.List<? extends com.google.speech.logs.AlternateOrBuilder> 
         getAlternatesOrBuilderList() {
      if (alternatesBuilder_ != null) {
        return alternatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alternates_);
      }
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public com.google.speech.logs.Alternate.Builder addAlternatesBuilder() {
      return getAlternatesFieldBuilder().addBuilder(
          com.google.speech.logs.Alternate.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public com.google.speech.logs.Alternate.Builder addAlternatesBuilder(
        int index) {
      return getAlternatesFieldBuilder().addBuilder(
          index, com.google.speech.logs.Alternate.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.Alternate alternates = 3;</code>
     */
    public java.util.List<com.google.speech.logs.Alternate.Builder> 
         getAlternatesBuilderList() {
      return getAlternatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.Alternate, com.google.speech.logs.Alternate.Builder, com.google.speech.logs.AlternateOrBuilder> 
        getAlternatesFieldBuilder() {
      if (alternatesBuilder_ == null) {
        alternatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.logs.Alternate, com.google.speech.logs.Alternate.Builder, com.google.speech.logs.AlternateOrBuilder>(
                alternates_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        alternates_ = null;
      }
      return alternatesBuilder_;
    }

    private float confidence_ ;
    /**
     * <code>optional float confidence = 4;</code>
     * @return Whether the confidence field is set.
     */
    @java.lang.Override
    public boolean hasConfidence() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional float confidence = 4;</code>
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <code>optional float confidence = 4;</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {
      bitField0_ |= 0x00000008;
      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float confidence = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000008);
      confidence_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.AlternateSpan)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.AlternateSpan)
  private static final com.google.speech.logs.AlternateSpan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.AlternateSpan();
  }

  public static com.google.speech.logs.AlternateSpan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AlternateSpan>
      PARSER = new com.google.protobuf.AbstractParser<AlternateSpan>() {
    @java.lang.Override
    public AlternateSpan parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlternateSpan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlternateSpan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.AlternateSpan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
