// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/contrib/fst/augmented_symbol_table_params.proto

package greco;

public final class AugmentedSymbolTableParamsOuterClass {
  private AugmentedSymbolTableParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AugmentedSymbolTableParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.AugmentedSymbolTableParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return Whether the symbolTableRef field is set.
     */
    boolean hasSymbolTableRef();
    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return The symbolTableRef.
     */
    java.lang.String getSymbolTableRef();
    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return The bytes for symbolTableRef.
     */
    com.google.protobuf.ByteString
        getSymbolTableRefBytes();
  }
  /**
   * Protobuf type {@code greco.AugmentedSymbolTableParams}
   */
  public static final class AugmentedSymbolTableParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.AugmentedSymbolTableParams)
      AugmentedSymbolTableParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AugmentedSymbolTableParams.newBuilder() to construct.
    private AugmentedSymbolTableParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AugmentedSymbolTableParams() {
      symbolTableRef_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AugmentedSymbolTableParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.AugmentedSymbolTableParamsOuterClass.internal_static_greco_AugmentedSymbolTableParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.AugmentedSymbolTableParamsOuterClass.internal_static_greco_AugmentedSymbolTableParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.class, greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.Builder.class);
    }

    private int bitField0_;
    public static final int SYMBOL_TABLE_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object symbolTableRef_;
    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return Whether the symbolTableRef field is set.
     */
    @java.lang.Override
    public boolean hasSymbolTableRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return The symbolTableRef.
     */
    @java.lang.Override
    public java.lang.String getSymbolTableRef() {
      java.lang.Object ref = symbolTableRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          symbolTableRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string symbol_table_ref = 1;</code>
     * @return The bytes for symbolTableRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSymbolTableRefBytes() {
      java.lang.Object ref = symbolTableRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbolTableRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams parseFrom(
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
    public static Builder newBuilder(greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams prototype) {
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
     * Protobuf type {@code greco.AugmentedSymbolTableParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.AugmentedSymbolTableParams)
        greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.AugmentedSymbolTableParamsOuterClass.internal_static_greco_AugmentedSymbolTableParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.AugmentedSymbolTableParamsOuterClass.internal_static_greco_AugmentedSymbolTableParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.class, greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.Builder.class);
      }

      // Construct using greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.newBuilder()
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
        symbolTableRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.AugmentedSymbolTableParamsOuterClass.internal_static_greco_AugmentedSymbolTableParams_descriptor;
      }

      @java.lang.Override
      public greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams getDefaultInstanceForType() {
        return greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams build() {
        greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams buildPartial() {
        greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams result = new greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.symbolTableRef_ = symbolTableRef_;
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

      private java.lang.Object symbolTableRef_ = "";
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @return Whether the symbolTableRef field is set.
       */
      public boolean hasSymbolTableRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @return The symbolTableRef.
       */
      public java.lang.String getSymbolTableRef() {
        java.lang.Object ref = symbolTableRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            symbolTableRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @return The bytes for symbolTableRef.
       */
      public com.google.protobuf.ByteString
          getSymbolTableRefBytes() {
        java.lang.Object ref = symbolTableRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symbolTableRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @param value The symbolTableRef to set.
       * @return This builder for chaining.
       */
      public Builder setSymbolTableRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbolTableRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSymbolTableRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        symbolTableRef_ = getDefaultInstance().getSymbolTableRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string symbol_table_ref = 1;</code>
       * @param value The bytes for symbolTableRef to set.
       * @return This builder for chaining.
       */
      public Builder setSymbolTableRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbolTableRef_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.AugmentedSymbolTableParams)
    }

    // @@protoc_insertion_point(class_scope:greco.AugmentedSymbolTableParams)
    private static final greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams();
    }

    public static greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AugmentedSymbolTableParams>
        PARSER = new com.google.protobuf.AbstractParser<AugmentedSymbolTableParams>() {
      @java.lang.Override
      public AugmentedSymbolTableParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<AugmentedSymbolTableParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AugmentedSymbolTableParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 173109948;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.getDefaultInstance(),
          0,
          greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.class,
          greco.AugmentedSymbolTableParamsOuterClass.AugmentedSymbolTableParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_AugmentedSymbolTableParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_AugmentedSymbolTableParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=speech/greco3/contrib/fst/augmented_sy" +
      "mbol_table_params.proto\022\005greco\032\037speech/g" +
      "reco3/core/params.proto\"w\n\032AugmentedSymb" +
      "olTableParams\022\030\n\020symbol_table_ref\030\001 \001(\t2" +
      "?\n\002id\022\r.greco.Params\030\274\345\305R \001(\0132!.greco.Au" +
      "gmentedSymbolTableParamsB\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_AugmentedSymbolTableParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_AugmentedSymbolTableParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_AugmentedSymbolTableParams_descriptor,
        new java.lang.String[] { "SymbolTableRef", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
