// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/energy_norm.proto

package greco;

public final class EnergyNorm {
  private EnergyNorm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.EnergyNorm.EnergyNormParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnergyNormParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.EnergyNormParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional float alpha = 1 [default = 0.99];</code>
     * @return Whether the alpha field is set.
     */
    boolean hasAlpha();
    /**
     * <code>optional float alpha = 1 [default = 0.99];</code>
     * @return The alpha.
     */
    float getAlpha();

    /**
     * <code>optional float beta = 2 [default = 0.99];</code>
     * @return Whether the beta field is set.
     */
    boolean hasBeta();
    /**
     * <code>optional float beta = 2 [default = 0.99];</code>
     * @return The beta.
     */
    float getBeta();

    /**
     * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
     * @return Whether the clippingNoiseScale field is set.
     */
    boolean hasClippingNoiseScale();
    /**
     * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
     * @return The clippingNoiseScale.
     */
    float getClippingNoiseScale();

    /**
     * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
     * @return Whether the useEndpointingThreshold field is set.
     */
    boolean hasUseEndpointingThreshold();
    /**
     * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
     * @return The useEndpointingThreshold.
     */
    boolean getUseEndpointingThreshold();

    /**
     * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
     * @return Whether the energyEpThreshold field is set.
     */
    boolean hasEnergyEpThreshold();
    /**
     * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
     * @return The energyEpThreshold.
     */
    float getEnergyEpThreshold();
  }
  /**
   * Protobuf type {@code greco.EnergyNormParams}
   */
  public static final class EnergyNormParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.EnergyNormParams)
      EnergyNormParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnergyNormParams.newBuilder() to construct.
    private EnergyNormParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnergyNormParams() {
      alpha_ = 0.99F;
      beta_ = 0.99F;
      clippingNoiseScale_ = 1.5F;
      energyEpThreshold_ = 20F;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnergyNormParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.EnergyNorm.internal_static_greco_EnergyNormParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.EnergyNorm.internal_static_greco_EnergyNormParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.EnergyNorm.EnergyNormParams.class, greco.EnergyNorm.EnergyNormParams.Builder.class);
    }

    private int bitField0_;
    public static final int ALPHA_FIELD_NUMBER = 1;
    private float alpha_;
    /**
     * <code>optional float alpha = 1 [default = 0.99];</code>
     * @return Whether the alpha field is set.
     */
    @java.lang.Override
    public boolean hasAlpha() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional float alpha = 1 [default = 0.99];</code>
     * @return The alpha.
     */
    @java.lang.Override
    public float getAlpha() {
      return alpha_;
    }

    public static final int BETA_FIELD_NUMBER = 2;
    private float beta_;
    /**
     * <code>optional float beta = 2 [default = 0.99];</code>
     * @return Whether the beta field is set.
     */
    @java.lang.Override
    public boolean hasBeta() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float beta = 2 [default = 0.99];</code>
     * @return The beta.
     */
    @java.lang.Override
    public float getBeta() {
      return beta_;
    }

    public static final int CLIPPING_NOISE_SCALE_FIELD_NUMBER = 3;
    private float clippingNoiseScale_;
    /**
     * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
     * @return Whether the clippingNoiseScale field is set.
     */
    @java.lang.Override
    public boolean hasClippingNoiseScale() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
     * @return The clippingNoiseScale.
     */
    @java.lang.Override
    public float getClippingNoiseScale() {
      return clippingNoiseScale_;
    }

    public static final int USE_ENDPOINTING_THRESHOLD_FIELD_NUMBER = 4;
    private boolean useEndpointingThreshold_;
    /**
     * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
     * @return Whether the useEndpointingThreshold field is set.
     */
    @java.lang.Override
    public boolean hasUseEndpointingThreshold() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
     * @return The useEndpointingThreshold.
     */
    @java.lang.Override
    public boolean getUseEndpointingThreshold() {
      return useEndpointingThreshold_;
    }

    public static final int ENERGY_EP_THRESHOLD_FIELD_NUMBER = 5;
    private float energyEpThreshold_;
    /**
     * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
     * @return Whether the energyEpThreshold field is set.
     */
    @java.lang.Override
    public boolean hasEnergyEpThreshold() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
     * @return The energyEpThreshold.
     */
    @java.lang.Override
    public float getEnergyEpThreshold() {
      return energyEpThreshold_;
    }

    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.EnergyNorm.EnergyNormParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.EnergyNorm.EnergyNormParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.EnergyNorm.EnergyNormParams parseFrom(
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
    public static Builder newBuilder(greco.EnergyNorm.EnergyNormParams prototype) {
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
     * Protobuf type {@code greco.EnergyNormParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.EnergyNormParams)
        greco.EnergyNorm.EnergyNormParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.EnergyNorm.internal_static_greco_EnergyNormParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.EnergyNorm.internal_static_greco_EnergyNormParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.EnergyNorm.EnergyNormParams.class, greco.EnergyNorm.EnergyNormParams.Builder.class);
      }

      // Construct using greco.EnergyNorm.EnergyNormParams.newBuilder()
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
        alpha_ = 0.99F;
        bitField0_ = (bitField0_ & ~0x00000001);
        beta_ = 0.99F;
        bitField0_ = (bitField0_ & ~0x00000002);
        clippingNoiseScale_ = 1.5F;
        bitField0_ = (bitField0_ & ~0x00000004);
        useEndpointingThreshold_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        energyEpThreshold_ = 20F;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.EnergyNorm.internal_static_greco_EnergyNormParams_descriptor;
      }

      @java.lang.Override
      public greco.EnergyNorm.EnergyNormParams getDefaultInstanceForType() {
        return greco.EnergyNorm.EnergyNormParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.EnergyNorm.EnergyNormParams build() {
        greco.EnergyNorm.EnergyNormParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.EnergyNorm.EnergyNormParams buildPartial() {
        greco.EnergyNorm.EnergyNormParams result = new greco.EnergyNorm.EnergyNormParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.alpha_ = alpha_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.beta_ = beta_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.clippingNoiseScale_ = clippingNoiseScale_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.useEndpointingThreshold_ = useEndpointingThreshold_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.energyEpThreshold_ = energyEpThreshold_;
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

      private float alpha_ = 0.99F;
      /**
       * <code>optional float alpha = 1 [default = 0.99];</code>
       * @return Whether the alpha field is set.
       */
      @java.lang.Override
      public boolean hasAlpha() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional float alpha = 1 [default = 0.99];</code>
       * @return The alpha.
       */
      @java.lang.Override
      public float getAlpha() {
        return alpha_;
      }
      /**
       * <code>optional float alpha = 1 [default = 0.99];</code>
       * @param value The alpha to set.
       * @return This builder for chaining.
       */
      public Builder setAlpha(float value) {
        bitField0_ |= 0x00000001;
        alpha_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float alpha = 1 [default = 0.99];</code>
       * @return This builder for chaining.
       */
      public Builder clearAlpha() {
        bitField0_ = (bitField0_ & ~0x00000001);
        alpha_ = 0.99F;
        onChanged();
        return this;
      }

      private float beta_ = 0.99F;
      /**
       * <code>optional float beta = 2 [default = 0.99];</code>
       * @return Whether the beta field is set.
       */
      @java.lang.Override
      public boolean hasBeta() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional float beta = 2 [default = 0.99];</code>
       * @return The beta.
       */
      @java.lang.Override
      public float getBeta() {
        return beta_;
      }
      /**
       * <code>optional float beta = 2 [default = 0.99];</code>
       * @param value The beta to set.
       * @return This builder for chaining.
       */
      public Builder setBeta(float value) {
        bitField0_ |= 0x00000002;
        beta_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float beta = 2 [default = 0.99];</code>
       * @return This builder for chaining.
       */
      public Builder clearBeta() {
        bitField0_ = (bitField0_ & ~0x00000002);
        beta_ = 0.99F;
        onChanged();
        return this;
      }

      private float clippingNoiseScale_ = 1.5F;
      /**
       * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
       * @return Whether the clippingNoiseScale field is set.
       */
      @java.lang.Override
      public boolean hasClippingNoiseScale() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
       * @return The clippingNoiseScale.
       */
      @java.lang.Override
      public float getClippingNoiseScale() {
        return clippingNoiseScale_;
      }
      /**
       * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
       * @param value The clippingNoiseScale to set.
       * @return This builder for chaining.
       */
      public Builder setClippingNoiseScale(float value) {
        bitField0_ |= 0x00000004;
        clippingNoiseScale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float clipping_noise_scale = 3 [default = 1.5];</code>
       * @return This builder for chaining.
       */
      public Builder clearClippingNoiseScale() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clippingNoiseScale_ = 1.5F;
        onChanged();
        return this;
      }

      private boolean useEndpointingThreshold_ ;
      /**
       * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
       * @return Whether the useEndpointingThreshold field is set.
       */
      @java.lang.Override
      public boolean hasUseEndpointingThreshold() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
       * @return The useEndpointingThreshold.
       */
      @java.lang.Override
      public boolean getUseEndpointingThreshold() {
        return useEndpointingThreshold_;
      }
      /**
       * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
       * @param value The useEndpointingThreshold to set.
       * @return This builder for chaining.
       */
      public Builder setUseEndpointingThreshold(boolean value) {
        bitField0_ |= 0x00000008;
        useEndpointingThreshold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool use_endpointing_threshold = 4 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearUseEndpointingThreshold() {
        bitField0_ = (bitField0_ & ~0x00000008);
        useEndpointingThreshold_ = false;
        onChanged();
        return this;
      }

      private float energyEpThreshold_ = 20F;
      /**
       * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
       * @return Whether the energyEpThreshold field is set.
       */
      @java.lang.Override
      public boolean hasEnergyEpThreshold() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
       * @return The energyEpThreshold.
       */
      @java.lang.Override
      public float getEnergyEpThreshold() {
        return energyEpThreshold_;
      }
      /**
       * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
       * @param value The energyEpThreshold to set.
       * @return This builder for chaining.
       */
      public Builder setEnergyEpThreshold(float value) {
        bitField0_ |= 0x00000010;
        energyEpThreshold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float energy_ep_threshold = 5 [default = 20];</code>
       * @return This builder for chaining.
       */
      public Builder clearEnergyEpThreshold() {
        bitField0_ = (bitField0_ & ~0x00000010);
        energyEpThreshold_ = 20F;
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


      // @@protoc_insertion_point(builder_scope:greco.EnergyNormParams)
    }

    // @@protoc_insertion_point(class_scope:greco.EnergyNormParams)
    private static final greco.EnergyNorm.EnergyNormParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.EnergyNorm.EnergyNormParams();
    }

    public static greco.EnergyNorm.EnergyNormParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EnergyNormParams>
        PARSER = new com.google.protobuf.AbstractParser<EnergyNormParams>() {
      @java.lang.Override
      public EnergyNormParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnergyNormParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnergyNormParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.EnergyNorm.EnergyNormParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 46649806;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.EnergyNorm.EnergyNormParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.EnergyNorm.EnergyNormParams.getDefaultInstance(),
          0,
          greco.EnergyNorm.EnergyNormParams.class,
          greco.EnergyNorm.EnergyNormParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_EnergyNormParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_EnergyNormParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(speech/greco3/frontend/energy_norm.pro" +
      "to\022\005greco\032\037speech/greco3/core/params.pro" +
      "to\"\340\001\n\020EnergyNormParams\022\023\n\005alpha\030\001 \001(\002:\004" +
      "0.99\022\022\n\004beta\030\002 \001(\002:\0040.99\022!\n\024clipping_noi" +
      "se_scale\030\003 \001(\002:\0031.5\022(\n\031use_endpointing_t" +
      "hreshold\030\004 \001(\010:\005false\022\037\n\023energy_ep_thres" +
      "hold\030\005 \001(\002:\0022025\n\002id\022\r.greco.Params\030\316\243\237\026" +
      " \001(\0132\027.greco.EnergyNormParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_EnergyNormParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_EnergyNormParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_EnergyNormParams_descriptor,
        new java.lang.String[] { "Alpha", "Beta", "ClippingNoiseScale", "UseEndpointingThreshold", "EnergyEpThreshold", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
