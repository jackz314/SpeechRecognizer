// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/context/dynamic_class_text_transformer_params.proto

package greco;

public final class DynamicClassTextTransformerParamsOuterClass {
  private DynamicClassTextTransformerParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DynamicClassTextTransformerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.DynamicClassTextTransformerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
     * @return Whether the transformation field is set.
     */
    boolean hasTransformation();
    /**
     * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
     * @return The transformation.
     */
    greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation getTransformation();

    /**
     * <code>optional bool keep_original = 2;</code>
     * @return Whether the keepOriginal field is set.
     */
    boolean hasKeepOriginal();
    /**
     * <code>optional bool keep_original = 2;</code>
     * @return The keepOriginal.
     */
    boolean getKeepOriginal();
  }
  /**
   * Protobuf type {@code greco.DynamicClassTextTransformerParams}
   */
  public static final class DynamicClassTextTransformerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.DynamicClassTextTransformerParams)
      DynamicClassTextTransformerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DynamicClassTextTransformerParams.newBuilder() to construct.
    private DynamicClassTextTransformerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DynamicClassTextTransformerParams() {
      transformation_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DynamicClassTextTransformerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.DynamicClassTextTransformerParamsOuterClass.internal_static_greco_DynamicClassTextTransformerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.DynamicClassTextTransformerParamsOuterClass.internal_static_greco_DynamicClassTextTransformerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.class, greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Builder.class);
    }

    /**
     * Protobuf enum {@code greco.DynamicClassTextTransformerParams.Transformation}
     */
    public enum Transformation
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INVALID_METOHD = 0;</code>
       */
      INVALID_METOHD(0),
      /**
       * <code>TO_LOWER = 1;</code>
       */
      TO_LOWER(1),
      /**
       * <code>TO_UPPER_FIRST_CHAR = 2;</code>
       */
      TO_UPPER_FIRST_CHAR(2),
      ;

      /**
       * <code>INVALID_METOHD = 0;</code>
       */
      public static final int INVALID_METOHD_VALUE = 0;
      /**
       * <code>TO_LOWER = 1;</code>
       */
      public static final int TO_LOWER_VALUE = 1;
      /**
       * <code>TO_UPPER_FIRST_CHAR = 2;</code>
       */
      public static final int TO_UPPER_FIRST_CHAR_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Transformation valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Transformation forNumber(int value) {
        switch (value) {
          case 0: return INVALID_METOHD;
          case 1: return TO_LOWER;
          case 2: return TO_UPPER_FIRST_CHAR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Transformation>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Transformation> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Transformation>() {
              public Transformation findValueByNumber(int number) {
                return Transformation.forNumber(number);
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
        return greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.getDescriptor().getEnumTypes().get(0);
      }

      private static final Transformation[] VALUES = values();

      public static Transformation valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Transformation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:greco.DynamicClassTextTransformerParams.Transformation)
    }

    private int bitField0_;
    public static final int TRANSFORMATION_FIELD_NUMBER = 1;
    private int transformation_;
    /**
     * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
     * @return Whether the transformation field is set.
     */
    @java.lang.Override public boolean hasTransformation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
     * @return The transformation.
     */
    @java.lang.Override public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation getTransformation() {
      @SuppressWarnings("deprecation")
      greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation result = greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation.valueOf(transformation_);
      return result == null ? greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation.INVALID_METOHD : result;
    }

    public static final int KEEP_ORIGINAL_FIELD_NUMBER = 2;
    private boolean keepOriginal_;
    /**
     * <code>optional bool keep_original = 2;</code>
     * @return Whether the keepOriginal field is set.
     */
    @java.lang.Override
    public boolean hasKeepOriginal() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool keep_original = 2;</code>
     * @return The keepOriginal.
     */
    @java.lang.Override
    public boolean getKeepOriginal() {
      return keepOriginal_;
    }

    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams parseFrom(
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
    public static Builder newBuilder(greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams prototype) {
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
     * Protobuf type {@code greco.DynamicClassTextTransformerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.DynamicClassTextTransformerParams)
        greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.DynamicClassTextTransformerParamsOuterClass.internal_static_greco_DynamicClassTextTransformerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.DynamicClassTextTransformerParamsOuterClass.internal_static_greco_DynamicClassTextTransformerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.class, greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Builder.class);
      }

      // Construct using greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.newBuilder()
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
        transformation_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        keepOriginal_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.DynamicClassTextTransformerParamsOuterClass.internal_static_greco_DynamicClassTextTransformerParams_descriptor;
      }

      @java.lang.Override
      public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams getDefaultInstanceForType() {
        return greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams build() {
        greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams buildPartial() {
        greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams result = new greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.transformation_ = transformation_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.keepOriginal_ = keepOriginal_;
          to_bitField0_ |= 0x00000002;
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

      private int transformation_ = 0;
      /**
       * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
       * @return Whether the transformation field is set.
       */
      @java.lang.Override public boolean hasTransformation() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
       * @return The transformation.
       */
      @java.lang.Override
      public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation getTransformation() {
        @SuppressWarnings("deprecation")
        greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation result = greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation.valueOf(transformation_);
        return result == null ? greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation.INVALID_METOHD : result;
      }
      /**
       * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
       * @param value The transformation to set.
       * @return This builder for chaining.
       */
      public Builder setTransformation(greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.Transformation value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        transformation_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.DynamicClassTextTransformerParams.Transformation transformation = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransformation() {
        bitField0_ = (bitField0_ & ~0x00000001);
        transformation_ = 0;
        onChanged();
        return this;
      }

      private boolean keepOriginal_ ;
      /**
       * <code>optional bool keep_original = 2;</code>
       * @return Whether the keepOriginal field is set.
       */
      @java.lang.Override
      public boolean hasKeepOriginal() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool keep_original = 2;</code>
       * @return The keepOriginal.
       */
      @java.lang.Override
      public boolean getKeepOriginal() {
        return keepOriginal_;
      }
      /**
       * <code>optional bool keep_original = 2;</code>
       * @param value The keepOriginal to set.
       * @return This builder for chaining.
       */
      public Builder setKeepOriginal(boolean value) {
        bitField0_ |= 0x00000002;
        keepOriginal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool keep_original = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKeepOriginal() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keepOriginal_ = false;
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


      // @@protoc_insertion_point(builder_scope:greco.DynamicClassTextTransformerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.DynamicClassTextTransformerParams)
    private static final greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams();
    }

    public static greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DynamicClassTextTransformerParams>
        PARSER = new com.google.protobuf.AbstractParser<DynamicClassTextTransformerParams>() {
      @java.lang.Override
      public DynamicClassTextTransformerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<DynamicClassTextTransformerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicClassTextTransformerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 220277203;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.getDefaultInstance(),
          0,
          greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.class,
          greco.DynamicClassTextTransformerParamsOuterClass.DynamicClassTextTransformerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_DynamicClassTextTransformerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_DynamicClassTextTransformerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAspeech/greco3/context/dynamic_class_te" +
      "xt_transformer_params.proto\022\005greco\032\037spee" +
      "ch/greco3/core/params.proto\"\240\002\n!DynamicC" +
      "lassTextTransformerParams\022O\n\016transformat" +
      "ion\030\001 \001(\01627.greco.DynamicClassTextTransf" +
      "ormerParams.Transformation\022\025\n\rkeep_origi" +
      "nal\030\002 \001(\010\"K\n\016Transformation\022\022\n\016INVALID_M" +
      "ETOHD\020\000\022\014\n\010TO_LOWER\020\001\022\027\n\023TO_UPPER_FIRST_" +
      "CHAR\020\0022F\n\002id\022\r.greco.Params\030\323\323\204i \001(\0132(.g" +
      "reco.DynamicClassTextTransformerParamsB\010" +
      "H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_DynamicClassTextTransformerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_DynamicClassTextTransformerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_DynamicClassTextTransformerParams_descriptor,
        new java.lang.String[] { "Transformation", "KeepOriginal", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
