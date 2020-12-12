// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/lstm/mean_stddev.proto

package lstm;

public final class MeanStddev {
  private MeanStddev() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MeanStdDevOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lstm.MeanStdDev)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @return A list containing the mean.
     */
    java.util.List<java.lang.Float> getMeanList();
    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @return The count of mean.
     */
    int getMeanCount();
    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The mean at the given index.
     */
    float getMean(int index);

    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @return A list containing the stdDev.
     */
    java.util.List<java.lang.Float> getStdDevList();
    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @return The count of stdDev.
     */
    int getStdDevCount();
    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The stdDev at the given index.
     */
    float getStdDev(int index);
  }
  /**
   * Protobuf type {@code lstm.MeanStdDev}
   */
  public static final class MeanStdDev extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lstm.MeanStdDev)
      MeanStdDevOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MeanStdDev.newBuilder() to construct.
    private MeanStdDev(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MeanStdDev() {
      mean_ = emptyFloatList();
      stdDev_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MeanStdDev();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lstm.MeanStddev.internal_static_lstm_MeanStdDev_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lstm.MeanStddev.internal_static_lstm_MeanStdDev_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lstm.MeanStddev.MeanStdDev.class, lstm.MeanStddev.MeanStdDev.Builder.class);
    }

    public static final int MEAN_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.FloatList mean_;
    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @return A list containing the mean.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getMeanList() {
      return mean_;
    }
    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @return The count of mean.
     */
    public int getMeanCount() {
      return mean_.size();
    }
    /**
     * <code>repeated float mean = 1 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The mean at the given index.
     */
    public float getMean(int index) {
      return mean_.getFloat(index);
    }
    private int meanMemoizedSerializedSize = -1;

    public static final int STD_DEV_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.FloatList stdDev_;
    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @return A list containing the stdDev.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getStdDevList() {
      return stdDev_;
    }
    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @return The count of stdDev.
     */
    public int getStdDevCount() {
      return stdDev_.size();
    }
    /**
     * <code>repeated float std_dev = 2 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The stdDev at the given index.
     */
    public float getStdDev(int index) {
      return stdDev_.getFloat(index);
    }
    private int stdDevMemoizedSerializedSize = -1;

    public static lstm.MeanStddev.MeanStdDev parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static lstm.MeanStddev.MeanStdDev parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static lstm.MeanStddev.MeanStdDev parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lstm.MeanStddev.MeanStdDev parseFrom(
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
    public static Builder newBuilder(lstm.MeanStddev.MeanStdDev prototype) {
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
     * Protobuf type {@code lstm.MeanStdDev}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lstm.MeanStdDev)
        lstm.MeanStddev.MeanStdDevOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return lstm.MeanStddev.internal_static_lstm_MeanStdDev_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return lstm.MeanStddev.internal_static_lstm_MeanStdDev_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                lstm.MeanStddev.MeanStdDev.class, lstm.MeanStddev.MeanStdDev.Builder.class);
      }

      // Construct using lstm.MeanStddev.MeanStdDev.newBuilder()
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
        mean_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
        stdDev_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return lstm.MeanStddev.internal_static_lstm_MeanStdDev_descriptor;
      }

      @java.lang.Override
      public lstm.MeanStddev.MeanStdDev getDefaultInstanceForType() {
        return lstm.MeanStddev.MeanStdDev.getDefaultInstance();
      }

      @java.lang.Override
      public lstm.MeanStddev.MeanStdDev build() {
        lstm.MeanStddev.MeanStdDev result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public lstm.MeanStddev.MeanStdDev buildPartial() {
        lstm.MeanStddev.MeanStdDev result = new lstm.MeanStddev.MeanStdDev(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mean_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mean_ = mean_;
        if (((bitField0_ & 0x00000002) != 0)) {
          stdDev_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.stdDev_ = stdDev_;
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

      private com.google.protobuf.Internal.FloatList mean_ = emptyFloatList();
      private void ensureMeanIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mean_ = mutableCopy(mean_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @return A list containing the mean.
       */
      public java.util.List<java.lang.Float>
          getMeanList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mean_) : mean_;
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @return The count of mean.
       */
      public int getMeanCount() {
        return mean_.size();
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The mean at the given index.
       */
      public float getMean(int index) {
        return mean_.getFloat(index);
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @param index The index to set the value at.
       * @param value The mean to set.
       * @return This builder for chaining.
       */
      public Builder setMean(
          int index, float value) {
        ensureMeanIsMutable();
        mean_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @param value The mean to add.
       * @return This builder for chaining.
       */
      public Builder addMean(float value) {
        ensureMeanIsMutable();
        mean_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @param values The mean to add.
       * @return This builder for chaining.
       */
      public Builder addAllMean(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureMeanIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mean_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float mean = 1 [packed = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearMean() {
        mean_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList stdDev_ = emptyFloatList();
      private void ensureStdDevIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          stdDev_ = mutableCopy(stdDev_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @return A list containing the stdDev.
       */
      public java.util.List<java.lang.Float>
          getStdDevList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(stdDev_) : stdDev_;
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @return The count of stdDev.
       */
      public int getStdDevCount() {
        return stdDev_.size();
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The stdDev at the given index.
       */
      public float getStdDev(int index) {
        return stdDev_.getFloat(index);
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @param index The index to set the value at.
       * @param value The stdDev to set.
       * @return This builder for chaining.
       */
      public Builder setStdDev(
          int index, float value) {
        ensureStdDevIsMutable();
        stdDev_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @param value The stdDev to add.
       * @return This builder for chaining.
       */
      public Builder addStdDev(float value) {
        ensureStdDevIsMutable();
        stdDev_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @param values The stdDev to add.
       * @return This builder for chaining.
       */
      public Builder addAllStdDev(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureStdDevIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stdDev_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float std_dev = 2 [packed = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearStdDev() {
        stdDev_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:lstm.MeanStdDev)
    }

    // @@protoc_insertion_point(class_scope:lstm.MeanStdDev)
    private static final lstm.MeanStddev.MeanStdDev DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new lstm.MeanStddev.MeanStdDev();
    }

    public static lstm.MeanStddev.MeanStdDev getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MeanStdDev>
        PARSER = new com.google.protobuf.AbstractParser<MeanStdDev>() {
      @java.lang.Override
      public MeanStdDev parsePartialFrom(
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

    public static com.google.protobuf.Parser<MeanStdDev> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MeanStdDev> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public lstm.MeanStddev.MeanStdDev getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lstm_MeanStdDev_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lstm_MeanStdDev_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035speech/lstm/mean_stddev.proto\022\004lstm\"3\n" +
      "\nMeanStdDev\022\020\n\004mean\030\001 \003(\002B\002\020\001\022\023\n\007std_dev" +
      "\030\002 \003(\002B\002\020\001B\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_lstm_MeanStdDev_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lstm_MeanStdDev_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lstm_MeanStdDev_descriptor,
        new java.lang.String[] { "Mean", "StdDev", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}