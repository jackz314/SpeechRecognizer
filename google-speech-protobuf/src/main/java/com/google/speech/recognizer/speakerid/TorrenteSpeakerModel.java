// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/speakerid/torrente_speaker_profile.proto

package com.google.speech.recognizer.speakerid;

/**
 * Protobuf type {@code greco.TorrenteSpeakerModel}
 */
public final class TorrenteSpeakerModel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greco.TorrenteSpeakerModel)
    TorrenteSpeakerModelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TorrenteSpeakerModel.newBuilder() to construct.
  private TorrenteSpeakerModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TorrenteSpeakerModel() {
    verifierName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TorrenteSpeakerModel();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.recognizer.speakerid.TorrenteSpeakerProfileProto.internal_static_greco_TorrenteSpeakerModel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.recognizer.speakerid.TorrenteSpeakerProfileProto.internal_static_greco_TorrenteSpeakerModel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.class, com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.Builder.class);
  }

  private int bitField0_;
  private int modelParamsCase_ = 0;
  private java.lang.Object modelParams_;
  public enum ModelParamsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    IVECTOR_PARAMS(2),
    DVECTOR_PARAMS(3),
    MODELPARAMS_NOT_SET(0);
    private final int value;
    private ModelParamsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModelParamsCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModelParamsCase forNumber(int value) {
      switch (value) {
        case 2: return IVECTOR_PARAMS;
        case 3: return DVECTOR_PARAMS;
        case 0: return MODELPARAMS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ModelParamsCase
  getModelParamsCase() {
    return ModelParamsCase.forNumber(
        modelParamsCase_);
  }

  public static final int VERIFIER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object verifierName_;
  /**
   * <code>optional string verifier_name = 1;</code>
   * @return Whether the verifierName field is set.
   */
  @java.lang.Override
  public boolean hasVerifierName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string verifier_name = 1;</code>
   * @return The verifierName.
   */
  @java.lang.Override
  public java.lang.String getVerifierName() {
    java.lang.Object ref = verifierName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        verifierName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string verifier_name = 1;</code>
   * @return The bytes for verifierName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVerifierNameBytes() {
    java.lang.Object ref = verifierName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verifierName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_TRAINING_UTTERANCES_USED_FIELD_NUMBER = 4;
  private long numTrainingUtterancesUsed_;
  /**
   * <code>optional int64 num_training_utterances_used = 4;</code>
   * @return Whether the numTrainingUtterancesUsed field is set.
   */
  @java.lang.Override
  public boolean hasNumTrainingUtterancesUsed() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 num_training_utterances_used = 4;</code>
   * @return The numTrainingUtterancesUsed.
   */
  @java.lang.Override
  public long getNumTrainingUtterancesUsed() {
    return numTrainingUtterancesUsed_;
  }

  public static final int IVECTOR_PARAMS_FIELD_NUMBER = 2;
  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   * @return Whether the ivectorParams field is set.
   */
  @java.lang.Override
  public boolean hasIvectorParams() {
    return modelParamsCase_ == 2;
  }
  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   * @return The ivectorParams.
   */
  @java.lang.Override
  public greco.Ivector.IvecModelProto getIvectorParams() {
    if (modelParamsCase_ == 2) {
       return (greco.Ivector.IvecModelProto) modelParams_;
    }
    return greco.Ivector.IvecModelProto.getDefaultInstance();
  }
  /**
   * <code>.greco.IvecModelProto ivector_params = 2;</code>
   */
  @java.lang.Override
  public greco.Ivector.IvecModelProtoOrBuilder getIvectorParamsOrBuilder() {
    if (modelParamsCase_ == 2) {
       return (greco.Ivector.IvecModelProto) modelParams_;
    }
    return greco.Ivector.IvecModelProto.getDefaultInstance();
  }

  public static final int DVECTOR_PARAMS_FIELD_NUMBER = 3;
  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   * @return Whether the dvectorParams field is set.
   */
  @java.lang.Override
  public boolean hasDvectorParams() {
    return modelParamsCase_ == 3;
  }
  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   * @return The dvectorParams.
   */
  @java.lang.Override
  public greco.Dvector.DvecModelProto getDvectorParams() {
    if (modelParamsCase_ == 3) {
       return (greco.Dvector.DvecModelProto) modelParams_;
    }
    return greco.Dvector.DvecModelProto.getDefaultInstance();
  }
  /**
   * <code>.greco.DvecModelProto dvector_params = 3;</code>
   */
  @java.lang.Override
  public greco.Dvector.DvecModelProtoOrBuilder getDvectorParamsOrBuilder() {
    if (modelParamsCase_ == 3) {
       return (greco.Dvector.DvecModelProto) modelParams_;
    }
    return greco.Dvector.DvecModelProto.getDefaultInstance();
  }

  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel parseFrom(
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
  public static Builder newBuilder(com.google.speech.recognizer.speakerid.TorrenteSpeakerModel prototype) {
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
   * Protobuf type {@code greco.TorrenteSpeakerModel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greco.TorrenteSpeakerModel)
      com.google.speech.recognizer.speakerid.TorrenteSpeakerModelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.recognizer.speakerid.TorrenteSpeakerProfileProto.internal_static_greco_TorrenteSpeakerModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.recognizer.speakerid.TorrenteSpeakerProfileProto.internal_static_greco_TorrenteSpeakerModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.class, com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.Builder.class);
    }

    // Construct using com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.newBuilder()
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
      verifierName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      numTrainingUtterancesUsed_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      modelParamsCase_ = 0;
      modelParams_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.recognizer.speakerid.TorrenteSpeakerProfileProto.internal_static_greco_TorrenteSpeakerModel_descriptor;
    }

    @java.lang.Override
    public com.google.speech.recognizer.speakerid.TorrenteSpeakerModel getDefaultInstanceForType() {
      return com.google.speech.recognizer.speakerid.TorrenteSpeakerModel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.recognizer.speakerid.TorrenteSpeakerModel build() {
      com.google.speech.recognizer.speakerid.TorrenteSpeakerModel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.recognizer.speakerid.TorrenteSpeakerModel buildPartial() {
      com.google.speech.recognizer.speakerid.TorrenteSpeakerModel result = new com.google.speech.recognizer.speakerid.TorrenteSpeakerModel(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.verifierName_ = verifierName_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numTrainingUtterancesUsed_ = numTrainingUtterancesUsed_;
        to_bitField0_ |= 0x00000002;
      }
      if (modelParamsCase_ == 2) {
        if (ivectorParamsBuilder_ == null) {
          result.modelParams_ = modelParams_;
        } else {
          result.modelParams_ = ivectorParamsBuilder_.build();
        }
      }
      if (modelParamsCase_ == 3) {
        if (dvectorParamsBuilder_ == null) {
          result.modelParams_ = modelParams_;
        } else {
          result.modelParams_ = dvectorParamsBuilder_.build();
        }
      }
      result.bitField0_ = to_bitField0_;
      result.modelParamsCase_ = modelParamsCase_;
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
    private int modelParamsCase_ = 0;
    private java.lang.Object modelParams_;
    public ModelParamsCase
        getModelParamsCase() {
      return ModelParamsCase.forNumber(
          modelParamsCase_);
    }

    public Builder clearModelParams() {
      modelParamsCase_ = 0;
      modelParams_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object verifierName_ = "";
    /**
     * <code>optional string verifier_name = 1;</code>
     * @return Whether the verifierName field is set.
     */
    public boolean hasVerifierName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string verifier_name = 1;</code>
     * @return The verifierName.
     */
    public java.lang.String getVerifierName() {
      java.lang.Object ref = verifierName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verifierName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string verifier_name = 1;</code>
     * @return The bytes for verifierName.
     */
    public com.google.protobuf.ByteString
        getVerifierNameBytes() {
      java.lang.Object ref = verifierName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verifierName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string verifier_name = 1;</code>
     * @param value The verifierName to set.
     * @return This builder for chaining.
     */
    public Builder setVerifierName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      verifierName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string verifier_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerifierName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      verifierName_ = getDefaultInstance().getVerifierName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string verifier_name = 1;</code>
     * @param value The bytes for verifierName to set.
     * @return This builder for chaining.
     */
    public Builder setVerifierNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      verifierName_ = value;
      onChanged();
      return this;
    }

    private long numTrainingUtterancesUsed_ ;
    /**
     * <code>optional int64 num_training_utterances_used = 4;</code>
     * @return Whether the numTrainingUtterancesUsed field is set.
     */
    @java.lang.Override
    public boolean hasNumTrainingUtterancesUsed() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 num_training_utterances_used = 4;</code>
     * @return The numTrainingUtterancesUsed.
     */
    @java.lang.Override
    public long getNumTrainingUtterancesUsed() {
      return numTrainingUtterancesUsed_;
    }
    /**
     * <code>optional int64 num_training_utterances_used = 4;</code>
     * @param value The numTrainingUtterancesUsed to set.
     * @return This builder for chaining.
     */
    public Builder setNumTrainingUtterancesUsed(long value) {
      bitField0_ |= 0x00000002;
      numTrainingUtterancesUsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 num_training_utterances_used = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTrainingUtterancesUsed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numTrainingUtterancesUsed_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        greco.Ivector.IvecModelProto, greco.Ivector.IvecModelProto.Builder, greco.Ivector.IvecModelProtoOrBuilder> ivectorParamsBuilder_;
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     * @return Whether the ivectorParams field is set.
     */
    @java.lang.Override
    public boolean hasIvectorParams() {
      return modelParamsCase_ == 2;
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     * @return The ivectorParams.
     */
    @java.lang.Override
    public greco.Ivector.IvecModelProto getIvectorParams() {
      if (ivectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 2) {
          return (greco.Ivector.IvecModelProto) modelParams_;
        }
        return greco.Ivector.IvecModelProto.getDefaultInstance();
      } else {
        if (modelParamsCase_ == 2) {
          return ivectorParamsBuilder_.getMessage();
        }
        return greco.Ivector.IvecModelProto.getDefaultInstance();
      }
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    public Builder setIvectorParams(greco.Ivector.IvecModelProto value) {
      if (ivectorParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelParams_ = value;
        onChanged();
      } else {
        ivectorParamsBuilder_.setMessage(value);
      }
      modelParamsCase_ = 2;
      return this;
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    public Builder setIvectorParams(
        greco.Ivector.IvecModelProto.Builder builderForValue) {
      if (ivectorParamsBuilder_ == null) {
        modelParams_ = builderForValue.build();
        onChanged();
      } else {
        ivectorParamsBuilder_.setMessage(builderForValue.build());
      }
      modelParamsCase_ = 2;
      return this;
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    public Builder mergeIvectorParams(greco.Ivector.IvecModelProto value) {
      if (ivectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 2 &&
            modelParams_ != greco.Ivector.IvecModelProto.getDefaultInstance()) {
          modelParams_ = greco.Ivector.IvecModelProto.newBuilder((greco.Ivector.IvecModelProto) modelParams_)
              .mergeFrom(value).buildPartial();
        } else {
          modelParams_ = value;
        }
        onChanged();
      } else {
        if (modelParamsCase_ == 2) {
          ivectorParamsBuilder_.mergeFrom(value);
        }
        ivectorParamsBuilder_.setMessage(value);
      }
      modelParamsCase_ = 2;
      return this;
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    public Builder clearIvectorParams() {
      if (ivectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 2) {
          modelParamsCase_ = 0;
          modelParams_ = null;
          onChanged();
        }
      } else {
        if (modelParamsCase_ == 2) {
          modelParamsCase_ = 0;
          modelParams_ = null;
        }
        ivectorParamsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    public greco.Ivector.IvecModelProto.Builder getIvectorParamsBuilder() {
      return getIvectorParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    @java.lang.Override
    public greco.Ivector.IvecModelProtoOrBuilder getIvectorParamsOrBuilder() {
      if ((modelParamsCase_ == 2) && (ivectorParamsBuilder_ != null)) {
        return ivectorParamsBuilder_.getMessageOrBuilder();
      } else {
        if (modelParamsCase_ == 2) {
          return (greco.Ivector.IvecModelProto) modelParams_;
        }
        return greco.Ivector.IvecModelProto.getDefaultInstance();
      }
    }
    /**
     * <code>.greco.IvecModelProto ivector_params = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        greco.Ivector.IvecModelProto, greco.Ivector.IvecModelProto.Builder, greco.Ivector.IvecModelProtoOrBuilder> 
        getIvectorParamsFieldBuilder() {
      if (ivectorParamsBuilder_ == null) {
        if (!(modelParamsCase_ == 2)) {
          modelParams_ = greco.Ivector.IvecModelProto.getDefaultInstance();
        }
        ivectorParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            greco.Ivector.IvecModelProto, greco.Ivector.IvecModelProto.Builder, greco.Ivector.IvecModelProtoOrBuilder>(
                (greco.Ivector.IvecModelProto) modelParams_,
                getParentForChildren(),
                isClean());
        modelParams_ = null;
      }
      modelParamsCase_ = 2;
      onChanged();;
      return ivectorParamsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        greco.Dvector.DvecModelProto, greco.Dvector.DvecModelProto.Builder, greco.Dvector.DvecModelProtoOrBuilder> dvectorParamsBuilder_;
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     * @return Whether the dvectorParams field is set.
     */
    @java.lang.Override
    public boolean hasDvectorParams() {
      return modelParamsCase_ == 3;
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     * @return The dvectorParams.
     */
    @java.lang.Override
    public greco.Dvector.DvecModelProto getDvectorParams() {
      if (dvectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 3) {
          return (greco.Dvector.DvecModelProto) modelParams_;
        }
        return greco.Dvector.DvecModelProto.getDefaultInstance();
      } else {
        if (modelParamsCase_ == 3) {
          return dvectorParamsBuilder_.getMessage();
        }
        return greco.Dvector.DvecModelProto.getDefaultInstance();
      }
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    public Builder setDvectorParams(greco.Dvector.DvecModelProto value) {
      if (dvectorParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelParams_ = value;
        onChanged();
      } else {
        dvectorParamsBuilder_.setMessage(value);
      }
      modelParamsCase_ = 3;
      return this;
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    public Builder setDvectorParams(
        greco.Dvector.DvecModelProto.Builder builderForValue) {
      if (dvectorParamsBuilder_ == null) {
        modelParams_ = builderForValue.build();
        onChanged();
      } else {
        dvectorParamsBuilder_.setMessage(builderForValue.build());
      }
      modelParamsCase_ = 3;
      return this;
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    public Builder mergeDvectorParams(greco.Dvector.DvecModelProto value) {
      if (dvectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 3 &&
            modelParams_ != greco.Dvector.DvecModelProto.getDefaultInstance()) {
          modelParams_ = greco.Dvector.DvecModelProto.newBuilder((greco.Dvector.DvecModelProto) modelParams_)
              .mergeFrom(value).buildPartial();
        } else {
          modelParams_ = value;
        }
        onChanged();
      } else {
        if (modelParamsCase_ == 3) {
          dvectorParamsBuilder_.mergeFrom(value);
        }
        dvectorParamsBuilder_.setMessage(value);
      }
      modelParamsCase_ = 3;
      return this;
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    public Builder clearDvectorParams() {
      if (dvectorParamsBuilder_ == null) {
        if (modelParamsCase_ == 3) {
          modelParamsCase_ = 0;
          modelParams_ = null;
          onChanged();
        }
      } else {
        if (modelParamsCase_ == 3) {
          modelParamsCase_ = 0;
          modelParams_ = null;
        }
        dvectorParamsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    public greco.Dvector.DvecModelProto.Builder getDvectorParamsBuilder() {
      return getDvectorParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    @java.lang.Override
    public greco.Dvector.DvecModelProtoOrBuilder getDvectorParamsOrBuilder() {
      if ((modelParamsCase_ == 3) && (dvectorParamsBuilder_ != null)) {
        return dvectorParamsBuilder_.getMessageOrBuilder();
      } else {
        if (modelParamsCase_ == 3) {
          return (greco.Dvector.DvecModelProto) modelParams_;
        }
        return greco.Dvector.DvecModelProto.getDefaultInstance();
      }
    }
    /**
     * <code>.greco.DvecModelProto dvector_params = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        greco.Dvector.DvecModelProto, greco.Dvector.DvecModelProto.Builder, greco.Dvector.DvecModelProtoOrBuilder> 
        getDvectorParamsFieldBuilder() {
      if (dvectorParamsBuilder_ == null) {
        if (!(modelParamsCase_ == 3)) {
          modelParams_ = greco.Dvector.DvecModelProto.getDefaultInstance();
        }
        dvectorParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            greco.Dvector.DvecModelProto, greco.Dvector.DvecModelProto.Builder, greco.Dvector.DvecModelProtoOrBuilder>(
                (greco.Dvector.DvecModelProto) modelParams_,
                getParentForChildren(),
                isClean());
        modelParams_ = null;
      }
      modelParamsCase_ = 3;
      onChanged();;
      return dvectorParamsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:greco.TorrenteSpeakerModel)
  }

  // @@protoc_insertion_point(class_scope:greco.TorrenteSpeakerModel)
  private static final com.google.speech.recognizer.speakerid.TorrenteSpeakerModel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.recognizer.speakerid.TorrenteSpeakerModel();
  }

  public static com.google.speech.recognizer.speakerid.TorrenteSpeakerModel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TorrenteSpeakerModel>
      PARSER = new com.google.protobuf.AbstractParser<TorrenteSpeakerModel>() {
    @java.lang.Override
    public TorrenteSpeakerModel parsePartialFrom(
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

  public static com.google.protobuf.Parser<TorrenteSpeakerModel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TorrenteSpeakerModel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.recognizer.speakerid.TorrenteSpeakerModel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

