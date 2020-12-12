// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/resource/symbol_table_params.proto

package greco;

public final class SymbolTableParamsOuterClass {
  private SymbolTableParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.SymbolTableParamsOuterClass.SymbolTableParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SymbolTableParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.SymbolTableParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string filename = 1;</code>
     * @return Whether the filename field is set.
     */
    boolean hasFilename();
    /**
     * <code>optional string filename = 1;</code>
     * @return The filename.
     */
    java.lang.String getFilename();
    /**
     * <code>optional string filename = 1;</code>
     * @return The bytes for filename.
     */
    com.google.protobuf.ByteString
        getFilenameBytes();

    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return Whether the fstFieldSeparator field is set.
     */
    boolean hasFstFieldSeparator();
    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return The fstFieldSeparator.
     */
    java.lang.String getFstFieldSeparator();
    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return The bytes for fstFieldSeparator.
     */
    com.google.protobuf.ByteString
        getFstFieldSeparatorBytes();

    /**
     * <code>optional bool binary = 3 [default = false];</code>
     * @return Whether the binary field is set.
     */
    boolean hasBinary();
    /**
     * <code>optional bool binary = 3 [default = false];</code>
     * @return The binary.
     */
    boolean getBinary();
  }
  /**
   * Protobuf type {@code greco.SymbolTableParams}
   */
  public static final class SymbolTableParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.SymbolTableParams)
      SymbolTableParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SymbolTableParams.newBuilder() to construct.
    private SymbolTableParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SymbolTableParams() {
      filename_ = "";
      fstFieldSeparator_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SymbolTableParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.SymbolTableParamsOuterClass.internal_static_greco_SymbolTableParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.SymbolTableParamsOuterClass.internal_static_greco_SymbolTableParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.SymbolTableParamsOuterClass.SymbolTableParams.class, greco.SymbolTableParamsOuterClass.SymbolTableParams.Builder.class);
    }

    private int bitField0_;
    public static final int FILENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object filename_;
    /**
     * <code>optional string filename = 1;</code>
     * @return Whether the filename field is set.
     */
    @java.lang.Override
    public boolean hasFilename() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string filename = 1;</code>
     * @return The filename.
     */
    @java.lang.Override
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          filename_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string filename = 1;</code>
     * @return The bytes for filename.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FST_FIELD_SEPARATOR_FIELD_NUMBER = 2;
    private volatile java.lang.Object fstFieldSeparator_;
    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return Whether the fstFieldSeparator field is set.
     */
    @java.lang.Override
    public boolean hasFstFieldSeparator() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return The fstFieldSeparator.
     */
    @java.lang.Override
    public java.lang.String getFstFieldSeparator() {
      java.lang.Object ref = fstFieldSeparator_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fstFieldSeparator_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string fst_field_separator = 2;</code>
     * @return The bytes for fstFieldSeparator.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFstFieldSeparatorBytes() {
      java.lang.Object ref = fstFieldSeparator_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fstFieldSeparator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BINARY_FIELD_NUMBER = 3;
    private boolean binary_;
    /**
     * <code>optional bool binary = 3 [default = false];</code>
     * @return Whether the binary field is set.
     */
    @java.lang.Override
    public boolean hasBinary() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool binary = 3 [default = false];</code>
     * @return The binary.
     */
    @java.lang.Override
    public boolean getBinary() {
      return binary_;
    }

    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SymbolTableParamsOuterClass.SymbolTableParams parseFrom(
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
    public static Builder newBuilder(greco.SymbolTableParamsOuterClass.SymbolTableParams prototype) {
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
     * Protobuf type {@code greco.SymbolTableParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.SymbolTableParams)
        greco.SymbolTableParamsOuterClass.SymbolTableParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.SymbolTableParamsOuterClass.internal_static_greco_SymbolTableParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.SymbolTableParamsOuterClass.internal_static_greco_SymbolTableParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.SymbolTableParamsOuterClass.SymbolTableParams.class, greco.SymbolTableParamsOuterClass.SymbolTableParams.Builder.class);
      }

      // Construct using greco.SymbolTableParamsOuterClass.SymbolTableParams.newBuilder()
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
        filename_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        fstFieldSeparator_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        binary_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.SymbolTableParamsOuterClass.internal_static_greco_SymbolTableParams_descriptor;
      }

      @java.lang.Override
      public greco.SymbolTableParamsOuterClass.SymbolTableParams getDefaultInstanceForType() {
        return greco.SymbolTableParamsOuterClass.SymbolTableParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.SymbolTableParamsOuterClass.SymbolTableParams build() {
        greco.SymbolTableParamsOuterClass.SymbolTableParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.SymbolTableParamsOuterClass.SymbolTableParams buildPartial() {
        greco.SymbolTableParamsOuterClass.SymbolTableParams result = new greco.SymbolTableParamsOuterClass.SymbolTableParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.filename_ = filename_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.fstFieldSeparator_ = fstFieldSeparator_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.binary_ = binary_;
          to_bitField0_ |= 0x00000004;
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

      private java.lang.Object filename_ = "";
      /**
       * <code>optional string filename = 1;</code>
       * @return Whether the filename field is set.
       */
      public boolean hasFilename() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string filename = 1;</code>
       * @return The filename.
       */
      public java.lang.String getFilename() {
        java.lang.Object ref = filename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            filename_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string filename = 1;</code>
       * @return The bytes for filename.
       */
      public com.google.protobuf.ByteString
          getFilenameBytes() {
        java.lang.Object ref = filename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          filename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string filename = 1;</code>
       * @param value The filename to set.
       * @return This builder for chaining.
       */
      public Builder setFilename(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        filename_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string filename = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilename() {
        bitField0_ = (bitField0_ & ~0x00000001);
        filename_ = getDefaultInstance().getFilename();
        onChanged();
        return this;
      }
      /**
       * <code>optional string filename = 1;</code>
       * @param value The bytes for filename to set.
       * @return This builder for chaining.
       */
      public Builder setFilenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        filename_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object fstFieldSeparator_ = "";
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @return Whether the fstFieldSeparator field is set.
       */
      public boolean hasFstFieldSeparator() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @return The fstFieldSeparator.
       */
      public java.lang.String getFstFieldSeparator() {
        java.lang.Object ref = fstFieldSeparator_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fstFieldSeparator_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @return The bytes for fstFieldSeparator.
       */
      public com.google.protobuf.ByteString
          getFstFieldSeparatorBytes() {
        java.lang.Object ref = fstFieldSeparator_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fstFieldSeparator_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @param value The fstFieldSeparator to set.
       * @return This builder for chaining.
       */
      public Builder setFstFieldSeparator(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        fstFieldSeparator_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFstFieldSeparator() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fstFieldSeparator_ = getDefaultInstance().getFstFieldSeparator();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fst_field_separator = 2;</code>
       * @param value The bytes for fstFieldSeparator to set.
       * @return This builder for chaining.
       */
      public Builder setFstFieldSeparatorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        fstFieldSeparator_ = value;
        onChanged();
        return this;
      }

      private boolean binary_ ;
      /**
       * <code>optional bool binary = 3 [default = false];</code>
       * @return Whether the binary field is set.
       */
      @java.lang.Override
      public boolean hasBinary() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bool binary = 3 [default = false];</code>
       * @return The binary.
       */
      @java.lang.Override
      public boolean getBinary() {
        return binary_;
      }
      /**
       * <code>optional bool binary = 3 [default = false];</code>
       * @param value The binary to set.
       * @return This builder for chaining.
       */
      public Builder setBinary(boolean value) {
        bitField0_ |= 0x00000004;
        binary_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool binary = 3 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearBinary() {
        bitField0_ = (bitField0_ & ~0x00000004);
        binary_ = false;
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


      // @@protoc_insertion_point(builder_scope:greco.SymbolTableParams)
    }

    // @@protoc_insertion_point(class_scope:greco.SymbolTableParams)
    private static final greco.SymbolTableParamsOuterClass.SymbolTableParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.SymbolTableParamsOuterClass.SymbolTableParams();
    }

    public static greco.SymbolTableParamsOuterClass.SymbolTableParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SymbolTableParams>
        PARSER = new com.google.protobuf.AbstractParser<SymbolTableParams>() {
      @java.lang.Override
      public SymbolTableParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<SymbolTableParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SymbolTableParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.SymbolTableParamsOuterClass.SymbolTableParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 98173;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.SymbolTableParamsOuterClass.SymbolTableParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.SymbolTableParamsOuterClass.SymbolTableParams.getDefaultInstance(),
          0,
          greco.SymbolTableParamsOuterClass.SymbolTableParams.class,
          greco.SymbolTableParamsOuterClass.SymbolTableParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_SymbolTableParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_SymbolTableParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0speech/greco3/resource/symbol_table_pa" +
      "rams.proto\022\005greco\032\037speech/greco3/core/pa" +
      "rams.proto\"\220\001\n\021SymbolTableParams\022\020\n\010file" +
      "name\030\001 \001(\t\022\033\n\023fst_field_separator\030\002 \001(\t\022" +
      "\025\n\006binary\030\003 \001(\010:\005false25\n\002id\022\r.greco.Par" +
      "ams\030\375\376\005 \001(\0132\030.greco.SymbolTableParamsB\010H" +
      "\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_SymbolTableParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_SymbolTableParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_SymbolTableParams_descriptor,
        new java.lang.String[] { "Filename", "FstFieldSeparator", "Binary", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
