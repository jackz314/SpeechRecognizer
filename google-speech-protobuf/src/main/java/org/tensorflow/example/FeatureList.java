// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: third_party/tensorflow/core/example/feature.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.FeatureList}
 */
public final class FeatureList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FeatureList)
    FeatureListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureList.newBuilder() to construct.
  private FeatureList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureList() {
    feature_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FeatureList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FeatureList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.FeatureList.class, org.tensorflow.example.FeatureList.Builder.class);
  }

  public static final int FEATURE_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.example.Feature> feature_;
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.tensorflow.example.Feature> getFeatureList() {
    return feature_;
  }
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.tensorflow.example.FeatureOrBuilder> 
      getFeatureOrBuilderList() {
    return feature_;
  }
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  @java.lang.Override
  public int getFeatureCount() {
    return feature_.size();
  }
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.Feature getFeature(int index) {
    return feature_.get(index);
  }
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FeatureOrBuilder getFeatureOrBuilder(
      int index) {
    return feature_.get(index);
  }

  public static org.tensorflow.example.FeatureList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FeatureList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FeatureList parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.FeatureList prototype) {
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
   * Protobuf type {@code tensorflow.FeatureList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FeatureList)
      org.tensorflow.example.FeatureListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FeatureList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FeatureList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.FeatureList.class, org.tensorflow.example.FeatureList.Builder.class);
    }

    // Construct using org.tensorflow.example.FeatureList.newBuilder()
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
        getFeatureFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (featureBuilder_ == null) {
        feature_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        featureBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FeatureList_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureList getDefaultInstanceForType() {
      return org.tensorflow.example.FeatureList.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureList build() {
      org.tensorflow.example.FeatureList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureList buildPartial() {
      org.tensorflow.example.FeatureList result = new org.tensorflow.example.FeatureList(this);
      int from_bitField0_ = bitField0_;
      if (featureBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          feature_ = java.util.Collections.unmodifiableList(feature_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feature_ = feature_;
      } else {
        result.feature_ = featureBuilder_.build();
      }
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

    private java.util.List<org.tensorflow.example.Feature> feature_ =
      java.util.Collections.emptyList();
    private void ensureFeatureIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        feature_ = new java.util.ArrayList<org.tensorflow.example.Feature>(feature_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.example.Feature, org.tensorflow.example.Feature.Builder, org.tensorflow.example.FeatureOrBuilder> featureBuilder_;

    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public java.util.List<org.tensorflow.example.Feature> getFeatureList() {
      if (featureBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feature_);
      } else {
        return featureBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public int getFeatureCount() {
      if (featureBuilder_ == null) {
        return feature_.size();
      } else {
        return featureBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public org.tensorflow.example.Feature getFeature(int index) {
      if (featureBuilder_ == null) {
        return feature_.get(index);
      } else {
        return featureBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder setFeature(
        int index, org.tensorflow.example.Feature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.set(index, value);
        onChanged();
      } else {
        featureBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder setFeature(
        int index, org.tensorflow.example.Feature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.set(index, builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder addFeature(org.tensorflow.example.Feature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.add(value);
        onChanged();
      } else {
        featureBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder addFeature(
        int index, org.tensorflow.example.Feature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.add(index, value);
        onChanged();
      } else {
        featureBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder addFeature(
        org.tensorflow.example.Feature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.add(builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder addFeature(
        int index, org.tensorflow.example.Feature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.add(index, builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder addAllFeature(
        java.lang.Iterable<? extends org.tensorflow.example.Feature> values) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feature_);
        onChanged();
      } else {
        featureBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder clearFeature() {
      if (featureBuilder_ == null) {
        feature_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public Builder removeFeature(int index) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.remove(index);
        onChanged();
      } else {
        featureBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public org.tensorflow.example.Feature.Builder getFeatureBuilder(
        int index) {
      return getFeatureFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public org.tensorflow.example.FeatureOrBuilder getFeatureOrBuilder(
        int index) {
      if (featureBuilder_ == null) {
        return feature_.get(index);  } else {
        return featureBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.example.FeatureOrBuilder> 
         getFeatureOrBuilderList() {
      if (featureBuilder_ != null) {
        return featureBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feature_);
      }
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public org.tensorflow.example.Feature.Builder addFeatureBuilder() {
      return getFeatureFieldBuilder().addBuilder(
          org.tensorflow.example.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public org.tensorflow.example.Feature.Builder addFeatureBuilder(
        int index) {
      return getFeatureFieldBuilder().addBuilder(
          index, org.tensorflow.example.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.Feature feature = 1;</code>
     */
    public java.util.List<org.tensorflow.example.Feature.Builder> 
         getFeatureBuilderList() {
      return getFeatureFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.example.Feature, org.tensorflow.example.Feature.Builder, org.tensorflow.example.FeatureOrBuilder> 
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        featureBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.example.Feature, org.tensorflow.example.Feature.Builder, org.tensorflow.example.FeatureOrBuilder>(
                feature_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        feature_ = null;
      }
      return featureBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.FeatureList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FeatureList)
  private static final org.tensorflow.example.FeatureList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.FeatureList();
  }

  public static org.tensorflow.example.FeatureList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureList>
      PARSER = new com.google.protobuf.AbstractParser<FeatureList>() {
    @java.lang.Override
    public FeatureList parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.FeatureList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
