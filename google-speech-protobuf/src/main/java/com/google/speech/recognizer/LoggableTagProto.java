// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/logs/loggable_tag.proto

package com.google.speech.recognizer;

public final class LoggableTagProto {
  private LoggableTagProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.speech.recognizer.LoggableTagProto.LoggableTag.logId);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoggableTagOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.LoggableTag)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string tag = 1;</code>
     * @return Whether the tag field is set.
     */
    boolean hasTag();
    /**
     * <code>optional string tag = 1;</code>
     * @return The tag.
     */
    java.lang.String getTag();
    /**
     * <code>optional string tag = 1;</code>
     * @return The bytes for tag.
     */
    com.google.protobuf.ByteString
        getTagBytes();
  }
  /**
   * Protobuf type {@code greco.LoggableTag}
   */
  public static final class LoggableTag extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.LoggableTag)
      LoggableTagOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LoggableTag.newBuilder() to construct.
    private LoggableTag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoggableTag() {
      tag_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LoggableTag();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.recognizer.LoggableTagProto.internal_static_greco_LoggableTag_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.recognizer.LoggableTagProto.internal_static_greco_LoggableTag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.recognizer.LoggableTagProto.LoggableTag.class, com.google.speech.recognizer.LoggableTagProto.LoggableTag.Builder.class);
    }

    private int bitField0_;
    public static final int TAG_FIELD_NUMBER = 1;
    private volatile java.lang.Object tag_;
    /**
     * <code>optional string tag = 1;</code>
     * @return Whether the tag field is set.
     */
    @java.lang.Override
    public boolean hasTag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string tag = 1;</code>
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tag_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tag = 1;</code>
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag parseFrom(
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
    public static Builder newBuilder(com.google.speech.recognizer.LoggableTagProto.LoggableTag prototype) {
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
     * Protobuf type {@code greco.LoggableTag}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.LoggableTag)
        com.google.speech.recognizer.LoggableTagProto.LoggableTagOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.speech.recognizer.LoggableTagProto.internal_static_greco_LoggableTag_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.speech.recognizer.LoggableTagProto.internal_static_greco_LoggableTag_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.speech.recognizer.LoggableTagProto.LoggableTag.class, com.google.speech.recognizer.LoggableTagProto.LoggableTag.Builder.class);
      }

      // Construct using com.google.speech.recognizer.LoggableTagProto.LoggableTag.newBuilder()
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
        tag_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.speech.recognizer.LoggableTagProto.internal_static_greco_LoggableTag_descriptor;
      }

      @java.lang.Override
      public com.google.speech.recognizer.LoggableTagProto.LoggableTag getDefaultInstanceForType() {
        return com.google.speech.recognizer.LoggableTagProto.LoggableTag.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.speech.recognizer.LoggableTagProto.LoggableTag build() {
        com.google.speech.recognizer.LoggableTagProto.LoggableTag result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.speech.recognizer.LoggableTagProto.LoggableTag buildPartial() {
        com.google.speech.recognizer.LoggableTagProto.LoggableTag result = new com.google.speech.recognizer.LoggableTagProto.LoggableTag(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tag_ = tag_;
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

      private java.lang.Object tag_ = "";
      /**
       * <code>optional string tag = 1;</code>
       * @return Whether the tag field is set.
       */
      public boolean hasTag() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string tag = 1;</code>
       * @return The tag.
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tag_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tag = 1;</code>
       * @return The bytes for tag.
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tag = 1;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 1;</code>
       * @param value The bytes for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tag_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.LoggableTag)
    }

    // @@protoc_insertion_point(class_scope:greco.LoggableTag)
    private static final com.google.speech.recognizer.LoggableTagProto.LoggableTag DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.speech.recognizer.LoggableTagProto.LoggableTag();
    }

    public static com.google.speech.recognizer.LoggableTagProto.LoggableTag getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LoggableTag>
        PARSER = new com.google.protobuf.AbstractParser<LoggableTag>() {
      @java.lang.Override
      public LoggableTag parsePartialFrom(
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

    public static com.google.protobuf.Parser<LoggableTag> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoggableTag> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.speech.recognizer.LoggableTagProto.LoggableTag getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int LOG_ID_FIELD_NUMBER = 62700942;
    /**
     * <code>extend .greco.Loggable { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.LoggableOuterClass.Loggable,
        com.google.speech.recognizer.LoggableTagProto.LoggableTag> logId = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          com.google.speech.recognizer.LoggableTagProto.LoggableTag.getDefaultInstance(),
          0,
          com.google.speech.recognizer.LoggableTagProto.LoggableTag.class,
          com.google.speech.recognizer.LoggableTagProto.LoggableTag.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_LoggableTag_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_LoggableTag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%speech/greco3/logs/loggable_tag.proto\022" +
      "\005greco\032!speech/greco3/core/loggable.prot" +
      "o\"R\n\013LoggableTag\022\013\n\003tag\030\001 \001(\t26\n\006log_id\022" +
      "\017.greco.Loggable\030\216\373\362\035 \001(\0132\022.greco.Loggab" +
      "leTagB8\n\034com.google.speech.recognizerB\020L" +
      "oggableTagProtoH\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.LoggableOuterClass.getDescriptor(),
        });
    internal_static_greco_LoggableTag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_LoggableTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_LoggableTag_descriptor,
        new java.lang.String[] { "Tag", });
    greco.LoggableOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
