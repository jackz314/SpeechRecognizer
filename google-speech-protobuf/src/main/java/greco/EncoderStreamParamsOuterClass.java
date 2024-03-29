// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/tflite/encoder_stream_params.proto

package greco;

public final class EncoderStreamParamsOuterClass {
  private EncoderStreamParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.EncoderStreamParamsOuterClass.EncoderStreamParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EncoderStreamParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.EncoderStreamParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return Whether the tfliteSessionRef field is set.
     */
    boolean hasTfliteSessionRef();
    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return The tfliteSessionRef.
     */
    java.lang.String getTfliteSessionRef();
    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return The bytes for tfliteSessionRef.
     */
    com.google.protobuf.ByteString
        getTfliteSessionRefBytes();

    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return Whether the inputMeanStdDevRef field is set.
     */
    boolean hasInputMeanStdDevRef();
    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return The inputMeanStdDevRef.
     */
    java.lang.String getInputMeanStdDevRef();
    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return The bytes for inputMeanStdDevRef.
     */
    com.google.protobuf.ByteString
        getInputMeanStdDevRefBytes();

    /**
     * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
     * @return Whether the eosFrameRepetition field is set.
     */
    boolean hasEosFrameRepetition();
    /**
     * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
     * @return The eosFrameRepetition.
     */
    int getEosFrameRepetition();

    /**
     * <code>optional float eos_frame_value = 4 [default = 0];</code>
     * @return Whether the eosFrameValue field is set.
     */
    boolean hasEosFrameValue();
    /**
     * <code>optional float eos_frame_value = 4 [default = 0];</code>
     * @return The eosFrameValue.
     */
    float getEosFrameValue();

    /**
     * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
     * @return Whether the minSegmentMsForEosFrame field is set.
     */
    boolean hasMinSegmentMsForEosFrame();
    /**
     * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
     * @return The minSegmentMsForEosFrame.
     */
    long getMinSegmentMsForEosFrame();

    /**
     * <code>optional bool reset_state = 6 [default = true];</code>
     * @return Whether the resetState field is set.
     */
    boolean hasResetState();
    /**
     * <code>optional bool reset_state = 6 [default = true];</code>
     * @return The resetState.
     */
    boolean getResetState();

    /**
     * <code>optional int64 reset_period_ms = 7;</code>
     * @return Whether the resetPeriodMs field is set.
     */
    boolean hasResetPeriodMs();
    /**
     * <code>optional int64 reset_period_ms = 7;</code>
     * @return The resetPeriodMs.
     */
    long getResetPeriodMs();
  }
  /**
   * Protobuf type {@code greco.EncoderStreamParams}
   */
  public static final class EncoderStreamParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.EncoderStreamParams)
      EncoderStreamParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EncoderStreamParams.newBuilder() to construct.
    private EncoderStreamParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EncoderStreamParams() {
      tfliteSessionRef_ = "";
      inputMeanStdDevRef_ = "";
      resetState_ = true;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EncoderStreamParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.EncoderStreamParamsOuterClass.internal_static_greco_EncoderStreamParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.EncoderStreamParamsOuterClass.internal_static_greco_EncoderStreamParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.EncoderStreamParamsOuterClass.EncoderStreamParams.class, greco.EncoderStreamParamsOuterClass.EncoderStreamParams.Builder.class);
    }

    private int bitField0_;
    public static final int TFLITE_SESSION_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object tfliteSessionRef_;
    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return Whether the tfliteSessionRef field is set.
     */
    @java.lang.Override
    public boolean hasTfliteSessionRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return The tfliteSessionRef.
     */
    @java.lang.Override
    public java.lang.String getTfliteSessionRef() {
      java.lang.Object ref = tfliteSessionRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tfliteSessionRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tflite_session_ref = 1;</code>
     * @return The bytes for tfliteSessionRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTfliteSessionRefBytes() {
      java.lang.Object ref = tfliteSessionRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tfliteSessionRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INPUT_MEAN_STD_DEV_REF_FIELD_NUMBER = 2;
    private volatile java.lang.Object inputMeanStdDevRef_;
    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return Whether the inputMeanStdDevRef field is set.
     */
    @java.lang.Override
    public boolean hasInputMeanStdDevRef() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return The inputMeanStdDevRef.
     */
    @java.lang.Override
    public java.lang.String getInputMeanStdDevRef() {
      java.lang.Object ref = inputMeanStdDevRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          inputMeanStdDevRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string input_mean_std_dev_ref = 2;</code>
     * @return The bytes for inputMeanStdDevRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInputMeanStdDevRefBytes() {
      java.lang.Object ref = inputMeanStdDevRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputMeanStdDevRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EOS_FRAME_REPETITION_FIELD_NUMBER = 3;
    private int eosFrameRepetition_;
    /**
     * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
     * @return Whether the eosFrameRepetition field is set.
     */
    @java.lang.Override
    public boolean hasEosFrameRepetition() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
     * @return The eosFrameRepetition.
     */
    @java.lang.Override
    public int getEosFrameRepetition() {
      return eosFrameRepetition_;
    }

    public static final int EOS_FRAME_VALUE_FIELD_NUMBER = 4;
    private float eosFrameValue_;
    /**
     * <code>optional float eos_frame_value = 4 [default = 0];</code>
     * @return Whether the eosFrameValue field is set.
     */
    @java.lang.Override
    public boolean hasEosFrameValue() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional float eos_frame_value = 4 [default = 0];</code>
     * @return The eosFrameValue.
     */
    @java.lang.Override
    public float getEosFrameValue() {
      return eosFrameValue_;
    }

    public static final int MIN_SEGMENT_MS_FOR_EOS_FRAME_FIELD_NUMBER = 5;
    private long minSegmentMsForEosFrame_;
    /**
     * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
     * @return Whether the minSegmentMsForEosFrame field is set.
     */
    @java.lang.Override
    public boolean hasMinSegmentMsForEosFrame() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
     * @return The minSegmentMsForEosFrame.
     */
    @java.lang.Override
    public long getMinSegmentMsForEosFrame() {
      return minSegmentMsForEosFrame_;
    }

    public static final int RESET_STATE_FIELD_NUMBER = 6;
    private boolean resetState_;
    /**
     * <code>optional bool reset_state = 6 [default = true];</code>
     * @return Whether the resetState field is set.
     */
    @java.lang.Override
    public boolean hasResetState() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional bool reset_state = 6 [default = true];</code>
     * @return The resetState.
     */
    @java.lang.Override
    public boolean getResetState() {
      return resetState_;
    }

    public static final int RESET_PERIOD_MS_FIELD_NUMBER = 7;
    private long resetPeriodMs_;
    /**
     * <code>optional int64 reset_period_ms = 7;</code>
     * @return Whether the resetPeriodMs field is set.
     */
    @java.lang.Override
    public boolean hasResetPeriodMs() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional int64 reset_period_ms = 7;</code>
     * @return The resetPeriodMs.
     */
    @java.lang.Override
    public long getResetPeriodMs() {
      return resetPeriodMs_;
    }

    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams parseFrom(
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
    public static Builder newBuilder(greco.EncoderStreamParamsOuterClass.EncoderStreamParams prototype) {
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
     * Protobuf type {@code greco.EncoderStreamParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.EncoderStreamParams)
        greco.EncoderStreamParamsOuterClass.EncoderStreamParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.EncoderStreamParamsOuterClass.internal_static_greco_EncoderStreamParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.EncoderStreamParamsOuterClass.internal_static_greco_EncoderStreamParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.EncoderStreamParamsOuterClass.EncoderStreamParams.class, greco.EncoderStreamParamsOuterClass.EncoderStreamParams.Builder.class);
      }

      // Construct using greco.EncoderStreamParamsOuterClass.EncoderStreamParams.newBuilder()
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
        tfliteSessionRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        inputMeanStdDevRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        eosFrameRepetition_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        eosFrameValue_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        minSegmentMsForEosFrame_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        resetState_ = true;
        bitField0_ = (bitField0_ & ~0x00000020);
        resetPeriodMs_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.EncoderStreamParamsOuterClass.internal_static_greco_EncoderStreamParams_descriptor;
      }

      @java.lang.Override
      public greco.EncoderStreamParamsOuterClass.EncoderStreamParams getDefaultInstanceForType() {
        return greco.EncoderStreamParamsOuterClass.EncoderStreamParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.EncoderStreamParamsOuterClass.EncoderStreamParams build() {
        greco.EncoderStreamParamsOuterClass.EncoderStreamParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.EncoderStreamParamsOuterClass.EncoderStreamParams buildPartial() {
        greco.EncoderStreamParamsOuterClass.EncoderStreamParams result = new greco.EncoderStreamParamsOuterClass.EncoderStreamParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tfliteSessionRef_ = tfliteSessionRef_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.inputMeanStdDevRef_ = inputMeanStdDevRef_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.eosFrameRepetition_ = eosFrameRepetition_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.eosFrameValue_ = eosFrameValue_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.minSegmentMsForEosFrame_ = minSegmentMsForEosFrame_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.resetState_ = resetState_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.resetPeriodMs_ = resetPeriodMs_;
          to_bitField0_ |= 0x00000040;
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

      private java.lang.Object tfliteSessionRef_ = "";
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @return Whether the tfliteSessionRef field is set.
       */
      public boolean hasTfliteSessionRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @return The tfliteSessionRef.
       */
      public java.lang.String getTfliteSessionRef() {
        java.lang.Object ref = tfliteSessionRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tfliteSessionRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @return The bytes for tfliteSessionRef.
       */
      public com.google.protobuf.ByteString
          getTfliteSessionRefBytes() {
        java.lang.Object ref = tfliteSessionRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tfliteSessionRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @param value The tfliteSessionRef to set.
       * @return This builder for chaining.
       */
      public Builder setTfliteSessionRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tfliteSessionRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTfliteSessionRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tfliteSessionRef_ = getDefaultInstance().getTfliteSessionRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tflite_session_ref = 1;</code>
       * @param value The bytes for tfliteSessionRef to set.
       * @return This builder for chaining.
       */
      public Builder setTfliteSessionRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tfliteSessionRef_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object inputMeanStdDevRef_ = "";
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @return Whether the inputMeanStdDevRef field is set.
       */
      public boolean hasInputMeanStdDevRef() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @return The inputMeanStdDevRef.
       */
      public java.lang.String getInputMeanStdDevRef() {
        java.lang.Object ref = inputMeanStdDevRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            inputMeanStdDevRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @return The bytes for inputMeanStdDevRef.
       */
      public com.google.protobuf.ByteString
          getInputMeanStdDevRefBytes() {
        java.lang.Object ref = inputMeanStdDevRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          inputMeanStdDevRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @param value The inputMeanStdDevRef to set.
       * @return This builder for chaining.
       */
      public Builder setInputMeanStdDevRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        inputMeanStdDevRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInputMeanStdDevRef() {
        bitField0_ = (bitField0_ & ~0x00000002);
        inputMeanStdDevRef_ = getDefaultInstance().getInputMeanStdDevRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string input_mean_std_dev_ref = 2;</code>
       * @param value The bytes for inputMeanStdDevRef to set.
       * @return This builder for chaining.
       */
      public Builder setInputMeanStdDevRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        inputMeanStdDevRef_ = value;
        onChanged();
        return this;
      }

      private int eosFrameRepetition_ ;
      /**
       * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
       * @return Whether the eosFrameRepetition field is set.
       */
      @java.lang.Override
      public boolean hasEosFrameRepetition() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
       * @return The eosFrameRepetition.
       */
      @java.lang.Override
      public int getEosFrameRepetition() {
        return eosFrameRepetition_;
      }
      /**
       * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
       * @param value The eosFrameRepetition to set.
       * @return This builder for chaining.
       */
      public Builder setEosFrameRepetition(int value) {
        bitField0_ |= 0x00000004;
        eosFrameRepetition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 eos_frame_repetition = 3 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearEosFrameRepetition() {
        bitField0_ = (bitField0_ & ~0x00000004);
        eosFrameRepetition_ = 0;
        onChanged();
        return this;
      }

      private float eosFrameValue_ ;
      /**
       * <code>optional float eos_frame_value = 4 [default = 0];</code>
       * @return Whether the eosFrameValue field is set.
       */
      @java.lang.Override
      public boolean hasEosFrameValue() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional float eos_frame_value = 4 [default = 0];</code>
       * @return The eosFrameValue.
       */
      @java.lang.Override
      public float getEosFrameValue() {
        return eosFrameValue_;
      }
      /**
       * <code>optional float eos_frame_value = 4 [default = 0];</code>
       * @param value The eosFrameValue to set.
       * @return This builder for chaining.
       */
      public Builder setEosFrameValue(float value) {
        bitField0_ |= 0x00000008;
        eosFrameValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float eos_frame_value = 4 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearEosFrameValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        eosFrameValue_ = 0F;
        onChanged();
        return this;
      }

      private long minSegmentMsForEosFrame_ ;
      /**
       * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
       * @return Whether the minSegmentMsForEosFrame field is set.
       */
      @java.lang.Override
      public boolean hasMinSegmentMsForEosFrame() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
       * @return The minSegmentMsForEosFrame.
       */
      @java.lang.Override
      public long getMinSegmentMsForEosFrame() {
        return minSegmentMsForEosFrame_;
      }
      /**
       * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
       * @param value The minSegmentMsForEosFrame to set.
       * @return This builder for chaining.
       */
      public Builder setMinSegmentMsForEosFrame(long value) {
        bitField0_ |= 0x00000010;
        minSegmentMsForEosFrame_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 min_segment_ms_for_eos_frame = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinSegmentMsForEosFrame() {
        bitField0_ = (bitField0_ & ~0x00000010);
        minSegmentMsForEosFrame_ = 0L;
        onChanged();
        return this;
      }

      private boolean resetState_ = true;
      /**
       * <code>optional bool reset_state = 6 [default = true];</code>
       * @return Whether the resetState field is set.
       */
      @java.lang.Override
      public boolean hasResetState() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional bool reset_state = 6 [default = true];</code>
       * @return The resetState.
       */
      @java.lang.Override
      public boolean getResetState() {
        return resetState_;
      }
      /**
       * <code>optional bool reset_state = 6 [default = true];</code>
       * @param value The resetState to set.
       * @return This builder for chaining.
       */
      public Builder setResetState(boolean value) {
        bitField0_ |= 0x00000020;
        resetState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool reset_state = 6 [default = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearResetState() {
        bitField0_ = (bitField0_ & ~0x00000020);
        resetState_ = true;
        onChanged();
        return this;
      }

      private long resetPeriodMs_ ;
      /**
       * <code>optional int64 reset_period_ms = 7;</code>
       * @return Whether the resetPeriodMs field is set.
       */
      @java.lang.Override
      public boolean hasResetPeriodMs() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional int64 reset_period_ms = 7;</code>
       * @return The resetPeriodMs.
       */
      @java.lang.Override
      public long getResetPeriodMs() {
        return resetPeriodMs_;
      }
      /**
       * <code>optional int64 reset_period_ms = 7;</code>
       * @param value The resetPeriodMs to set.
       * @return This builder for chaining.
       */
      public Builder setResetPeriodMs(long value) {
        bitField0_ |= 0x00000040;
        resetPeriodMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 reset_period_ms = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearResetPeriodMs() {
        bitField0_ = (bitField0_ & ~0x00000040);
        resetPeriodMs_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:greco.EncoderStreamParams)
    }

    // @@protoc_insertion_point(class_scope:greco.EncoderStreamParams)
    private static final greco.EncoderStreamParamsOuterClass.EncoderStreamParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.EncoderStreamParamsOuterClass.EncoderStreamParams();
    }

    public static greco.EncoderStreamParamsOuterClass.EncoderStreamParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EncoderStreamParams>
        PARSER = new com.google.protobuf.AbstractParser<EncoderStreamParams>() {
      @java.lang.Override
      public EncoderStreamParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<EncoderStreamParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EncoderStreamParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.EncoderStreamParamsOuterClass.EncoderStreamParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 320100746;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.EncoderStreamParamsOuterClass.EncoderStreamParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.EncoderStreamParamsOuterClass.EncoderStreamParams.getDefaultInstance(),
          0,
          greco.EncoderStreamParamsOuterClass.EncoderStreamParams.class,
          greco.EncoderStreamParamsOuterClass.EncoderStreamParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_EncoderStreamParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_EncoderStreamParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0speech/greco3/tflite/encoder_stream_pa" +
      "rams.proto\022\005greco\032\037speech/greco3/core/pa" +
      "rams.proto\"\243\002\n\023EncoderStreamParams\022\032\n\022tf" +
      "lite_session_ref\030\001 \001(\t\022\036\n\026input_mean_std" +
      "_dev_ref\030\002 \001(\t\022\037\n\024eos_frame_repetition\030\003" +
      " \001(\005:\0010\022\032\n\017eos_frame_value\030\004 \001(\002:\0010\022$\n\034m" +
      "in_segment_ms_for_eos_frame\030\005 \001(\003\022\031\n\013res" +
      "et_state\030\006 \001(\010:\004true\022\027\n\017reset_period_ms\030" +
      "\007 \001(\00329\n\002id\022\r.greco.Params\030\212\263\321\230\001 \001(\0132\032.g" +
      "reco.EncoderStreamParamsB\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_EncoderStreamParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_EncoderStreamParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_EncoderStreamParams_descriptor,
        new java.lang.String[] { "TfliteSessionRef", "InputMeanStdDevRef", "EosFrameRepetition", "EosFrameValue", "MinSegmentMsForEosFrame", "ResetState", "ResetPeriodMs", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
