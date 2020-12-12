// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/results/combined_result_stream.proto

package greco;

public final class CombinedResultStream {
  private CombinedResultStream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.CombinedResultStream.CombinedResultStreamParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombinedResultStreamParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.CombinedResultStreamParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @return A list containing the resultGeneratorClassname.
     */
    java.util.List<java.lang.String>
        getResultGeneratorClassnameList();
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @return The count of resultGeneratorClassname.
     */
    int getResultGeneratorClassnameCount();
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @param index The index of the element to return.
     * @return The resultGeneratorClassname at the given index.
     */
    java.lang.String getResultGeneratorClassname(int index);
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the resultGeneratorClassname at the given index.
     */
    com.google.protobuf.ByteString
        getResultGeneratorClassnameBytes(int index);
  }
  /**
   * Protobuf type {@code greco.CombinedResultStreamParams}
   */
  public static final class CombinedResultStreamParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.CombinedResultStreamParams)
      CombinedResultStreamParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombinedResultStreamParams.newBuilder() to construct.
    private CombinedResultStreamParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombinedResultStreamParams() {
      resultGeneratorClassname_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombinedResultStreamParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.CombinedResultStream.internal_static_greco_CombinedResultStreamParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.CombinedResultStream.internal_static_greco_CombinedResultStreamParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.CombinedResultStream.CombinedResultStreamParams.class, greco.CombinedResultStream.CombinedResultStreamParams.Builder.class);
    }

    public static final int RESULT_GENERATOR_CLASSNAME_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList resultGeneratorClassname_;
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @return A list containing the resultGeneratorClassname.
     */
    public com.google.protobuf.ProtocolStringList
        getResultGeneratorClassnameList() {
      return resultGeneratorClassname_;
    }
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @return The count of resultGeneratorClassname.
     */
    public int getResultGeneratorClassnameCount() {
      return resultGeneratorClassname_.size();
    }
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @param index The index of the element to return.
     * @return The resultGeneratorClassname at the given index.
     */
    public java.lang.String getResultGeneratorClassname(int index) {
      return resultGeneratorClassname_.get(index);
    }
    /**
     * <code>repeated string result_generator_classname = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the resultGeneratorClassname at the given index.
     */
    public com.google.protobuf.ByteString
        getResultGeneratorClassnameBytes(int index) {
      return resultGeneratorClassname_.getByteString(index);
    }

    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.CombinedResultStream.CombinedResultStreamParams parseFrom(
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
    public static Builder newBuilder(greco.CombinedResultStream.CombinedResultStreamParams prototype) {
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
     * Protobuf type {@code greco.CombinedResultStreamParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.CombinedResultStreamParams)
        greco.CombinedResultStream.CombinedResultStreamParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.CombinedResultStream.internal_static_greco_CombinedResultStreamParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.CombinedResultStream.internal_static_greco_CombinedResultStreamParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.CombinedResultStream.CombinedResultStreamParams.class, greco.CombinedResultStream.CombinedResultStreamParams.Builder.class);
      }

      // Construct using greco.CombinedResultStream.CombinedResultStreamParams.newBuilder()
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
        resultGeneratorClassname_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.CombinedResultStream.internal_static_greco_CombinedResultStreamParams_descriptor;
      }

      @java.lang.Override
      public greco.CombinedResultStream.CombinedResultStreamParams getDefaultInstanceForType() {
        return greco.CombinedResultStream.CombinedResultStreamParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.CombinedResultStream.CombinedResultStreamParams build() {
        greco.CombinedResultStream.CombinedResultStreamParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.CombinedResultStream.CombinedResultStreamParams buildPartial() {
        greco.CombinedResultStream.CombinedResultStreamParams result = new greco.CombinedResultStream.CombinedResultStreamParams(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          resultGeneratorClassname_ = resultGeneratorClassname_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resultGeneratorClassname_ = resultGeneratorClassname_;
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

      private com.google.protobuf.LazyStringList resultGeneratorClassname_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureResultGeneratorClassnameIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          resultGeneratorClassname_ = new com.google.protobuf.LazyStringArrayList(resultGeneratorClassname_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @return A list containing the resultGeneratorClassname.
       */
      public com.google.protobuf.ProtocolStringList
          getResultGeneratorClassnameList() {
        return resultGeneratorClassname_.getUnmodifiableView();
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @return The count of resultGeneratorClassname.
       */
      public int getResultGeneratorClassnameCount() {
        return resultGeneratorClassname_.size();
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param index The index of the element to return.
       * @return The resultGeneratorClassname at the given index.
       */
      public java.lang.String getResultGeneratorClassname(int index) {
        return resultGeneratorClassname_.get(index);
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the resultGeneratorClassname at the given index.
       */
      public com.google.protobuf.ByteString
          getResultGeneratorClassnameBytes(int index) {
        return resultGeneratorClassname_.getByteString(index);
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param index The index to set the value at.
       * @param value The resultGeneratorClassname to set.
       * @return This builder for chaining.
       */
      public Builder setResultGeneratorClassname(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureResultGeneratorClassnameIsMutable();
        resultGeneratorClassname_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param value The resultGeneratorClassname to add.
       * @return This builder for chaining.
       */
      public Builder addResultGeneratorClassname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureResultGeneratorClassnameIsMutable();
        resultGeneratorClassname_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param values The resultGeneratorClassname to add.
       * @return This builder for chaining.
       */
      public Builder addAllResultGeneratorClassname(
          java.lang.Iterable<java.lang.String> values) {
        ensureResultGeneratorClassnameIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resultGeneratorClassname_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResultGeneratorClassname() {
        resultGeneratorClassname_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string result_generator_classname = 1;</code>
       * @param value The bytes of the resultGeneratorClassname to add.
       * @return This builder for chaining.
       */
      public Builder addResultGeneratorClassnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureResultGeneratorClassnameIsMutable();
        resultGeneratorClassname_.add(value);
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


      // @@protoc_insertion_point(builder_scope:greco.CombinedResultStreamParams)
    }

    // @@protoc_insertion_point(class_scope:greco.CombinedResultStreamParams)
    private static final greco.CombinedResultStream.CombinedResultStreamParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.CombinedResultStream.CombinedResultStreamParams();
    }

    public static greco.CombinedResultStream.CombinedResultStreamParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CombinedResultStreamParams>
        PARSER = new com.google.protobuf.AbstractParser<CombinedResultStreamParams>() {
      @java.lang.Override
      public CombinedResultStreamParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<CombinedResultStreamParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombinedResultStreamParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.CombinedResultStream.CombinedResultStreamParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 323495842;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.CombinedResultStream.CombinedResultStreamParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.CombinedResultStream.CombinedResultStreamParams.getDefaultInstance(),
          0,
          greco.CombinedResultStream.CombinedResultStreamParams.class,
          greco.CombinedResultStream.CombinedResultStreamParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_CombinedResultStreamParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_CombinedResultStreamParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2speech/greco3/results/combined_result_" +
      "stream.proto\022\005greco\032\037speech/greco3/core/" +
      "params.proto\"\202\001\n\032CombinedResultStreamPar" +
      "ams\022\"\n\032result_generator_classname\030\001 \003(\t2" +
      "@\n\002id\022\r.greco.Params\030\242\317\240\232\001 \001(\0132!.greco.C" +
      "ombinedResultStreamParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_CombinedResultStreamParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_CombinedResultStreamParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_CombinedResultStreamParams_descriptor,
        new java.lang.String[] { "ResultGeneratorClassname", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
