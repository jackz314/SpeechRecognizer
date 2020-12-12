// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/decoder/pass_through_score_cache_params.proto

package greco;

public final class PassThroughScoreCacheParamsOuterClass {
  private PassThroughScoreCacheParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PassThroughScoreCacheParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.PassThroughScoreCacheParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional float inverse_scale = 1 [default = 1];</code>
     * @return Whether the inverseScale field is set.
     */
    boolean hasInverseScale();
    /**
     * <code>optional float inverse_scale = 1 [default = 1];</code>
     * @return The inverseScale.
     */
    float getInverseScale();

    /**
     * <code>optional int32 unscaled_state = 2;</code>
     * @return Whether the unscaledState field is set.
     */
    boolean hasUnscaledState();
    /**
     * <code>optional int32 unscaled_state = 2;</code>
     * @return The unscaledState.
     */
    int getUnscaledState();

    /**
     * <code>optional float blank_scale = 3 [default = 1];</code>
     * @return Whether the blankScale field is set.
     */
    boolean hasBlankScale();
    /**
     * <code>optional float blank_scale = 3 [default = 1];</code>
     * @return The blankScale.
     */
    float getBlankScale();

    /**
     * <code>optional int32 score_begin = 4 [default = 0];</code>
     * @return Whether the scoreBegin field is set.
     */
    boolean hasScoreBegin();
    /**
     * <code>optional int32 score_begin = 4 [default = 0];</code>
     * @return The scoreBegin.
     */
    int getScoreBegin();

    /**
     * <code>optional int32 score_size = 5 [default = -1];</code>
     * @return Whether the scoreSize field is set.
     */
    boolean hasScoreSize();
    /**
     * <code>optional int32 score_size = 5 [default = -1];</code>
     * @return The scoreSize.
     */
    int getScoreSize();
  }
  /**
   * Protobuf type {@code greco.PassThroughScoreCacheParams}
   */
  public static final class PassThroughScoreCacheParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.PassThroughScoreCacheParams)
      PassThroughScoreCacheParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PassThroughScoreCacheParams.newBuilder() to construct.
    private PassThroughScoreCacheParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PassThroughScoreCacheParams() {
      inverseScale_ = 1F;
      blankScale_ = 1F;
      scoreSize_ = -1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PassThroughScoreCacheParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.PassThroughScoreCacheParamsOuterClass.internal_static_greco_PassThroughScoreCacheParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.PassThroughScoreCacheParamsOuterClass.internal_static_greco_PassThroughScoreCacheParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.class, greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.Builder.class);
    }

    private int bitField0_;
    public static final int INVERSE_SCALE_FIELD_NUMBER = 1;
    private float inverseScale_;
    /**
     * <code>optional float inverse_scale = 1 [default = 1];</code>
     * @return Whether the inverseScale field is set.
     */
    @java.lang.Override
    public boolean hasInverseScale() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional float inverse_scale = 1 [default = 1];</code>
     * @return The inverseScale.
     */
    @java.lang.Override
    public float getInverseScale() {
      return inverseScale_;
    }

    public static final int UNSCALED_STATE_FIELD_NUMBER = 2;
    private int unscaledState_;
    /**
     * <code>optional int32 unscaled_state = 2;</code>
     * @return Whether the unscaledState field is set.
     */
    @java.lang.Override
    public boolean hasUnscaledState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 unscaled_state = 2;</code>
     * @return The unscaledState.
     */
    @java.lang.Override
    public int getUnscaledState() {
      return unscaledState_;
    }

    public static final int BLANK_SCALE_FIELD_NUMBER = 3;
    private float blankScale_;
    /**
     * <code>optional float blank_scale = 3 [default = 1];</code>
     * @return Whether the blankScale field is set.
     */
    @java.lang.Override
    public boolean hasBlankScale() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float blank_scale = 3 [default = 1];</code>
     * @return The blankScale.
     */
    @java.lang.Override
    public float getBlankScale() {
      return blankScale_;
    }

    public static final int SCORE_BEGIN_FIELD_NUMBER = 4;
    private int scoreBegin_;
    /**
     * <code>optional int32 score_begin = 4 [default = 0];</code>
     * @return Whether the scoreBegin field is set.
     */
    @java.lang.Override
    public boolean hasScoreBegin() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 score_begin = 4 [default = 0];</code>
     * @return The scoreBegin.
     */
    @java.lang.Override
    public int getScoreBegin() {
      return scoreBegin_;
    }

    public static final int SCORE_SIZE_FIELD_NUMBER = 5;
    private int scoreSize_;
    /**
     * <code>optional int32 score_size = 5 [default = -1];</code>
     * @return Whether the scoreSize field is set.
     */
    @java.lang.Override
    public boolean hasScoreSize() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 score_size = 5 [default = -1];</code>
     * @return The scoreSize.
     */
    @java.lang.Override
    public int getScoreSize() {
      return scoreSize_;
    }

    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams parseFrom(
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
    public static Builder newBuilder(greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams prototype) {
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
     * Protobuf type {@code greco.PassThroughScoreCacheParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.PassThroughScoreCacheParams)
        greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.PassThroughScoreCacheParamsOuterClass.internal_static_greco_PassThroughScoreCacheParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.PassThroughScoreCacheParamsOuterClass.internal_static_greco_PassThroughScoreCacheParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.class, greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.Builder.class);
      }

      // Construct using greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.newBuilder()
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
        inverseScale_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000001);
        unscaledState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        blankScale_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000004);
        scoreBegin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        scoreSize_ = -1;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.PassThroughScoreCacheParamsOuterClass.internal_static_greco_PassThroughScoreCacheParams_descriptor;
      }

      @java.lang.Override
      public greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams getDefaultInstanceForType() {
        return greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams build() {
        greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams buildPartial() {
        greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams result = new greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.inverseScale_ = inverseScale_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unscaledState_ = unscaledState_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.blankScale_ = blankScale_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.scoreBegin_ = scoreBegin_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.scoreSize_ = scoreSize_;
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

      private float inverseScale_ = 1F;
      /**
       * <code>optional float inverse_scale = 1 [default = 1];</code>
       * @return Whether the inverseScale field is set.
       */
      @java.lang.Override
      public boolean hasInverseScale() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional float inverse_scale = 1 [default = 1];</code>
       * @return The inverseScale.
       */
      @java.lang.Override
      public float getInverseScale() {
        return inverseScale_;
      }
      /**
       * <code>optional float inverse_scale = 1 [default = 1];</code>
       * @param value The inverseScale to set.
       * @return This builder for chaining.
       */
      public Builder setInverseScale(float value) {
        bitField0_ |= 0x00000001;
        inverseScale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float inverse_scale = 1 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearInverseScale() {
        bitField0_ = (bitField0_ & ~0x00000001);
        inverseScale_ = 1F;
        onChanged();
        return this;
      }

      private int unscaledState_ ;
      /**
       * <code>optional int32 unscaled_state = 2;</code>
       * @return Whether the unscaledState field is set.
       */
      @java.lang.Override
      public boolean hasUnscaledState() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 unscaled_state = 2;</code>
       * @return The unscaledState.
       */
      @java.lang.Override
      public int getUnscaledState() {
        return unscaledState_;
      }
      /**
       * <code>optional int32 unscaled_state = 2;</code>
       * @param value The unscaledState to set.
       * @return This builder for chaining.
       */
      public Builder setUnscaledState(int value) {
        bitField0_ |= 0x00000002;
        unscaledState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 unscaled_state = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnscaledState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unscaledState_ = 0;
        onChanged();
        return this;
      }

      private float blankScale_ = 1F;
      /**
       * <code>optional float blank_scale = 3 [default = 1];</code>
       * @return Whether the blankScale field is set.
       */
      @java.lang.Override
      public boolean hasBlankScale() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional float blank_scale = 3 [default = 1];</code>
       * @return The blankScale.
       */
      @java.lang.Override
      public float getBlankScale() {
        return blankScale_;
      }
      /**
       * <code>optional float blank_scale = 3 [default = 1];</code>
       * @param value The blankScale to set.
       * @return This builder for chaining.
       */
      public Builder setBlankScale(float value) {
        bitField0_ |= 0x00000004;
        blankScale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float blank_scale = 3 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearBlankScale() {
        bitField0_ = (bitField0_ & ~0x00000004);
        blankScale_ = 1F;
        onChanged();
        return this;
      }

      private int scoreBegin_ ;
      /**
       * <code>optional int32 score_begin = 4 [default = 0];</code>
       * @return Whether the scoreBegin field is set.
       */
      @java.lang.Override
      public boolean hasScoreBegin() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int32 score_begin = 4 [default = 0];</code>
       * @return The scoreBegin.
       */
      @java.lang.Override
      public int getScoreBegin() {
        return scoreBegin_;
      }
      /**
       * <code>optional int32 score_begin = 4 [default = 0];</code>
       * @param value The scoreBegin to set.
       * @return This builder for chaining.
       */
      public Builder setScoreBegin(int value) {
        bitField0_ |= 0x00000008;
        scoreBegin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 score_begin = 4 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreBegin() {
        bitField0_ = (bitField0_ & ~0x00000008);
        scoreBegin_ = 0;
        onChanged();
        return this;
      }

      private int scoreSize_ = -1;
      /**
       * <code>optional int32 score_size = 5 [default = -1];</code>
       * @return Whether the scoreSize field is set.
       */
      @java.lang.Override
      public boolean hasScoreSize() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int32 score_size = 5 [default = -1];</code>
       * @return The scoreSize.
       */
      @java.lang.Override
      public int getScoreSize() {
        return scoreSize_;
      }
      /**
       * <code>optional int32 score_size = 5 [default = -1];</code>
       * @param value The scoreSize to set.
       * @return This builder for chaining.
       */
      public Builder setScoreSize(int value) {
        bitField0_ |= 0x00000010;
        scoreSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 score_size = 5 [default = -1];</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreSize() {
        bitField0_ = (bitField0_ & ~0x00000010);
        scoreSize_ = -1;
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


      // @@protoc_insertion_point(builder_scope:greco.PassThroughScoreCacheParams)
    }

    // @@protoc_insertion_point(class_scope:greco.PassThroughScoreCacheParams)
    private static final greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams();
    }

    public static greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PassThroughScoreCacheParams>
        PARSER = new com.google.protobuf.AbstractParser<PassThroughScoreCacheParams>() {
      @java.lang.Override
      public PassThroughScoreCacheParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<PassThroughScoreCacheParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PassThroughScoreCacheParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 80660861;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.getDefaultInstance(),
          0,
          greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.class,
          greco.PassThroughScoreCacheParamsOuterClass.PassThroughScoreCacheParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_PassThroughScoreCacheParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_PassThroughScoreCacheParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;speech/greco3/decoder/pass_through_sco" +
      "re_cache_params.proto\022\005greco\032\037speech/gre" +
      "co3/core/params.proto\"\331\001\n\033PassThroughSco" +
      "reCacheParams\022\030\n\rinverse_scale\030\001 \001(\002:\0011\022" +
      "\026\n\016unscaled_state\030\002 \001(\005\022\026\n\013blank_scale\030\003" +
      " \001(\002:\0011\022\026\n\013score_begin\030\004 \001(\005:\0010\022\026\n\nscore" +
      "_size\030\005 \001(\005:\002-12@\n\002id\022\r.greco.Params\030\375\222\273" +
      "& \001(\0132\".greco.PassThroughScoreCacheParam" +
      "sB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_PassThroughScoreCacheParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_PassThroughScoreCacheParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_PassThroughScoreCacheParams_descriptor,
        new java.lang.String[] { "InverseScale", "UnscaledState", "BlankScale", "ScoreBegin", "ScoreSize", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}