// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/endpointer_event_params.proto

package com.google.speech.greco3.frontend;

public final class EndpointerEventParamsProto {
  private EndpointerEventParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EndpointerEventParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.EndpointerEventParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
     * @return Whether the minSuffixSilenceMs field is set.
     */
    @java.lang.Deprecated boolean hasMinSuffixSilenceMs();
    /**
     * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
     * @return The minSuffixSilenceMs.
     */
    @java.lang.Deprecated int getMinSuffixSilenceMs();

    /**
     * <code>optional bool pass_through_frames = 2;</code>
     * @return Whether the passThroughFrames field is set.
     */
    boolean hasPassThroughFrames();
    /**
     * <code>optional bool pass_through_frames = 2;</code>
     * @return The passThroughFrames.
     */
    boolean getPassThroughFrames();
  }
  /**
   * Protobuf type {@code greco.EndpointerEventParams}
   */
  public static final class EndpointerEventParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.EndpointerEventParams)
      EndpointerEventParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EndpointerEventParams.newBuilder() to construct.
    private EndpointerEventParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EndpointerEventParams() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EndpointerEventParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.greco3.frontend.EndpointerEventParamsProto.internal_static_greco_EndpointerEventParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.greco3.frontend.EndpointerEventParamsProto.internal_static_greco_EndpointerEventParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.class, com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.Builder.class);
    }

    private int bitField0_;
    public static final int MIN_SUFFIX_SILENCE_MS_FIELD_NUMBER = 1;
    private int minSuffixSilenceMs_;
    /**
     * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
     * @return Whether the minSuffixSilenceMs field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean hasMinSuffixSilenceMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
     * @return The minSuffixSilenceMs.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getMinSuffixSilenceMs() {
      return minSuffixSilenceMs_;
    }

    public static final int PASS_THROUGH_FRAMES_FIELD_NUMBER = 2;
    private boolean passThroughFrames_;
    /**
     * <code>optional bool pass_through_frames = 2;</code>
     * @return Whether the passThroughFrames field is set.
     */
    @java.lang.Override
    public boolean hasPassThroughFrames() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool pass_through_frames = 2;</code>
     * @return The passThroughFrames.
     */
    @java.lang.Override
    public boolean getPassThroughFrames() {
      return passThroughFrames_;
    }

    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams parseFrom(
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
    public static Builder newBuilder(com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams prototype) {
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
     * Protobuf type {@code greco.EndpointerEventParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.EndpointerEventParams)
        com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.speech.greco3.frontend.EndpointerEventParamsProto.internal_static_greco_EndpointerEventParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.speech.greco3.frontend.EndpointerEventParamsProto.internal_static_greco_EndpointerEventParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.class, com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.Builder.class);
      }

      // Construct using com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.newBuilder()
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
        minSuffixSilenceMs_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        passThroughFrames_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.speech.greco3.frontend.EndpointerEventParamsProto.internal_static_greco_EndpointerEventParams_descriptor;
      }

      @java.lang.Override
      public com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams getDefaultInstanceForType() {
        return com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams build() {
        com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams buildPartial() {
        com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams result = new com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.minSuffixSilenceMs_ = minSuffixSilenceMs_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.passThroughFrames_ = passThroughFrames_;
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

      private int minSuffixSilenceMs_ ;
      /**
       * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
       * @return Whether the minSuffixSilenceMs field is set.
       */
      @java.lang.Override
      @java.lang.Deprecated public boolean hasMinSuffixSilenceMs() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
       * @return The minSuffixSilenceMs.
       */
      @java.lang.Override
      @java.lang.Deprecated public int getMinSuffixSilenceMs() {
        return minSuffixSilenceMs_;
      }
      /**
       * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
       * @param value The minSuffixSilenceMs to set.
       * @return This builder for chaining.
       */
      @java.lang.Deprecated public Builder setMinSuffixSilenceMs(int value) {
        bitField0_ |= 0x00000001;
        minSuffixSilenceMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 min_suffix_silence_ms = 1 [default = 0, deprecated = true];</code>
       * @return This builder for chaining.
       */
      @java.lang.Deprecated public Builder clearMinSuffixSilenceMs() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minSuffixSilenceMs_ = 0;
        onChanged();
        return this;
      }

      private boolean passThroughFrames_ ;
      /**
       * <code>optional bool pass_through_frames = 2;</code>
       * @return Whether the passThroughFrames field is set.
       */
      @java.lang.Override
      public boolean hasPassThroughFrames() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool pass_through_frames = 2;</code>
       * @return The passThroughFrames.
       */
      @java.lang.Override
      public boolean getPassThroughFrames() {
        return passThroughFrames_;
      }
      /**
       * <code>optional bool pass_through_frames = 2;</code>
       * @param value The passThroughFrames to set.
       * @return This builder for chaining.
       */
      public Builder setPassThroughFrames(boolean value) {
        bitField0_ |= 0x00000002;
        passThroughFrames_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool pass_through_frames = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassThroughFrames() {
        bitField0_ = (bitField0_ & ~0x00000002);
        passThroughFrames_ = false;
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


      // @@protoc_insertion_point(builder_scope:greco.EndpointerEventParams)
    }

    // @@protoc_insertion_point(class_scope:greco.EndpointerEventParams)
    private static final com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams();
    }

    public static com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EndpointerEventParams>
        PARSER = new com.google.protobuf.AbstractParser<EndpointerEventParams>() {
      @java.lang.Override
      public EndpointerEventParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<EndpointerEventParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EndpointerEventParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 94428082;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.getDefaultInstance(),
          0,
          com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.class,
          com.google.speech.greco3.frontend.EndpointerEventParamsProto.EndpointerEventParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_EndpointerEventParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_EndpointerEventParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4speech/greco3/frontend/endpointer_even" +
      "t_params.proto\022\005greco\032\037speech/greco3/cor" +
      "e/params.proto\"\226\001\n\025EndpointerEventParams" +
      "\022$\n\025min_suffix_silence_ms\030\001 \001(\005:\0010B\002\030\001\022\033" +
      "\n\023pass_through_frames\030\002 \001(\0102:\n\002id\022\r.grec" +
      "o.Params\030\262\267\203- \001(\0132\034.greco.EndpointerEven" +
      "tParamsBG\n!com.google.speech.greco3.fron" +
      "tendB\032EndpointerEventParamsProtoH\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_EndpointerEventParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_EndpointerEventParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_EndpointerEventParams_descriptor,
        new java.lang.String[] { "MinSuffixSilenceMs", "PassThroughFrames", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}