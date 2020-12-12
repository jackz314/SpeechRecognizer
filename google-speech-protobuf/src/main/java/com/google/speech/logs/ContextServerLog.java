// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

/**
 * Protobuf type {@code speech.logs.ContextServerLog}
 */
public final class ContextServerLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:speech.logs.ContextServerLog)
    ContextServerLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContextServerLog.newBuilder() to construct.
  private ContextServerLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContextServerLog() {
    requestContext_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContextServerLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_ContextServerLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_ContextServerLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.speech.logs.ContextServerLog.class, com.google.speech.logs.ContextServerLog.Builder.class);
  }

  private int bitField0_;
  public static final int REQUEST_CONTEXT_FIELD_NUMBER = 1;
  private java.util.List<com.google.speech.logs.RequestContextLog> requestContext_;
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.speech.logs.RequestContextLog> getRequestContextList() {
    return requestContext_;
  }
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.speech.logs.RequestContextLogOrBuilder> 
      getRequestContextOrBuilderList() {
    return requestContext_;
  }
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  @java.lang.Override
  public int getRequestContextCount() {
    return requestContext_.size();
  }
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.RequestContextLog getRequestContext(int index) {
    return requestContext_.get(index);
  }
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.RequestContextLogOrBuilder getRequestContextOrBuilder(
      int index) {
    return requestContext_.get(index);
  }

  public static final int CONTEXT_BACKEND_LOG_FIELD_NUMBER = 11;
  private com.google.speech.logs.ContextBackendLog contextBackendLog_;
  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   * @return Whether the contextBackendLog field is set.
   */
  @java.lang.Override
  public boolean hasContextBackendLog() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   * @return The contextBackendLog.
   */
  @java.lang.Override
  public com.google.speech.logs.ContextBackendLog getContextBackendLog() {
    return contextBackendLog_ == null ? com.google.speech.logs.ContextBackendLog.getDefaultInstance() : contextBackendLog_;
  }
  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   */
  @java.lang.Override
  public com.google.speech.logs.ContextBackendLogOrBuilder getContextBackendLogOrBuilder() {
    return contextBackendLog_ == null ? com.google.speech.logs.ContextBackendLog.getDefaultInstance() : contextBackendLog_;
  }

  public static com.google.speech.logs.ContextServerLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.ContextServerLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.ContextServerLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.speech.logs.ContextServerLog parseFrom(
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
  public static Builder newBuilder(com.google.speech.logs.ContextServerLog prototype) {
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
   * Protobuf type {@code speech.logs.ContextServerLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:speech.logs.ContextServerLog)
      com.google.speech.logs.ContextServerLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_ContextServerLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_ContextServerLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.speech.logs.ContextServerLog.class, com.google.speech.logs.ContextServerLog.Builder.class);
    }

    // Construct using com.google.speech.logs.ContextServerLog.newBuilder()
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
        getRequestContextFieldBuilder();
        getContextBackendLogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestContextBuilder_ == null) {
        requestContext_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        requestContextBuilder_.clear();
      }
      if (contextBackendLogBuilder_ == null) {
        contextBackendLog_ = null;
      } else {
        contextBackendLogBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.speech.logs.RecognizerOuterClass.internal_static_speech_logs_ContextServerLog_descriptor;
    }

    @java.lang.Override
    public com.google.speech.logs.ContextServerLog getDefaultInstanceForType() {
      return com.google.speech.logs.ContextServerLog.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.speech.logs.ContextServerLog build() {
      com.google.speech.logs.ContextServerLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.speech.logs.ContextServerLog buildPartial() {
      com.google.speech.logs.ContextServerLog result = new com.google.speech.logs.ContextServerLog(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (requestContextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requestContext_ = java.util.Collections.unmodifiableList(requestContext_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requestContext_ = requestContext_;
      } else {
        result.requestContext_ = requestContextBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (contextBackendLogBuilder_ == null) {
          result.contextBackendLog_ = contextBackendLog_;
        } else {
          result.contextBackendLog_ = contextBackendLogBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
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

    private java.util.List<com.google.speech.logs.RequestContextLog> requestContext_ =
      java.util.Collections.emptyList();
    private void ensureRequestContextIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requestContext_ = new java.util.ArrayList<com.google.speech.logs.RequestContextLog>(requestContext_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.RequestContextLog, com.google.speech.logs.RequestContextLog.Builder, com.google.speech.logs.RequestContextLogOrBuilder> requestContextBuilder_;

    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public java.util.List<com.google.speech.logs.RequestContextLog> getRequestContextList() {
      if (requestContextBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requestContext_);
      } else {
        return requestContextBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public int getRequestContextCount() {
      if (requestContextBuilder_ == null) {
        return requestContext_.size();
      } else {
        return requestContextBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public com.google.speech.logs.RequestContextLog getRequestContext(int index) {
      if (requestContextBuilder_ == null) {
        return requestContext_.get(index);
      } else {
        return requestContextBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder setRequestContext(
        int index, com.google.speech.logs.RequestContextLog value) {
      if (requestContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestContextIsMutable();
        requestContext_.set(index, value);
        onChanged();
      } else {
        requestContextBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder setRequestContext(
        int index, com.google.speech.logs.RequestContextLog.Builder builderForValue) {
      if (requestContextBuilder_ == null) {
        ensureRequestContextIsMutable();
        requestContext_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestContextBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder addRequestContext(com.google.speech.logs.RequestContextLog value) {
      if (requestContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestContextIsMutable();
        requestContext_.add(value);
        onChanged();
      } else {
        requestContextBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder addRequestContext(
        int index, com.google.speech.logs.RequestContextLog value) {
      if (requestContextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestContextIsMutable();
        requestContext_.add(index, value);
        onChanged();
      } else {
        requestContextBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder addRequestContext(
        com.google.speech.logs.RequestContextLog.Builder builderForValue) {
      if (requestContextBuilder_ == null) {
        ensureRequestContextIsMutable();
        requestContext_.add(builderForValue.build());
        onChanged();
      } else {
        requestContextBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder addRequestContext(
        int index, com.google.speech.logs.RequestContextLog.Builder builderForValue) {
      if (requestContextBuilder_ == null) {
        ensureRequestContextIsMutable();
        requestContext_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestContextBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder addAllRequestContext(
        java.lang.Iterable<? extends com.google.speech.logs.RequestContextLog> values) {
      if (requestContextBuilder_ == null) {
        ensureRequestContextIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, requestContext_);
        onChanged();
      } else {
        requestContextBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder clearRequestContext() {
      if (requestContextBuilder_ == null) {
        requestContext_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestContextBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public Builder removeRequestContext(int index) {
      if (requestContextBuilder_ == null) {
        ensureRequestContextIsMutable();
        requestContext_.remove(index);
        onChanged();
      } else {
        requestContextBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public com.google.speech.logs.RequestContextLog.Builder getRequestContextBuilder(
        int index) {
      return getRequestContextFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public com.google.speech.logs.RequestContextLogOrBuilder getRequestContextOrBuilder(
        int index) {
      if (requestContextBuilder_ == null) {
        return requestContext_.get(index);  } else {
        return requestContextBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public java.util.List<? extends com.google.speech.logs.RequestContextLogOrBuilder> 
         getRequestContextOrBuilderList() {
      if (requestContextBuilder_ != null) {
        return requestContextBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requestContext_);
      }
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public com.google.speech.logs.RequestContextLog.Builder addRequestContextBuilder() {
      return getRequestContextFieldBuilder().addBuilder(
          com.google.speech.logs.RequestContextLog.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public com.google.speech.logs.RequestContextLog.Builder addRequestContextBuilder(
        int index) {
      return getRequestContextFieldBuilder().addBuilder(
          index, com.google.speech.logs.RequestContextLog.getDefaultInstance());
    }
    /**
     * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
     */
    public java.util.List<com.google.speech.logs.RequestContextLog.Builder> 
         getRequestContextBuilderList() {
      return getRequestContextFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.speech.logs.RequestContextLog, com.google.speech.logs.RequestContextLog.Builder, com.google.speech.logs.RequestContextLogOrBuilder> 
        getRequestContextFieldBuilder() {
      if (requestContextBuilder_ == null) {
        requestContextBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.speech.logs.RequestContextLog, com.google.speech.logs.RequestContextLog.Builder, com.google.speech.logs.RequestContextLogOrBuilder>(
                requestContext_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        requestContext_ = null;
      }
      return requestContextBuilder_;
    }

    private com.google.speech.logs.ContextBackendLog contextBackendLog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.logs.ContextBackendLog, com.google.speech.logs.ContextBackendLog.Builder, com.google.speech.logs.ContextBackendLogOrBuilder> contextBackendLogBuilder_;
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     * @return Whether the contextBackendLog field is set.
     */
    public boolean hasContextBackendLog() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     * @return The contextBackendLog.
     */
    public com.google.speech.logs.ContextBackendLog getContextBackendLog() {
      if (contextBackendLogBuilder_ == null) {
        return contextBackendLog_ == null ? com.google.speech.logs.ContextBackendLog.getDefaultInstance() : contextBackendLog_;
      } else {
        return contextBackendLogBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public Builder setContextBackendLog(com.google.speech.logs.ContextBackendLog value) {
      if (contextBackendLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contextBackendLog_ = value;
        onChanged();
      } else {
        contextBackendLogBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public Builder setContextBackendLog(
        com.google.speech.logs.ContextBackendLog.Builder builderForValue) {
      if (contextBackendLogBuilder_ == null) {
        contextBackendLog_ = builderForValue.build();
        onChanged();
      } else {
        contextBackendLogBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public Builder mergeContextBackendLog(com.google.speech.logs.ContextBackendLog value) {
      if (contextBackendLogBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            contextBackendLog_ != null &&
            contextBackendLog_ != com.google.speech.logs.ContextBackendLog.getDefaultInstance()) {
          contextBackendLog_ =
            com.google.speech.logs.ContextBackendLog.newBuilder(contextBackendLog_).mergeFrom(value).buildPartial();
        } else {
          contextBackendLog_ = value;
        }
        onChanged();
      } else {
        contextBackendLogBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public Builder clearContextBackendLog() {
      if (contextBackendLogBuilder_ == null) {
        contextBackendLog_ = null;
        onChanged();
      } else {
        contextBackendLogBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public com.google.speech.logs.ContextBackendLog.Builder getContextBackendLogBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getContextBackendLogFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    public com.google.speech.logs.ContextBackendLogOrBuilder getContextBackendLogOrBuilder() {
      if (contextBackendLogBuilder_ != null) {
        return contextBackendLogBuilder_.getMessageOrBuilder();
      } else {
        return contextBackendLog_ == null ?
            com.google.speech.logs.ContextBackendLog.getDefaultInstance() : contextBackendLog_;
      }
    }
    /**
     * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.speech.logs.ContextBackendLog, com.google.speech.logs.ContextBackendLog.Builder, com.google.speech.logs.ContextBackendLogOrBuilder> 
        getContextBackendLogFieldBuilder() {
      if (contextBackendLogBuilder_ == null) {
        contextBackendLogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.speech.logs.ContextBackendLog, com.google.speech.logs.ContextBackendLog.Builder, com.google.speech.logs.ContextBackendLogOrBuilder>(
                getContextBackendLog(),
                getParentForChildren(),
                isClean());
        contextBackendLog_ = null;
      }
      return contextBackendLogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:speech.logs.ContextServerLog)
  }

  // @@protoc_insertion_point(class_scope:speech.logs.ContextServerLog)
  private static final com.google.speech.logs.ContextServerLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.speech.logs.ContextServerLog();
  }

  public static com.google.speech.logs.ContextServerLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ContextServerLog>
      PARSER = new com.google.protobuf.AbstractParser<ContextServerLog>() {
    @java.lang.Override
    public ContextServerLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContextServerLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContextServerLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.speech.logs.ContextServerLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

