// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/cepstrum.proto

package greco;

public final class Cepstrum {
  private Cepstrum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.Cepstrum.CepstrumParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CepstrumParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.CepstrumParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 channel_count = 1 [default = 20];</code>
     * @return Whether the channelCount field is set.
     */
    boolean hasChannelCount();
    /**
     * <code>optional int32 channel_count = 1 [default = 20];</code>
     * @return The channelCount.
     */
    int getChannelCount();

    /**
     * <code>optional int32 coeff_count = 2 [default = 13];</code>
     * @return Whether the coeffCount field is set.
     */
    boolean hasCoeffCount();
    /**
     * <code>optional int32 coeff_count = 2 [default = 13];</code>
     * @return The coeffCount.
     */
    int getCoeffCount();

    /**
     * <code>optional int32 lifter_param = 3 [default = 22];</code>
     * @return Whether the lifterParam field is set.
     */
    boolean hasLifterParam();
    /**
     * <code>optional int32 lifter_param = 3 [default = 22];</code>
     * @return The lifterParam.
     */
    int getLifterParam();

    /**
     * <code>optional bool use_c0 = 4 [default = true];</code>
     * @return Whether the useC0 field is set.
     */
    boolean hasUseC0();
    /**
     * <code>optional bool use_c0 = 4 [default = true];</code>
     * @return The useC0.
     */
    boolean getUseC0();
  }
  /**
   * Protobuf type {@code greco.CepstrumParams}
   */
  public static final class CepstrumParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.CepstrumParams)
      CepstrumParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CepstrumParams.newBuilder() to construct.
    private CepstrumParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CepstrumParams() {
      channelCount_ = 20;
      coeffCount_ = 13;
      lifterParam_ = 22;
      useC0_ = true;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CepstrumParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.Cepstrum.internal_static_greco_CepstrumParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.Cepstrum.internal_static_greco_CepstrumParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.Cepstrum.CepstrumParams.class, greco.Cepstrum.CepstrumParams.Builder.class);
    }

    private int bitField0_;
    public static final int CHANNEL_COUNT_FIELD_NUMBER = 1;
    private int channelCount_;
    /**
     * <code>optional int32 channel_count = 1 [default = 20];</code>
     * @return Whether the channelCount field is set.
     */
    @java.lang.Override
    public boolean hasChannelCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 channel_count = 1 [default = 20];</code>
     * @return The channelCount.
     */
    @java.lang.Override
    public int getChannelCount() {
      return channelCount_;
    }

    public static final int COEFF_COUNT_FIELD_NUMBER = 2;
    private int coeffCount_;
    /**
     * <code>optional int32 coeff_count = 2 [default = 13];</code>
     * @return Whether the coeffCount field is set.
     */
    @java.lang.Override
    public boolean hasCoeffCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 coeff_count = 2 [default = 13];</code>
     * @return The coeffCount.
     */
    @java.lang.Override
    public int getCoeffCount() {
      return coeffCount_;
    }

    public static final int LIFTER_PARAM_FIELD_NUMBER = 3;
    private int lifterParam_;
    /**
     * <code>optional int32 lifter_param = 3 [default = 22];</code>
     * @return Whether the lifterParam field is set.
     */
    @java.lang.Override
    public boolean hasLifterParam() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 lifter_param = 3 [default = 22];</code>
     * @return The lifterParam.
     */
    @java.lang.Override
    public int getLifterParam() {
      return lifterParam_;
    }

    public static final int USE_C0_FIELD_NUMBER = 4;
    private boolean useC0_;
    /**
     * <code>optional bool use_c0 = 4 [default = true];</code>
     * @return Whether the useC0 field is set.
     */
    @java.lang.Override
    public boolean hasUseC0() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool use_c0 = 4 [default = true];</code>
     * @return The useC0.
     */
    @java.lang.Override
    public boolean getUseC0() {
      return useC0_;
    }

    public static greco.Cepstrum.CepstrumParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Cepstrum.CepstrumParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.Cepstrum.CepstrumParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Cepstrum.CepstrumParams parseFrom(
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
    public static Builder newBuilder(greco.Cepstrum.CepstrumParams prototype) {
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
     * Protobuf type {@code greco.CepstrumParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.CepstrumParams)
        greco.Cepstrum.CepstrumParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.Cepstrum.internal_static_greco_CepstrumParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.Cepstrum.internal_static_greco_CepstrumParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.Cepstrum.CepstrumParams.class, greco.Cepstrum.CepstrumParams.Builder.class);
      }

      // Construct using greco.Cepstrum.CepstrumParams.newBuilder()
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
        channelCount_ = 20;
        bitField0_ = (bitField0_ & ~0x00000001);
        coeffCount_ = 13;
        bitField0_ = (bitField0_ & ~0x00000002);
        lifterParam_ = 22;
        bitField0_ = (bitField0_ & ~0x00000004);
        useC0_ = true;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.Cepstrum.internal_static_greco_CepstrumParams_descriptor;
      }

      @java.lang.Override
      public greco.Cepstrum.CepstrumParams getDefaultInstanceForType() {
        return greco.Cepstrum.CepstrumParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.Cepstrum.CepstrumParams build() {
        greco.Cepstrum.CepstrumParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.Cepstrum.CepstrumParams buildPartial() {
        greco.Cepstrum.CepstrumParams result = new greco.Cepstrum.CepstrumParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.channelCount_ = channelCount_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.coeffCount_ = coeffCount_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.lifterParam_ = lifterParam_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.useC0_ = useC0_;
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

      private int channelCount_ = 20;
      /**
       * <code>optional int32 channel_count = 1 [default = 20];</code>
       * @return Whether the channelCount field is set.
       */
      @java.lang.Override
      public boolean hasChannelCount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 channel_count = 1 [default = 20];</code>
       * @return The channelCount.
       */
      @java.lang.Override
      public int getChannelCount() {
        return channelCount_;
      }
      /**
       * <code>optional int32 channel_count = 1 [default = 20];</code>
       * @param value The channelCount to set.
       * @return This builder for chaining.
       */
      public Builder setChannelCount(int value) {
        bitField0_ |= 0x00000001;
        channelCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 channel_count = 1 [default = 20];</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        channelCount_ = 20;
        onChanged();
        return this;
      }

      private int coeffCount_ = 13;
      /**
       * <code>optional int32 coeff_count = 2 [default = 13];</code>
       * @return Whether the coeffCount field is set.
       */
      @java.lang.Override
      public boolean hasCoeffCount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 coeff_count = 2 [default = 13];</code>
       * @return The coeffCount.
       */
      @java.lang.Override
      public int getCoeffCount() {
        return coeffCount_;
      }
      /**
       * <code>optional int32 coeff_count = 2 [default = 13];</code>
       * @param value The coeffCount to set.
       * @return This builder for chaining.
       */
      public Builder setCoeffCount(int value) {
        bitField0_ |= 0x00000002;
        coeffCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 coeff_count = 2 [default = 13];</code>
       * @return This builder for chaining.
       */
      public Builder clearCoeffCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        coeffCount_ = 13;
        onChanged();
        return this;
      }

      private int lifterParam_ = 22;
      /**
       * <code>optional int32 lifter_param = 3 [default = 22];</code>
       * @return Whether the lifterParam field is set.
       */
      @java.lang.Override
      public boolean hasLifterParam() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 lifter_param = 3 [default = 22];</code>
       * @return The lifterParam.
       */
      @java.lang.Override
      public int getLifterParam() {
        return lifterParam_;
      }
      /**
       * <code>optional int32 lifter_param = 3 [default = 22];</code>
       * @param value The lifterParam to set.
       * @return This builder for chaining.
       */
      public Builder setLifterParam(int value) {
        bitField0_ |= 0x00000004;
        lifterParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 lifter_param = 3 [default = 22];</code>
       * @return This builder for chaining.
       */
      public Builder clearLifterParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lifterParam_ = 22;
        onChanged();
        return this;
      }

      private boolean useC0_ = true;
      /**
       * <code>optional bool use_c0 = 4 [default = true];</code>
       * @return Whether the useC0 field is set.
       */
      @java.lang.Override
      public boolean hasUseC0() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bool use_c0 = 4 [default = true];</code>
       * @return The useC0.
       */
      @java.lang.Override
      public boolean getUseC0() {
        return useC0_;
      }
      /**
       * <code>optional bool use_c0 = 4 [default = true];</code>
       * @param value The useC0 to set.
       * @return This builder for chaining.
       */
      public Builder setUseC0(boolean value) {
        bitField0_ |= 0x00000008;
        useC0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool use_c0 = 4 [default = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearUseC0() {
        bitField0_ = (bitField0_ & ~0x00000008);
        useC0_ = true;
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


      // @@protoc_insertion_point(builder_scope:greco.CepstrumParams)
    }

    // @@protoc_insertion_point(class_scope:greco.CepstrumParams)
    private static final greco.Cepstrum.CepstrumParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.Cepstrum.CepstrumParams();
    }

    public static greco.Cepstrum.CepstrumParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CepstrumParams>
        PARSER = new com.google.protobuf.AbstractParser<CepstrumParams>() {
      @java.lang.Override
      public CepstrumParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<CepstrumParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CepstrumParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.Cepstrum.CepstrumParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 19014488;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.Cepstrum.CepstrumParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.Cepstrum.CepstrumParams.getDefaultInstance(),
          0,
          greco.Cepstrum.CepstrumParams.class,
          greco.Cepstrum.CepstrumParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_CepstrumParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_CepstrumParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%speech/greco3/frontend/cepstrum.proto\022" +
      "\005greco\032\037speech/greco3/core/params.proto\"" +
      "\251\001\n\016CepstrumParams\022\031\n\rchannel_count\030\001 \001(" +
      "\005:\00220\022\027\n\013coeff_count\030\002 \001(\005:\00213\022\030\n\014lifter" +
      "_param\030\003 \001(\005:\00222\022\024\n\006use_c0\030\004 \001(\010:\004true23" +
      "\n\002id\022\r.greco.Params\030\330\306\210\t \001(\0132\025.greco.Cep" +
      "strumParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_CepstrumParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_CepstrumParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_CepstrumParams_descriptor,
        new java.lang.String[] { "ChannelCount", "CoeffCount", "LifterParam", "UseC0", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}