// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/dsp/filter/linear_filter_params.proto

package speech.dsp;

public final class LinearFilterParamsOuterClass {
  private LinearFilterParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LinearFilterParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:speech.dsp.LinearFilterParams)
      com.google.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<LinearFilterParams> {

    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @return A list containing the filterCoeffB.
     */
    java.util.List<java.lang.Double> getFilterCoeffBList();
    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @return The count of filterCoeffB.
     */
    int getFilterCoeffBCount();
    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @param index The index of the element to return.
     * @return The filterCoeffB at the given index.
     */
    double getFilterCoeffB(int index);

    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @return A list containing the filterCoeffA.
     */
    java.util.List<java.lang.Double> getFilterCoeffAList();
    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @return The count of filterCoeffA.
     */
    int getFilterCoeffACount();
    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @param index The index of the element to return.
     * @return The filterCoeffA at the given index.
     */
    double getFilterCoeffA(int index);
  }
  /**
   * Protobuf type {@code speech.dsp.LinearFilterParams}
   */
  public static final class LinearFilterParams extends
      com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
        LinearFilterParams> implements
      // @@protoc_insertion_point(message_implements:speech.dsp.LinearFilterParams)
      LinearFilterParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LinearFilterParams.newBuilder() to construct.
    private LinearFilterParams(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, ?> builder) {
      super(builder);
    }
    private LinearFilterParams() {
      filterCoeffB_ = emptyDoubleList();
      filterCoeffA_ = emptyDoubleList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LinearFilterParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return speech.dsp.LinearFilterParamsOuterClass.internal_static_speech_dsp_LinearFilterParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return speech.dsp.LinearFilterParamsOuterClass.internal_static_speech_dsp_LinearFilterParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.class, speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.Builder.class);
    }

    public static final int FILTER_COEFF_B_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.DoubleList filterCoeffB_;
    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @return A list containing the filterCoeffB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Double>
        getFilterCoeffBList() {
      return filterCoeffB_;
    }
    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @return The count of filterCoeffB.
     */
    public int getFilterCoeffBCount() {
      return filterCoeffB_.size();
    }
    /**
     * <code>repeated double filter_coeff_b = 1;</code>
     * @param index The index of the element to return.
     * @return The filterCoeffB at the given index.
     */
    public double getFilterCoeffB(int index) {
      return filterCoeffB_.getDouble(index);
    }

    public static final int FILTER_COEFF_A_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.DoubleList filterCoeffA_;
    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @return A list containing the filterCoeffA.
     */
    @java.lang.Override
    public java.util.List<java.lang.Double>
        getFilterCoeffAList() {
      return filterCoeffA_;
    }
    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @return The count of filterCoeffA.
     */
    public int getFilterCoeffACount() {
      return filterCoeffA_.size();
    }
    /**
     * <code>repeated double filter_coeff_a = 2;</code>
     * @param index The index of the element to return.
     * @return The filterCoeffA at the given index.
     */
    public double getFilterCoeffA(int index) {
      return filterCoeffA_.getDouble(index);
    }

    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams parseFrom(
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
    public static Builder newBuilder(speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams prototype) {
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
     * Protobuf type {@code speech.dsp.LinearFilterParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
          speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, Builder> implements
        // @@protoc_insertion_point(builder_implements:speech.dsp.LinearFilterParams)
        speech.dsp.LinearFilterParamsOuterClass.LinearFilterParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return speech.dsp.LinearFilterParamsOuterClass.internal_static_speech_dsp_LinearFilterParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return speech.dsp.LinearFilterParamsOuterClass.internal_static_speech_dsp_LinearFilterParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.class, speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.Builder.class);
      }

      // Construct using speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.newBuilder()
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
        filterCoeffB_ = emptyDoubleList();
        bitField0_ = (bitField0_ & ~0x00000001);
        filterCoeffA_ = emptyDoubleList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return speech.dsp.LinearFilterParamsOuterClass.internal_static_speech_dsp_LinearFilterParams_descriptor;
      }

      @java.lang.Override
      public speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams getDefaultInstanceForType() {
        return speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.getDefaultInstance();
      }

      @java.lang.Override
      public speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams build() {
        speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams buildPartial() {
        speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams result = new speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          filterCoeffB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filterCoeffB_ = filterCoeffB_;
        if (((bitField0_ & 0x00000002) != 0)) {
          filterCoeffA_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.filterCoeffA_ = filterCoeffA_;
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
      @java.lang.Override
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, Type> extension,
          Type value) {
        return super.setExtension(extension, value);
      }
      @java.lang.Override
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, java.util.List<Type>> extension,
          int index, Type value) {
        return super.setExtension(extension, index, value);
      }
      @java.lang.Override
      public <Type> Builder addExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, java.util.List<Type>> extension,
          Type value) {
        return super.addExtension(extension, value);
      }
      @java.lang.Override
      public <Type> Builder clearExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams, ?> extension) {
        return super.clearExtension(extension);
      }
      private int bitField0_;

      private com.google.protobuf.Internal.DoubleList filterCoeffB_ = emptyDoubleList();
      private void ensureFilterCoeffBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          filterCoeffB_ = mutableCopy(filterCoeffB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @return A list containing the filterCoeffB.
       */
      public java.util.List<java.lang.Double>
          getFilterCoeffBList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(filterCoeffB_) : filterCoeffB_;
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @return The count of filterCoeffB.
       */
      public int getFilterCoeffBCount() {
        return filterCoeffB_.size();
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @param index The index of the element to return.
       * @return The filterCoeffB at the given index.
       */
      public double getFilterCoeffB(int index) {
        return filterCoeffB_.getDouble(index);
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @param index The index to set the value at.
       * @param value The filterCoeffB to set.
       * @return This builder for chaining.
       */
      public Builder setFilterCoeffB(
          int index, double value) {
        ensureFilterCoeffBIsMutable();
        filterCoeffB_.setDouble(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @param value The filterCoeffB to add.
       * @return This builder for chaining.
       */
      public Builder addFilterCoeffB(double value) {
        ensureFilterCoeffBIsMutable();
        filterCoeffB_.addDouble(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @param values The filterCoeffB to add.
       * @return This builder for chaining.
       */
      public Builder addAllFilterCoeffB(
          java.lang.Iterable<? extends java.lang.Double> values) {
        ensureFilterCoeffBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filterCoeffB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_b = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilterCoeffB() {
        filterCoeffB_ = emptyDoubleList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.DoubleList filterCoeffA_ = emptyDoubleList();
      private void ensureFilterCoeffAIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          filterCoeffA_ = mutableCopy(filterCoeffA_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @return A list containing the filterCoeffA.
       */
      public java.util.List<java.lang.Double>
          getFilterCoeffAList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(filterCoeffA_) : filterCoeffA_;
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @return The count of filterCoeffA.
       */
      public int getFilterCoeffACount() {
        return filterCoeffA_.size();
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @param index The index of the element to return.
       * @return The filterCoeffA at the given index.
       */
      public double getFilterCoeffA(int index) {
        return filterCoeffA_.getDouble(index);
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @param index The index to set the value at.
       * @param value The filterCoeffA to set.
       * @return This builder for chaining.
       */
      public Builder setFilterCoeffA(
          int index, double value) {
        ensureFilterCoeffAIsMutable();
        filterCoeffA_.setDouble(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @param value The filterCoeffA to add.
       * @return This builder for chaining.
       */
      public Builder addFilterCoeffA(double value) {
        ensureFilterCoeffAIsMutable();
        filterCoeffA_.addDouble(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @param values The filterCoeffA to add.
       * @return This builder for chaining.
       */
      public Builder addAllFilterCoeffA(
          java.lang.Iterable<? extends java.lang.Double> values) {
        ensureFilterCoeffAIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filterCoeffA_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double filter_coeff_a = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilterCoeffA() {
        filterCoeffA_ = emptyDoubleList();
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


      // @@protoc_insertion_point(builder_scope:speech.dsp.LinearFilterParams)
    }

    // @@protoc_insertion_point(class_scope:speech.dsp.LinearFilterParams)
    private static final speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams();
    }

    public static speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LinearFilterParams>
        PARSER = new com.google.protobuf.AbstractParser<LinearFilterParams>() {
      @java.lang.Override
      public LinearFilterParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<LinearFilterParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LinearFilterParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 23104211;
    /**
     * <code>extend .speech.dsp.FilterParams { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        speech.dsp.FilterParamsOuterClass.FilterParams,
        speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.getDefaultInstance(),
          0,
          speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.class,
          speech.dsp.LinearFilterParamsOuterClass.LinearFilterParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_dsp_LinearFilterParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_dsp_LinearFilterParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,speech/dsp/filter/linear_filter_params" +
      ".proto\022\nspeech.dsp\032%speech/dsp/filter/fi" +
      "lter_params.proto\"\230\001\n\022LinearFilterParams" +
      "\022\026\n\016filter_coeff_b\030\001 \003(\001\022\026\n\016filter_coeff" +
      "_a\030\002 \003(\001*\t\010\200\001\020\200\200\200\200\0022G\n\002id\022\030.speech.dsp.F" +
      "ilterParams\030\323\225\202\013 \001(\0132\036.speech.dsp.Linear" +
      "FilterParamsB\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          speech.dsp.FilterParamsOuterClass.getDescriptor(),
        });
    internal_static_speech_dsp_LinearFilterParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_dsp_LinearFilterParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_dsp_LinearFilterParams_descriptor,
        new java.lang.String[] { "FilterCoeffB", "FilterCoeffA", });
    speech.dsp.FilterParamsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}