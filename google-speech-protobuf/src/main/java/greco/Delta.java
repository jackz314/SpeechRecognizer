// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/delta.proto

package greco;

public final class Delta {
  private Delta() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.Delta.DeltaParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeltaParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.DeltaParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 reach = 1 [default = 2];</code>
     * @return Whether the reach field is set.
     */
    boolean hasReach();
    /**
     * <code>optional uint32 reach = 1 [default = 2];</code>
     * @return The reach.
     */
    int getReach();

    /**
     * <code>optional int32 input_size = 2 [default = 13];</code>
     * @return Whether the inputSize field is set.
     */
    boolean hasInputSize();
    /**
     * <code>optional int32 input_size = 2 [default = 13];</code>
     * @return The inputSize.
     */
    int getInputSize();
  }
  /**
   * Protobuf type {@code greco.DeltaParams}
   */
  public static final class DeltaParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.DeltaParams)
      DeltaParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeltaParams.newBuilder() to construct.
    private DeltaParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeltaParams() {
      reach_ = 2;
      inputSize_ = 13;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeltaParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.Delta.internal_static_greco_DeltaParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.Delta.internal_static_greco_DeltaParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.Delta.DeltaParams.class, greco.Delta.DeltaParams.Builder.class);
    }

    private int bitField0_;
    public static final int REACH_FIELD_NUMBER = 1;
    private int reach_;
    /**
     * <code>optional uint32 reach = 1 [default = 2];</code>
     * @return Whether the reach field is set.
     */
    @java.lang.Override
    public boolean hasReach() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 reach = 1 [default = 2];</code>
     * @return The reach.
     */
    @java.lang.Override
    public int getReach() {
      return reach_;
    }

    public static final int INPUT_SIZE_FIELD_NUMBER = 2;
    private int inputSize_;
    /**
     * <code>optional int32 input_size = 2 [default = 13];</code>
     * @return Whether the inputSize field is set.
     */
    @java.lang.Override
    public boolean hasInputSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 input_size = 2 [default = 13];</code>
     * @return The inputSize.
     */
    @java.lang.Override
    public int getInputSize() {
      return inputSize_;
    }

    public static greco.Delta.DeltaParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Delta.DeltaParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Delta.DeltaParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Delta.DeltaParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Delta.DeltaParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Delta.DeltaParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Delta.DeltaParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Delta.DeltaParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Delta.DeltaParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.Delta.DeltaParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Delta.DeltaParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Delta.DeltaParams parseFrom(
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
    public static Builder newBuilder(greco.Delta.DeltaParams prototype) {
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
     * Protobuf type {@code greco.DeltaParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.DeltaParams)
        greco.Delta.DeltaParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.Delta.internal_static_greco_DeltaParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.Delta.internal_static_greco_DeltaParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.Delta.DeltaParams.class, greco.Delta.DeltaParams.Builder.class);
      }

      // Construct using greco.Delta.DeltaParams.newBuilder()
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
        reach_ = 2;
        bitField0_ = (bitField0_ & ~0x00000001);
        inputSize_ = 13;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.Delta.internal_static_greco_DeltaParams_descriptor;
      }

      @java.lang.Override
      public greco.Delta.DeltaParams getDefaultInstanceForType() {
        return greco.Delta.DeltaParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.Delta.DeltaParams build() {
        greco.Delta.DeltaParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.Delta.DeltaParams buildPartial() {
        greco.Delta.DeltaParams result = new greco.Delta.DeltaParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.reach_ = reach_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.inputSize_ = inputSize_;
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

      private int reach_ = 2;
      /**
       * <code>optional uint32 reach = 1 [default = 2];</code>
       * @return Whether the reach field is set.
       */
      @java.lang.Override
      public boolean hasReach() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint32 reach = 1 [default = 2];</code>
       * @return The reach.
       */
      @java.lang.Override
      public int getReach() {
        return reach_;
      }
      /**
       * <code>optional uint32 reach = 1 [default = 2];</code>
       * @param value The reach to set.
       * @return This builder for chaining.
       */
      public Builder setReach(int value) {
        bitField0_ |= 0x00000001;
        reach_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 reach = 1 [default = 2];</code>
       * @return This builder for chaining.
       */
      public Builder clearReach() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reach_ = 2;
        onChanged();
        return this;
      }

      private int inputSize_ = 13;
      /**
       * <code>optional int32 input_size = 2 [default = 13];</code>
       * @return Whether the inputSize field is set.
       */
      @java.lang.Override
      public boolean hasInputSize() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 input_size = 2 [default = 13];</code>
       * @return The inputSize.
       */
      @java.lang.Override
      public int getInputSize() {
        return inputSize_;
      }
      /**
       * <code>optional int32 input_size = 2 [default = 13];</code>
       * @param value The inputSize to set.
       * @return This builder for chaining.
       */
      public Builder setInputSize(int value) {
        bitField0_ |= 0x00000002;
        inputSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 input_size = 2 [default = 13];</code>
       * @return This builder for chaining.
       */
      public Builder clearInputSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        inputSize_ = 13;
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


      // @@protoc_insertion_point(builder_scope:greco.DeltaParams)
    }

    // @@protoc_insertion_point(class_scope:greco.DeltaParams)
    private static final greco.Delta.DeltaParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.Delta.DeltaParams();
    }

    public static greco.Delta.DeltaParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DeltaParams>
        PARSER = new com.google.protobuf.AbstractParser<DeltaParams>() {
      @java.lang.Override
      public DeltaParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<DeltaParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeltaParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.Delta.DeltaParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 19077715;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.Delta.DeltaParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.Delta.DeltaParams.getDefaultInstance(),
          0,
          greco.Delta.DeltaParams.class,
          greco.Delta.DeltaParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_DeltaParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_DeltaParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"speech/greco3/frontend/delta.proto\022\005gr" +
      "eco\032\037speech/greco3/core/params.proto\"i\n\013" +
      "DeltaParams\022\020\n\005reach\030\001 \001(\r:\0012\022\026\n\ninput_s" +
      "ize\030\002 \001(\005:\0021320\n\002id\022\r.greco.Params\030\323\264\214\t " +
      "\001(\0132\022.greco.DeltaParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_DeltaParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_DeltaParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_DeltaParams_descriptor,
        new java.lang.String[] { "Reach", "InputSize", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
