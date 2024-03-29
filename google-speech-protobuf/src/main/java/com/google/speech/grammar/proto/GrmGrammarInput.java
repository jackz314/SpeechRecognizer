// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/grammar/proto/grammar_semantic_compiler.proto

package com.google.speech.grammar.proto;

/**
 * Protobuf type {@code speech.GrmGrammarInput}
 */
public final class GrmGrammarInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.GrmGrammarInput)
    GrmGrammarInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrmGrammarInput.newBuilder() to construct.
  private GrmGrammarInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrmGrammarInput() {
    grammar_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrmGrammarInput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrmGrammarInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrmGrammarInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.grammar.proto.GrmGrammarInput.class, com.google.speech.grammar.proto.GrmGrammarInput.Builder.class);
  }

  private int bitField0_;
  public static final int GRAMMAR_FIELD_NUMBER = 1;
  private volatile java.lang.Object grammar_;
  /**
   * <code>optional string grammar = 1;</code>
   * @return Whether the grammar field is set.
   */
  @java.lang.Override
  public boolean hasGrammar() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string grammar = 1;</code>
   * @return The grammar.
   */
  @java.lang.Override
  public java.lang.String getGrammar() {
    java.lang.Object ref = grammar_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        grammar_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string grammar = 1;</code>
   * @return The bytes for grammar.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGrammarBytes() {
    java.lang.Object ref = grammar_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grammar_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.grammar.proto.GrmGrammarInput parseFrom(
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
  public static Builder newBuilder(com.google.speech.grammar.proto.GrmGrammarInput prototype) {
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
   * Protobuf type {@code speech.GrmGrammarInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.GrmGrammarInput)
      com.google.speech.grammar.proto.GrmGrammarInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrmGrammarInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrmGrammarInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.grammar.proto.GrmGrammarInput.class, com.google.speech.grammar.proto.GrmGrammarInput.Builder.class);
    }

    // Construct using com.google.speech.grammar.proto.GrmGrammarInput.newBuilder()
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
      grammar_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.grammar.proto.GrammarSemanticCompiler.internal_static_speech_GrmGrammarInput_descriptor;
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrmGrammarInput getDefaultInstanceForType() {
      return com.google.speech.grammar.proto.GrmGrammarInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrmGrammarInput build() {
      com.google.speech.grammar.proto.GrmGrammarInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.grammar.proto.GrmGrammarInput buildPartial() {
      com.google.speech.grammar.proto.GrmGrammarInput result = new com.google.speech.grammar.proto.GrmGrammarInput(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.grammar_ = grammar_;
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

    private java.lang.Object grammar_ = "";
    /**
     * <code>optional string grammar = 1;</code>
     * @return Whether the grammar field is set.
     */
    public boolean hasGrammar() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string grammar = 1;</code>
     * @return The grammar.
     */
    public java.lang.String getGrammar() {
      java.lang.Object ref = grammar_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          grammar_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string grammar = 1;</code>
     * @return The bytes for grammar.
     */
    public com.google.protobuf.ByteString
        getGrammarBytes() {
      java.lang.Object ref = grammar_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grammar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string grammar = 1;</code>
     * @param value The grammar to set.
     * @return This builder for chaining.
     */
    public Builder setGrammar(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      grammar_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string grammar = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrammar() {
      bitField0_ = (bitField0_ & ~0x00000001);
      grammar_ = getDefaultInstance().getGrammar();
      onChanged();
      return this;
    }
    /**
     * <code>optional string grammar = 1;</code>
     * @param value The bytes for grammar to set.
     * @return This builder for chaining.
     */
    public Builder setGrammarBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      grammar_ = value;
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


    // @@protoc_insertion_point(builder_scope:speech.GrmGrammarInput)
  }

  // @@protoc_insertion_point(class_scope:speech.GrmGrammarInput)
  private static final com.google.speech.grammar.proto.GrmGrammarInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.grammar.proto.GrmGrammarInput();
  }

  public static com.google.speech.grammar.proto.GrmGrammarInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GrmGrammarInput>
      PARSER = new com.google.protobuf.AbstractParser<GrmGrammarInput>() {
    @java.lang.Override
    public GrmGrammarInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<GrmGrammarInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrmGrammarInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.grammar.proto.GrmGrammarInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

