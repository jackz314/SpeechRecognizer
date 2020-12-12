// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/energy.proto

package greco;

public final class Energy {
  private Energy() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.Energy.EnergyParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnergyParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.EnergyParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
     * @return Whether the energyType field is set.
     */
    boolean hasEnergyType();
    /**
     * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
     * @return The energyType.
     */
    greco.Energy.EnergyParams.EnergyType getEnergyType();

    /**
     * <code>optional float frame_size_ms = 2 [default = 25];</code>
     * @return Whether the frameSizeMs field is set.
     */
    boolean hasFrameSizeMs();
    /**
     * <code>optional float frame_size_ms = 2 [default = 25];</code>
     * @return The frameSizeMs.
     */
    float getFrameSizeMs();

    /**
     * <code>optional float energy_scale = 3 [default = 0.1];</code>
     * @return Whether the energyScale field is set.
     */
    boolean hasEnergyScale();
    /**
     * <code>optional float energy_scale = 3 [default = 0.1];</code>
     * @return The energyScale.
     */
    float getEnergyScale();

    /**
     * <code>optional float sample_rate_override = 4 [default = -1];</code>
     * @return Whether the sampleRateOverride field is set.
     */
    boolean hasSampleRateOverride();
    /**
     * <code>optional float sample_rate_override = 4 [default = -1];</code>
     * @return The sampleRateOverride.
     */
    float getSampleRateOverride();
  }
  /**
   * Protobuf type {@code greco.EnergyParams}
   */
  public static final class EnergyParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.EnergyParams)
      EnergyParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnergyParams.newBuilder() to construct.
    private EnergyParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnergyParams() {
      energyType_ = 2;
      frameSizeMs_ = 25F;
      energyScale_ = 0.1F;
      sampleRateOverride_ = -1F;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnergyParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.Energy.internal_static_greco_EnergyParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.Energy.internal_static_greco_EnergyParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.Energy.EnergyParams.class, greco.Energy.EnergyParams.Builder.class);
    }

    /**
     * Protobuf enum {@code greco.EnergyParams.EnergyType}
     */
    public enum EnergyType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ENERGY = 1;</code>
       */
      ENERGY(1),
      /**
       * <code>LOG_ENERGY = 2;</code>
       */
      LOG_ENERGY(2),
      /**
       * <code>POWER = 3;</code>
       */
      POWER(3),
      /**
       * <code>RMS = 4;</code>
       */
      RMS(4),
      /**
       * <code>NONE = 5;</code>
       */
      NONE(5),
      ;

      /**
       * <code>ENERGY = 1;</code>
       */
      public static final int ENERGY_VALUE = 1;
      /**
       * <code>LOG_ENERGY = 2;</code>
       */
      public static final int LOG_ENERGY_VALUE = 2;
      /**
       * <code>POWER = 3;</code>
       */
      public static final int POWER_VALUE = 3;
      /**
       * <code>RMS = 4;</code>
       */
      public static final int RMS_VALUE = 4;
      /**
       * <code>NONE = 5;</code>
       */
      public static final int NONE_VALUE = 5;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static EnergyType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EnergyType forNumber(int value) {
        switch (value) {
          case 1: return ENERGY;
          case 2: return LOG_ENERGY;
          case 3: return POWER;
          case 4: return RMS;
          case 5: return NONE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EnergyType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EnergyType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EnergyType>() {
              public EnergyType findValueByNumber(int number) {
                return EnergyType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return greco.Energy.EnergyParams.getDescriptor().getEnumTypes().get(0);
      }

      private static final EnergyType[] VALUES = values();

      public static EnergyType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private EnergyType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:greco.EnergyParams.EnergyType)
    }

    private int bitField0_;
    public static final int ENERGY_TYPE_FIELD_NUMBER = 1;
    private int energyType_;
    /**
     * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
     * @return Whether the energyType field is set.
     */
    @java.lang.Override public boolean hasEnergyType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
     * @return The energyType.
     */
    @java.lang.Override public greco.Energy.EnergyParams.EnergyType getEnergyType() {
      @SuppressWarnings("deprecation")
      greco.Energy.EnergyParams.EnergyType result = greco.Energy.EnergyParams.EnergyType.valueOf(energyType_);
      return result == null ? greco.Energy.EnergyParams.EnergyType.LOG_ENERGY : result;
    }

    public static final int FRAME_SIZE_MS_FIELD_NUMBER = 2;
    private float frameSizeMs_;
    /**
     * <code>optional float frame_size_ms = 2 [default = 25];</code>
     * @return Whether the frameSizeMs field is set.
     */
    @java.lang.Override
    public boolean hasFrameSizeMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional float frame_size_ms = 2 [default = 25];</code>
     * @return The frameSizeMs.
     */
    @java.lang.Override
    public float getFrameSizeMs() {
      return frameSizeMs_;
    }

    public static final int ENERGY_SCALE_FIELD_NUMBER = 3;
    private float energyScale_;
    /**
     * <code>optional float energy_scale = 3 [default = 0.1];</code>
     * @return Whether the energyScale field is set.
     */
    @java.lang.Override
    public boolean hasEnergyScale() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float energy_scale = 3 [default = 0.1];</code>
     * @return The energyScale.
     */
    @java.lang.Override
    public float getEnergyScale() {
      return energyScale_;
    }

    public static final int SAMPLE_RATE_OVERRIDE_FIELD_NUMBER = 4;
    private float sampleRateOverride_;
    /**
     * <code>optional float sample_rate_override = 4 [default = -1];</code>
     * @return Whether the sampleRateOverride field is set.
     */
    @java.lang.Override
    public boolean hasSampleRateOverride() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional float sample_rate_override = 4 [default = -1];</code>
     * @return The sampleRateOverride.
     */
    @java.lang.Override
    public float getSampleRateOverride() {
      return sampleRateOverride_;
    }

    public static greco.Energy.EnergyParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Energy.EnergyParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Energy.EnergyParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Energy.EnergyParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Energy.EnergyParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.Energy.EnergyParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.Energy.EnergyParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Energy.EnergyParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Energy.EnergyParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.Energy.EnergyParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.Energy.EnergyParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.Energy.EnergyParams parseFrom(
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
    public static Builder newBuilder(greco.Energy.EnergyParams prototype) {
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
     * Protobuf type {@code greco.EnergyParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.EnergyParams)
        greco.Energy.EnergyParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.Energy.internal_static_greco_EnergyParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.Energy.internal_static_greco_EnergyParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.Energy.EnergyParams.class, greco.Energy.EnergyParams.Builder.class);
      }

      // Construct using greco.Energy.EnergyParams.newBuilder()
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
        energyType_ = 2;
        bitField0_ = (bitField0_ & ~0x00000001);
        frameSizeMs_ = 25F;
        bitField0_ = (bitField0_ & ~0x00000002);
        energyScale_ = 0.1F;
        bitField0_ = (bitField0_ & ~0x00000004);
        sampleRateOverride_ = -1F;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.Energy.internal_static_greco_EnergyParams_descriptor;
      }

      @java.lang.Override
      public greco.Energy.EnergyParams getDefaultInstanceForType() {
        return greco.Energy.EnergyParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.Energy.EnergyParams build() {
        greco.Energy.EnergyParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.Energy.EnergyParams buildPartial() {
        greco.Energy.EnergyParams result = new greco.Energy.EnergyParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.energyType_ = energyType_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.frameSizeMs_ = frameSizeMs_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.energyScale_ = energyScale_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sampleRateOverride_ = sampleRateOverride_;
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

      private int energyType_ = 2;
      /**
       * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
       * @return Whether the energyType field is set.
       */
      @java.lang.Override public boolean hasEnergyType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
       * @return The energyType.
       */
      @java.lang.Override
      public greco.Energy.EnergyParams.EnergyType getEnergyType() {
        @SuppressWarnings("deprecation")
        greco.Energy.EnergyParams.EnergyType result = greco.Energy.EnergyParams.EnergyType.valueOf(energyType_);
        return result == null ? greco.Energy.EnergyParams.EnergyType.LOG_ENERGY : result;
      }
      /**
       * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
       * @param value The energyType to set.
       * @return This builder for chaining.
       */
      public Builder setEnergyType(greco.Energy.EnergyParams.EnergyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        energyType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.EnergyParams.EnergyType energy_type = 1 [default = LOG_ENERGY];</code>
       * @return This builder for chaining.
       */
      public Builder clearEnergyType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        energyType_ = 2;
        onChanged();
        return this;
      }

      private float frameSizeMs_ = 25F;
      /**
       * <code>optional float frame_size_ms = 2 [default = 25];</code>
       * @return Whether the frameSizeMs field is set.
       */
      @java.lang.Override
      public boolean hasFrameSizeMs() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional float frame_size_ms = 2 [default = 25];</code>
       * @return The frameSizeMs.
       */
      @java.lang.Override
      public float getFrameSizeMs() {
        return frameSizeMs_;
      }
      /**
       * <code>optional float frame_size_ms = 2 [default = 25];</code>
       * @param value The frameSizeMs to set.
       * @return This builder for chaining.
       */
      public Builder setFrameSizeMs(float value) {
        bitField0_ |= 0x00000002;
        frameSizeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float frame_size_ms = 2 [default = 25];</code>
       * @return This builder for chaining.
       */
      public Builder clearFrameSizeMs() {
        bitField0_ = (bitField0_ & ~0x00000002);
        frameSizeMs_ = 25F;
        onChanged();
        return this;
      }

      private float energyScale_ = 0.1F;
      /**
       * <code>optional float energy_scale = 3 [default = 0.1];</code>
       * @return Whether the energyScale field is set.
       */
      @java.lang.Override
      public boolean hasEnergyScale() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional float energy_scale = 3 [default = 0.1];</code>
       * @return The energyScale.
       */
      @java.lang.Override
      public float getEnergyScale() {
        return energyScale_;
      }
      /**
       * <code>optional float energy_scale = 3 [default = 0.1];</code>
       * @param value The energyScale to set.
       * @return This builder for chaining.
       */
      public Builder setEnergyScale(float value) {
        bitField0_ |= 0x00000004;
        energyScale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float energy_scale = 3 [default = 0.1];</code>
       * @return This builder for chaining.
       */
      public Builder clearEnergyScale() {
        bitField0_ = (bitField0_ & ~0x00000004);
        energyScale_ = 0.1F;
        onChanged();
        return this;
      }

      private float sampleRateOverride_ = -1F;
      /**
       * <code>optional float sample_rate_override = 4 [default = -1];</code>
       * @return Whether the sampleRateOverride field is set.
       */
      @java.lang.Override
      public boolean hasSampleRateOverride() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional float sample_rate_override = 4 [default = -1];</code>
       * @return The sampleRateOverride.
       */
      @java.lang.Override
      public float getSampleRateOverride() {
        return sampleRateOverride_;
      }
      /**
       * <code>optional float sample_rate_override = 4 [default = -1];</code>
       * @param value The sampleRateOverride to set.
       * @return This builder for chaining.
       */
      public Builder setSampleRateOverride(float value) {
        bitField0_ |= 0x00000008;
        sampleRateOverride_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float sample_rate_override = 4 [default = -1];</code>
       * @return This builder for chaining.
       */
      public Builder clearSampleRateOverride() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sampleRateOverride_ = -1F;
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


      // @@protoc_insertion_point(builder_scope:greco.EnergyParams)
    }

    // @@protoc_insertion_point(class_scope:greco.EnergyParams)
    private static final greco.Energy.EnergyParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.Energy.EnergyParams();
    }

    public static greco.Energy.EnergyParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EnergyParams>
        PARSER = new com.google.protobuf.AbstractParser<EnergyParams>() {
      @java.lang.Override
      public EnergyParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnergyParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnergyParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.Energy.EnergyParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 20804407;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.Energy.EnergyParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.Energy.EnergyParams.getDefaultInstance(),
          0,
          greco.Energy.EnergyParams.class,
          greco.Energy.EnergyParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_EnergyParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_EnergyParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#speech/greco3/frontend/energy.proto\022\005g" +
      "reco\032\037speech/greco3/core/params.proto\"\242\002" +
      "\n\014EnergyParams\022?\n\013energy_type\030\001 \001(\0162\036.gr" +
      "eco.EnergyParams.EnergyType:\nLOG_ENERGY\022" +
      "\031\n\rframe_size_ms\030\002 \001(\002:\00225\022\031\n\014energy_sca" +
      "le\030\003 \001(\002:\0030.1\022 \n\024sample_rate_override\030\004 " +
      "\001(\002:\002-1\"F\n\nEnergyType\022\n\n\006ENERGY\020\001\022\016\n\nLOG" +
      "_ENERGY\020\002\022\t\n\005POWER\020\003\022\007\n\003RMS\020\004\022\010\n\004NONE\020\0052" +
      "1\n\002id\022\r.greco.Params\030\267\346\365\t \001(\0132\023.greco.En" +
      "ergyParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_EnergyParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_EnergyParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_EnergyParams_descriptor,
        new java.lang.String[] { "EnergyType", "FrameSizeMs", "EnergyScale", "SampleRateOverride", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}