// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/lstm/darwinn_delegate_options.proto

package greco;

public final class DarwinnDelegateOptions {
  private DarwinnDelegateOptions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DarwinnOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.DarwinnOptions)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code greco.DarwinnOptions}
   */
  public static final class DarwinnOptions extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.DarwinnOptions)
      DarwinnOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DarwinnOptions.newBuilder() to construct.
    private DarwinnOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DarwinnOptions() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DarwinnOptions();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.DarwinnDelegateOptions.internal_static_greco_DarwinnOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.DarwinnDelegateOptions.internal_static_greco_DarwinnOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.DarwinnDelegateOptions.DarwinnOptions.class, greco.DarwinnDelegateOptions.DarwinnOptions.Builder.class);
    }

    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.DarwinnDelegateOptions.DarwinnOptions parseFrom(
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
    public static Builder newBuilder(greco.DarwinnDelegateOptions.DarwinnOptions prototype) {
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
     * Protobuf type {@code greco.DarwinnOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.DarwinnOptions)
        greco.DarwinnDelegateOptions.DarwinnOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.DarwinnDelegateOptions.internal_static_greco_DarwinnOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.DarwinnDelegateOptions.internal_static_greco_DarwinnOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.DarwinnDelegateOptions.DarwinnOptions.class, greco.DarwinnDelegateOptions.DarwinnOptions.Builder.class);
      }

      // Construct using greco.DarwinnDelegateOptions.DarwinnOptions.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.DarwinnDelegateOptions.internal_static_greco_DarwinnOptions_descriptor;
      }

      @java.lang.Override
      public greco.DarwinnDelegateOptions.DarwinnOptions getDefaultInstanceForType() {
        return greco.DarwinnDelegateOptions.DarwinnOptions.getDefaultInstance();
      }

      @java.lang.Override
      public greco.DarwinnDelegateOptions.DarwinnOptions build() {
        greco.DarwinnDelegateOptions.DarwinnOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.DarwinnDelegateOptions.DarwinnOptions buildPartial() {
        greco.DarwinnDelegateOptions.DarwinnOptions result = new greco.DarwinnDelegateOptions.DarwinnOptions(this);
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


      // @@protoc_insertion_point(builder_scope:greco.DarwinnOptions)
    }

    // @@protoc_insertion_point(class_scope:greco.DarwinnOptions)
    private static final greco.DarwinnDelegateOptions.DarwinnOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.DarwinnDelegateOptions.DarwinnOptions();
    }

    public static greco.DarwinnDelegateOptions.DarwinnOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DarwinnOptions>
        PARSER = new com.google.protobuf.AbstractParser<DarwinnOptions>() {
      @java.lang.Override
      public DarwinnOptions parsePartialFrom(
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

    public static com.google.protobuf.Parser<DarwinnOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DarwinnOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.DarwinnDelegateOptions.DarwinnOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_DarwinnOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_DarwinnOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1speech/greco3/lstm/darwinn_delegate_op" +
      "tions.proto\022\005greco\"\020\n\016DarwinnOptionsB\002H\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greco_DarwinnOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_DarwinnOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_DarwinnOptions_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
