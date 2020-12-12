// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/dsp/filter/spl_weighting_filter_params.proto

package speech.dsp;

public final class SplWeightingFilterParamsOuterClass {
  private SplWeightingFilterParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SplWeightingFilterParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:speech.dsp.SplWeightingFilterParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
     * @return Whether the weightingType field is set.
     */
    boolean hasWeightingType();
    /**
     * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
     * @return The weightingType.
     */
    speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType getWeightingType();
  }
  /**
   * Protobuf type {@code speech.dsp.SplWeightingFilterParams}
   */
  public static final class SplWeightingFilterParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:speech.dsp.SplWeightingFilterParams)
      SplWeightingFilterParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SplWeightingFilterParams.newBuilder() to construct.
    private SplWeightingFilterParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SplWeightingFilterParams() {
      weightingType_ = 3;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SplWeightingFilterParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return speech.dsp.SplWeightingFilterParamsOuterClass.internal_static_speech_dsp_SplWeightingFilterParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return speech.dsp.SplWeightingFilterParamsOuterClass.internal_static_speech_dsp_SplWeightingFilterParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.class, speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.Builder.class);
    }

    /**
     * Protobuf enum {@code speech.dsp.SplWeightingFilterParams.WeightingType}
     */
    public enum WeightingType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0),
      /**
       * <code>A_WEIGHTING = 1;</code>
       */
      A_WEIGHTING(1),
      /**
       * <code>B_WEIGHTING = 2;</code>
       */
      B_WEIGHTING(2),
      /**
       * <code>C_WEIGHTING = 3;</code>
       */
      C_WEIGHTING(3),
      /**
       * <code>BUTTERWORTH_BANDPASS = 4;</code>
       */
      BUTTERWORTH_BANDPASS(4),
      ;

      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>A_WEIGHTING = 1;</code>
       */
      public static final int A_WEIGHTING_VALUE = 1;
      /**
       * <code>B_WEIGHTING = 2;</code>
       */
      public static final int B_WEIGHTING_VALUE = 2;
      /**
       * <code>C_WEIGHTING = 3;</code>
       */
      public static final int C_WEIGHTING_VALUE = 3;
      /**
       * <code>BUTTERWORTH_BANDPASS = 4;</code>
       */
      public static final int BUTTERWORTH_BANDPASS_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static WeightingType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static WeightingType forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1: return A_WEIGHTING;
          case 2: return B_WEIGHTING;
          case 3: return C_WEIGHTING;
          case 4: return BUTTERWORTH_BANDPASS;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<WeightingType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          WeightingType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<WeightingType>() {
              public WeightingType findValueByNumber(int number) {
                return WeightingType.forNumber(number);
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
        return speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.getDescriptor().getEnumTypes().get(0);
      }

      private static final WeightingType[] VALUES = values();

      public static WeightingType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private WeightingType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:speech.dsp.SplWeightingFilterParams.WeightingType)
    }

    private int bitField0_;
    public static final int WEIGHTING_TYPE_FIELD_NUMBER = 1;
    private int weightingType_;
    /**
     * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
     * @return Whether the weightingType field is set.
     */
    @java.lang.Override public boolean hasWeightingType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
     * @return The weightingType.
     */
    @java.lang.Override public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType getWeightingType() {
      @SuppressWarnings("deprecation")
      speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType result = speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType.valueOf(weightingType_);
      return result == null ? speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType.C_WEIGHTING : result;
    }

    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams parseFrom(
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
    public static Builder newBuilder(speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams prototype) {
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
     * Protobuf type {@code speech.dsp.SplWeightingFilterParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:speech.dsp.SplWeightingFilterParams)
        speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return speech.dsp.SplWeightingFilterParamsOuterClass.internal_static_speech_dsp_SplWeightingFilterParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return speech.dsp.SplWeightingFilterParamsOuterClass.internal_static_speech_dsp_SplWeightingFilterParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.class, speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.Builder.class);
      }

      // Construct using speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.newBuilder()
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
        weightingType_ = 3;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return speech.dsp.SplWeightingFilterParamsOuterClass.internal_static_speech_dsp_SplWeightingFilterParams_descriptor;
      }

      @java.lang.Override
      public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams getDefaultInstanceForType() {
        return speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.getDefaultInstance();
      }

      @java.lang.Override
      public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams build() {
        speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams buildPartial() {
        speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams result = new speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.weightingType_ = weightingType_;
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

      private int weightingType_ = 3;
      /**
       * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
       * @return Whether the weightingType field is set.
       */
      @java.lang.Override public boolean hasWeightingType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
       * @return The weightingType.
       */
      @java.lang.Override
      public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType getWeightingType() {
        @SuppressWarnings("deprecation")
        speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType result = speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType.valueOf(weightingType_);
        return result == null ? speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType.C_WEIGHTING : result;
      }
      /**
       * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
       * @param value The weightingType to set.
       * @return This builder for chaining.
       */
      public Builder setWeightingType(speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams.WeightingType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        weightingType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .speech.dsp.SplWeightingFilterParams.WeightingType weighting_type = 1 [default = C_WEIGHTING];</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightingType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        weightingType_ = 3;
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


      // @@protoc_insertion_point(builder_scope:speech.dsp.SplWeightingFilterParams)
    }

    // @@protoc_insertion_point(class_scope:speech.dsp.SplWeightingFilterParams)
    private static final speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams();
    }

    public static speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SplWeightingFilterParams>
        PARSER = new com.google.protobuf.AbstractParser<SplWeightingFilterParams>() {
      @java.lang.Override
      public SplWeightingFilterParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<SplWeightingFilterParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SplWeightingFilterParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public speech.dsp.SplWeightingFilterParamsOuterClass.SplWeightingFilterParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_dsp_SplWeightingFilterParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_dsp_SplWeightingFilterParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3speech/dsp/filter/spl_weighting_filter" +
      "_params.proto\022\nspeech.dsp\"\333\001\n\030SplWeighti" +
      "ngFilterParams\022W\n\016weighting_type\030\001 \001(\01622" +
      ".speech.dsp.SplWeightingFilterParams.Wei" +
      "ghtingType:\013C_WEIGHTING\"f\n\rWeightingType" +
      "\022\010\n\004NONE\020\000\022\017\n\013A_WEIGHTING\020\001\022\017\n\013B_WEIGHTI" +
      "NG\020\002\022\017\n\013C_WEIGHTING\020\003\022\030\n\024BUTTERWORTH_BAN" +
      "DPASS\020\004B\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_speech_dsp_SplWeightingFilterParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_dsp_SplWeightingFilterParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_dsp_SplWeightingFilterParams_descriptor,
        new java.lang.String[] { "WeightingType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
