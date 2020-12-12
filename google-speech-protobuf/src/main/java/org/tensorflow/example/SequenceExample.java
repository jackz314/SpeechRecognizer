// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: third_party/tensorflow/core/example/example.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.SequenceExample}
 */
public final class SequenceExample extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SequenceExample)
    SequenceExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SequenceExample.newBuilder() to construct.
  private SequenceExample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SequenceExample() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SequenceExample();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.SequenceExample.class, org.tensorflow.example.SequenceExample.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private org.tensorflow.example.Features context_;
  /**
   * <code>.tensorflow.Features context = 1;</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <code>.tensorflow.Features context = 1;</code>
   * @return The context.
   */
  @java.lang.Override
  public org.tensorflow.example.Features getContext() {
    return context_ == null ? org.tensorflow.example.Features.getDefaultInstance() : context_;
  }
  /**
   * <code>.tensorflow.Features context = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FeaturesOrBuilder getContextOrBuilder() {
    return getContext();
  }

  public static final int FEATURE_LISTS_FIELD_NUMBER = 2;
  private org.tensorflow.example.FeatureLists featureLists_;
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   * @return Whether the featureLists field is set.
   */
  @java.lang.Override
  public boolean hasFeatureLists() {
    return featureLists_ != null;
  }
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   * @return The featureLists.
   */
  @java.lang.Override
  public org.tensorflow.example.FeatureLists getFeatureLists() {
    return featureLists_ == null ? org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
  }
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FeatureListsOrBuilder getFeatureListsOrBuilder() {
    return getFeatureLists();
  }

  public static org.tensorflow.example.SequenceExample parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.SequenceExample prototype) {
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
   * Protobuf type {@code tensorflow.SequenceExample}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SequenceExample)
      org.tensorflow.example.SequenceExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.SequenceExample.class, org.tensorflow.example.SequenceExample.Builder.class);
    }

    // Construct using org.tensorflow.example.SequenceExample.newBuilder()
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
      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      if (featureListsBuilder_ == null) {
        featureLists_ = null;
      } else {
        featureLists_ = null;
        featureListsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample getDefaultInstanceForType() {
      return org.tensorflow.example.SequenceExample.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample build() {
      org.tensorflow.example.SequenceExample result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample buildPartial() {
      org.tensorflow.example.SequenceExample result = new org.tensorflow.example.SequenceExample(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      if (featureListsBuilder_ == null) {
        result.featureLists_ = featureLists_;
      } else {
        result.featureLists_ = featureListsBuilder_.build();
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

    private org.tensorflow.example.Features context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> contextBuilder_;
    /**
     * <code>.tensorflow.Features context = 1;</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     * @return The context.
     */
    public org.tensorflow.example.Features getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? org.tensorflow.example.Features.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public Builder setContext(org.tensorflow.example.Features value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public Builder setContext(
        org.tensorflow.example.Features.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public Builder mergeContext(org.tensorflow.example.Features value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            org.tensorflow.example.Features.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public org.tensorflow.example.Features.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    public org.tensorflow.example.FeaturesOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            org.tensorflow.example.Features.getDefaultInstance() : context_;
      }
    }
    /**
     * <code>.tensorflow.Features context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private org.tensorflow.example.FeatureLists featureLists_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder> featureListsBuilder_;
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     * @return Whether the featureLists field is set.
     */
    public boolean hasFeatureLists() {
      return featureListsBuilder_ != null || featureLists_ != null;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     * @return The featureLists.
     */
    public org.tensorflow.example.FeatureLists getFeatureLists() {
      if (featureListsBuilder_ == null) {
        return featureLists_ == null ? org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
      } else {
        return featureListsBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public Builder setFeatureLists(org.tensorflow.example.FeatureLists value) {
      if (featureListsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureLists_ = value;
        onChanged();
      } else {
        featureListsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public Builder setFeatureLists(
        org.tensorflow.example.FeatureLists.Builder builderForValue) {
      if (featureListsBuilder_ == null) {
        featureLists_ = builderForValue.build();
        onChanged();
      } else {
        featureListsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public Builder mergeFeatureLists(org.tensorflow.example.FeatureLists value) {
      if (featureListsBuilder_ == null) {
        if (featureLists_ != null) {
          featureLists_ =
            org.tensorflow.example.FeatureLists.newBuilder(featureLists_).mergeFrom(value).buildPartial();
        } else {
          featureLists_ = value;
        }
        onChanged();
      } else {
        featureListsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public Builder clearFeatureLists() {
      if (featureListsBuilder_ == null) {
        featureLists_ = null;
        onChanged();
      } else {
        featureLists_ = null;
        featureListsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public org.tensorflow.example.FeatureLists.Builder getFeatureListsBuilder() {
      
      onChanged();
      return getFeatureListsFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    public org.tensorflow.example.FeatureListsOrBuilder getFeatureListsOrBuilder() {
      if (featureListsBuilder_ != null) {
        return featureListsBuilder_.getMessageOrBuilder();
      } else {
        return featureLists_ == null ?
            org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
      }
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder> 
        getFeatureListsFieldBuilder() {
      if (featureListsBuilder_ == null) {
        featureListsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder>(
                getFeatureLists(),
                getParentForChildren(),
                isClean());
        featureLists_ = null;
      }
      return featureListsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SequenceExample)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SequenceExample)
  private static final org.tensorflow.example.SequenceExample DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.SequenceExample();
  }

  public static org.tensorflow.example.SequenceExample getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SequenceExample>
      PARSER = new com.google.protobuf.AbstractParser<SequenceExample>() {
    @java.lang.Override
    public SequenceExample parsePartialFrom(
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

  public static com.google.protobuf.Parser<SequenceExample> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SequenceExample> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.SequenceExample getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
