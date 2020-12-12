// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/grammar/proto/grammar_semantic_compiler.proto

package com.google.speech.grammar.proto;

/**
 * Protobuf type {@code speech.GrxmlGrammarInput}
 */
public final class GrxmlGrammarInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.GrxmlGrammarInput)
    GrxmlGrammarInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrxmlGrammarInput.newBuilder() to construct.
  private GrxmlGrammarInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrxmlGrammarInput() {
    url_ = "";
    grxml_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrxmlGrammarInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrxmlGrammarInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrxmlGrammarInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.grammar.proto.GrxmlGrammarInput.class, com.google.speech.grammar.proto.GrxmlGrammarInput.Builder.class);
  }

  private int bitField0_;
  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        url_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRXML_FIELD_NUMBER = 2;
  private volatile java.lang.Object grxml_;
  /**
   * <code>optional string grxml = 2;</code>
   * @return Whether the grxml field is set.
   */
  @java.lang.Override
  public boolean hasGrxml() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string grxml = 2;</code>
   * @return The grxml.
   */
  @java.lang.Override
  public java.lang.String getGrxml() {
    java.lang.Object ref = grxml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        grxml_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string grxml = 2;</code>
   * @return The bytes for grxml.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGrxmlBytes() {
    java.lang.Object ref = grxml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grxml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrxmlGrammarInput parseFrom(
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
  public static Builder newBuilder(com.google.speech.grammar.proto.GrxmlGrammarInput prototype) {
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
   * Protobuf type {@code speech.GrxmlGrammarInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.GrxmlGrammarInput)
      com.google.speech.grammar.proto.GrxmlGrammarInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrxmlGrammarInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrxmlGrammarInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.grammar.proto.GrxmlGrammarInput.class, com.google.speech.grammar.proto.GrxmlGrammarInput.Builder.class);
    }

    // Construct using com.google.speech.grammar.proto.GrxmlGrammarInput.newBuilder()
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
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      grxml_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrxmlGrammarInput_descriptor;
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrxmlGrammarInput getDefaultInstanceForType() {
      return com.google.speech.grammar.proto.GrxmlGrammarInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrxmlGrammarInput build() {
      com.google.speech.grammar.proto.GrxmlGrammarInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrxmlGrammarInput buildPartial() {
      com.google.speech.grammar.proto.GrxmlGrammarInput result = new com.google.speech.grammar.proto.GrxmlGrammarInput(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.url_ = url_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.grxml_ = grxml_;
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

    private java.lang.Object url_ = "";
    /**
     * <code>optional string url = 1;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string url = 1;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string url = 1;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string url = 1;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object grxml_ = "";
    /**
     * <code>optional string grxml = 2;</code>
     * @return Whether the grxml field is set.
     */
    public boolean hasGrxml() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string grxml = 2;</code>
     * @return The grxml.
     */
    public java.lang.String getGrxml() {
      java.lang.Object ref = grxml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          grxml_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string grxml = 2;</code>
     * @return The bytes for grxml.
     */
    public com.google.protobuf.ByteString
        getGrxmlBytes() {
      java.lang.Object ref = grxml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grxml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string grxml = 2;</code>
     * @param value The grxml to set.
     * @return This builder for chaining.
     */
    public Builder setGrxml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      grxml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string grxml = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrxml() {
      bitField0_ = (bitField0_ & ~0x00000002);
      grxml_ = getDefaultInstance().getGrxml();
      onChanged();
      return this;
    }
    /**
     * <code>optional string grxml = 2;</code>
     * @param value The bytes for grxml to set.
     * @return This builder for chaining.
     */
    public Builder setGrxmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      grxml_ = value;
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


    // @@protoc_insertion_point(builder_scope:speech.GrxmlGrammarInput)
  }

  // @@protoc_insertion_point(class_scope:speech.GrxmlGrammarInput)
  private static final com.google.speech.grammar.proto.GrxmlGrammarInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.grammar.proto.GrxmlGrammarInput();
  }

  public static com.google.speech.grammar.proto.GrxmlGrammarInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GrxmlGrammarInput>
      PARSER = new com.google.protobuf.AbstractParser<GrxmlGrammarInput>() {
    @java.lang.Override
    public GrxmlGrammarInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<GrxmlGrammarInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrxmlGrammarInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.grammar.proto.GrxmlGrammarInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

