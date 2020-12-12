// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

/**
 * Protobuf type {@code speech.logs.timeline.AccountSwitchedInfo}
 */
public final class AccountSwitchedInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.timeline.AccountSwitchedInfo)
    AccountSwitchedInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountSwitchedInfo.newBuilder() to construct.
  private AccountSwitchedInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountSwitchedInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountSwitchedInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AccountSwitchedInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AccountSwitchedInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.timeline.AccountSwitchedInfo.class, com.google.speech.logs.timeline.AccountSwitchedInfo.Builder.class);
  }

  private int bitField0_;
  public static final int PREVIOUS_AUTH_TOKEN_INDEX_FIELD_NUMBER = 1;
  private int previousAuthTokenIndex_;
  /**
   * <code>optional int32 previous_auth_token_index = 1;</code>
   * @return Whether the previousAuthTokenIndex field is set.
   */
  @java.lang.Override
  public boolean hasPreviousAuthTokenIndex() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 previous_auth_token_index = 1;</code>
   * @return The previousAuthTokenIndex.
   */
  @java.lang.Override
  public int getPreviousAuthTokenIndex() {
    return previousAuthTokenIndex_;
  }

  public static final int NEW_AUTH_TOKEN_INDEX_FIELD_NUMBER = 2;
  private int newAuthTokenIndex_;
  /**
   * <code>optional int32 new_auth_token_index = 2;</code>
   * @return Whether the newAuthTokenIndex field is set.
   */
  @java.lang.Override
  public boolean hasNewAuthTokenIndex() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 new_auth_token_index = 2;</code>
   * @return The newAuthTokenIndex.
   */
  @java.lang.Override
  public int getNewAuthTokenIndex() {
    return newAuthTokenIndex_;
  }

  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.timeline.AccountSwitchedInfo parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.timeline.AccountSwitchedInfo prototype) {
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
   * Protobuf type {@code speech.logs.timeline.AccountSwitchedInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.timeline.AccountSwitchedInfo)
      com.google.speech.logs.timeline.AccountSwitchedInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AccountSwitchedInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AccountSwitchedInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.timeline.AccountSwitchedInfo.class, com.google.speech.logs.timeline.AccountSwitchedInfo.Builder.class);
    }

    // Construct using com.google.speech.logs.timeline.AccountSwitchedInfo.newBuilder()
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
      previousAuthTokenIndex_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      newAuthTokenIndex_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.timeline.TimelineEventOuterClass.internal_static_speech_logs_timeline_AccountSwitchedInfo_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AccountSwitchedInfo getDefaultInstanceForType() {
      return com.google.speech.logs.timeline.AccountSwitchedInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AccountSwitchedInfo build() {
      com.google.speech.logs.timeline.AccountSwitchedInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.timeline.AccountSwitchedInfo buildPartial() {
      com.google.speech.logs.timeline.AccountSwitchedInfo result = new com.google.speech.logs.timeline.AccountSwitchedInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.previousAuthTokenIndex_ = previousAuthTokenIndex_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newAuthTokenIndex_ = newAuthTokenIndex_;
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

    private int previousAuthTokenIndex_ ;
    /**
     * <code>optional int32 previous_auth_token_index = 1;</code>
     * @return Whether the previousAuthTokenIndex field is set.
     */
    @java.lang.Override
    public boolean hasPreviousAuthTokenIndex() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 previous_auth_token_index = 1;</code>
     * @return The previousAuthTokenIndex.
     */
    @java.lang.Override
    public int getPreviousAuthTokenIndex() {
      return previousAuthTokenIndex_;
    }
    /**
     * <code>optional int32 previous_auth_token_index = 1;</code>
     * @param value The previousAuthTokenIndex to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousAuthTokenIndex(int value) {
      bitField0_ |= 0x00000001;
      previousAuthTokenIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 previous_auth_token_index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviousAuthTokenIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      previousAuthTokenIndex_ = 0;
      onChanged();
      return this;
    }

    private int newAuthTokenIndex_ ;
    /**
     * <code>optional int32 new_auth_token_index = 2;</code>
     * @return Whether the newAuthTokenIndex field is set.
     */
    @java.lang.Override
    public boolean hasNewAuthTokenIndex() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 new_auth_token_index = 2;</code>
     * @return The newAuthTokenIndex.
     */
    @java.lang.Override
    public int getNewAuthTokenIndex() {
      return newAuthTokenIndex_;
    }
    /**
     * <code>optional int32 new_auth_token_index = 2;</code>
     * @param value The newAuthTokenIndex to set.
     * @return This builder for chaining.
     */
    public Builder setNewAuthTokenIndex(int value) {
      bitField0_ |= 0x00000002;
      newAuthTokenIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 new_auth_token_index = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewAuthTokenIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      newAuthTokenIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.timeline.AccountSwitchedInfo)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.timeline.AccountSwitchedInfo)
  private static final com.google.speech.logs.timeline.AccountSwitchedInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.timeline.AccountSwitchedInfo();
  }

  public static com.google.speech.logs.timeline.AccountSwitchedInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AccountSwitchedInfo>
      PARSER = new com.google.protobuf.AbstractParser<AccountSwitchedInfo>() {
    @java.lang.Override
    public AccountSwitchedInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountSwitchedInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountSwitchedInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.timeline.AccountSwitchedInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
