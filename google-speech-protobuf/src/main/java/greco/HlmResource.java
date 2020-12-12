// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/resource/hlm_resource.proto

package greco;

public final class HlmResource {
  private HlmResource() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.HlmResource.HlmResourceParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HlmResourceParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.HlmResourceParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     * @return Whether the hlmConfig field is set.
     */
    boolean hasHlmConfig();
    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     * @return The hlmConfig.
     */
    com.google.speech.fst.HlmConfigProto.HlmConfig getHlmConfig();
    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     */
    com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder getHlmConfigOrBuilder();
  }
  /**
   * Protobuf type {@code greco.HlmResourceParams}
   */
  public static final class HlmResourceParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.HlmResourceParams)
      HlmResourceParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HlmResourceParams.newBuilder() to construct.
    private HlmResourceParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HlmResourceParams() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HlmResourceParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.HlmResource.internal_static_greco_HlmResourceParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.HlmResource.internal_static_greco_HlmResourceParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.HlmResource.HlmResourceParams.class, greco.HlmResource.HlmResourceParams.Builder.class);
    }

    private int bitField0_;
    public static final int HLM_CONFIG_FIELD_NUMBER = 1;
    private com.google.speech.fst.HlmConfigProto.HlmConfig hlmConfig_;
    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     * @return Whether the hlmConfig field is set.
     */
    @java.lang.Override
    public boolean hasHlmConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     * @return The hlmConfig.
     */
    @java.lang.Override
    public com.google.speech.fst.HlmConfigProto.HlmConfig getHlmConfig() {
      return hlmConfig_ == null ? com.google.speech.fst.HlmConfigProto.HlmConfig.getDefaultInstance() : hlmConfig_;
    }
    /**
     * <code>required .speech.HlmConfig hlm_config = 1;</code>
     */
    @java.lang.Override
    public com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder getHlmConfigOrBuilder() {
      return hlmConfig_ == null ? com.google.speech.fst.HlmConfigProto.HlmConfig.getDefaultInstance() : hlmConfig_;
    }

    public static greco.HlmResource.HlmResourceParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.HlmResource.HlmResourceParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.HlmResource.HlmResourceParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.HlmResource.HlmResourceParams parseFrom(
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
    public static Builder newBuilder(greco.HlmResource.HlmResourceParams prototype) {
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
     * Protobuf type {@code greco.HlmResourceParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.HlmResourceParams)
        greco.HlmResource.HlmResourceParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.HlmResource.internal_static_greco_HlmResourceParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.HlmResource.internal_static_greco_HlmResourceParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.HlmResource.HlmResourceParams.class, greco.HlmResource.HlmResourceParams.Builder.class);
      }

      // Construct using greco.HlmResource.HlmResourceParams.newBuilder()
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
          getHlmConfigFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (hlmConfigBuilder_ == null) {
          hlmConfig_ = null;
        } else {
          hlmConfigBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.HlmResource.internal_static_greco_HlmResourceParams_descriptor;
      }

      @java.lang.Override
      public greco.HlmResource.HlmResourceParams getDefaultInstanceForType() {
        return greco.HlmResource.HlmResourceParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.HlmResource.HlmResourceParams build() {
        greco.HlmResource.HlmResourceParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.HlmResource.HlmResourceParams buildPartial() {
        greco.HlmResource.HlmResourceParams result = new greco.HlmResource.HlmResourceParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (hlmConfigBuilder_ == null) {
            result.hlmConfig_ = hlmConfig_;
          } else {
            result.hlmConfig_ = hlmConfigBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
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

      private com.google.speech.fst.HlmConfigProto.HlmConfig hlmConfig_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.speech.fst.HlmConfigProto.HlmConfig, com.google.speech.fst.HlmConfigProto.HlmConfig.Builder, com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder> hlmConfigBuilder_;
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       * @return Whether the hlmConfig field is set.
       */
      public boolean hasHlmConfig() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       * @return The hlmConfig.
       */
      public com.google.speech.fst.HlmConfigProto.HlmConfig getHlmConfig() {
        if (hlmConfigBuilder_ == null) {
          return hlmConfig_ == null ? com.google.speech.fst.HlmConfigProto.HlmConfig.getDefaultInstance() : hlmConfig_;
        } else {
          return hlmConfigBuilder_.getMessage();
        }
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public Builder setHlmConfig(com.google.speech.fst.HlmConfigProto.HlmConfig value) {
        if (hlmConfigBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hlmConfig_ = value;
          onChanged();
        } else {
          hlmConfigBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public Builder setHlmConfig(
          com.google.speech.fst.HlmConfigProto.HlmConfig.Builder builderForValue) {
        if (hlmConfigBuilder_ == null) {
          hlmConfig_ = builderForValue.build();
          onChanged();
        } else {
          hlmConfigBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public Builder mergeHlmConfig(com.google.speech.fst.HlmConfigProto.HlmConfig value) {
        if (hlmConfigBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              hlmConfig_ != null &&
              hlmConfig_ != com.google.speech.fst.HlmConfigProto.HlmConfig.getDefaultInstance()) {
            hlmConfig_ =
              com.google.speech.fst.HlmConfigProto.HlmConfig.newBuilder(hlmConfig_).mergeFrom(value).buildPartial();
          } else {
            hlmConfig_ = value;
          }
          onChanged();
        } else {
          hlmConfigBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public Builder clearHlmConfig() {
        if (hlmConfigBuilder_ == null) {
          hlmConfig_ = null;
          onChanged();
        } else {
          hlmConfigBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public com.google.speech.fst.HlmConfigProto.HlmConfig.Builder getHlmConfigBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHlmConfigFieldBuilder().getBuilder();
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      public com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder getHlmConfigOrBuilder() {
        if (hlmConfigBuilder_ != null) {
          return hlmConfigBuilder_.getMessageOrBuilder();
        } else {
          return hlmConfig_ == null ?
              com.google.speech.fst.HlmConfigProto.HlmConfig.getDefaultInstance() : hlmConfig_;
        }
      }
      /**
       * <code>required .speech.HlmConfig hlm_config = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.speech.fst.HlmConfigProto.HlmConfig, com.google.speech.fst.HlmConfigProto.HlmConfig.Builder, com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder> 
          getHlmConfigFieldBuilder() {
        if (hlmConfigBuilder_ == null) {
          hlmConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.speech.fst.HlmConfigProto.HlmConfig, com.google.speech.fst.HlmConfigProto.HlmConfig.Builder, com.google.speech.fst.HlmConfigProto.HlmConfigOrBuilder>(
                  getHlmConfig(),
                  getParentForChildren(),
                  isClean());
          hlmConfig_ = null;
        }
        return hlmConfigBuilder_;
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


      // @@protoc_insertion_point(builder_scope:greco.HlmResourceParams)
    }

    // @@protoc_insertion_point(class_scope:greco.HlmResourceParams)
    private static final greco.HlmResource.HlmResourceParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.HlmResource.HlmResourceParams();
    }

    public static greco.HlmResource.HlmResourceParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HlmResourceParams>
        PARSER = new com.google.protobuf.AbstractParser<HlmResourceParams>() {
      @java.lang.Override
      public HlmResourceParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<HlmResourceParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HlmResourceParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.HlmResource.HlmResourceParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 26276554;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.HlmResource.HlmResourceParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.HlmResource.HlmResourceParams.getDefaultInstance(),
          0,
          greco.HlmResource.HlmResourceParams.class,
          greco.HlmResource.HlmResourceParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_HlmResourceParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_HlmResourceParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)speech/greco3/resource/hlm_resource.pr" +
      "oto\022\005greco\032\037speech/greco3/core/params.pr" +
      "oto\032$speech/portable/fst/hlm_config.prot" +
      "o\"r\n\021HlmResourceParams\022%\n\nhlm_config\030\001 \002" +
      "(\0132\021.speech.HlmConfig26\n\002id\022\r.greco.Para" +
      "ms\030\312\345\303\014 \001(\0132\030.greco.HlmResourceParamsB\010H" +
      "\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
          com.google.speech.fst.HlmConfigProto.getDescriptor(),
        });
    internal_static_greco_HlmResourceParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_HlmResourceParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_HlmResourceParams_descriptor,
        new java.lang.String[] { "HlmConfig", });
    greco.ParamsProto.getDescriptor();
    com.google.speech.fst.HlmConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}