// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/training_cache_policy_config.proto

package com.google.speech.trainingcache;

/**
 * Protobuf type {@code speech.training_cache.TrainingCachePolicyConfig}
 */
public final class TrainingCachePolicyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.training_cache.TrainingCachePolicyConfig)
    TrainingCachePolicyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrainingCachePolicyConfig.newBuilder() to construct.
  private TrainingCachePolicyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrainingCachePolicyConfig() {
    features_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrainingCachePolicyConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_TrainingCachePolicyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_TrainingCachePolicyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.trainingcache.TrainingCachePolicyConfig.class, com.google.speech.trainingcache.TrainingCachePolicyConfig.Builder.class);
  }

  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>optional int32 version = 1;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int FEATURES_FIELD_NUMBER = 2;
  private java.util.List<com.google.speech.trainingcache.Feature> features_;
  /**
   * <code>repeated .speech.training_cache.Feature features = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.trainingcache.Feature> getFeaturesList() {
    return features_;
  }
  /**
   * <code>repeated .speech.training_cache.Feature features = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.trainingcache.FeatureOrBuilder> 
      getFeaturesOrBuilderList() {
    return features_;
  }
  /**
   * <code>repeated .speech.training_cache.Feature features = 2;</code>
   */
  @java.lang.Override
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   * <code>repeated .speech.training_cache.Feature features = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.Feature getFeatures(int index) {
    return features_.get(index);
  }
  /**
   * <code>repeated .speech.training_cache.Feature features = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.FeatureOrBuilder getFeaturesOrBuilder(
      int index) {
    return features_.get(index);
  }

  public static final int MAX_TTL_HOURS_FIELD_NUMBER = 3;
  private int maxTtlHours_;
  /**
   * <code>optional int32 max_ttl_hours = 3;</code>
   * @return Whether the maxTtlHours field is set.
   */
  @java.lang.Override
  public boolean hasMaxTtlHours() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 max_ttl_hours = 3;</code>
   * @return The maxTtlHours.
   */
  @java.lang.Override
  public int getMaxTtlHours() {
    return maxTtlHours_;
  }

  public static final int DEFAULT_TTL_HOURS_FIELD_NUMBER = 4;
  private int defaultTtlHours_;
  /**
   * <code>optional int32 default_ttl_hours = 4;</code>
   * @return Whether the defaultTtlHours field is set.
   */
  @java.lang.Override
  public boolean hasDefaultTtlHours() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 default_ttl_hours = 4;</code>
   * @return The defaultTtlHours.
   */
  @java.lang.Override
  public int getDefaultTtlHours() {
    return defaultTtlHours_;
  }

  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.TrainingCachePolicyConfig parseFrom(
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
  public static Builder newBuilder(com.google.speech.trainingcache.TrainingCachePolicyConfig prototype) {
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
   * Protobuf type {@code speech.training_cache.TrainingCachePolicyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.training_cache.TrainingCachePolicyConfig)
      com.google.speech.trainingcache.TrainingCachePolicyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_TrainingCachePolicyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_TrainingCachePolicyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.trainingcache.TrainingCachePolicyConfig.class, com.google.speech.trainingcache.TrainingCachePolicyConfig.Builder.class);
    }

    // Construct using com.google.speech.trainingcache.TrainingCachePolicyConfig.newBuilder()
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
        getFeaturesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        featuresBuilder_.clear();
      }
      maxTtlHours_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      defaultTtlHours_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_TrainingCachePolicyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.TrainingCachePolicyConfig getDefaultInstanceForType() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.trainingcache.TrainingCachePolicyConfig build() {
      com.google.speech.trainingcache.TrainingCachePolicyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.TrainingCachePolicyConfig buildPartial() {
      com.google.speech.trainingcache.TrainingCachePolicyConfig result = new com.google.speech.trainingcache.TrainingCachePolicyConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
        to_bitField0_ |= 0x00000001;
      }
      if (featuresBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          features_ = java.util.Collections.unmodifiableList(features_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxTtlHours_ = maxTtlHours_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.defaultTtlHours_ = defaultTtlHours_;
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

    private int version_ ;
    /**
     * <code>optional int32 version = 1;</code>
     * @return Whether the version field is set.
     */
    @java.lang.Override
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional int32 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      bitField0_ |= 0x00000001;
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.speech.trainingcache.Feature> features_ =
      java.util.Collections.emptyList();
    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        features_ = new java.util.ArrayList<com.google.speech.trainingcache.Feature>(features_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.trainingcache.Feature, com.google.speech.trainingcache.Feature.Builder, com.google.speech.trainingcache.FeatureOrBuilder> featuresBuilder_;

    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public java.util.List<com.google.speech.trainingcache.Feature> getFeaturesList() {
      if (featuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(features_);
      } else {
        return featuresBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public int getFeaturesCount() {
      if (featuresBuilder_ == null) {
        return features_.size();
      } else {
        return featuresBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public com.google.speech.trainingcache.Feature getFeatures(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder setFeatures(
        int index, com.google.speech.trainingcache.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.set(index, value);
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder setFeatures(
        int index, com.google.speech.trainingcache.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.set(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder addFeatures(com.google.speech.trainingcache.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder addFeatures(
        int index, com.google.speech.trainingcache.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(index, value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder addFeatures(
        com.google.speech.trainingcache.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder addFeatures(
        int index, com.google.speech.trainingcache.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder addAllFeatures(
        java.lang.Iterable<? extends com.google.speech.trainingcache.Feature> values) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, features_);
        onChanged();
      } else {
        featuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        featuresBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public Builder removeFeatures(int index) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.remove(index);
        onChanged();
      } else {
        featuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public com.google.speech.trainingcache.Feature.Builder getFeaturesBuilder(
        int index) {
      return getFeaturesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public com.google.speech.trainingcache.FeatureOrBuilder getFeaturesOrBuilder(
        int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);  } else {
        return featuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public java.util.List<? extends com.google.speech.trainingcache.FeatureOrBuilder> 
         getFeaturesOrBuilderList() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(features_);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public com.google.speech.trainingcache.Feature.Builder addFeaturesBuilder() {
      return getFeaturesFieldBuilder().addBuilder(
          com.google.speech.trainingcache.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public com.google.speech.trainingcache.Feature.Builder addFeaturesBuilder(
        int index) {
      return getFeaturesFieldBuilder().addBuilder(
          index, com.google.speech.trainingcache.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.training_cache.Feature features = 2;</code>
     */
    public java.util.List<com.google.speech.trainingcache.Feature.Builder> 
         getFeaturesBuilderList() {
      return getFeaturesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.trainingcache.Feature, com.google.speech.trainingcache.Feature.Builder, com.google.speech.trainingcache.FeatureOrBuilder> 
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.trainingcache.Feature, com.google.speech.trainingcache.Feature.Builder, com.google.speech.trainingcache.FeatureOrBuilder>(
                features_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        features_ = null;
      }
      return featuresBuilder_;
    }

    private int maxTtlHours_ ;
    /**
     * <code>optional int32 max_ttl_hours = 3;</code>
     * @return Whether the maxTtlHours field is set.
     */
    @java.lang.Override
    public boolean hasMaxTtlHours() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 max_ttl_hours = 3;</code>
     * @return The maxTtlHours.
     */
    @java.lang.Override
    public int getMaxTtlHours() {
      return maxTtlHours_;
    }
    /**
     * <code>optional int32 max_ttl_hours = 3;</code>
     * @param value The maxTtlHours to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTtlHours(int value) {
      bitField0_ |= 0x00000004;
      maxTtlHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 max_ttl_hours = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTtlHours() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxTtlHours_ = 0;
      onChanged();
      return this;
    }

    private int defaultTtlHours_ ;
    /**
     * <code>optional int32 default_ttl_hours = 4;</code>
     * @return Whether the defaultTtlHours field is set.
     */
    @java.lang.Override
    public boolean hasDefaultTtlHours() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 default_ttl_hours = 4;</code>
     * @return The defaultTtlHours.
     */
    @java.lang.Override
    public int getDefaultTtlHours() {
      return defaultTtlHours_;
    }
    /**
     * <code>optional int32 default_ttl_hours = 4;</code>
     * @param value The defaultTtlHours to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultTtlHours(int value) {
      bitField0_ |= 0x00000008;
      defaultTtlHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 default_ttl_hours = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultTtlHours() {
      bitField0_ = (bitField0_ & ~0x00000008);
      defaultTtlHours_ = 0;
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


    // @@protoc_insertion_point(builder_scope:speech.training_cache.TrainingCachePolicyConfig)
  }

  // @@protoc_insertion_point(class_scope:speech.training_cache.TrainingCachePolicyConfig)
  private static final com.google.speech.trainingcache.TrainingCachePolicyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.trainingcache.TrainingCachePolicyConfig();
  }

  public static com.google.speech.trainingcache.TrainingCachePolicyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TrainingCachePolicyConfig>
      PARSER = new com.google.protobuf.AbstractParser<TrainingCachePolicyConfig>() {
    @java.lang.Override
    public TrainingCachePolicyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrainingCachePolicyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrainingCachePolicyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.trainingcache.TrainingCachePolicyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
