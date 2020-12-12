// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.PhrasesContextLog}
 */
public final class PhrasesContextLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.PhrasesContextLog)
    PhrasesContextLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhrasesContextLog.newBuilder() to construct.
  private PhrasesContextLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhrasesContextLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhrasesContextLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_PhrasesContextLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_PhrasesContextLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.PhrasesContextLog.class, com.google.speech.logs.PhrasesContextLog.Builder.class);
  }

  private int bitField0_;
  public static final int NUM_PHRASES_FIELD_NUMBER = 1;
  private int numPhrases_;
  /**
   * <code>optional int32 num_phrases = 1;</code>
   * @return Whether the numPhrases field is set.
   */
  @java.lang.Override
  public boolean hasNumPhrases() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 num_phrases = 1;</code>
   * @return The numPhrases.
   */
  @java.lang.Override
  public int getNumPhrases() {
    return numPhrases_;
  }

  public static final int PHRASES_ID_LOG_FIELD_NUMBER = 2;
  private com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog phrasesIdLog_;
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   * @return Whether the phrasesIdLog field is set.
   */
  @java.lang.Override
  public boolean hasPhrasesIdLog() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   * @return The phrasesIdLog.
   */
  @java.lang.Override
  public com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog getPhrasesIdLog() {
    return phrasesIdLog_ == null ? com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.getDefaultInstance() : phrasesIdLog_;
  }
  /**
   * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder getPhrasesIdLogOrBuilder() {
    return phrasesIdLog_ == null ? com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.getDefaultInstance() : phrasesIdLog_;
  }

  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.PhrasesContextLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.PhrasesContextLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.PhrasesContextLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.PhrasesContextLog prototype) {
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
   * Protobuf type {@code speech.logs.PhrasesContextLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.PhrasesContextLog)
      com.google.speech.logs.PhrasesContextLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_PhrasesContextLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_PhrasesContextLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.PhrasesContextLog.class, com.google.speech.logs.PhrasesContextLog.Builder.class);
    }

    // Construct using com.google.speech.logs.PhrasesContextLog.newBuilder()
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
        getPhrasesIdLogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      numPhrases_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (phrasesIdLogBuilder_ == null) {
        phrasesIdLog_ = null;
      } else {
        phrasesIdLogBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_PhrasesContextLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.PhrasesContextLog getDefaultInstanceForType() {
      return com.google.speech.logs.PhrasesContextLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.PhrasesContextLog build() {
      com.google.speech.logs.PhrasesContextLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.PhrasesContextLog buildPartial() {
      com.google.speech.logs.PhrasesContextLog result = new com.google.speech.logs.PhrasesContextLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numPhrases_ = numPhrases_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (phrasesIdLogBuilder_ == null) {
          result.phrasesIdLog_ = phrasesIdLog_;
        } else {
          result.phrasesIdLog_ = phrasesIdLogBuilder_.build();
        }
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

    private int numPhrases_ ;
    /**
     * <code>optional int32 num_phrases = 1;</code>
     * @return Whether the numPhrases field is set.
     */
    @java.lang.Override
    public boolean hasNumPhrases() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 num_phrases = 1;</code>
     * @return The numPhrases.
     */
    @java.lang.Override
    public int getNumPhrases() {
      return numPhrases_;
    }
    /**
     * <code>optional int32 num_phrases = 1;</code>
     * @param value The numPhrases to set.
     * @return This builder for chaining.
     */
    public Builder setNumPhrases(int value) {
      bitField0_ |= 0x00000001;
      numPhrases_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num_phrases = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumPhrases() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numPhrases_ = 0;
      onChanged();
      return this;
    }

    private com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog phrasesIdLog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.Builder, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder> phrasesIdLogBuilder_;
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     * @return Whether the phrasesIdLog field is set.
     */
    public boolean hasPhrasesIdLog() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     * @return The phrasesIdLog.
     */
    public com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog getPhrasesIdLog() {
      if (phrasesIdLogBuilder_ == null) {
        return phrasesIdLog_ == null ? com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.getDefaultInstance() : phrasesIdLog_;
      } else {
        return phrasesIdLogBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public Builder setPhrasesIdLog(com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog value) {
      if (phrasesIdLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phrasesIdLog_ = value;
        onChanged();
      } else {
        phrasesIdLogBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public Builder setPhrasesIdLog(
        com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.Builder builderForValue) {
      if (phrasesIdLogBuilder_ == null) {
        phrasesIdLog_ = builderForValue.build();
        onChanged();
      } else {
        phrasesIdLogBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public Builder mergePhrasesIdLog(com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog value) {
      if (phrasesIdLogBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            phrasesIdLog_ != null &&
            phrasesIdLog_ != com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.getDefaultInstance()) {
          phrasesIdLog_ =
            com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.newBuilder(phrasesIdLog_).mergeFrom(value).buildPartial();
        } else {
          phrasesIdLog_ = value;
        }
        onChanged();
      } else {
        phrasesIdLogBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public Builder clearPhrasesIdLog() {
      if (phrasesIdLogBuilder_ == null) {
        phrasesIdLog_ = null;
        onChanged();
      } else {
        phrasesIdLogBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.Builder getPhrasesIdLogBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPhrasesIdLogFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    public com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder getPhrasesIdLogOrBuilder() {
      if (phrasesIdLogBuilder_ != null) {
        return phrasesIdLogBuilder_.getMessageOrBuilder();
      } else {
        return phrasesIdLog_ == null ?
            com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.getDefaultInstance() : phrasesIdLog_;
      }
    }
    /**
     * <code>optional .speech.logs.GrammarIdsContextLog.GrammarIdLog phrases_id_log = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.Builder, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder> 
        getPhrasesIdLogFieldBuilder() {
      if (phrasesIdLogBuilder_ == null) {
        phrasesIdLogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLog.Builder, com.google.speech.logs.GrammarIdsContextLog.GrammarIdLogOrBuilder>(
                getPhrasesIdLog(),
                getParentForChildren(),
                isClean());
        phrasesIdLog_ = null;
      }
      return phrasesIdLogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.PhrasesContextLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.PhrasesContextLog)
  private static final com.google.speech.logs.PhrasesContextLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.PhrasesContextLog();
  }

  public static com.google.speech.logs.PhrasesContextLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PhrasesContextLog>
      PARSER = new com.google.protobuf.AbstractParser<PhrasesContextLog>() {
    @java.lang.Override
    public PhrasesContextLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhrasesContextLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhrasesContextLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.PhrasesContextLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

