// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/text_norm/capitalization_mask_normalizer.proto

package greco;

public final class CapitalizationMaskNormalizer {
  private CapitalizationMaskNormalizer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CapitalizationMaskNormalizerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.CapitalizationMaskNormalizerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
     * @return Whether the scope field is set.
     */
    boolean hasScope();
    /**
     * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
     * @return The scope.
     */
    greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope getScope();
  }
  /**
   * Protobuf type {@code greco.CapitalizationMaskNormalizerParams}
   */
  public static final class CapitalizationMaskNormalizerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.CapitalizationMaskNormalizerParams)
      CapitalizationMaskNormalizerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CapitalizationMaskNormalizerParams.newBuilder() to construct.
    private CapitalizationMaskNormalizerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CapitalizationMaskNormalizerParams() {
      scope_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CapitalizationMaskNormalizerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.CapitalizationMaskNormalizer.internal_static_greco_CapitalizationMaskNormalizerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.CapitalizationMaskNormalizer.internal_static_greco_CapitalizationMaskNormalizerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.class, greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.Builder.class);
    }

    /**
     * Protobuf enum {@code greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope}
     */
    public enum CapitalizationMaskScope
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DEFAULT = 0;</code>
       */
      DEFAULT(0),
      /**
       * <code>WORD = 1;</code>
       */
      WORD(1),
      /**
       * <code>UTTERANCE = 2;</code>
       */
      UTTERANCE(2),
      ;

      /**
       * <code>DEFAULT = 0;</code>
       */
      public static final int DEFAULT_VALUE = 0;
      /**
       * <code>WORD = 1;</code>
       */
      public static final int WORD_VALUE = 1;
      /**
       * <code>UTTERANCE = 2;</code>
       */
      public static final int UTTERANCE_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CapitalizationMaskScope valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CapitalizationMaskScope forNumber(int value) {
        switch (value) {
          case 0: return DEFAULT;
          case 1: return WORD;
          case 2: return UTTERANCE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CapitalizationMaskScope>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CapitalizationMaskScope> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CapitalizationMaskScope>() {
              public CapitalizationMaskScope findValueByNumber(int number) {
                return CapitalizationMaskScope.forNumber(number);
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
        return greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.getDescriptor().getEnumTypes().get(0);
      }

      private static final CapitalizationMaskScope[] VALUES = values();

      public static CapitalizationMaskScope valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private CapitalizationMaskScope(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope)
    }

    private int bitField0_;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private int scope_;
    /**
     * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
     * @return Whether the scope field is set.
     */
    @java.lang.Override public boolean hasScope() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
     * @return The scope.
     */
    @java.lang.Override public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope getScope() {
      @SuppressWarnings("deprecation")
      greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope result = greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope.valueOf(scope_);
      return result == null ? greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope.DEFAULT : result;
    }

    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams parseFrom(
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
    public static Builder newBuilder(greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams prototype) {
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
     * Protobuf type {@code greco.CapitalizationMaskNormalizerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.CapitalizationMaskNormalizerParams)
        greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.CapitalizationMaskNormalizer.internal_static_greco_CapitalizationMaskNormalizerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.CapitalizationMaskNormalizer.internal_static_greco_CapitalizationMaskNormalizerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.class, greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.Builder.class);
      }

      // Construct using greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.newBuilder()
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
        scope_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.CapitalizationMaskNormalizer.internal_static_greco_CapitalizationMaskNormalizerParams_descriptor;
      }

      @java.lang.Override
      public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams getDefaultInstanceForType() {
        return greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams build() {
        greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams buildPartial() {
        greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams result = new greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.scope_ = scope_;
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

      private int scope_ = 0;
      /**
       * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
       * @return Whether the scope field is set.
       */
      @java.lang.Override public boolean hasScope() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
       * @return The scope.
       */
      @java.lang.Override
      public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope getScope() {
        @SuppressWarnings("deprecation")
        greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope result = greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope.valueOf(scope_);
        return result == null ? greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope.DEFAULT : result;
      }
      /**
       * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
       * @param value The scope to set.
       * @return This builder for chaining.
       */
      public Builder setScope(greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.CapitalizationMaskScope value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        scope_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.CapitalizationMaskNormalizerParams.CapitalizationMaskScope scope = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearScope() {
        bitField0_ = (bitField0_ & ~0x00000001);
        scope_ = 0;
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


      // @@protoc_insertion_point(builder_scope:greco.CapitalizationMaskNormalizerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.CapitalizationMaskNormalizerParams)
    private static final greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams();
    }

    public static greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CapitalizationMaskNormalizerParams>
        PARSER = new com.google.protobuf.AbstractParser<CapitalizationMaskNormalizerParams>() {
      @java.lang.Override
      public CapitalizationMaskNormalizerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<CapitalizationMaskNormalizerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CapitalizationMaskNormalizerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 254237440;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.getDefaultInstance(),
          0,
          greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.class,
          greco.CapitalizationMaskNormalizer.CapitalizationMaskNormalizerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_CapitalizationMaskNormalizerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_CapitalizationMaskNormalizerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<speech/greco3/text_norm/capitalization" +
      "_mask_normalizer.proto\022\005greco\032\037speech/gr" +
      "eco3/core/params.proto\"\200\002\n\"Capitalizatio" +
      "nMaskNormalizerParams\022P\n\005scope\030\001 \001(\0162A.g" +
      "reco.CapitalizationMaskNormalizerParams." +
      "CapitalizationMaskScope\"?\n\027Capitalizatio" +
      "nMaskScope\022\013\n\007DEFAULT\020\000\022\010\n\004WORD\020\001\022\r\n\tUTT" +
      "ERANCE\020\0022G\n\002id\022\r.greco.Params\030\200\266\235y \001(\0132)" +
      ".greco.CapitalizationMaskNormalizerParam" +
      "sB\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_CapitalizationMaskNormalizerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_CapitalizationMaskNormalizerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_CapitalizationMaskNormalizerParams_descriptor,
        new java.lang.String[] { "Scope", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
