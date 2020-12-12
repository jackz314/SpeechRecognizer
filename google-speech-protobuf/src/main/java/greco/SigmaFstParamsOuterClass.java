// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/fst/sigma_fst_params.proto

package greco;

public final class SigmaFstParamsOuterClass {
  private SigmaFstParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.SigmaFstParamsOuterClass.SigmaFstParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SigmaFstParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.SigmaFstParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 first_label = 3 [default = 1];</code>
     * @return Whether the firstLabel field is set.
     */
    boolean hasFirstLabel();
    /**
     * <code>optional int32 first_label = 3 [default = 1];</code>
     * @return The firstLabel.
     */
    int getFirstLabel();

    /**
     * <code>optional bool sigma_plus = 4;</code>
     * @return Whether the sigmaPlus field is set.
     */
    boolean hasSigmaPlus();
    /**
     * <code>optional bool sigma_plus = 4;</code>
     * @return The sigmaPlus.
     */
    boolean getSigmaPlus();

    /**
     * <code>optional float empty_weight = 5;</code>
     * @return Whether the emptyWeight field is set.
     */
    boolean hasEmptyWeight();
    /**
     * <code>optional float empty_weight = 5;</code>
     * @return The emptyWeight.
     */
    float getEmptyWeight();

    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return Whether the symbolTableRef field is set.
     */
    boolean hasSymbolTableRef();
    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return The symbolTableRef.
     */
    java.lang.String getSymbolTableRef();
    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return The bytes for symbolTableRef.
     */
    com.google.protobuf.ByteString
        getSymbolTableRefBytes();

    /**
     * <code>int32 num_labels = 2;</code>
     * @return Whether the numLabels field is set.
     */
    boolean hasNumLabels();
    /**
     * <code>int32 num_labels = 2;</code>
     * @return The numLabels.
     */
    int getNumLabels();

    public greco.SigmaFstParamsOuterClass.SigmaFstParams.LabelsCase getLabelsCase();
  }
  /**
   * Protobuf type {@code greco.SigmaFstParams}
   */
  public static final class SigmaFstParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.SigmaFstParams)
      SigmaFstParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SigmaFstParams.newBuilder() to construct.
    private SigmaFstParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SigmaFstParams() {
      firstLabel_ = 1;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SigmaFstParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.SigmaFstParamsOuterClass.internal_static_greco_SigmaFstParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.SigmaFstParamsOuterClass.internal_static_greco_SigmaFstParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.SigmaFstParamsOuterClass.SigmaFstParams.class, greco.SigmaFstParamsOuterClass.SigmaFstParams.Builder.class);
    }

    private int bitField0_;
    private int labelsCase_ = 0;
    private java.lang.Object labels_;
    public enum LabelsCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      SYMBOL_TABLE_REF(1),
      NUM_LABELS(2),
      LABELS_NOT_SET(0);
      private final int value;
      private LabelsCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static LabelsCase valueOf(int value) {
        return forNumber(value);
      }

      public static LabelsCase forNumber(int value) {
        switch (value) {
          case 1: return SYMBOL_TABLE_REF;
          case 2: return NUM_LABELS;
          case 0: return LABELS_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public LabelsCase
    getLabelsCase() {
      return LabelsCase.forNumber(
          labelsCase_);
    }

    public static final int FIRST_LABEL_FIELD_NUMBER = 3;
    private int firstLabel_;
    /**
     * <code>optional int32 first_label = 3 [default = 1];</code>
     * @return Whether the firstLabel field is set.
     */
    @java.lang.Override
    public boolean hasFirstLabel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 first_label = 3 [default = 1];</code>
     * @return The firstLabel.
     */
    @java.lang.Override
    public int getFirstLabel() {
      return firstLabel_;
    }

    public static final int SIGMA_PLUS_FIELD_NUMBER = 4;
    private boolean sigmaPlus_;
    /**
     * <code>optional bool sigma_plus = 4;</code>
     * @return Whether the sigmaPlus field is set.
     */
    @java.lang.Override
    public boolean hasSigmaPlus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool sigma_plus = 4;</code>
     * @return The sigmaPlus.
     */
    @java.lang.Override
    public boolean getSigmaPlus() {
      return sigmaPlus_;
    }

    public static final int EMPTY_WEIGHT_FIELD_NUMBER = 5;
    private float emptyWeight_;
    /**
     * <code>optional float empty_weight = 5;</code>
     * @return Whether the emptyWeight field is set.
     */
    @java.lang.Override
    public boolean hasEmptyWeight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional float empty_weight = 5;</code>
     * @return The emptyWeight.
     */
    @java.lang.Override
    public float getEmptyWeight() {
      return emptyWeight_;
    }

    public static final int SYMBOL_TABLE_REF_FIELD_NUMBER = 1;
    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return Whether the symbolTableRef field is set.
     */
    public boolean hasSymbolTableRef() {
      return labelsCase_ == 1;
    }
    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return The symbolTableRef.
     */
    public java.lang.String getSymbolTableRef() {
      java.lang.Object ref = "";
      if (labelsCase_ == 1) {
        ref = labels_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8() && (labelsCase_ == 1)) {
          labels_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string symbol_table_ref = 1;</code>
     * @return The bytes for symbolTableRef.
     */
    public com.google.protobuf.ByteString
        getSymbolTableRefBytes() {
      java.lang.Object ref = "";
      if (labelsCase_ == 1) {
        ref = labels_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (labelsCase_ == 1) {
          labels_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NUM_LABELS_FIELD_NUMBER = 2;
    /**
     * <code>int32 num_labels = 2;</code>
     * @return Whether the numLabels field is set.
     */
    @java.lang.Override
    public boolean hasNumLabels() {
      return labelsCase_ == 2;
    }
    /**
     * <code>int32 num_labels = 2;</code>
     * @return The numLabels.
     */
    @java.lang.Override
    public int getNumLabels() {
      if (labelsCase_ == 2) {
        return (java.lang.Integer) labels_;
      }
      return 0;
    }

    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.SigmaFstParamsOuterClass.SigmaFstParams parseFrom(
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
    public static Builder newBuilder(greco.SigmaFstParamsOuterClass.SigmaFstParams prototype) {
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
     * Protobuf type {@code greco.SigmaFstParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.SigmaFstParams)
        greco.SigmaFstParamsOuterClass.SigmaFstParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.SigmaFstParamsOuterClass.internal_static_greco_SigmaFstParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.SigmaFstParamsOuterClass.internal_static_greco_SigmaFstParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.SigmaFstParamsOuterClass.SigmaFstParams.class, greco.SigmaFstParamsOuterClass.SigmaFstParams.Builder.class);
      }

      // Construct using greco.SigmaFstParamsOuterClass.SigmaFstParams.newBuilder()
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
        firstLabel_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        sigmaPlus_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        emptyWeight_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        labelsCase_ = 0;
        labels_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.SigmaFstParamsOuterClass.internal_static_greco_SigmaFstParams_descriptor;
      }

      @java.lang.Override
      public greco.SigmaFstParamsOuterClass.SigmaFstParams getDefaultInstanceForType() {
        return greco.SigmaFstParamsOuterClass.SigmaFstParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.SigmaFstParamsOuterClass.SigmaFstParams build() {
        greco.SigmaFstParamsOuterClass.SigmaFstParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.SigmaFstParamsOuterClass.SigmaFstParams buildPartial() {
        greco.SigmaFstParamsOuterClass.SigmaFstParams result = new greco.SigmaFstParamsOuterClass.SigmaFstParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.firstLabel_ = firstLabel_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sigmaPlus_ = sigmaPlus_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.emptyWeight_ = emptyWeight_;
          to_bitField0_ |= 0x00000004;
        }
        if (labelsCase_ == 1) {
          result.labels_ = labels_;
        }
        if (labelsCase_ == 2) {
          result.labels_ = labels_;
        }
        result.bitField0_ = to_bitField0_;
        result.labelsCase_ = labelsCase_;
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
      private int labelsCase_ = 0;
      private java.lang.Object labels_;
      public LabelsCase
          getLabelsCase() {
        return LabelsCase.forNumber(
            labelsCase_);
      }

      public Builder clearLabels() {
        labelsCase_ = 0;
        labels_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private int firstLabel_ = 1;
      /**
       * <code>optional int32 first_label = 3 [default = 1];</code>
       * @return Whether the firstLabel field is set.
       */
      @java.lang.Override
      public boolean hasFirstLabel() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 first_label = 3 [default = 1];</code>
       * @return The firstLabel.
       */
      @java.lang.Override
      public int getFirstLabel() {
        return firstLabel_;
      }
      /**
       * <code>optional int32 first_label = 3 [default = 1];</code>
       * @param value The firstLabel to set.
       * @return This builder for chaining.
       */
      public Builder setFirstLabel(int value) {
        bitField0_ |= 0x00000001;
        firstLabel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 first_label = 3 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstLabel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        firstLabel_ = 1;
        onChanged();
        return this;
      }

      private boolean sigmaPlus_ ;
      /**
       * <code>optional bool sigma_plus = 4;</code>
       * @return Whether the sigmaPlus field is set.
       */
      @java.lang.Override
      public boolean hasSigmaPlus() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool sigma_plus = 4;</code>
       * @return The sigmaPlus.
       */
      @java.lang.Override
      public boolean getSigmaPlus() {
        return sigmaPlus_;
      }
      /**
       * <code>optional bool sigma_plus = 4;</code>
       * @param value The sigmaPlus to set.
       * @return This builder for chaining.
       */
      public Builder setSigmaPlus(boolean value) {
        bitField0_ |= 0x00000002;
        sigmaPlus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool sigma_plus = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSigmaPlus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sigmaPlus_ = false;
        onChanged();
        return this;
      }

      private float emptyWeight_ ;
      /**
       * <code>optional float empty_weight = 5;</code>
       * @return Whether the emptyWeight field is set.
       */
      @java.lang.Override
      public boolean hasEmptyWeight() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional float empty_weight = 5;</code>
       * @return The emptyWeight.
       */
      @java.lang.Override
      public float getEmptyWeight() {
        return emptyWeight_;
      }
      /**
       * <code>optional float empty_weight = 5;</code>
       * @param value The emptyWeight to set.
       * @return This builder for chaining.
       */
      public Builder setEmptyWeight(float value) {
        bitField0_ |= 0x00000004;
        emptyWeight_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float empty_weight = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmptyWeight() {
        bitField0_ = (bitField0_ & ~0x00000004);
        emptyWeight_ = 0F;
        onChanged();
        return this;
      }

      /**
       * <code>string symbol_table_ref = 1;</code>
       * @return Whether the symbolTableRef field is set.
       */
      @java.lang.Override
      public boolean hasSymbolTableRef() {
        return labelsCase_ == 1;
      }
      /**
       * <code>string symbol_table_ref = 1;</code>
       * @return The symbolTableRef.
       */
      @java.lang.Override
      public java.lang.String getSymbolTableRef() {
        java.lang.Object ref = "";
        if (labelsCase_ == 1) {
          ref = labels_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (labelsCase_ == 1) {
            if (bs.isValidUtf8()) {
              labels_ = s;
            }
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string symbol_table_ref = 1;</code>
       * @return The bytes for symbolTableRef.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getSymbolTableRefBytes() {
        java.lang.Object ref = "";
        if (labelsCase_ == 1) {
          ref = labels_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (labelsCase_ == 1) {
            labels_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string symbol_table_ref = 1;</code>
       * @param value The symbolTableRef to set.
       * @return This builder for chaining.
       */
      public Builder setSymbolTableRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  labelsCase_ = 1;
        labels_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string symbol_table_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSymbolTableRef() {
        if (labelsCase_ == 1) {
          labelsCase_ = 0;
          labels_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string symbol_table_ref = 1;</code>
       * @param value The bytes for symbolTableRef to set.
       * @return This builder for chaining.
       */
      public Builder setSymbolTableRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  labelsCase_ = 1;
        labels_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>int32 num_labels = 2;</code>
       * @return Whether the numLabels field is set.
       */
      public boolean hasNumLabels() {
        return labelsCase_ == 2;
      }
      /**
       * <code>int32 num_labels = 2;</code>
       * @return The numLabels.
       */
      public int getNumLabels() {
        if (labelsCase_ == 2) {
          return (java.lang.Integer) labels_;
        }
        return 0;
      }
      /**
       * <code>int32 num_labels = 2;</code>
       * @param value The numLabels to set.
       * @return This builder for chaining.
       */
      public Builder setNumLabels(int value) {
        labelsCase_ = 2;
        labels_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 num_labels = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumLabels() {
        if (labelsCase_ == 2) {
          labelsCase_ = 0;
          labels_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:greco.SigmaFstParams)
    }

    // @@protoc_insertion_point(class_scope:greco.SigmaFstParams)
    private static final greco.SigmaFstParamsOuterClass.SigmaFstParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.SigmaFstParamsOuterClass.SigmaFstParams();
    }

    public static greco.SigmaFstParamsOuterClass.SigmaFstParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SigmaFstParams>
        PARSER = new com.google.protobuf.AbstractParser<SigmaFstParams>() {
      @java.lang.Override
      public SigmaFstParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<SigmaFstParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SigmaFstParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.SigmaFstParamsOuterClass.SigmaFstParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 212796148;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.SigmaFstParamsOuterClass.SigmaFstParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.SigmaFstParamsOuterClass.SigmaFstParams.getDefaultInstance(),
          0,
          greco.SigmaFstParamsOuterClass.SigmaFstParams.class,
          greco.SigmaFstParamsOuterClass.SigmaFstParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_SigmaFstParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_SigmaFstParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(speech/greco3/fst/sigma_fst_params.pro" +
      "to\022\005greco\032\037speech/greco3/core/params.pro" +
      "to\"\303\001\n\016SigmaFstParams\022\026\n\013first_label\030\003 \001" +
      "(\005:\0011\022\022\n\nsigma_plus\030\004 \001(\010\022\024\n\014empty_weigh" +
      "t\030\005 \001(\002\022\032\n\020symbol_table_ref\030\001 \001(\tH\000\022\024\n\nn" +
      "um_labels\030\002 \001(\005H\00023\n\002id\022\r.greco.Params\030\364" +
      "\205\274e \001(\0132\025.greco.SigmaFstParamsB\010\n\006labels" +
      "B\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_SigmaFstParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_SigmaFstParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_SigmaFstParams_descriptor,
        new java.lang.String[] { "FirstLabel", "SigmaPlus", "EmptyWeight", "SymbolTableRef", "NumLabels", "Labels", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
