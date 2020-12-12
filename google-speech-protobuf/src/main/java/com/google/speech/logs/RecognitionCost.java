// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.RecognitionCost}
 */
public final class RecognitionCost extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.RecognitionCost)
    RecognitionCostOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecognitionCost.newBuilder() to construct.
  private RecognitionCost(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecognitionCost() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecognitionCost();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_RecognitionCost_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_RecognitionCost_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.RecognitionCost.class, com.google.speech.logs.RecognitionCost.Builder.class);
  }

  private int bitField0_;
  public static final int TOTAL_ACTIVE_DECODER_STATES_FIELD_NUMBER = 1;
  private int totalActiveDecoderStates_;
  /**
   * <code>optional int32 total_active_decoder_states = 1;</code>
   * @return Whether the totalActiveDecoderStates field is set.
   */
  @java.lang.Override
  public boolean hasTotalActiveDecoderStates() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 total_active_decoder_states = 1;</code>
   * @return The totalActiveDecoderStates.
   */
  @java.lang.Override
  public int getTotalActiveDecoderStates() {
    return totalActiveDecoderStates_;
  }

  public static com.google.speech.logs.RecognitionCost parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.RecognitionCost parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.RecognitionCost parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.RecognitionCost parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.RecognitionCost prototype) {
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
   * Protobuf type {@code speech.logs.RecognitionCost}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.RecognitionCost)
      com.google.speech.logs.RecognitionCostOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_RecognitionCost_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_RecognitionCost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.RecognitionCost.class, com.google.speech.logs.RecognitionCost.Builder.class);
    }

    // Construct using com.google.speech.logs.RecognitionCost.newBuilder()
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
      totalActiveDecoderStates_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_RecognitionCost_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.RecognitionCost getDefaultInstanceForType() {
      return com.google.speech.logs.RecognitionCost.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.RecognitionCost build() {
      com.google.speech.logs.RecognitionCost result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.RecognitionCost buildPartial() {
      com.google.speech.logs.RecognitionCost result = new com.google.speech.logs.RecognitionCost(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalActiveDecoderStates_ = totalActiveDecoderStates_;
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

    private int totalActiveDecoderStates_ ;
    /**
     * <code>optional int32 total_active_decoder_states = 1;</code>
     * @return Whether the totalActiveDecoderStates field is set.
     */
    @java.lang.Override
    public boolean hasTotalActiveDecoderStates() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 total_active_decoder_states = 1;</code>
     * @return The totalActiveDecoderStates.
     */
    @java.lang.Override
    public int getTotalActiveDecoderStates() {
      return totalActiveDecoderStates_;
    }
    /**
     * <code>optional int32 total_active_decoder_states = 1;</code>
     * @param value The totalActiveDecoderStates to set.
     * @return This builder for chaining.
     */
    public Builder setTotalActiveDecoderStates(int value) {
      bitField0_ |= 0x00000001;
      totalActiveDecoderStates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 total_active_decoder_states = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalActiveDecoderStates() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalActiveDecoderStates_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.RecognitionCost)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.RecognitionCost)
  private static final com.google.speech.logs.RecognitionCost DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.RecognitionCost();
  }

  public static com.google.speech.logs.RecognitionCost getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RecognitionCost>
      PARSER = new com.google.protobuf.AbstractParser<RecognitionCost>() {
    @java.lang.Override
    public RecognitionCost parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecognitionCost> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognitionCost> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.RecognitionCost getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
