// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/common/res.proto

package speech.res;

public final class Res {
  private Res() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(speech.res.Res.ResProto.messageSetExtension);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:speech.res.ResProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 code = 1;</code>
     * @return Whether the code field is set.
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 1;</code>
     * @return The code.
     */
    int getCode();

    /**
     * <code>optional string message = 2;</code>
     * @return Whether the message field is set.
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 2;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 2;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     * @return Whether the subRes field is set.
     */
    boolean hasSubRes();
    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     * @return The subRes.
     */
    speech.res.Res.ResProto getSubRes();
    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     */
    speech.res.Res.ResProtoOrBuilder getSubResOrBuilder();
  }
  /**
   * Protobuf type {@code speech.res.ResProto}
   */
  public static final class ResProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:speech.res.ResProto)
      ResProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResProto.newBuilder() to construct.
    private ResProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResProto() {
      message_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return speech.res.Res.internal_static_speech_res_ResProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return speech.res.Res.internal_static_speech_res_ResProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              speech.res.Res.ResProto.class, speech.res.Res.ResProto.Builder.class);
    }

    private int bitField0_;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>optional int32 code = 1;</code>
     * @return Whether the code field is set.
     */
    @java.lang.Override
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     * <code>optional string message = 2;</code>
     * @return Whether the message field is set.
     */
    @java.lang.Override
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string message = 2;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 2;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUB_RES_FIELD_NUMBER = 3;
    private speech.res.Res.ResProto subRes_;
    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     * @return Whether the subRes field is set.
     */
    @java.lang.Override
    public boolean hasSubRes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     * @return The subRes.
     */
    @java.lang.Override
    public speech.res.Res.ResProto getSubRes() {
      return subRes_ == null ? speech.res.Res.ResProto.getDefaultInstance() : subRes_;
    }
    /**
     * <code>optional .speech.res.ResProto sub_res = 3;</code>
     */
    @java.lang.Override
    public speech.res.Res.ResProtoOrBuilder getSubResOrBuilder() {
      return subRes_ == null ? speech.res.Res.ResProto.getDefaultInstance() : subRes_;
    }

    public static speech.res.Res.ResProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.res.Res.ResProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.res.Res.ResProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.res.Res.ResProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.res.Res.ResProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.res.Res.ResProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.res.Res.ResProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.res.Res.ResProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.res.Res.ResProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static speech.res.Res.ResProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.res.Res.ResProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.res.Res.ResProto parseFrom(
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
    public static Builder newBuilder(speech.res.Res.ResProto prototype) {
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
     * Protobuf type {@code speech.res.ResProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:speech.res.ResProto)
        speech.res.Res.ResProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return speech.res.Res.internal_static_speech_res_ResProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return speech.res.Res.internal_static_speech_res_ResProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                speech.res.Res.ResProto.class, speech.res.Res.ResProto.Builder.class);
      }

      // Construct using speech.res.Res.ResProto.newBuilder()
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
          getSubResFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (subResBuilder_ == null) {
          subRes_ = null;
        } else {
          subResBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return speech.res.Res.internal_static_speech_res_ResProto_descriptor;
      }

      @java.lang.Override
      public speech.res.Res.ResProto getDefaultInstanceForType() {
        return speech.res.Res.ResProto.getDefaultInstance();
      }

      @java.lang.Override
      public speech.res.Res.ResProto build() {
        speech.res.Res.ResProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public speech.res.Res.ResProto buildPartial() {
        speech.res.Res.ResProto result = new speech.res.Res.ResProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.code_ = code_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (subResBuilder_ == null) {
            result.subRes_ = subRes_;
          } else {
            result.subRes_ = subResBuilder_.build();
          }
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

      private int code_ ;
      /**
       * <code>optional int32 code = 1;</code>
       * @return Whether the code field is set.
       */
      @java.lang.Override
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 code = 1;</code>
       * @return The code.
       */
      @java.lang.Override
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 1;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 2;</code>
       * @return Whether the message field is set.
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string message = 2;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }

      private speech.res.Res.ResProto subRes_;
      private com.google.protobuf.SingleFieldBuilderV3<
          speech.res.Res.ResProto, speech.res.Res.ResProto.Builder, speech.res.Res.ResProtoOrBuilder> subResBuilder_;
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       * @return Whether the subRes field is set.
       */
      public boolean hasSubRes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       * @return The subRes.
       */
      public speech.res.Res.ResProto getSubRes() {
        if (subResBuilder_ == null) {
          return subRes_ == null ? speech.res.Res.ResProto.getDefaultInstance() : subRes_;
        } else {
          return subResBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public Builder setSubRes(speech.res.Res.ResProto value) {
        if (subResBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          subRes_ = value;
          onChanged();
        } else {
          subResBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public Builder setSubRes(
          speech.res.Res.ResProto.Builder builderForValue) {
        if (subResBuilder_ == null) {
          subRes_ = builderForValue.build();
          onChanged();
        } else {
          subResBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public Builder mergeSubRes(speech.res.Res.ResProto value) {
        if (subResBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              subRes_ != null &&
              subRes_ != speech.res.Res.ResProto.getDefaultInstance()) {
            subRes_ =
              speech.res.Res.ResProto.newBuilder(subRes_).mergeFrom(value).buildPartial();
          } else {
            subRes_ = value;
          }
          onChanged();
        } else {
          subResBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public Builder clearSubRes() {
        if (subResBuilder_ == null) {
          subRes_ = null;
          onChanged();
        } else {
          subResBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public speech.res.Res.ResProto.Builder getSubResBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSubResFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      public speech.res.Res.ResProtoOrBuilder getSubResOrBuilder() {
        if (subResBuilder_ != null) {
          return subResBuilder_.getMessageOrBuilder();
        } else {
          return subRes_ == null ?
              speech.res.Res.ResProto.getDefaultInstance() : subRes_;
        }
      }
      /**
       * <code>optional .speech.res.ResProto sub_res = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          speech.res.Res.ResProto, speech.res.Res.ResProto.Builder, speech.res.Res.ResProtoOrBuilder> 
          getSubResFieldBuilder() {
        if (subResBuilder_ == null) {
          subResBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              speech.res.Res.ResProto, speech.res.Res.ResProto.Builder, speech.res.Res.ResProtoOrBuilder>(
                  getSubRes(),
                  getParentForChildren(),
                  isClean());
          subRes_ = null;
        }
        return subResBuilder_;
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


      // @@protoc_insertion_point(builder_scope:speech.res.ResProto)
    }

    // @@protoc_insertion_point(class_scope:speech.res.ResProto)
    private static final speech.res.Res.ResProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new speech.res.Res.ResProto();
    }

    public static speech.res.Res.ResProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ResProto>
        PARSER = new com.google.protobuf.AbstractParser<ResProto>() {
      @java.lang.Override
      public ResProto parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public speech.res.Res.ResProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 217702706;
    /**
     * <code>extend .proto2.bridge.MessageSet { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        proto2.bridge.MessageSet,
        speech.res.Res.ResProto> messageSetExtension = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          speech.res.Res.ResProto.getDefaultInstance(),
          0,
          speech.res.Res.ResProto.class,
          speech.res.Res.ResProto.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_res_ResProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_res_ResProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027speech/common/res.proto\022\nspeech.res\032)n" +
      "et/proto2/bridge/proto/message_set.proto" +
      "\"\243\001\n\010ResProto\022\014\n\004code\030\001 \001(\005\022\017\n\007message\030\002" +
      " \001(\t\022%\n\007sub_res\030\003 \001(\0132\024.speech.res.ResPr" +
      "oto2Q\n\025message_set_extension\022\031.proto2.br" +
      "idge.MessageSet\030\262\302\347g \001(\0132\024.speech.res.Re" +
      "sProtoB\005H\002\370\001\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          proto2.bridge.MessageSetProtos.getDescriptor(),
        });
    internal_static_speech_res_ResProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_res_ResProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_res_ResProto_descriptor,
        new java.lang.String[] { "Code", "Message", "SubRes", });
    proto2.bridge.MessageSetProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
