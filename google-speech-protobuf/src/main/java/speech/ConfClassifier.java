// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/decoder/confidence/conf_classifier.proto

package speech;

public final class ConfClassifier {
  private ConfClassifier() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LinearClassifierParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:speech.LinearClassifierParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required float constant_term = 1;</code>
     * @return Whether the constantTerm field is set.
     */
    boolean hasConstantTerm();
    /**
     * <code>required float constant_term = 1;</code>
     * @return The constantTerm.
     */
    float getConstantTerm();

    /**
     * <code>repeated float weights = 2;</code>
     * @return A list containing the weights.
     */
    java.util.List<java.lang.Float> getWeightsList();
    /**
     * <code>repeated float weights = 2;</code>
     * @return The count of weights.
     */
    int getWeightsCount();
    /**
     * <code>repeated float weights = 2;</code>
     * @param index The index of the element to return.
     * @return The weights at the given index.
     */
    float getWeights(int index);
  }
  /**
   * Protobuf type {@code speech.LinearClassifierParam}
   */
  public static final class LinearClassifierParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:speech.LinearClassifierParam)
      LinearClassifierParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LinearClassifierParam.newBuilder() to construct.
    private LinearClassifierParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LinearClassifierParam() {
      weights_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LinearClassifierParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return speech.ConfClassifier.internal_static_speech_LinearClassifierParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return speech.ConfClassifier.internal_static_speech_LinearClassifierParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              speech.ConfClassifier.LinearClassifierParam.class, speech.ConfClassifier.LinearClassifierParam.Builder.class);
    }

    private int bitField0_;
    public static final int CONSTANT_TERM_FIELD_NUMBER = 1;
    private float constantTerm_;
    /**
     * <code>required float constant_term = 1;</code>
     * @return Whether the constantTerm field is set.
     */
    @java.lang.Override
    public boolean hasConstantTerm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required float constant_term = 1;</code>
     * @return The constantTerm.
     */
    @java.lang.Override
    public float getConstantTerm() {
      return constantTerm_;
    }

    public static final int WEIGHTS_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.FloatList weights_;
    /**
     * <code>repeated float weights = 2;</code>
     * @return A list containing the weights.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getWeightsList() {
      return weights_;
    }
    /**
     * <code>repeated float weights = 2;</code>
     * @return The count of weights.
     */
    public int getWeightsCount() {
      return weights_.size();
    }
    /**
     * <code>repeated float weights = 2;</code>
     * @param index The index of the element to return.
     * @return The weights at the given index.
     */
    public float getWeights(int index) {
      return weights_.getFloat(index);
    }

    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static speech.ConfClassifier.LinearClassifierParam parseFrom(
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
    public static Builder newBuilder(speech.ConfClassifier.LinearClassifierParam prototype) {
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
     * Protobuf type {@code speech.LinearClassifierParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:speech.LinearClassifierParam)
        speech.ConfClassifier.LinearClassifierParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return speech.ConfClassifier.internal_static_speech_LinearClassifierParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return speech.ConfClassifier.internal_static_speech_LinearClassifierParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                speech.ConfClassifier.LinearClassifierParam.class, speech.ConfClassifier.LinearClassifierParam.Builder.class);
      }

      // Construct using speech.ConfClassifier.LinearClassifierParam.newBuilder()
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
        constantTerm_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        weights_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return speech.ConfClassifier.internal_static_speech_LinearClassifierParam_descriptor;
      }

      @java.lang.Override
      public speech.ConfClassifier.LinearClassifierParam getDefaultInstanceForType() {
        return speech.ConfClassifier.LinearClassifierParam.getDefaultInstance();
      }

      @java.lang.Override
      public speech.ConfClassifier.LinearClassifierParam build() {
        speech.ConfClassifier.LinearClassifierParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public speech.ConfClassifier.LinearClassifierParam buildPartial() {
        speech.ConfClassifier.LinearClassifierParam result = new speech.ConfClassifier.LinearClassifierParam(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.constantTerm_ = constantTerm_;
          to_bitField0_ |= 0x00000001;
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          weights_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.weights_ = weights_;
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

      private float constantTerm_ ;
      /**
       * <code>required float constant_term = 1;</code>
       * @return Whether the constantTerm field is set.
       */
      @java.lang.Override
      public boolean hasConstantTerm() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required float constant_term = 1;</code>
       * @return The constantTerm.
       */
      @java.lang.Override
      public float getConstantTerm() {
        return constantTerm_;
      }
      /**
       * <code>required float constant_term = 1;</code>
       * @param value The constantTerm to set.
       * @return This builder for chaining.
       */
      public Builder setConstantTerm(float value) {
        bitField0_ |= 0x00000001;
        constantTerm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float constant_term = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearConstantTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        constantTerm_ = 0F;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList weights_ = emptyFloatList();
      private void ensureWeightsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          weights_ = mutableCopy(weights_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @return A list containing the weights.
       */
      public java.util.List<java.lang.Float>
          getWeightsList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(weights_) : weights_;
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @return The count of weights.
       */
      public int getWeightsCount() {
        return weights_.size();
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @param index The index of the element to return.
       * @return The weights at the given index.
       */
      public float getWeights(int index) {
        return weights_.getFloat(index);
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @param index The index to set the value at.
       * @param value The weights to set.
       * @return This builder for chaining.
       */
      public Builder setWeights(
          int index, float value) {
        ensureWeightsIsMutable();
        weights_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @param value The weights to add.
       * @return This builder for chaining.
       */
      public Builder addWeights(float value) {
        ensureWeightsIsMutable();
        weights_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @param values The weights to add.
       * @return This builder for chaining.
       */
      public Builder addAllWeights(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureWeightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, weights_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float weights = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeights() {
        weights_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:speech.LinearClassifierParam)
    }

    // @@protoc_insertion_point(class_scope:speech.LinearClassifierParam)
    private static final speech.ConfClassifier.LinearClassifierParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new speech.ConfClassifier.LinearClassifierParam();
    }

    public static speech.ConfClassifier.LinearClassifierParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<LinearClassifierParam>
        PARSER = new com.google.protobuf.AbstractParser<LinearClassifierParam>() {
      @java.lang.Override
      public LinearClassifierParam parsePartialFrom(
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

    public static com.google.protobuf.Parser<LinearClassifierParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LinearClassifierParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public speech.ConfClassifier.LinearClassifierParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speech_LinearClassifierParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speech_LinearClassifierParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/speech/decoder/confidence/conf_classif" +
      "ier.proto\022\006speech\"?\n\025LinearClassifierPar" +
      "am\022\025\n\rconstant_term\030\001 \002(\002\022\017\n\007weights\030\002 \003" +
      "(\002B\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_speech_LinearClassifierParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speech_LinearClassifierParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speech_LinearClassifierParam_descriptor,
        new java.lang.String[] { "ConstantTerm", "Weights", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
