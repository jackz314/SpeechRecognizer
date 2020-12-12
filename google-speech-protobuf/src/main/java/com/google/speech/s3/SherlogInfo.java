// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/service/s3/util/sherlog-info.proto

package com.google.speech.s3;

public final class SherlogInfo {
  private SherlogInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.speech.s3.SherlogInfo.S3SherlogInfo.sherlogInfo);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface S3SherlogInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:speech.s3.S3SherlogInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
     * @return Whether the enabledState field is set.
     */
    boolean hasEnabledState();
    /**
     * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
     * @return The enabledState.
     */
    com.google.speech.s3.SherlogInfo.S3SherlogInfo.State getEnabledState();

    /**
     * <code>optional string input_dataid = 2;</code>
     * @return Whether the inputDataid field is set.
     */
    boolean hasInputDataid();
    /**
     * <code>optional string input_dataid = 2;</code>
     * @return The inputDataid.
     */
    java.lang.String getInputDataid();
    /**
     * <code>optional string input_dataid = 2;</code>
     * @return The bytes for inputDataid.
     */
    com.google.protobuf.ByteString
        getInputDataidBytes();
  }
  /**
   * Protobuf type {@code speech.s3.S3SherlogInfo}
   */
  public static final class S3SherlogInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:speech.s3.S3SherlogInfo)
      S3SherlogInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use S3SherlogInfo.newBuilder() to construct.
    private S3SherlogInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private S3SherlogInfo() {
      enabledState_ = 0;
      inputDataid_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new S3SherlogInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.s3.SherlogInfo.internal_static_speech_s3_S3SherlogInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.s3.SherlogInfo.internal_static_speech_s3_S3SherlogInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.s3.SherlogInfo.S3SherlogInfo.class, com.google.speech.s3.SherlogInfo.S3SherlogInfo.Builder.class);
    }

    /**
     * Protobuf enum {@code speech.s3.S3SherlogInfo.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>DISABLED = 1;</code>
       */
      DISABLED(1),
      /**
       * <code>ENABLED = 2;</code>
       */
      ENABLED(2),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>DISABLED = 1;</code>
       */
      public static final int DISABLED_VALUE = 1;
      /**
       * <code>ENABLED = 2;</code>
       */
      public static final int ENABLED_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return DISABLED;
          case 2: return ENABLED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.speech.s3.SherlogInfo.S3SherlogInfo.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:speech.s3.S3SherlogInfo.State)
    }

    private int bitField0_;
    public static final int ENABLED_STATE_FIELD_NUMBER = 1;
    private int enabledState_;
    /**
     * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
     * @return Whether the enabledState field is set.
     */
    @java.lang.Override public boolean hasEnabledState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
     * @return The enabledState.
     */
    @java.lang.Override public com.google.speech.s3.SherlogInfo.S3SherlogInfo.State getEnabledState() {
      @SuppressWarnings("deprecation")
      com.google.speech.s3.SherlogInfo.S3SherlogInfo.State result = com.google.speech.s3.SherlogInfo.S3SherlogInfo.State.valueOf(enabledState_);
      return result == null ? com.google.speech.s3.SherlogInfo.S3SherlogInfo.State.UNKNOWN : result;
    }

    public static final int INPUT_DATAID_FIELD_NUMBER = 2;
    private volatile java.lang.Object inputDataid_;
    /**
     * <code>optional string input_dataid = 2;</code>
     * @return Whether the inputDataid field is set.
     */
    @java.lang.Override
    public boolean hasInputDataid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string input_dataid = 2;</code>
     * @return The inputDataid.
     */
    @java.lang.Override
    public java.lang.String getInputDataid() {
      java.lang.Object ref = inputDataid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          inputDataid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string input_dataid = 2;</code>
     * @return The bytes for inputDataid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInputDataidBytes() {
      java.lang.Object ref = inputDataid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputDataid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo parseFrom(
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
    public static Builder newBuilder(com.google.speech.s3.SherlogInfo.S3SherlogInfo prototype) {
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
     * Protobuf type {@code speech.s3.S3SherlogInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:speech.s3.S3SherlogInfo)
        com.google.speech.s3.SherlogInfo.S3SherlogInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.speech.s3.SherlogInfo.internal_static_speech_s3_S3SherlogInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.speech.s3.SherlogInfo.internal_static_speech_s3_S3SherlogInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.speech.s3.SherlogInfo.S3SherlogInfo.class, com.google.speech.s3.SherlogInfo.S3SherlogInfo.Builder.class);
      }

      // Construct using com.google.speech.s3.SherlogInfo.S3SherlogInfo.newBuilder()
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
        enabledState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        inputDataid_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.speech.s3.SherlogInfo.internal_static_speech_s3_S3SherlogInfo_descriptor;
      }

      @java.lang.Override
      public com.google.speech.s3.SherlogInfo.S3SherlogInfo getDefaultInstanceForType() {
        return com.google.speech.s3.SherlogInfo.S3SherlogInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.speech.s3.SherlogInfo.S3SherlogInfo build() {
        com.google.speech.s3.SherlogInfo.S3SherlogInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.speech.s3.SherlogInfo.S3SherlogInfo buildPartial() {
        com.google.speech.s3.SherlogInfo.S3SherlogInfo result = new com.google.speech.s3.SherlogInfo.S3SherlogInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.enabledState_ = enabledState_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.inputDataid_ = inputDataid_;
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

      private int enabledState_ = 0;
      /**
       * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
       * @return Whether the enabledState field is set.
       */
      @java.lang.Override public boolean hasEnabledState() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
       * @return The enabledState.
       */
      @java.lang.Override
      public com.google.speech.s3.SherlogInfo.S3SherlogInfo.State getEnabledState() {
        @SuppressWarnings("deprecation")
        com.google.speech.s3.SherlogInfo.S3SherlogInfo.State result = com.google.speech.s3.SherlogInfo.S3SherlogInfo.State.valueOf(enabledState_);
        return result == null ? com.google.speech.s3.SherlogInfo.S3SherlogInfo.State.UNKNOWN : result;
      }
      /**
       * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
       * @param value The enabledState to set.
       * @return This builder for chaining.
       */
      public Builder setEnabledState(com.google.speech.s3.SherlogInfo.S3SherlogInfo.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        enabledState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .speech.s3.S3SherlogInfo.State enabled_state = 1 [default = UNKNOWN];</code>
       * @return This builder for chaining.
       */
      public Builder clearEnabledState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        enabledState_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object inputDataid_ = "";
      /**
       * <code>optional string input_dataid = 2;</code>
       * @return Whether the inputDataid field is set.
       */
      public boolean hasInputDataid() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string input_dataid = 2;</code>
       * @return The inputDataid.
       */
      public java.lang.String getInputDataid() {
        java.lang.Object ref = inputDataid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            inputDataid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string input_dataid = 2;</code>
       * @return The bytes for inputDataid.
       */
      public com.google.protobuf.ByteString
          getInputDataidBytes() {
        java.lang.Object ref = inputDataid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          inputDataid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string input_dataid = 2;</code>
       * @param value The inputDataid to set.
       * @return This builder for chaining.
       */
      public Builder setInputDataid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        inputDataid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string input_dataid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInputDataid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        inputDataid_ = getDefaultInstance().getInputDataid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string input_dataid = 2;</code>
       * @param value The bytes for inputDataid to set.
       * @return This builder for chaining.
       */
      public Builder setInputDataidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        inputDataid_ = value;
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


      // @@protoc_insertion_point(builder_scope:speech.s3.S3SherlogInfo)
    }

    // @@protoc_insertion_point(class_scope:speech.s3.S3SherlogInfo)
    private static final com.google.speech.s3.SherlogInfo.S3SherlogInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.speech.s3.SherlogInfo.S3SherlogInfo();
    }

    public static com.google.speech.s3.SherlogInfo.S3SherlogInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<S3SherlogInfo>
        PARSER = new com.google.protobuf.AbstractParser<S3SherlogInfo>() {
      @java.lang.Override
      public S3SherlogInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<S3SherlogInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<S3SherlogInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.speech.s3.SherlogInfo.S3SherlogInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int SHERLOG_INFO_FIELD_NUMBER = 112997213;
    /**
     * <code>extend .speech.s3.S3DebugInfo { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        com.google.speech.s3.S3.S3DebugInfo,
        com.google.speech.s3.SherlogInfo.S3SherlogInfo> sherlogInfo = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          com.google.speech.s3.SherlogInfo.S3SherlogInfo.getDefaultInstance(),
          0,
          com.google.speech.s3.SherlogInfo.S3SherlogInfo.class,
          com.google.speech.s3.SherlogInfo.S3SherlogInfo.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_s3_S3SherlogInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_s3_S3SherlogInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)speech/service/s3/util/sherlog-info.pr" +
      "oto\022\tspeech.s3\032\032speech/service/s3/s3.pro" +
      "to\"\341\001\n\rS3SherlogInfo\022>\n\renabled_state\030\001 " +
      "\001(\0162\036.speech.s3.S3SherlogInfo.State:\007UNK" +
      "NOWN\022\024\n\014input_dataid\030\002 \001(\t\"/\n\005State\022\013\n\007U" +
      "NKNOWN\020\000\022\014\n\010DISABLED\020\001\022\013\n\007ENABLED\020\0022I\n\014s" +
      "herlog_info\022\026.speech.s3.S3DebugInfo\030\335\346\3605" +
      " \001(\0132\030.speech.s3.S3SherlogInfoB\030\n\024com.go" +
      "ogle.speech.s3H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.speech.s3.S3.getDescriptor(),
        });
    internal_static_speech_s3_S3SherlogInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_s3_S3SherlogInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_s3_S3SherlogInfo_descriptor,
        new java.lang.String[] { "EnabledState", "InputDataid", });
    com.google.speech.s3.S3.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
