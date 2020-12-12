// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.TopContactsContextLog}
 */
public final class TopContactsContextLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.TopContactsContextLog)
    TopContactsContextLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopContactsContextLog.newBuilder() to construct.
  private TopContactsContextLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopContactsContextLog() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopContactsContextLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_TopContactsContextLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_TopContactsContextLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.TopContactsContextLog.class, com.google.speech.logs.TopContactsContextLog.Builder.class);
  }

  private int bitField0_;
  public static final int NUM_CONTACTS_FIELD_NUMBER = 1;
  private int numContacts_;
  /**
   * <code>optional int32 num_contacts = 1;</code>
   * @return Whether the numContacts field is set.
   */
  @java.lang.Override
  public boolean hasNumContacts() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 num_contacts = 1;</code>
   * @return The numContacts.
   */
  @java.lang.Override
  public int getNumContacts() {
    return numContacts_;
  }

  public static final int NUM_CONTACTS_USED_FIELD_NUMBER = 2;
  private int numContactsUsed_;
  /**
   * <code>optional int32 num_contacts_used = 2;</code>
   * @return Whether the numContactsUsed field is set.
   */
  @java.lang.Override
  public boolean hasNumContactsUsed() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 num_contacts_used = 2;</code>
   * @return The numContactsUsed.
   */
  @java.lang.Override
  public int getNumContactsUsed() {
    return numContactsUsed_;
  }

  public static final int NUM_CONTACTS_WITH_AFFINITY_FIELD_NUMBER = 3;
  private int numContactsWithAffinity_;
  /**
   * <code>optional int32 num_contacts_with_affinity = 3;</code>
   * @return Whether the numContactsWithAffinity field is set.
   */
  @java.lang.Override
  public boolean hasNumContactsWithAffinity() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 num_contacts_with_affinity = 3;</code>
   * @return The numContactsWithAffinity.
   */
  @java.lang.Override
  public int getNumContactsWithAffinity() {
    return numContactsWithAffinity_;
  }

  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.TopContactsContextLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.TopContactsContextLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.TopContactsContextLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.TopContactsContextLog prototype) {
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
   * Protobuf type {@code speech.logs.TopContactsContextLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.TopContactsContextLog)
      com.google.speech.logs.TopContactsContextLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_TopContactsContextLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_TopContactsContextLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.TopContactsContextLog.class, com.google.speech.logs.TopContactsContextLog.Builder.class);
    }

    // Construct using com.google.speech.logs.TopContactsContextLog.newBuilder()
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
      numContacts_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      numContactsUsed_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      numContactsWithAffinity_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_TopContactsContextLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.TopContactsContextLog getDefaultInstanceForType() {
      return com.google.speech.logs.TopContactsContextLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.TopContactsContextLog build() {
      com.google.speech.logs.TopContactsContextLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.TopContactsContextLog buildPartial() {
      com.google.speech.logs.TopContactsContextLog result = new com.google.speech.logs.TopContactsContextLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numContacts_ = numContacts_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numContactsUsed_ = numContactsUsed_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numContactsWithAffinity_ = numContactsWithAffinity_;
        to_bitField0_ |= 0x00000004;
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

    private int numContacts_ ;
    /**
     * <code>optional int32 num_contacts = 1;</code>
     * @return Whether the numContacts field is set.
     */
    @java.lang.Override
    public boolean hasNumContacts() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 num_contacts = 1;</code>
     * @return The numContacts.
     */
    @java.lang.Override
    public int getNumContacts() {
      return numContacts_;
    }
    /**
     * <code>optional int32 num_contacts = 1;</code>
     * @param value The numContacts to set.
     * @return This builder for chaining.
     */
    public Builder setNumContacts(int value) {
      bitField0_ |= 0x00000001;
      numContacts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num_contacts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumContacts() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numContacts_ = 0;
      onChanged();
      return this;
    }

    private int numContactsUsed_ ;
    /**
     * <code>optional int32 num_contacts_used = 2;</code>
     * @return Whether the numContactsUsed field is set.
     */
    @java.lang.Override
    public boolean hasNumContactsUsed() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 num_contacts_used = 2;</code>
     * @return The numContactsUsed.
     */
    @java.lang.Override
    public int getNumContactsUsed() {
      return numContactsUsed_;
    }
    /**
     * <code>optional int32 num_contacts_used = 2;</code>
     * @param value The numContactsUsed to set.
     * @return This builder for chaining.
     */
    public Builder setNumContactsUsed(int value) {
      bitField0_ |= 0x00000002;
      numContactsUsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num_contacts_used = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumContactsUsed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numContactsUsed_ = 0;
      onChanged();
      return this;
    }

    private int numContactsWithAffinity_ ;
    /**
     * <code>optional int32 num_contacts_with_affinity = 3;</code>
     * @return Whether the numContactsWithAffinity field is set.
     */
    @java.lang.Override
    public boolean hasNumContactsWithAffinity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 num_contacts_with_affinity = 3;</code>
     * @return The numContactsWithAffinity.
     */
    @java.lang.Override
    public int getNumContactsWithAffinity() {
      return numContactsWithAffinity_;
    }
    /**
     * <code>optional int32 num_contacts_with_affinity = 3;</code>
     * @param value The numContactsWithAffinity to set.
     * @return This builder for chaining.
     */
    public Builder setNumContactsWithAffinity(int value) {
      bitField0_ |= 0x00000004;
      numContactsWithAffinity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num_contacts_with_affinity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumContactsWithAffinity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numContactsWithAffinity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.TopContactsContextLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.TopContactsContextLog)
  private static final com.google.speech.logs.TopContactsContextLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.TopContactsContextLog();
  }

  public static com.google.speech.logs.TopContactsContextLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TopContactsContextLog>
      PARSER = new com.google.protobuf.AbstractParser<TopContactsContextLog>() {
    @java.lang.Override
    public TopContactsContextLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopContactsContextLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopContactsContextLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.TopContactsContextLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

