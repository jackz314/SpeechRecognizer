// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/speakerid/postprocess_speakerid_stream.proto

package greco;

public final class PostprocessSpeakeridStream {
  private PostprocessSpeakeridStream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code greco.OutputEventType}
   */
  public enum OutputEventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SPEAKER_ID_RESULT = 0;</code>
     */
    SPEAKER_ID_RESULT(0),
    /**
     * <code>VERIFICATION_RESULT = 1;</code>
     */
    VERIFICATION_RESULT(1),
    ;

    /**
     * <code>SPEAKER_ID_RESULT = 0;</code>
     */
    public static final int SPEAKER_ID_RESULT_VALUE = 0;
    /**
     * <code>VERIFICATION_RESULT = 1;</code>
     */
    public static final int VERIFICATION_RESULT_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OutputEventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OutputEventType forNumber(int value) {
      switch (value) {
        case 0: return SPEAKER_ID_RESULT;
        case 1: return VERIFICATION_RESULT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OutputEventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OutputEventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OutputEventType>() {
            public OutputEventType findValueByNumber(int number) {
              return OutputEventType.forNumber(number);
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
      return greco.PostprocessSpeakeridStream.getDescriptor().getEnumTypes().get(0);
    }

    private static final OutputEventType[] VALUES = values();

    public static OutputEventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OutputEventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:greco.OutputEventType)
  }

  public interface PostprocessSpeakerIdParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.PostprocessSpeakerIdParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return Whether the profilesIoRef field is set.
     */
    boolean hasProfilesIoRef();
    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return The profilesIoRef.
     */
    java.lang.String getProfilesIoRef();
    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return The bytes for profilesIoRef.
     */
    com.google.protobuf.ByteString
        getProfilesIoRefBytes();

    /**
     * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
     * @return Whether the smartModeEnrollUtts field is set.
     */
    boolean hasSmartModeEnrollUtts();
    /**
     * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
     * @return The smartModeEnrollUtts.
     */
    int getSmartModeEnrollUtts();

    /**
     * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
     * @return Whether the outputEventType field is set.
     */
    boolean hasOutputEventType();
    /**
     * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
     * @return The outputEventType.
     */
    greco.PostprocessSpeakeridStream.OutputEventType getOutputEventType();
  }
  /**
   * Protobuf type {@code greco.PostprocessSpeakerIdParams}
   */
  public static final class PostprocessSpeakerIdParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.PostprocessSpeakerIdParams)
      PostprocessSpeakerIdParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PostprocessSpeakerIdParams.newBuilder() to construct.
    private PostprocessSpeakerIdParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PostprocessSpeakerIdParams() {
      profilesIoRef_ = "";
      smartModeEnrollUtts_ = 50;
      outputEventType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PostprocessSpeakerIdParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.PostprocessSpeakeridStream.internal_static_greco_PostprocessSpeakerIdParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.PostprocessSpeakeridStream.internal_static_greco_PostprocessSpeakerIdParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.class, greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.Builder.class);
    }

    private int bitField0_;
    public static final int PROFILES_IO_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object profilesIoRef_;
    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return Whether the profilesIoRef field is set.
     */
    @java.lang.Override
    public boolean hasProfilesIoRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return The profilesIoRef.
     */
    @java.lang.Override
    public java.lang.String getProfilesIoRef() {
      java.lang.Object ref = profilesIoRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          profilesIoRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string profiles_io_ref = 1;</code>
     * @return The bytes for profilesIoRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProfilesIoRefBytes() {
      java.lang.Object ref = profilesIoRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        profilesIoRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SMART_MODE_ENROLL_UTTS_FIELD_NUMBER = 2;
    private int smartModeEnrollUtts_;
    /**
     * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
     * @return Whether the smartModeEnrollUtts field is set.
     */
    @java.lang.Override
    public boolean hasSmartModeEnrollUtts() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
     * @return The smartModeEnrollUtts.
     */
    @java.lang.Override
    public int getSmartModeEnrollUtts() {
      return smartModeEnrollUtts_;
    }

    public static final int OUTPUT_EVENT_TYPE_FIELD_NUMBER = 3;
    private int outputEventType_;
    /**
     * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
     * @return Whether the outputEventType field is set.
     */
    @java.lang.Override public boolean hasOutputEventType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
     * @return The outputEventType.
     */
    @java.lang.Override public greco.PostprocessSpeakeridStream.OutputEventType getOutputEventType() {
      @SuppressWarnings("deprecation")
      greco.PostprocessSpeakeridStream.OutputEventType result = greco.PostprocessSpeakeridStream.OutputEventType.valueOf(outputEventType_);
      return result == null ? greco.PostprocessSpeakeridStream.OutputEventType.SPEAKER_ID_RESULT : result;
    }

    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams parseFrom(
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
    public static Builder newBuilder(greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams prototype) {
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
     * Protobuf type {@code greco.PostprocessSpeakerIdParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.PostprocessSpeakerIdParams)
        greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.PostprocessSpeakeridStream.internal_static_greco_PostprocessSpeakerIdParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.PostprocessSpeakeridStream.internal_static_greco_PostprocessSpeakerIdParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.class, greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.Builder.class);
      }

      // Construct using greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.newBuilder()
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
        profilesIoRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        smartModeEnrollUtts_ = 50;
        bitField0_ = (bitField0_ & ~0x00000002);
        outputEventType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.PostprocessSpeakeridStream.internal_static_greco_PostprocessSpeakerIdParams_descriptor;
      }

      @java.lang.Override
      public greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams getDefaultInstanceForType() {
        return greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams build() {
        greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams buildPartial() {
        greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams result = new greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.profilesIoRef_ = profilesIoRef_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.smartModeEnrollUtts_ = smartModeEnrollUtts_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.outputEventType_ = outputEventType_;
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

      private java.lang.Object profilesIoRef_ = "";
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @return Whether the profilesIoRef field is set.
       */
      public boolean hasProfilesIoRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @return The profilesIoRef.
       */
      public java.lang.String getProfilesIoRef() {
        java.lang.Object ref = profilesIoRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            profilesIoRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @return The bytes for profilesIoRef.
       */
      public com.google.protobuf.ByteString
          getProfilesIoRefBytes() {
        java.lang.Object ref = profilesIoRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          profilesIoRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @param value The profilesIoRef to set.
       * @return This builder for chaining.
       */
      public Builder setProfilesIoRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        profilesIoRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProfilesIoRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        profilesIoRef_ = getDefaultInstance().getProfilesIoRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string profiles_io_ref = 1;</code>
       * @param value The bytes for profilesIoRef to set.
       * @return This builder for chaining.
       */
      public Builder setProfilesIoRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        profilesIoRef_ = value;
        onChanged();
        return this;
      }

      private int smartModeEnrollUtts_ = 50;
      /**
       * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
       * @return Whether the smartModeEnrollUtts field is set.
       */
      @java.lang.Override
      public boolean hasSmartModeEnrollUtts() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
       * @return The smartModeEnrollUtts.
       */
      @java.lang.Override
      public int getSmartModeEnrollUtts() {
        return smartModeEnrollUtts_;
      }
      /**
       * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
       * @param value The smartModeEnrollUtts to set.
       * @return This builder for chaining.
       */
      public Builder setSmartModeEnrollUtts(int value) {
        bitField0_ |= 0x00000002;
        smartModeEnrollUtts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 smart_mode_enroll_utts = 2 [default = 50];</code>
       * @return This builder for chaining.
       */
      public Builder clearSmartModeEnrollUtts() {
        bitField0_ = (bitField0_ & ~0x00000002);
        smartModeEnrollUtts_ = 50;
        onChanged();
        return this;
      }

      private int outputEventType_ = 0;
      /**
       * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
       * @return Whether the outputEventType field is set.
       */
      @java.lang.Override public boolean hasOutputEventType() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
       * @return The outputEventType.
       */
      @java.lang.Override
      public greco.PostprocessSpeakeridStream.OutputEventType getOutputEventType() {
        @SuppressWarnings("deprecation")
        greco.PostprocessSpeakeridStream.OutputEventType result = greco.PostprocessSpeakeridStream.OutputEventType.valueOf(outputEventType_);
        return result == null ? greco.PostprocessSpeakeridStream.OutputEventType.SPEAKER_ID_RESULT : result;
      }
      /**
       * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
       * @param value The outputEventType to set.
       * @return This builder for chaining.
       */
      public Builder setOutputEventType(greco.PostprocessSpeakeridStream.OutputEventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        outputEventType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.OutputEventType output_event_type = 3 [default = SPEAKER_ID_RESULT];</code>
       * @return This builder for chaining.
       */
      public Builder clearOutputEventType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        outputEventType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:greco.PostprocessSpeakerIdParams)
    }

    // @@protoc_insertion_point(class_scope:greco.PostprocessSpeakerIdParams)
    private static final greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams();
    }

    public static greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PostprocessSpeakerIdParams>
        PARSER = new com.google.protobuf.AbstractParser<PostprocessSpeakerIdParams>() {
      @java.lang.Override
      public PostprocessSpeakerIdParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<PostprocessSpeakerIdParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PostprocessSpeakerIdParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 78803860;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.getDefaultInstance(),
          0,
          greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.class,
          greco.PostprocessSpeakeridStream.PostprocessSpeakerIdParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_PostprocessSpeakerIdParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_PostprocessSpeakerIdParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:speech/greco3/speakerid/postprocess_sp" +
      "eakerid_stream.proto\022\005greco\032\037speech/grec" +
      "o3/core/params.proto\"\340\001\n\032PostprocessSpea" +
      "kerIdParams\022\027\n\017profiles_io_ref\030\001 \001(\t\022\"\n\026" +
      "smart_mode_enroll_utts\030\002 \001(\005:\00250\022D\n\021outp" +
      "ut_event_type\030\003 \001(\0162\026.greco.OutputEventT" +
      "ype:\021SPEAKER_ID_RESULT2?\n\002id\022\r.greco.Par" +
      "ams\030\224\347\311% \001(\0132!.greco.PostprocessSpeakerI" +
      "dParams*A\n\017OutputEventType\022\025\n\021SPEAKER_ID" +
      "_RESULT\020\000\022\027\n\023VERIFICATION_RESULT\020\001B\010H\002\242\002" +
      "\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_PostprocessSpeakerIdParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_PostprocessSpeakerIdParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_PostprocessSpeakerIdParams_descriptor,
        new java.lang.String[] { "ProfilesIoRef", "SmartModeEnrollUtts", "OutputEventType", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
