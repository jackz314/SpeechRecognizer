// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/lintrans_stream.proto

package greco;

public final class LintransStream {
  private LintransStream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.LintransStream.LintransStreamParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LintransStreamParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.LintransStreamParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return Whether the lintransModel field is set.
     */
    boolean hasLintransModel();
    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return The lintransModel.
     */
    java.lang.String getLintransModel();
    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return The bytes for lintransModel.
     */
    com.google.protobuf.ByteString
        getLintransModelBytes();
  }
  /**
   * Protobuf type {@code greco.LintransStreamParams}
   */
  public static final class LintransStreamParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.LintransStreamParams)
      LintransStreamParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LintransStreamParams.newBuilder() to construct.
    private LintransStreamParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LintransStreamParams() {
      lintransModel_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LintransStreamParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.LintransStream.internal_static_greco_LintransStreamParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.LintransStream.internal_static_greco_LintransStreamParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.LintransStream.LintransStreamParams.class, greco.LintransStream.LintransStreamParams.Builder.class);
    }

    private int bitField0_;
    public static final int LINTRANS_MODEL_FIELD_NUMBER = 1;
    private volatile java.lang.Object lintransModel_;
    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return Whether the lintransModel field is set.
     */
    @java.lang.Override
    public boolean hasLintransModel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return The lintransModel.
     */
    @java.lang.Override
    public java.lang.String getLintransModel() {
      java.lang.Object ref = lintransModel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lintransModel_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string lintrans_model = 1;</code>
     * @return The bytes for lintransModel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLintransModelBytes() {
      java.lang.Object ref = lintransModel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lintransModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static greco.LintransStream.LintransStreamParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.LintransStream.LintransStreamParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.LintransStream.LintransStreamParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.LintransStream.LintransStreamParams parseFrom(
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
    public static Builder newBuilder(greco.LintransStream.LintransStreamParams prototype) {
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
     * Protobuf type {@code greco.LintransStreamParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.LintransStreamParams)
        greco.LintransStream.LintransStreamParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.LintransStream.internal_static_greco_LintransStreamParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.LintransStream.internal_static_greco_LintransStreamParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.LintransStream.LintransStreamParams.class, greco.LintransStream.LintransStreamParams.Builder.class);
      }

      // Construct using greco.LintransStream.LintransStreamParams.newBuilder()
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
        lintransModel_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.LintransStream.internal_static_greco_LintransStreamParams_descriptor;
      }

      @java.lang.Override
      public greco.LintransStream.LintransStreamParams getDefaultInstanceForType() {
        return greco.LintransStream.LintransStreamParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.LintransStream.LintransStreamParams build() {
        greco.LintransStream.LintransStreamParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.LintransStream.LintransStreamParams buildPartial() {
        greco.LintransStream.LintransStreamParams result = new greco.LintransStream.LintransStreamParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.lintransModel_ = lintransModel_;
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

      private java.lang.Object lintransModel_ = "";
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @return Whether the lintransModel field is set.
       */
      public boolean hasLintransModel() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @return The lintransModel.
       */
      public java.lang.String getLintransModel() {
        java.lang.Object ref = lintransModel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            lintransModel_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @return The bytes for lintransModel.
       */
      public com.google.protobuf.ByteString
          getLintransModelBytes() {
        java.lang.Object ref = lintransModel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lintransModel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @param value The lintransModel to set.
       * @return This builder for chaining.
       */
      public Builder setLintransModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        lintransModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLintransModel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lintransModel_ = getDefaultInstance().getLintransModel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string lintrans_model = 1;</code>
       * @param value The bytes for lintransModel to set.
       * @return This builder for chaining.
       */
      public Builder setLintransModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        lintransModel_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.LintransStreamParams)
    }

    // @@protoc_insertion_point(class_scope:greco.LintransStreamParams)
    private static final greco.LintransStream.LintransStreamParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.LintransStream.LintransStreamParams();
    }

    public static greco.LintransStream.LintransStreamParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LintransStreamParams>
        PARSER = new com.google.protobuf.AbstractParser<LintransStreamParams>() {
      @java.lang.Override
      public LintransStreamParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<LintransStreamParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LintransStreamParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.LintransStream.LintransStreamParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 23965528;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.LintransStream.LintransStreamParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.LintransStream.LintransStreamParams.getDefaultInstance(),
          0,
          greco.LintransStream.LintransStreamParams.class,
          greco.LintransStream.LintransStreamParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_LintransStreamParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_LintransStreamParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,speech/greco3/frontend/lintrans_stream" +
      ".proto\022\005greco\032\037speech/greco3/core/params" +
      ".proto\"i\n\024LintransStreamParams\022\026\n\016lintra" +
      "ns_model\030\001 \001(\t29\n\002id\022\r.greco.Params\030\330\336\266\013" +
      " \001(\0132\033.greco.LintransStreamParamsB\010H\002\242\002\003" +
      "GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_LintransStreamParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_LintransStreamParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_LintransStreamParams_descriptor,
        new java.lang.String[] { "LintransModel", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}