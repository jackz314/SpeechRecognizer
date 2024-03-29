// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/segmenter_params.proto

package greco;

public final class SegmenterParamsOuterClass {
  private SegmenterParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.SegmenterParamsOuterClass.SegmenterParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SegmenterParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.SegmenterParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool skip_silence_frames = 1 [default = false];</code>
     * @return Whether the skipSilenceFrames field is set.
     */
    boolean hasSkipSilenceFrames();
    /**
     * <code>optional bool skip_silence_frames = 1 [default = false];</code>
     * @return The skipSilenceFrames.
     */
    boolean getSkipSilenceFrames();

    /**
     * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
     * @return Whether the silencePadMs field is set.
     */
    boolean hasSilencePadMs();
    /**
     * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
     * @return The silencePadMs.
     */
    int getSilencePadMs();

    /**
     * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
     * @return Whether the resetIntervalMs field is set.
     */
    boolean hasResetIntervalMs();
    /**
     * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
     * @return The resetIntervalMs.
     */
    int getResetIntervalMs();

    /**
     * <code>optional int32 impatience_start_ms = 4;</code>
     * @return Whether the impatienceStartMs field is set.
     */
    boolean hasImpatienceStartMs();
    /**
     * <code>optional int32 impatience_start_ms = 4;</code>
     * @return The impatienceStartMs.
     */
    int getImpatienceStartMs();

    /**
     * <code>optional int32 impatience_limit_ms = 5;</code>
     * @return Whether the impatienceLimitMs field is set.
     */
    boolean hasImpatienceLimitMs();
    /**
     * <code>optional int32 impatience_limit_ms = 5;</code>
     * @return The impatienceLimitMs.
     */
    int getImpatienceLimitMs();

    /**
     * <code>optional bool never_transition_to_silence = 6;</code>
     * @return Whether the neverTransitionToSilence field is set.
     */
    boolean hasNeverTransitionToSilence();
    /**
     * <code>optional bool never_transition_to_silence = 6;</code>
     * @return The neverTransitionToSilence.
     */
    boolean getNeverTransitionToSilence();

    /**
     * <code>optional bool send_empty_frames = 7;</code>
     * @return Whether the sendEmptyFrames field is set.
     */
    boolean hasSendEmptyFrames();
    /**
     * <code>optional bool send_empty_frames = 7;</code>
     * @return The sendEmptyFrames.
     */
    boolean getSendEmptyFrames();

    /**
     * <code>optional bool skip_frame_filtering = 8;</code>
     * @return Whether the skipFrameFiltering field is set.
     */
    boolean hasSkipFrameFiltering();
    /**
     * <code>optional bool skip_frame_filtering = 8;</code>
     * @return The skipFrameFiltering.
     */
    boolean getSkipFrameFiltering();
  }
  /**
   * Protobuf type {@code greco.SegmenterParams}
   */
  public static final class SegmenterParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.SegmenterParams)
      SegmenterParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SegmenterParams.newBuilder() to construct.
    private SegmenterParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SegmenterParams() {
      resetIntervalMs_ = 1000;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SegmenterParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.SegmenterParamsOuterClass.internal_static_greco_SegmenterParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.SegmenterParamsOuterClass.internal_static_greco_SegmenterParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.SegmenterParamsOuterClass.SegmenterParams.class, greco.SegmenterParamsOuterClass.SegmenterParams.Builder.class);
    }

    private int bitField0_;
    public static final int SKIP_SILENCE_FRAMES_FIELD_NUMBER = 1;
    private boolean skipSilenceFrames_;
    /**
     * <code>optional bool skip_silence_frames = 1 [default = false];</code>
     * @return Whether the skipSilenceFrames field is set.
     */
    @java.lang.Override
    public boolean hasSkipSilenceFrames() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool skip_silence_frames = 1 [default = false];</code>
     * @return The skipSilenceFrames.
     */
    @java.lang.Override
    public boolean getSkipSilenceFrames() {
      return skipSilenceFrames_;
    }

    public static final int SILENCE_PAD_MS_FIELD_NUMBER = 2;
    private int silencePadMs_;
    /**
     * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
     * @return Whether the silencePadMs field is set.
     */
    @java.lang.Override
    public boolean hasSilencePadMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
     * @return The silencePadMs.
     */
    @java.lang.Override
    public int getSilencePadMs() {
      return silencePadMs_;
    }

    public static final int RESET_INTERVAL_MS_FIELD_NUMBER = 3;
    private int resetIntervalMs_;
    /**
     * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
     * @return Whether the resetIntervalMs field is set.
     */
    @java.lang.Override
    public boolean hasResetIntervalMs() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
     * @return The resetIntervalMs.
     */
    @java.lang.Override
    public int getResetIntervalMs() {
      return resetIntervalMs_;
    }

    public static final int IMPATIENCE_START_MS_FIELD_NUMBER = 4;
    private int impatienceStartMs_;
    /**
     * <code>optional int32 impatience_start_ms = 4;</code>
     * @return Whether the impatienceStartMs field is set.
     */
    @java.lang.Override
    public boolean hasImpatienceStartMs() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 impatience_start_ms = 4;</code>
     * @return The impatienceStartMs.
     */
    @java.lang.Override
    public int getImpatienceStartMs() {
      return impatienceStartMs_;
    }

    public static final int IMPATIENCE_LIMIT_MS_FIELD_NUMBER = 5;
    private int impatienceLimitMs_;
    /**
     * <code>optional int32 impatience_limit_ms = 5;</code>
     * @return Whether the impatienceLimitMs field is set.
     */
    @java.lang.Override
    public boolean hasImpatienceLimitMs() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 impatience_limit_ms = 5;</code>
     * @return The impatienceLimitMs.
     */
    @java.lang.Override
    public int getImpatienceLimitMs() {
      return impatienceLimitMs_;
    }

    public static final int NEVER_TRANSITION_TO_SILENCE_FIELD_NUMBER = 6;
    private boolean neverTransitionToSilence_;
    /**
     * <code>optional bool never_transition_to_silence = 6;</code>
     * @return Whether the neverTransitionToSilence field is set.
     */
    @java.lang.Override
    public boolean hasNeverTransitionToSilence() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional bool never_transition_to_silence = 6;</code>
     * @return The neverTransitionToSilence.
     */
    @java.lang.Override
    public boolean getNeverTransitionToSilence() {
      return neverTransitionToSilence_;
    }

    public static final int SEND_EMPTY_FRAMES_FIELD_NUMBER = 7;
    private boolean sendEmptyFrames_;
    /**
     * <code>optional bool send_empty_frames = 7;</code>
     * @return Whether the sendEmptyFrames field is set.
     */
    @java.lang.Override
    public boolean hasSendEmptyFrames() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional bool send_empty_frames = 7;</code>
     * @return The sendEmptyFrames.
     */
    @java.lang.Override
    public boolean getSendEmptyFrames() {
      return sendEmptyFrames_;
    }

    public static final int SKIP_FRAME_FILTERING_FIELD_NUMBER = 8;
    private boolean skipFrameFiltering_;
    /**
     * <code>optional bool skip_frame_filtering = 8;</code>
     * @return Whether the skipFrameFiltering field is set.
     */
    @java.lang.Override
    public boolean hasSkipFrameFiltering() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>optional bool skip_frame_filtering = 8;</code>
     * @return The skipFrameFiltering.
     */
    @java.lang.Override
    public boolean getSkipFrameFiltering() {
      return skipFrameFiltering_;
    }

    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SegmenterParamsOuterClass.SegmenterParams parseFrom(
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
    public static Builder newBuilder(greco.SegmenterParamsOuterClass.SegmenterParams prototype) {
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
     * Protobuf type {@code greco.SegmenterParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.SegmenterParams)
        greco.SegmenterParamsOuterClass.SegmenterParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.SegmenterParamsOuterClass.internal_static_greco_SegmenterParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.SegmenterParamsOuterClass.internal_static_greco_SegmenterParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.SegmenterParamsOuterClass.SegmenterParams.class, greco.SegmenterParamsOuterClass.SegmenterParams.Builder.class);
      }

      // Construct using greco.SegmenterParamsOuterClass.SegmenterParams.newBuilder()
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
        skipSilenceFrames_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        silencePadMs_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        resetIntervalMs_ = 1000;
        bitField0_ = (bitField0_ & ~0x00000004);
        impatienceStartMs_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        impatienceLimitMs_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        neverTransitionToSilence_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        sendEmptyFrames_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        skipFrameFiltering_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.SegmenterParamsOuterClass.internal_static_greco_SegmenterParams_descriptor;
      }

      @java.lang.Override
      public greco.SegmenterParamsOuterClass.SegmenterParams getDefaultInstanceForType() {
        return greco.SegmenterParamsOuterClass.SegmenterParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.SegmenterParamsOuterClass.SegmenterParams build() {
        greco.SegmenterParamsOuterClass.SegmenterParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.SegmenterParamsOuterClass.SegmenterParams buildPartial() {
        greco.SegmenterParamsOuterClass.SegmenterParams result = new greco.SegmenterParamsOuterClass.SegmenterParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skipSilenceFrames_ = skipSilenceFrames_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.silencePadMs_ = silencePadMs_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.resetIntervalMs_ = resetIntervalMs_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.impatienceStartMs_ = impatienceStartMs_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.impatienceLimitMs_ = impatienceLimitMs_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.neverTransitionToSilence_ = neverTransitionToSilence_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.sendEmptyFrames_ = sendEmptyFrames_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.skipFrameFiltering_ = skipFrameFiltering_;
          to_bitField0_ |= 0x00000080;
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

      private boolean skipSilenceFrames_ ;
      /**
       * <code>optional bool skip_silence_frames = 1 [default = false];</code>
       * @return Whether the skipSilenceFrames field is set.
       */
      @java.lang.Override
      public boolean hasSkipSilenceFrames() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bool skip_silence_frames = 1 [default = false];</code>
       * @return The skipSilenceFrames.
       */
      @java.lang.Override
      public boolean getSkipSilenceFrames() {
        return skipSilenceFrames_;
      }
      /**
       * <code>optional bool skip_silence_frames = 1 [default = false];</code>
       * @param value The skipSilenceFrames to set.
       * @return This builder for chaining.
       */
      public Builder setSkipSilenceFrames(boolean value) {
        bitField0_ |= 0x00000001;
        skipSilenceFrames_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool skip_silence_frames = 1 [default = false];</code>
       * @return This builder for chaining.
       */
      public Builder clearSkipSilenceFrames() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skipSilenceFrames_ = false;
        onChanged();
        return this;
      }

      private int silencePadMs_ ;
      /**
       * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
       * @return Whether the silencePadMs field is set.
       */
      @java.lang.Override
      public boolean hasSilencePadMs() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
       * @return The silencePadMs.
       */
      @java.lang.Override
      public int getSilencePadMs() {
        return silencePadMs_;
      }
      /**
       * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
       * @param value The silencePadMs to set.
       * @return This builder for chaining.
       */
      public Builder setSilencePadMs(int value) {
        bitField0_ |= 0x00000002;
        silencePadMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 silence_pad_ms = 2 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearSilencePadMs() {
        bitField0_ = (bitField0_ & ~0x00000002);
        silencePadMs_ = 0;
        onChanged();
        return this;
      }

      private int resetIntervalMs_ = 1000;
      /**
       * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
       * @return Whether the resetIntervalMs field is set.
       */
      @java.lang.Override
      public boolean hasResetIntervalMs() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
       * @return The resetIntervalMs.
       */
      @java.lang.Override
      public int getResetIntervalMs() {
        return resetIntervalMs_;
      }
      /**
       * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
       * @param value The resetIntervalMs to set.
       * @return This builder for chaining.
       */
      public Builder setResetIntervalMs(int value) {
        bitField0_ |= 0x00000004;
        resetIntervalMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 reset_interval_ms = 3 [default = 1000];</code>
       * @return This builder for chaining.
       */
      public Builder clearResetIntervalMs() {
        bitField0_ = (bitField0_ & ~0x00000004);
        resetIntervalMs_ = 1000;
        onChanged();
        return this;
      }

      private int impatienceStartMs_ ;
      /**
       * <code>optional int32 impatience_start_ms = 4;</code>
       * @return Whether the impatienceStartMs field is set.
       */
      @java.lang.Override
      public boolean hasImpatienceStartMs() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int32 impatience_start_ms = 4;</code>
       * @return The impatienceStartMs.
       */
      @java.lang.Override
      public int getImpatienceStartMs() {
        return impatienceStartMs_;
      }
      /**
       * <code>optional int32 impatience_start_ms = 4;</code>
       * @param value The impatienceStartMs to set.
       * @return This builder for chaining.
       */
      public Builder setImpatienceStartMs(int value) {
        bitField0_ |= 0x00000008;
        impatienceStartMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 impatience_start_ms = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearImpatienceStartMs() {
        bitField0_ = (bitField0_ & ~0x00000008);
        impatienceStartMs_ = 0;
        onChanged();
        return this;
      }

      private int impatienceLimitMs_ ;
      /**
       * <code>optional int32 impatience_limit_ms = 5;</code>
       * @return Whether the impatienceLimitMs field is set.
       */
      @java.lang.Override
      public boolean hasImpatienceLimitMs() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int32 impatience_limit_ms = 5;</code>
       * @return The impatienceLimitMs.
       */
      @java.lang.Override
      public int getImpatienceLimitMs() {
        return impatienceLimitMs_;
      }
      /**
       * <code>optional int32 impatience_limit_ms = 5;</code>
       * @param value The impatienceLimitMs to set.
       * @return This builder for chaining.
       */
      public Builder setImpatienceLimitMs(int value) {
        bitField0_ |= 0x00000010;
        impatienceLimitMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 impatience_limit_ms = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearImpatienceLimitMs() {
        bitField0_ = (bitField0_ & ~0x00000010);
        impatienceLimitMs_ = 0;
        onChanged();
        return this;
      }

      private boolean neverTransitionToSilence_ ;
      /**
       * <code>optional bool never_transition_to_silence = 6;</code>
       * @return Whether the neverTransitionToSilence field is set.
       */
      @java.lang.Override
      public boolean hasNeverTransitionToSilence() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional bool never_transition_to_silence = 6;</code>
       * @return The neverTransitionToSilence.
       */
      @java.lang.Override
      public boolean getNeverTransitionToSilence() {
        return neverTransitionToSilence_;
      }
      /**
       * <code>optional bool never_transition_to_silence = 6;</code>
       * @param value The neverTransitionToSilence to set.
       * @return This builder for chaining.
       */
      public Builder setNeverTransitionToSilence(boolean value) {
        bitField0_ |= 0x00000020;
        neverTransitionToSilence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool never_transition_to_silence = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNeverTransitionToSilence() {
        bitField0_ = (bitField0_ & ~0x00000020);
        neverTransitionToSilence_ = false;
        onChanged();
        return this;
      }

      private boolean sendEmptyFrames_ ;
      /**
       * <code>optional bool send_empty_frames = 7;</code>
       * @return Whether the sendEmptyFrames field is set.
       */
      @java.lang.Override
      public boolean hasSendEmptyFrames() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional bool send_empty_frames = 7;</code>
       * @return The sendEmptyFrames.
       */
      @java.lang.Override
      public boolean getSendEmptyFrames() {
        return sendEmptyFrames_;
      }
      /**
       * <code>optional bool send_empty_frames = 7;</code>
       * @param value The sendEmptyFrames to set.
       * @return This builder for chaining.
       */
      public Builder setSendEmptyFrames(boolean value) {
        bitField0_ |= 0x00000040;
        sendEmptyFrames_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool send_empty_frames = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSendEmptyFrames() {
        bitField0_ = (bitField0_ & ~0x00000040);
        sendEmptyFrames_ = false;
        onChanged();
        return this;
      }

      private boolean skipFrameFiltering_ ;
      /**
       * <code>optional bool skip_frame_filtering = 8;</code>
       * @return Whether the skipFrameFiltering field is set.
       */
      @java.lang.Override
      public boolean hasSkipFrameFiltering() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>optional bool skip_frame_filtering = 8;</code>
       * @return The skipFrameFiltering.
       */
      @java.lang.Override
      public boolean getSkipFrameFiltering() {
        return skipFrameFiltering_;
      }
      /**
       * <code>optional bool skip_frame_filtering = 8;</code>
       * @param value The skipFrameFiltering to set.
       * @return This builder for chaining.
       */
      public Builder setSkipFrameFiltering(boolean value) {
        bitField0_ |= 0x00000080;
        skipFrameFiltering_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool skip_frame_filtering = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkipFrameFiltering() {
        bitField0_ = (bitField0_ & ~0x00000080);
        skipFrameFiltering_ = false;
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


      // @@protoc_insertion_point(builder_scope:greco.SegmenterParams)
    }

    // @@protoc_insertion_point(class_scope:greco.SegmenterParams)
    private static final greco.SegmenterParamsOuterClass.SegmenterParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.SegmenterParamsOuterClass.SegmenterParams();
    }

    public static greco.SegmenterParamsOuterClass.SegmenterParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SegmenterParams>
        PARSER = new com.google.protobuf.AbstractParser<SegmenterParams>() {
      @java.lang.Override
      public SegmenterParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<SegmenterParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SegmenterParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.SegmenterParamsOuterClass.SegmenterParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 27058394;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.SegmenterParamsOuterClass.SegmenterParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.SegmenterParamsOuterClass.SegmenterParams.getDefaultInstance(),
          0,
          greco.SegmenterParamsOuterClass.SegmenterParams.class,
          greco.SegmenterParamsOuterClass.SegmenterParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_SegmenterParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_SegmenterParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-speech/greco3/frontend/segmenter_param" +
      "s.proto\022\005greco\032\037speech/greco3/core/param" +
      "s.proto\"\277\002\n\017SegmenterParams\022\"\n\023skip_sile" +
      "nce_frames\030\001 \001(\010:\005false\022\031\n\016silence_pad_m" +
      "s\030\002 \001(\005:\0010\022\037\n\021reset_interval_ms\030\003 \001(\005:\0041" +
      "000\022\033\n\023impatience_start_ms\030\004 \001(\005\022\033\n\023impa" +
      "tience_limit_ms\030\005 \001(\005\022#\n\033never_transitio" +
      "n_to_silence\030\006 \001(\010\022\031\n\021send_empty_frames\030" +
      "\007 \001(\010\022\034\n\024skip_frame_filtering\030\010 \001(\01024\n\002i" +
      "d\022\r.greco.Params\030\332\301\363\014 \001(\0132\026.greco.Segmen" +
      "terParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_SegmenterParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_SegmenterParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_SegmenterParams_descriptor,
        new java.lang.String[] { "SkipSilenceFrames", "SilencePadMs", "ResetIntervalMs", "ImpatienceStartMs", "ImpatienceLimitMs", "NeverTransitionToSilence", "SendEmptyFrames", "SkipFrameFiltering", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
