// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/frame_log.proto

package com.google.speech.recognizer.frontend;

public final class FrameLogOuterClass {
  private FrameLogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.logId);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FrameLogOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.FrameLog)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string feature_name = 1;</code>
     * @return Whether the featureName field is set.
     */
    boolean hasFeatureName();
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The featureName.
     */
    java.lang.String getFeatureName();
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The bytes for featureName.
     */
    com.google.protobuf.ByteString
        getFeatureNameBytes();

    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @return A list containing the features.
     */
    java.util.List<java.lang.Float> getFeaturesList();
    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @return The count of features.
     */
    int getFeaturesCount();
    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The features at the given index.
     */
    float getFeatures(int index);
  }
  /**
   * Protobuf type {@code greco.FrameLog}
   */
  public static final class FrameLog extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.FrameLog)
      FrameLogOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FrameLog.newBuilder() to construct.
    private FrameLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FrameLog() {
      featureName_ = "";
      features_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FrameLog();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.recognizer.frontend.FrameLogOuterClass.internal_static_greco_FrameLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.recognizer.frontend.FrameLogOuterClass.internal_static_greco_FrameLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.class, com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.Builder.class);
    }

    private int bitField0_;
    public static final int FEATURE_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object featureName_;
    /**
     * <code>optional string feature_name = 1;</code>
     * @return Whether the featureName field is set.
     */
    @java.lang.Override
    public boolean hasFeatureName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The featureName.
     */
    @java.lang.Override
    public java.lang.String getFeatureName() {
      java.lang.Object ref = featureName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          featureName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string feature_name = 1;</code>
     * @return The bytes for featureName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeatureNameBytes() {
      java.lang.Object ref = featureName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        featureName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FEATURES_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.FloatList features_;
    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @return A list containing the features.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getFeaturesList() {
      return features_;
    }
    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @return The count of features.
     */
    public int getFeaturesCount() {
      return features_.size();
    }
    /**
     * <code>repeated float features = 2 [packed = true];</code>
     * @param index The index of the element to return.
     * @return The features at the given index.
     */
    public float getFeatures(int index) {
      return features_.getFloat(index);
    }
    private int featuresMemoizedSerializedSize = -1;

    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog parseFrom(
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
    public static Builder newBuilder(com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog prototype) {
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
     * Protobuf type {@code greco.FrameLog}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.FrameLog)
        com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLogOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.speech.recognizer.frontend.FrameLogOuterClass.internal_static_greco_FrameLog_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.speech.recognizer.frontend.FrameLogOuterClass.internal_static_greco_FrameLog_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.class, com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.Builder.class);
      }

      // Construct using com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.newBuilder()
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
        featureName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        features_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.speech.recognizer.frontend.FrameLogOuterClass.internal_static_greco_FrameLog_descriptor;
      }

      @java.lang.Override
      public com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog getDefaultInstanceForType() {
        return com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog build() {
        com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog buildPartial() {
        com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog result = new com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.featureName_ = featureName_;
        if (((bitField0_ & 0x00000002) != 0)) {
          features_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.features_ = features_;
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

      private java.lang.Object featureName_ = "";
      /**
       * <code>optional string feature_name = 1;</code>
       * @return Whether the featureName field is set.
       */
      public boolean hasFeatureName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return The featureName.
       */
      public java.lang.String getFeatureName() {
        java.lang.Object ref = featureName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            featureName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return The bytes for featureName.
       */
      public com.google.protobuf.ByteString
          getFeatureNameBytes() {
        java.lang.Object ref = featureName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          featureName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @param value The featureName to set.
       * @return This builder for chaining.
       */
      public Builder setFeatureName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        featureName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeatureName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        featureName_ = getDefaultInstance().getFeatureName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string feature_name = 1;</code>
       * @param value The bytes for featureName to set.
       * @return This builder for chaining.
       */
      public Builder setFeatureNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        featureName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList features_ = emptyFloatList();
      private void ensureFeaturesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          features_ = mutableCopy(features_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @return A list containing the features.
       */
      public java.util.List<java.lang.Float>
          getFeaturesList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(features_) : features_;
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @return The count of features.
       */
      public int getFeaturesCount() {
        return features_.size();
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @param index The index of the element to return.
       * @return The features at the given index.
       */
      public float getFeatures(int index) {
        return features_.getFloat(index);
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @param index The index to set the value at.
       * @param value The features to set.
       * @return This builder for chaining.
       */
      public Builder setFeatures(
          int index, float value) {
        ensureFeaturesIsMutable();
        features_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @param value The features to add.
       * @return This builder for chaining.
       */
      public Builder addFeatures(float value) {
        ensureFeaturesIsMutable();
        features_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @param values The features to add.
       * @return This builder for chaining.
       */
      public Builder addAllFeatures(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureFeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, features_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float features = 2 [packed = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearFeatures() {
        features_ = emptyFloatList();
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


      // @@protoc_insertion_point(builder_scope:greco.FrameLog)
    }

    // @@protoc_insertion_point(class_scope:greco.FrameLog)
    private static final com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog();
    }

    public static com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<FrameLog>
        PARSER = new com.google.protobuf.AbstractParser<FrameLog>() {
      @java.lang.Override
      public FrameLog parsePartialFrom(
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

    public static com.google.protobuf.Parser<FrameLog> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FrameLog> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int LOG_ID_FIELD_NUMBER = 44990708;
    /**
     * <code>extend .greco.Loggable { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.LoggableOuterClass.Loggable,
        com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog> logId = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.getDefaultInstance(),
          0,
          com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.class,
          com.google.speech.recognizer.frontend.FrameLogOuterClass.FrameLog.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_FrameLog_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_FrameLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&speech/greco3/frontend/frame_log.proto" +
      "\022\005greco\032!speech/greco3/core/loggable.pro" +
      "to\"k\n\010FrameLog\022\024\n\014feature_name\030\001 \001(\t\022\024\n\010" +
      "features\030\002 \003(\002B\002\020\00123\n\006log_id\022\017.greco.Log" +
      "gable\030\364\201\272\025 \001(\0132\017.greco.FrameLogB/\n%com.g" +
      "oogle.speech.recognizer.frontendH\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.LoggableOuterClass.getDescriptor(),
        });
    internal_static_greco_FrameLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_FrameLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_FrameLog_descriptor,
        new java.lang.String[] { "FeatureName", "Features", });
    greco.LoggableOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}