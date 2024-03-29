// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/text_norm/class_normalizer_params.proto

package greco;

public final class ClassNormalizerParamsOuterClass {
  private ClassNormalizerParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClassNormalizerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.ClassNormalizerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return Whether the fullmatchNormalizerRef field is set.
     */
    boolean hasFullmatchNormalizerRef();
    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return The fullmatchNormalizerRef.
     */
    java.lang.String getFullmatchNormalizerRef();
    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return The bytes for fullmatchNormalizerRef.
     */
    com.google.protobuf.ByteString
        getFullmatchNormalizerRefBytes();
  }
  /**
   * Protobuf type {@code greco.ClassNormalizerParams}
   */
  public static final class ClassNormalizerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.ClassNormalizerParams)
      ClassNormalizerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClassNormalizerParams.newBuilder() to construct.
    private ClassNormalizerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClassNormalizerParams() {
      fullmatchNormalizerRef_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClassNormalizerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.ClassNormalizerParamsOuterClass.internal_static_greco_ClassNormalizerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.ClassNormalizerParamsOuterClass.internal_static_greco_ClassNormalizerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.class, greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.Builder.class);
    }

    private int bitField0_;
    public static final int FULLMATCH_NORMALIZER_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object fullmatchNormalizerRef_;
    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return Whether the fullmatchNormalizerRef field is set.
     */
    @java.lang.Override
    public boolean hasFullmatchNormalizerRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return The fullmatchNormalizerRef.
     */
    @java.lang.Override
    public java.lang.String getFullmatchNormalizerRef() {
      java.lang.Object ref = fullmatchNormalizerRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fullmatchNormalizerRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string fullmatch_normalizer_ref = 1;</code>
     * @return The bytes for fullmatchNormalizerRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFullmatchNormalizerRefBytes() {
      java.lang.Object ref = fullmatchNormalizerRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullmatchNormalizerRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams parseFrom(
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
    public static Builder newBuilder(greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams prototype) {
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
     * Protobuf type {@code greco.ClassNormalizerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.ClassNormalizerParams)
        greco.ClassNormalizerParamsOuterClass.ClassNormalizerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.ClassNormalizerParamsOuterClass.internal_static_greco_ClassNormalizerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.ClassNormalizerParamsOuterClass.internal_static_greco_ClassNormalizerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.class, greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.Builder.class);
      }

      // Construct using greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.newBuilder()
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
        fullmatchNormalizerRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.ClassNormalizerParamsOuterClass.internal_static_greco_ClassNormalizerParams_descriptor;
      }

      @java.lang.Override
      public greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams getDefaultInstanceForType() {
        return greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams build() {
        greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams buildPartial() {
        greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams result = new greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fullmatchNormalizerRef_ = fullmatchNormalizerRef_;
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

      private java.lang.Object fullmatchNormalizerRef_ = "";
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @return Whether the fullmatchNormalizerRef field is set.
       */
      public boolean hasFullmatchNormalizerRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @return The fullmatchNormalizerRef.
       */
      public java.lang.String getFullmatchNormalizerRef() {
        java.lang.Object ref = fullmatchNormalizerRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fullmatchNormalizerRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @return The bytes for fullmatchNormalizerRef.
       */
      public com.google.protobuf.ByteString
          getFullmatchNormalizerRefBytes() {
        java.lang.Object ref = fullmatchNormalizerRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fullmatchNormalizerRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @param value The fullmatchNormalizerRef to set.
       * @return This builder for chaining.
       */
      public Builder setFullmatchNormalizerRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fullmatchNormalizerRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFullmatchNormalizerRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fullmatchNormalizerRef_ = getDefaultInstance().getFullmatchNormalizerRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fullmatch_normalizer_ref = 1;</code>
       * @param value The bytes for fullmatchNormalizerRef to set.
       * @return This builder for chaining.
       */
      public Builder setFullmatchNormalizerRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fullmatchNormalizerRef_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.ClassNormalizerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.ClassNormalizerParams)
    private static final greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams();
    }

    public static greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ClassNormalizerParams>
        PARSER = new com.google.protobuf.AbstractParser<ClassNormalizerParams>() {
      @java.lang.Override
      public ClassNormalizerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClassNormalizerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClassNormalizerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 109121237;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.getDefaultInstance(),
          0,
          greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.class,
          greco.ClassNormalizerParamsOuterClass.ClassNormalizerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_ClassNormalizerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_ClassNormalizerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5speech/greco3/text_norm/class_normaliz" +
      "er_params.proto\022\005greco\032\037speech/greco3/co" +
      "re/params.proto\"u\n\025ClassNormalizerParams" +
      "\022 \n\030fullmatch_normalizer_ref\030\001 \001(\t2:\n\002id" +
      "\022\r.greco.Params\030\325\235\2044 \001(\0132\034.greco.ClassNo" +
      "rmalizerParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_ClassNormalizerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_ClassNormalizerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_ClassNormalizerParams_descriptor,
        new java.lang.String[] { "FullmatchNormalizerRef", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
