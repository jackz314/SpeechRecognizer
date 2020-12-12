// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/training_cache_policy_config.proto

package com.google.speech.trainingcache;

/**
 * Protobuf type {@code speech.training_cache.PolicySet}
 */
public final class PolicySet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.training_cache.PolicySet)
    PolicySetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicySet.newBuilder() to construct.
  private PolicySet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicySet() {
    policies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicySet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_PolicySet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_PolicySet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.trainingcache.PolicySet.class, com.google.speech.trainingcache.PolicySet.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 1;</code>
   * @return Whether the enabled field is set.
   */
  @java.lang.Override
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int POLICIES_FIELD_NUMBER = 2;
  private java.util.List<com.google.speech.trainingcache.Policy> policies_;
  /**
   * <code>repeated .speech.training_cache.Policy policies = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.trainingcache.Policy> getPoliciesList() {
    return policies_;
  }
  /**
   * <code>repeated .speech.training_cache.Policy policies = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.trainingcache.PolicyOrBuilder> 
      getPoliciesOrBuilderList() {
    return policies_;
  }
  /**
   * <code>repeated .speech.training_cache.Policy policies = 2;</code>
   */
  @java.lang.Override
  public int getPoliciesCount() {
    return policies_.size();
  }
  /**
   * <code>repeated .speech.training_cache.Policy policies = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.Policy getPolicies(int index) {
    return policies_.get(index);
  }
  /**
   * <code>repeated .speech.training_cache.Policy policies = 2;</code>
   */
  @java.lang.Override
  public com.google.speech.trainingcache.PolicyOrBuilder getPoliciesOrBuilder(
      int index) {
    return policies_.get(index);
  }

  public static com.google.speech.trainingcache.PolicySet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.PolicySet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.PolicySet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.trainingcache.PolicySet parseFrom(
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
  public static Builder newBuilder(com.google.speech.trainingcache.PolicySet prototype) {
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
   * Protobuf type {@code speech.training_cache.PolicySet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.training_cache.PolicySet)
      com.google.speech.trainingcache.PolicySetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_PolicySet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_PolicySet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.trainingcache.PolicySet.class, com.google.speech.trainingcache.PolicySet.Builder.class);
    }

    // Construct using com.google.speech.trainingcache.PolicySet.newBuilder()
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
        getPoliciesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        policiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.trainingcache.TrainingCachePolicyConfigOuterClass.internal_static_speech_training_cache_PolicySet_descriptor;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.PolicySet getDefaultInstanceForType() {
      return com.google.speech.trainingcache.PolicySet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.trainingcache.PolicySet build() {
      com.google.speech.trainingcache.PolicySet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.trainingcache.PolicySet buildPartial() {
      com.google.speech.trainingcache.PolicySet result = new com.google.speech.trainingcache.PolicySet(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
        to_bitField0_ |= 0x00000001;
      }
      if (policiesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          policies_ = java.util.Collections.unmodifiableList(policies_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.policies_ = policies_;
      } else {
        result.policies_ = policiesBuilder_.build();
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

    private boolean enabled_ ;
    /**
     * <code>optional bool enabled = 1;</code>
     * @return Whether the enabled field is set.
     */
    @java.lang.Override
    public boolean hasEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      bitField0_ |= 0x00000001;
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.google.speech.trainingcache.Policy> policies_ =
      java.util.Collections.emptyList();
    private void ensurePoliciesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        policies_ = new java.util.ArrayList<com.google.speech.trainingcache.Policy>(policies_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.trainingcache.Policy, com.google.speech.trainingcache.Policy.Builder, com.google.speech.trainingcache.PolicyOrBuilder> policiesBuilder_;

    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public java.util.List<com.google.speech.trainingcache.Policy> getPoliciesList() {
      if (policiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policies_);
      } else {
        return policiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public int getPoliciesCount() {
      if (policiesBuilder_ == null) {
        return policies_.size();
      } else {
        return policiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public com.google.speech.trainingcache.Policy getPolicies(int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder setPolicies(
        int index, com.google.speech.trainingcache.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.set(index, value);
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder setPolicies(
        int index, com.google.speech.trainingcache.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.set(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder addPolicies(com.google.speech.trainingcache.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder addPolicies(
        int index, com.google.speech.trainingcache.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(index, value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder addPolicies(
        com.google.speech.trainingcache.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder addPolicies(
        int index, com.google.speech.trainingcache.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder addAllPolicies(
        java.lang.Iterable<? extends com.google.speech.trainingcache.Policy> values) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, policies_);
        onChanged();
      } else {
        policiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder clearPolicies() {
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        policiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public Builder removePolicies(int index) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.remove(index);
        onChanged();
      } else {
        policiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public com.google.speech.trainingcache.Policy.Builder getPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public com.google.speech.trainingcache.PolicyOrBuilder getPoliciesOrBuilder(
        int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);  } else {
        return policiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public java.util.List<? extends com.google.speech.trainingcache.PolicyOrBuilder> 
         getPoliciesOrBuilderList() {
      if (policiesBuilder_ != null) {
        return policiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policies_);
      }
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public com.google.speech.trainingcache.Policy.Builder addPoliciesBuilder() {
      return getPoliciesFieldBuilder().addBuilder(
          com.google.speech.trainingcache.Policy.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public com.google.speech.trainingcache.Policy.Builder addPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder().addBuilder(
          index, com.google.speech.trainingcache.Policy.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.training_cache.Policy policies = 2;</code>
     */
    public java.util.List<com.google.speech.trainingcache.Policy.Builder> 
         getPoliciesBuilderList() {
      return getPoliciesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.trainingcache.Policy, com.google.speech.trainingcache.Policy.Builder, com.google.speech.trainingcache.PolicyOrBuilder> 
        getPoliciesFieldBuilder() {
      if (policiesBuilder_ == null) {
        policiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.trainingcache.Policy, com.google.speech.trainingcache.Policy.Builder, com.google.speech.trainingcache.PolicyOrBuilder>(
                policies_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        policies_ = null;
      }
      return policiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speech.training_cache.PolicySet)
  }

  // @@protoc_insertion_point(class_scope:speech.training_cache.PolicySet)
  private static final com.google.speech.trainingcache.PolicySet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.trainingcache.PolicySet();
  }

  public static com.google.speech.trainingcache.PolicySet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<PolicySet>
      PARSER = new com.google.protobuf.AbstractParser<PolicySet>() {
    @java.lang.Override
    public PolicySet parsePartialFrom(
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

  public static com.google.protobuf.Parser<PolicySet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicySet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.trainingcache.PolicySet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

