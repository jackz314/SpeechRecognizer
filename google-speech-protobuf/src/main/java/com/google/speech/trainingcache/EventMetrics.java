// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/metrics.proto

package com.google.speech.trainingcache;

/**
 * Protobuf type {@code speech.training_cache.EventMetrics}
 */
public final class EventMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.training_cache.EventMetrics)
    EventMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventMetrics.newBuilder() to construct.
  private EventMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.trainingcache.Metrics.internal_static_speech_training_cache_EventMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.trainingcache.Metrics.internal_static_speech_training_cache_EventMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.trainingcache.EventMetrics.class, com.google.speech.trainingcache.EventMetrics.Builder.class);
  }

  private int bitField0_;
  public static final int NUM_EVENTS_FIELD_NUMBER = 1;
  private long numEvents_;
  /**
   * <code>optional int64 num_events = 1;</code>
   * @return Whether the numEvents field is set.
   */
  @java.lang.Override
  public boolean hasNumEvents() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 num_events = 1;</code>
   * @return The numEvents.
   */
  @java.lang.Override
  public long getNumEvents() {
    return numEvents_;
  }

  public static final int NUM_BYTES_IN_TOTAL_FIELD_NUMBER = 2;
  private long numBytesInTotal_;
  /**
   * <code>optional int64 num_bytes_in_total = 2;</code>
   * @return Whether the numBytesInTotal field is set.
   */
  @java.lang.Override
  public boolean hasNumBytesInTotal() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 num_bytes_in_total = 2;</code>
   * @return The numBytesInTotal.
   */
  @java.lang.Override
  public long getNumBytesInTotal() {
    return numBytesInTotal_;
  }

  public static final int NUM_BYTES_HISTOGRAM_FIELD_NUMBER = 3;
  private com.google.speech.trainingcache.Histogram numBytesHistogram_;
  /**
   * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
   * @return Whether the numBytesHistogram field is set.
   */
  @java.lang.Override
  public boolean hasNumBytesHistogram() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
   * @return The numBytesHistogram.
   */
  @java.lang.Override
  public com.google.speech.trainingcache.Histogram getNumBytesHistogram() {
    return numBytesHistogram_ == null ? com.google.speech.trainingcache.Histogram.getDefaultInstance() : numBytesHistogram_;
  }
  /**
   * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.HistogramOrBuilder getNumBytesHistogramOrBuilder() {
    return numBytesHistogram_ == null ? com.google.speech.trainingcache.Histogram.getDefaultInstance() : numBytesHistogram_;
  }

  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.EventMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.EventMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.EventMetrics parseFrom(
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
  public static Builder newBuilder(com.google.speech.trainingcache.EventMetrics prototype) {
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
   * Protobuf type {@code speech.training_cache.EventMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.training_cache.EventMetrics)
      com.google.speech.trainingcache.EventMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.trainingcache.Metrics.internal_static_speech_training_cache_EventMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.trainingcache.Metrics.internal_static_speech_training_cache_EventMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.trainingcache.EventMetrics.class, com.google.speech.trainingcache.EventMetrics.Builder.class);
    }

    // Construct using com.google.speech.trainingcache.EventMetrics.newBuilder()
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
        getNumBytesHistogramFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      numEvents_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      numBytesInTotal_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (numBytesHistogramBuilder_ == null) {
        numBytesHistogram_ = null;
      } else {
        numBytesHistogramBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.trainingcache.Metrics.internal_static_speech_training_cache_EventMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.EventMetrics getDefaultInstanceForType() {
      return com.google.speech.trainingcache.EventMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.trainingcache.EventMetrics build() {
      com.google.speech.trainingcache.EventMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.EventMetrics buildPartial() {
      com.google.speech.trainingcache.EventMetrics result = new com.google.speech.trainingcache.EventMetrics(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numEvents_ = numEvents_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numBytesInTotal_ = numBytesInTotal_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (numBytesHistogramBuilder_ == null) {
          result.numBytesHistogram_ = numBytesHistogram_;
        } else {
          result.numBytesHistogram_ = numBytesHistogramBuilder_.build();
        }
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

    private long numEvents_ ;
    /**
     * <code>optional int64 num_events = 1;</code>
     * @return Whether the numEvents field is set.
     */
    @java.lang.Override
    public boolean hasNumEvents() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 num_events = 1;</code>
     * @return The numEvents.
     */
    @java.lang.Override
    public long getNumEvents() {
      return numEvents_;
    }
    /**
     * <code>optional int64 num_events = 1;</code>
     * @param value The numEvents to set.
     * @return This builder for chaining.
     */
    public Builder setNumEvents(long value) {
      bitField0_ |= 0x00000001;
      numEvents_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 num_events = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumEvents() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numEvents_ = 0L;
      onChanged();
      return this;
    }

    private long numBytesInTotal_ ;
    /**
     * <code>optional int64 num_bytes_in_total = 2;</code>
     * @return Whether the numBytesInTotal field is set.
     */
    @java.lang.Override
    public boolean hasNumBytesInTotal() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 num_bytes_in_total = 2;</code>
     * @return The numBytesInTotal.
     */
    @java.lang.Override
    public long getNumBytesInTotal() {
      return numBytesInTotal_;
    }
    /**
     * <code>optional int64 num_bytes_in_total = 2;</code>
     * @param value The numBytesInTotal to set.
     * @return This builder for chaining.
     */
    public Builder setNumBytesInTotal(long value) {
      bitField0_ |= 0x00000002;
      numBytesInTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 num_bytes_in_total = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumBytesInTotal() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numBytesInTotal_ = 0L;
      onChanged();
      return this;
    }

    private com.google.speech.trainingcache.Histogram numBytesHistogram_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.trainingcache.Histogram, com.google.speech.trainingcache.Histogram.Builder, com.google.speech.trainingcache.HistogramOrBuilder> numBytesHistogramBuilder_;
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     * @return Whether the numBytesHistogram field is set.
     */
    public boolean hasNumBytesHistogram() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     * @return The numBytesHistogram.
     */
    public com.google.speech.trainingcache.Histogram getNumBytesHistogram() {
      if (numBytesHistogramBuilder_ == null) {
        return numBytesHistogram_ == null ? com.google.speech.trainingcache.Histogram.getDefaultInstance() : numBytesHistogram_;
      } else {
        return numBytesHistogramBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public Builder setNumBytesHistogram(com.google.speech.trainingcache.Histogram value) {
      if (numBytesHistogramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        numBytesHistogram_ = value;
        onChanged();
      } else {
        numBytesHistogramBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public Builder setNumBytesHistogram(
        com.google.speech.trainingcache.Histogram.Builder builderForValue) {
      if (numBytesHistogramBuilder_ == null) {
        numBytesHistogram_ = builderForValue.build();
        onChanged();
      } else {
        numBytesHistogramBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public Builder mergeNumBytesHistogram(com.google.speech.trainingcache.Histogram value) {
      if (numBytesHistogramBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            numBytesHistogram_ != null &&
            numBytesHistogram_ != com.google.speech.trainingcache.Histogram.getDefaultInstance()) {
          numBytesHistogram_ =
            com.google.speech.trainingcache.Histogram.newBuilder(numBytesHistogram_).mergeFrom(value).buildPartial();
        } else {
          numBytesHistogram_ = value;
        }
        onChanged();
      } else {
        numBytesHistogramBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public Builder clearNumBytesHistogram() {
      if (numBytesHistogramBuilder_ == null) {
        numBytesHistogram_ = null;
        onChanged();
      } else {
        numBytesHistogramBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public com.google.speech.trainingcache.Histogram.Builder getNumBytesHistogramBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getNumBytesHistogramFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    public com.google.speech.trainingcache.HistogramOrBuilder getNumBytesHistogramOrBuilder() {
      if (numBytesHistogramBuilder_ != null) {
        return numBytesHistogramBuilder_.getMessageOrBuilder();
      } else {
        return numBytesHistogram_ == null ?
            com.google.speech.trainingcache.Histogram.getDefaultInstance() : numBytesHistogram_;
      }
    }
    /**
     * <code>optional .speech.training_cache.Histogram num_bytes_histogram = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.trainingcache.Histogram, com.google.speech.trainingcache.Histogram.Builder, com.google.speech.trainingcache.HistogramOrBuilder> 
        getNumBytesHistogramFieldBuilder() {
      if (numBytesHistogramBuilder_ == null) {
        numBytesHistogramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.trainingcache.Histogram, com.google.speech.trainingcache.Histogram.Builder, com.google.speech.trainingcache.HistogramOrBuilder>(
                getNumBytesHistogram(),
                getParentForChildren(),
                isClean());
        numBytesHistogram_ = null;
      }
      return numBytesHistogramBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speech.training_cache.EventMetrics)
  }

  // @@protoc_insertion_point(class_scope:speech.training_cache.EventMetrics)
  private static final com.google.speech.trainingcache.EventMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.trainingcache.EventMetrics();
  }

  public static com.google.speech.trainingcache.EventMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EventMetrics>
      PARSER = new com.google.protobuf.AbstractParser<EventMetrics>() {
    @java.lang.Override
    public EventMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.trainingcache.EventMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

