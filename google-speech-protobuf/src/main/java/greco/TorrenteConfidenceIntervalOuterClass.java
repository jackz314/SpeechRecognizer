// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/speakerid/torrente_confidence_interval.proto

package greco;

public final class TorrenteConfidenceIntervalOuterClass {
  private TorrenteConfidenceIntervalOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TorrenteConfidenceIntervalOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.TorrenteConfidenceInterval)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
     * @return Whether the label field is set.
     */
    boolean hasLabel();
    /**
     * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
     * @return The label.
     */
    com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel getLabel();

    /**
     * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
     * @return Whether the leftBoundaryInclusive field is set.
     */
    boolean hasLeftBoundaryInclusive();
    /**
     * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
     * @return The leftBoundaryInclusive.
     */
    float getLeftBoundaryInclusive();

    /**
     * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
     * @return Whether the rightBoundaryExclusive field is set.
     */
    boolean hasRightBoundaryExclusive();
    /**
     * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
     * @return The rightBoundaryExclusive.
     */
    float getRightBoundaryExclusive();
  }
  /**
   * Protobuf type {@code greco.TorrenteConfidenceInterval}
   */
  public static final class TorrenteConfidenceInterval extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.TorrenteConfidenceInterval)
      TorrenteConfidenceIntervalOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TorrenteConfidenceInterval.newBuilder() to construct.
    private TorrenteConfidenceInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TorrenteConfidenceInterval() {
      label_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TorrenteConfidenceInterval();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.TorrenteConfidenceIntervalOuterClass.internal_static_greco_TorrenteConfidenceInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.TorrenteConfidenceIntervalOuterClass.internal_static_greco_TorrenteConfidenceInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.class, greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.Builder.class);
    }

    private int bitField0_;
    public static final int LABEL_FIELD_NUMBER = 1;
    private int label_;
    /**
     * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
     * @return Whether the label field is set.
     */
    @java.lang.Override public boolean hasLabel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
     * @return The label.
     */
    @java.lang.Override public com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel getLabel() {
      @SuppressWarnings("deprecation")
      com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel result = com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel.valueOf(label_);
      return result == null ? com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel.DEFAULT_INTERVAL_GUEST : result;
    }

    public static final int LEFT_BOUNDARY_INCLUSIVE_FIELD_NUMBER = 2;
    private float leftBoundaryInclusive_;
    /**
     * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
     * @return Whether the leftBoundaryInclusive field is set.
     */
    @java.lang.Override
    public boolean hasLeftBoundaryInclusive() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
     * @return The leftBoundaryInclusive.
     */
    @java.lang.Override
    public float getLeftBoundaryInclusive() {
      return leftBoundaryInclusive_;
    }

    public static final int RIGHT_BOUNDARY_EXCLUSIVE_FIELD_NUMBER = 3;
    private float rightBoundaryExclusive_;
    /**
     * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
     * @return Whether the rightBoundaryExclusive field is set.
     */
    @java.lang.Override
    public boolean hasRightBoundaryExclusive() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
     * @return The rightBoundaryExclusive.
     */
    @java.lang.Override
    public float getRightBoundaryExclusive() {
      return rightBoundaryExclusive_;
    }

    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval parseFrom(
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
    public static Builder newBuilder(greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval prototype) {
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
     * Protobuf type {@code greco.TorrenteConfidenceInterval}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.TorrenteConfidenceInterval)
        greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceIntervalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.TorrenteConfidenceIntervalOuterClass.internal_static_greco_TorrenteConfidenceInterval_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.TorrenteConfidenceIntervalOuterClass.internal_static_greco_TorrenteConfidenceInterval_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.class, greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.Builder.class);
      }

      // Construct using greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.newBuilder()
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
        label_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        leftBoundaryInclusive_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        rightBoundaryExclusive_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.TorrenteConfidenceIntervalOuterClass.internal_static_greco_TorrenteConfidenceInterval_descriptor;
      }

      @java.lang.Override
      public greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval getDefaultInstanceForType() {
        return greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval.getDefaultInstance();
      }

      @java.lang.Override
      public greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval build() {
        greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval buildPartial() {
        greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval result = new greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.label_ = label_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.leftBoundaryInclusive_ = leftBoundaryInclusive_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.rightBoundaryExclusive_ = rightBoundaryExclusive_;
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

      private int label_ = 0;
      /**
       * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
       * @return Whether the label field is set.
       */
      @java.lang.Override public boolean hasLabel() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
       * @return The label.
       */
      @java.lang.Override
      public com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel getLabel() {
        @SuppressWarnings("deprecation")
        com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel result = com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel.valueOf(label_);
        return result == null ? com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel.DEFAULT_INTERVAL_GUEST : result;
      }
      /**
       * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
       * @param value The label to set.
       * @return This builder for chaining.
       */
      public Builder setLabel(com.google.speech.s3.ConfidenceIntervalLabelOuterClass.ConfidenceIntervalLabel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        label_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .speech.s3.ConfidenceIntervalLabel label = 1 [default = DEFAULT_INTERVAL_GUEST];</code>
       * @return This builder for chaining.
       */
      public Builder clearLabel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        label_ = 0;
        onChanged();
        return this;
      }

      private float leftBoundaryInclusive_ ;
      /**
       * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
       * @return Whether the leftBoundaryInclusive field is set.
       */
      @java.lang.Override
      public boolean hasLeftBoundaryInclusive() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
       * @return The leftBoundaryInclusive.
       */
      @java.lang.Override
      public float getLeftBoundaryInclusive() {
        return leftBoundaryInclusive_;
      }
      /**
       * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
       * @param value The leftBoundaryInclusive to set.
       * @return This builder for chaining.
       */
      public Builder setLeftBoundaryInclusive(float value) {
        bitField0_ |= 0x00000002;
        leftBoundaryInclusive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float left_boundary_inclusive = 2 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftBoundaryInclusive() {
        bitField0_ = (bitField0_ & ~0x00000002);
        leftBoundaryInclusive_ = 0F;
        onChanged();
        return this;
      }

      private float rightBoundaryExclusive_ ;
      /**
       * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
       * @return Whether the rightBoundaryExclusive field is set.
       */
      @java.lang.Override
      public boolean hasRightBoundaryExclusive() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
       * @return The rightBoundaryExclusive.
       */
      @java.lang.Override
      public float getRightBoundaryExclusive() {
        return rightBoundaryExclusive_;
      }
      /**
       * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
       * @param value The rightBoundaryExclusive to set.
       * @return This builder for chaining.
       */
      public Builder setRightBoundaryExclusive(float value) {
        bitField0_ |= 0x00000004;
        rightBoundaryExclusive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float right_boundary_exclusive = 3 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearRightBoundaryExclusive() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rightBoundaryExclusive_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:greco.TorrenteConfidenceInterval)
    }

    // @@protoc_insertion_point(class_scope:greco.TorrenteConfidenceInterval)
    private static final greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval();
    }

    public static greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TorrenteConfidenceInterval>
        PARSER = new com.google.protobuf.AbstractParser<TorrenteConfidenceInterval>() {
      @java.lang.Override
      public TorrenteConfidenceInterval parsePartialFrom(
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

    public static com.google.protobuf.Parser<TorrenteConfidenceInterval> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TorrenteConfidenceInterval> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.TorrenteConfidenceIntervalOuterClass.TorrenteConfidenceInterval getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_TorrenteConfidenceInterval_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_TorrenteConfidenceInterval_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:speech/greco3/speakerid/torrente_confi" +
      "dence_interval.proto\022\005greco\032Mspeech/serv" +
      "ice/s3/services/speakerid/frontend/confi" +
      "dence-interval-label.proto\"\260\001\n\032TorrenteC" +
      "onfidenceInterval\022I\n\005label\030\001 \001(\0162\".speec" +
      "h.s3.ConfidenceIntervalLabel:\026DEFAULT_IN" +
      "TERVAL_GUEST\022\"\n\027left_boundary_inclusive\030" +
      "\002 \001(\002:\0010\022#\n\030right_boundary_exclusive\030\003 \001" +
      "(\002:\0010B\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.s3.ConfidenceIntervalLabelOuterClass.getDescriptor(),
        });
    internal_static_greco_TorrenteConfidenceInterval_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_TorrenteConfidenceInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_TorrenteConfidenceInterval_descriptor,
        new java.lang.String[] { "Label", "LeftBoundaryInclusive", "RightBoundaryExclusive", });
    com.google.speech.s3.ConfidenceIntervalLabelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
