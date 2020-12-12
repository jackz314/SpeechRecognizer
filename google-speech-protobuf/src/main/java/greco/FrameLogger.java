// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/frame_logger.proto

package greco;

public final class FrameLogger {
  private FrameLogger() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.FrameLogger.FrameLoggerParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FrameLoggerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.FrameLoggerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string feature_name = 1;</code>
     * @return Whether the featureName field is set.
     */
    boolean hasFeatureName();
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The featureName.
     */
    java.lang.String getFeatureName();
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The bytes for featureName.
     */
    com.google.protobuf.ByteString
        getFeatureNameBytes();
  }
  /**
   * Protobuf type {@code greco.FrameLoggerParams}
   */
  public static final class FrameLoggerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.FrameLoggerParams)
      FrameLoggerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FrameLoggerParams.newBuilder() to construct.
    private FrameLoggerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FrameLoggerParams() {
      featureName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FrameLoggerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.FrameLogger.internal_static_greco_FrameLoggerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.FrameLogger.internal_static_greco_FrameLoggerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.FrameLogger.FrameLoggerParams.class, greco.FrameLogger.FrameLoggerParams.Builder.class);
    }

    private int bitField0_;
    public static final int FEATURE_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object featureName_;
    /**
     * <code>optional string feature_name = 1;</code>
     * @return Whether the featureName field is set.
     */
    @java.lang.Override
    public boolean hasFeatureName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The featureName.
     */
    @java.lang.Override
    public java.lang.String getFeatureName() {
      java.lang.Object ref = featureName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          featureName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The bytes for featureName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeatureNameBytes() {
      java.lang.Object ref = featureName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        featureName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.FrameLogger.FrameLoggerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.FrameLogger.FrameLoggerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.FrameLogger.FrameLoggerParams parseFrom(
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
    public static Builder newBuilder(greco.FrameLogger.FrameLoggerParams prototype) {
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
     * Protobuf type {@code greco.FrameLoggerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.FrameLoggerParams)
        greco.FrameLogger.FrameLoggerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.FrameLogger.internal_static_greco_FrameLoggerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.FrameLogger.internal_static_greco_FrameLoggerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.FrameLogger.FrameLoggerParams.class, greco.FrameLogger.FrameLoggerParams.Builder.class);
      }

      // Construct using greco.FrameLogger.FrameLoggerParams.newBuilder()
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
        featureName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.FrameLogger.internal_static_greco_FrameLoggerParams_descriptor;
      }

      @java.lang.Override
      public greco.FrameLogger.FrameLoggerParams getDefaultInstanceForType() {
        return greco.FrameLogger.FrameLoggerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.FrameLogger.FrameLoggerParams build() {
        greco.FrameLogger.FrameLoggerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.FrameLogger.FrameLoggerParams buildPartial() {
        greco.FrameLogger.FrameLoggerParams result = new greco.FrameLogger.FrameLoggerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.featureName_ = featureName_;
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

      private java.lang.Object featureName_ = "";
      /**
       * <code>optional string feature_name = 1;</code>
       * @return Whether the featureName field is set.
       */
      public boolean hasFeatureName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return The featureName.
       */
      public java.lang.String getFeatureName() {
        java.lang.Object ref = featureName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            featureName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return The bytes for featureName.
       */
      public com.google.protobuf.ByteString
          getFeatureNameBytes() {
        java.lang.Object ref = featureName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          featureName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @param value The featureName to set.
       * @return This builder for chaining.
       */
      public Builder setFeatureName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        featureName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeatureName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        featureName_ = getDefaultInstance().getFeatureName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @param value The bytes for featureName to set.
       * @return This builder for chaining.
       */
      public Builder setFeatureNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        featureName_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.FrameLoggerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.FrameLoggerParams)
    private static final greco.FrameLogger.FrameLoggerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.FrameLogger.FrameLoggerParams();
    }

    public static greco.FrameLogger.FrameLoggerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<FrameLoggerParams>
        PARSER = new com.google.protobuf.AbstractParser<FrameLoggerParams>() {
      @java.lang.Override
      public FrameLoggerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<FrameLoggerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FrameLoggerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.FrameLogger.FrameLoggerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 45050839;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.FrameLogger.FrameLoggerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.FrameLogger.FrameLoggerParams.getDefaultInstance(),
          0,
          greco.FrameLogger.FrameLoggerParams.class,
          greco.FrameLogger.FrameLoggerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_FrameLoggerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_FrameLoggerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)speech/greco3/frontend/frame_logger.pr" +
      "oto\022\005greco\032\037speech/greco3/core/params.pr" +
      "oto\"a\n\021FrameLoggerParams\022\024\n\014feature_name" +
      "\030\001 \001(\t26\n\002id\022\r.greco.Params\030\327\327\275\025 \001(\0132\030.g" +
      "reco.FrameLoggerParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_FrameLoggerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_FrameLoggerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_FrameLoggerParams_descriptor,
        new java.lang.String[] { "FeatureName", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
