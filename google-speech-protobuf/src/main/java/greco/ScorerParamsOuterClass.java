// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/acoustic_model/scorer_params.proto

package greco;

public final class ScorerParamsOuterClass {
  private ScorerParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.ScorerParamsOuterClass.ScorerParams.id);
    registry.add(greco.ScorerParamsOuterClass.ScorerParams.logId);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScorerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.ScorerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return Whether the acousticModelRef field is set.
     */
    boolean hasAcousticModelRef();
    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return The acousticModelRef.
     */
    java.lang.String getAcousticModelRef();
    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return The bytes for acousticModelRef.
     */
    com.google.protobuf.ByteString
        getAcousticModelRefBytes();

    /**
     * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
     * @return Whether the gaussSelectionCentroids field is set.
     */
    boolean hasGaussSelectionCentroids();
    /**
     * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
     * @return The gaussSelectionCentroids.
     */
    int getGaussSelectionCentroids();

    /**
     * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
     * @return Whether the scorerType field is set.
     */
    boolean hasScorerType();
    /**
     * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
     * @return The scorerType.
     */
    greco.ScorerTypeOuterClass.ScorerType getScorerType();

    /**
     * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
     * @return Whether the gaussSelectionScorerType field is set.
     */
    boolean hasGaussSelectionScorerType();
    /**
     * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
     * @return The gaussSelectionScorerType.
     */
    greco.ScorerTypeOuterClass.ScorerType getGaussSelectionScorerType();

    /**
     * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
     * @return Whether the numBatchFrames field is set.
     */
    boolean hasNumBatchFrames();
    /**
     * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
     * @return The numBatchFrames.
     */
    int getNumBatchFrames();
  }
  /**
   * Protobuf type {@code greco.ScorerParams}
   */
  public static final class ScorerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.ScorerParams)
      ScorerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScorerParams.newBuilder() to construct.
    private ScorerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScorerParams() {
      acousticModelRef_ = "";
      scorerType_ = 0;
      gaussSelectionScorerType_ = 0;
      numBatchFrames_ = 1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScorerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.ScorerParamsOuterClass.internal_static_greco_ScorerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.ScorerParamsOuterClass.internal_static_greco_ScorerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.ScorerParamsOuterClass.ScorerParams.class, greco.ScorerParamsOuterClass.ScorerParams.Builder.class);
    }

    private int bitField0_;
    public static final int ACOUSTIC_MODEL_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object acousticModelRef_;
    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return Whether the acousticModelRef field is set.
     */
    @java.lang.Override
    public boolean hasAcousticModelRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return The acousticModelRef.
     */
    @java.lang.Override
    public java.lang.String getAcousticModelRef() {
      java.lang.Object ref = acousticModelRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          acousticModelRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string acoustic_model_ref = 1;</code>
     * @return The bytes for acousticModelRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAcousticModelRefBytes() {
      java.lang.Object ref = acousticModelRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acousticModelRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GAUSS_SELECTION_CENTROIDS_FIELD_NUMBER = 2;
    private int gaussSelectionCentroids_;
    /**
     * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
     * @return Whether the gaussSelectionCentroids field is set.
     */
    @java.lang.Override
    public boolean hasGaussSelectionCentroids() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
     * @return The gaussSelectionCentroids.
     */
    @java.lang.Override
    public int getGaussSelectionCentroids() {
      return gaussSelectionCentroids_;
    }

    public static final int SCORER_TYPE_FIELD_NUMBER = 3;
    private int scorerType_;
    /**
     * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
     * @return Whether the scorerType field is set.
     */
    @java.lang.Override public boolean hasScorerType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
     * @return The scorerType.
     */
    @java.lang.Override public greco.ScorerTypeOuterClass.ScorerType getScorerType() {
      @SuppressWarnings("deprecation")
      greco.ScorerTypeOuterClass.ScorerType result = greco.ScorerTypeOuterClass.ScorerType.valueOf(scorerType_);
      return result == null ? greco.ScorerTypeOuterClass.ScorerType.MAX : result;
    }

    public static final int GAUSS_SELECTION_SCORER_TYPE_FIELD_NUMBER = 4;
    private int gaussSelectionScorerType_;
    /**
     * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
     * @return Whether the gaussSelectionScorerType field is set.
     */
    @java.lang.Override public boolean hasGaussSelectionScorerType() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
     * @return The gaussSelectionScorerType.
     */
    @java.lang.Override public greco.ScorerTypeOuterClass.ScorerType getGaussSelectionScorerType() {
      @SuppressWarnings("deprecation")
      greco.ScorerTypeOuterClass.ScorerType result = greco.ScorerTypeOuterClass.ScorerType.valueOf(gaussSelectionScorerType_);
      return result == null ? greco.ScorerTypeOuterClass.ScorerType.MAX : result;
    }

    public static final int NUM_BATCH_FRAMES_FIELD_NUMBER = 5;
    private int numBatchFrames_;
    /**
     * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
     * @return Whether the numBatchFrames field is set.
     */
    @java.lang.Override
    public boolean hasNumBatchFrames() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
     * @return The numBatchFrames.
     */
    @java.lang.Override
    public int getNumBatchFrames() {
      return numBatchFrames_;
    }

    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ScorerParamsOuterClass.ScorerParams parseFrom(
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
    public static Builder newBuilder(greco.ScorerParamsOuterClass.ScorerParams prototype) {
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
     * Protobuf type {@code greco.ScorerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.ScorerParams)
        greco.ScorerParamsOuterClass.ScorerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.ScorerParamsOuterClass.internal_static_greco_ScorerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.ScorerParamsOuterClass.internal_static_greco_ScorerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.ScorerParamsOuterClass.ScorerParams.class, greco.ScorerParamsOuterClass.ScorerParams.Builder.class);
      }

      // Construct using greco.ScorerParamsOuterClass.ScorerParams.newBuilder()
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
        acousticModelRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        gaussSelectionCentroids_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        scorerType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        gaussSelectionScorerType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        numBatchFrames_ = 1;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.ScorerParamsOuterClass.internal_static_greco_ScorerParams_descriptor;
      }

      @java.lang.Override
      public greco.ScorerParamsOuterClass.ScorerParams getDefaultInstanceForType() {
        return greco.ScorerParamsOuterClass.ScorerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.ScorerParamsOuterClass.ScorerParams build() {
        greco.ScorerParamsOuterClass.ScorerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.ScorerParamsOuterClass.ScorerParams buildPartial() {
        greco.ScorerParamsOuterClass.ScorerParams result = new greco.ScorerParamsOuterClass.ScorerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.acousticModelRef_ = acousticModelRef_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gaussSelectionCentroids_ = gaussSelectionCentroids_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.scorerType_ = scorerType_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.gaussSelectionScorerType_ = gaussSelectionScorerType_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.numBatchFrames_ = numBatchFrames_;
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

      private java.lang.Object acousticModelRef_ = "";
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @return Whether the acousticModelRef field is set.
       */
      public boolean hasAcousticModelRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @return The acousticModelRef.
       */
      public java.lang.String getAcousticModelRef() {
        java.lang.Object ref = acousticModelRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            acousticModelRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @return The bytes for acousticModelRef.
       */
      public com.google.protobuf.ByteString
          getAcousticModelRefBytes() {
        java.lang.Object ref = acousticModelRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          acousticModelRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @param value The acousticModelRef to set.
       * @return This builder for chaining.
       */
      public Builder setAcousticModelRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        acousticModelRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAcousticModelRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        acousticModelRef_ = getDefaultInstance().getAcousticModelRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string acoustic_model_ref = 1;</code>
       * @param value The bytes for acousticModelRef to set.
       * @return This builder for chaining.
       */
      public Builder setAcousticModelRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        acousticModelRef_ = value;
        onChanged();
        return this;
      }

      private int gaussSelectionCentroids_ ;
      /**
       * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
       * @return Whether the gaussSelectionCentroids field is set.
       */
      @java.lang.Override
      public boolean hasGaussSelectionCentroids() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
       * @return The gaussSelectionCentroids.
       */
      @java.lang.Override
      public int getGaussSelectionCentroids() {
        return gaussSelectionCentroids_;
      }
      /**
       * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
       * @param value The gaussSelectionCentroids to set.
       * @return This builder for chaining.
       */
      public Builder setGaussSelectionCentroids(int value) {
        bitField0_ |= 0x00000002;
        gaussSelectionCentroids_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 gauss_selection_centroids = 2 [default = 0];</code>
       * @return This builder for chaining.
       */
      public Builder clearGaussSelectionCentroids() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gaussSelectionCentroids_ = 0;
        onChanged();
        return this;
      }

      private int scorerType_ = 0;
      /**
       * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
       * @return Whether the scorerType field is set.
       */
      @java.lang.Override public boolean hasScorerType() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
       * @return The scorerType.
       */
      @java.lang.Override
      public greco.ScorerTypeOuterClass.ScorerType getScorerType() {
        @SuppressWarnings("deprecation")
        greco.ScorerTypeOuterClass.ScorerType result = greco.ScorerTypeOuterClass.ScorerType.valueOf(scorerType_);
        return result == null ? greco.ScorerTypeOuterClass.ScorerType.MAX : result;
      }
      /**
       * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
       * @param value The scorerType to set.
       * @return This builder for chaining.
       */
      public Builder setScorerType(greco.ScorerTypeOuterClass.ScorerType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        scorerType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.ScorerType scorer_type = 3 [default = MAX];</code>
       * @return This builder for chaining.
       */
      public Builder clearScorerType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        scorerType_ = 0;
        onChanged();
        return this;
      }

      private int gaussSelectionScorerType_ = 0;
      /**
       * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
       * @return Whether the gaussSelectionScorerType field is set.
       */
      @java.lang.Override public boolean hasGaussSelectionScorerType() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
       * @return The gaussSelectionScorerType.
       */
      @java.lang.Override
      public greco.ScorerTypeOuterClass.ScorerType getGaussSelectionScorerType() {
        @SuppressWarnings("deprecation")
        greco.ScorerTypeOuterClass.ScorerType result = greco.ScorerTypeOuterClass.ScorerType.valueOf(gaussSelectionScorerType_);
        return result == null ? greco.ScorerTypeOuterClass.ScorerType.MAX : result;
      }
      /**
       * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
       * @param value The gaussSelectionScorerType to set.
       * @return This builder for chaining.
       */
      public Builder setGaussSelectionScorerType(greco.ScorerTypeOuterClass.ScorerType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        gaussSelectionScorerType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .greco.ScorerType gauss_selection_scorer_type = 4 [default = MAX];</code>
       * @return This builder for chaining.
       */
      public Builder clearGaussSelectionScorerType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gaussSelectionScorerType_ = 0;
        onChanged();
        return this;
      }

      private int numBatchFrames_ = 1;
      /**
       * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
       * @return Whether the numBatchFrames field is set.
       */
      @java.lang.Override
      public boolean hasNumBatchFrames() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
       * @return The numBatchFrames.
       */
      @java.lang.Override
      public int getNumBatchFrames() {
        return numBatchFrames_;
      }
      /**
       * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
       * @param value The numBatchFrames to set.
       * @return This builder for chaining.
       */
      public Builder setNumBatchFrames(int value) {
        bitField0_ |= 0x00000010;
        numBatchFrames_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 num_batch_frames = 5 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearNumBatchFrames() {
        bitField0_ = (bitField0_ & ~0x00000010);
        numBatchFrames_ = 1;
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


      // @@protoc_insertion_point(builder_scope:greco.ScorerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.ScorerParams)
    private static final greco.ScorerParamsOuterClass.ScorerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.ScorerParamsOuterClass.ScorerParams();
    }

    public static greco.ScorerParamsOuterClass.ScorerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ScorerParams>
        PARSER = new com.google.protobuf.AbstractParser<ScorerParams>() {
      @java.lang.Override
      public ScorerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScorerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScorerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.ScorerParamsOuterClass.ScorerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 20456956;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.ScorerParamsOuterClass.ScorerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.ScorerParamsOuterClass.ScorerParams.getDefaultInstance(),
          0,
          greco.ScorerParamsOuterClass.ScorerParams.class,
          greco.ScorerParamsOuterClass.ScorerParams.getDefaultInstance());
    public static final int LOG_ID_FIELD_NUMBER = 29739330;
    /**
     * <code>extend .greco.Loggable { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.LoggableOuterClass.Loggable,
        greco.ScorerParamsOuterClass.ScorerParams> logId = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.ScorerParamsOuterClass.ScorerParams.getDefaultInstance(),
          1,
          greco.ScorerParamsOuterClass.ScorerParams.class,
          greco.ScorerParamsOuterClass.ScorerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_ScorerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_ScorerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0speech/greco3/acoustic_model/scorer_pa" +
      "rams.proto\022\005greco\032.speech/greco3/acousti" +
      "c_model/scorer_type.proto\032!speech/greco3" +
      "/core/loggable.proto\032\037speech/greco3/core" +
      "/params.proto\"\303\002\n\014ScorerParams\022\032\n\022acoust" +
      "ic_model_ref\030\001 \001(\t\022$\n\031gauss_selection_ce" +
      "ntroids\030\002 \001(\005:\0010\022+\n\013scorer_type\030\003 \001(\0162\021." +
      "greco.ScorerType:\003MAX\022;\n\033gauss_selection" +
      "_scorer_type\030\004 \001(\0162\021.greco.ScorerType:\003M" +
      "AX\022\033\n\020num_batch_frames\030\005 \001(\005:\001121\n\002id\022\r." +
      "greco.Params\030\374\313\340\t \001(\0132\023.greco.ScorerPara" +
      "ms27\n\006log_id\022\017.greco.Loggable\030\302\222\227\016 \001(\0132\023" +
      ".greco.ScorerParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ScorerTypeOuterClass.getDescriptor(),
          greco.LoggableOuterClass.getDescriptor(),
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_ScorerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_ScorerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_ScorerParams_descriptor,
        new java.lang.String[] { "AcousticModelRef", "GaussSelectionCentroids", "ScorerType", "GaussSelectionScorerType", "NumBatchFrames", });
    greco.ScorerTypeOuterClass.getDescriptor();
    greco.LoggableOuterClass.getDescriptor();
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
