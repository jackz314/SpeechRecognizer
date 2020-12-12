// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/context/contacts_model_params.proto

package greco;

public final class ContactsModelParamsOuterClass {
  private ContactsModelParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.ContactsModelParamsOuterClass.ContactsModelParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ContactsModelParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.ContactsModelParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return Whether the phonelistRef field is set.
     */
    boolean hasPhonelistRef();
    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return The phonelistRef.
     */
    java.lang.String getPhonelistRef();
    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return The bytes for phonelistRef.
     */
    com.google.protobuf.ByteString
        getPhonelistRefBytes();

    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return Whether the pronGeneratorRef field is set.
     */
    boolean hasPronGeneratorRef();
    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return The pronGeneratorRef.
     */
    java.lang.String getPronGeneratorRef();
    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return The bytes for pronGeneratorRef.
     */
    com.google.protobuf.ByteString
        getPronGeneratorRefBytes();

    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     * @return Whether the contactsParams field is set.
     */
    boolean hasContactsParams();
    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     * @return The contactsParams.
     */
    greco.DynamicClassModelParamsOuterClass.DynamicClassParams getContactsParams();
    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     */
    greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder getContactsParamsOrBuilder();

    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return Whether the contactsNormalizerRef field is set.
     */
    boolean hasContactsNormalizerRef();
    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return The contactsNormalizerRef.
     */
    java.lang.String getContactsNormalizerRef();
    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return The bytes for contactsNormalizerRef.
     */
    com.google.protobuf.ByteString
        getContactsNormalizerRefBytes();
  }
  /**
   * Protobuf type {@code greco.ContactsModelParams}
   */
  public static final class ContactsModelParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.ContactsModelParams)
      ContactsModelParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ContactsModelParams.newBuilder() to construct.
    private ContactsModelParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ContactsModelParams() {
      phonelistRef_ = "";
      pronGeneratorRef_ = "";
      contactsNormalizerRef_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ContactsModelParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.ContactsModelParamsOuterClass.internal_static_greco_ContactsModelParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.ContactsModelParamsOuterClass.internal_static_greco_ContactsModelParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.ContactsModelParamsOuterClass.ContactsModelParams.class, greco.ContactsModelParamsOuterClass.ContactsModelParams.Builder.class);
    }

    private int bitField0_;
    public static final int PHONELIST_REF_FIELD_NUMBER = 1;
    private volatile java.lang.Object phonelistRef_;
    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return Whether the phonelistRef field is set.
     */
    @java.lang.Override
    public boolean hasPhonelistRef() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return The phonelistRef.
     */
    @java.lang.Override
    public java.lang.String getPhonelistRef() {
      java.lang.Object ref = phonelistRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          phonelistRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string phonelist_ref = 1;</code>
     * @return The bytes for phonelistRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPhonelistRefBytes() {
      java.lang.Object ref = phonelistRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phonelistRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRON_GENERATOR_REF_FIELD_NUMBER = 2;
    private volatile java.lang.Object pronGeneratorRef_;
    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return Whether the pronGeneratorRef field is set.
     */
    @java.lang.Override
    public boolean hasPronGeneratorRef() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return The pronGeneratorRef.
     */
    @java.lang.Override
    public java.lang.String getPronGeneratorRef() {
      java.lang.Object ref = pronGeneratorRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          pronGeneratorRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string pron_generator_ref = 2;</code>
     * @return The bytes for pronGeneratorRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPronGeneratorRefBytes() {
      java.lang.Object ref = pronGeneratorRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pronGeneratorRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTACTS_PARAMS_FIELD_NUMBER = 3;
    private greco.DynamicClassModelParamsOuterClass.DynamicClassParams contactsParams_;
    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     * @return Whether the contactsParams field is set.
     */
    @java.lang.Override
    public boolean hasContactsParams() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     * @return The contactsParams.
     */
    @java.lang.Override
    public greco.DynamicClassModelParamsOuterClass.DynamicClassParams getContactsParams() {
      return contactsParams_ == null ? greco.DynamicClassModelParamsOuterClass.DynamicClassParams.getDefaultInstance() : contactsParams_;
    }
    /**
     * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
     */
    @java.lang.Override
    public greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder getContactsParamsOrBuilder() {
      return contactsParams_ == null ? greco.DynamicClassModelParamsOuterClass.DynamicClassParams.getDefaultInstance() : contactsParams_;
    }

    public static final int CONTACTS_NORMALIZER_REF_FIELD_NUMBER = 4;
    private volatile java.lang.Object contactsNormalizerRef_;
    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return Whether the contactsNormalizerRef field is set.
     */
    @java.lang.Override
    public boolean hasContactsNormalizerRef() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return The contactsNormalizerRef.
     */
    @java.lang.Override
    public java.lang.String getContactsNormalizerRef() {
      java.lang.Object ref = contactsNormalizerRef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          contactsNormalizerRef_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string contacts_normalizer_ref = 4;</code>
     * @return The bytes for contactsNormalizerRef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContactsNormalizerRefBytes() {
      java.lang.Object ref = contactsNormalizerRef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contactsNormalizerRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.ContactsModelParamsOuterClass.ContactsModelParams parseFrom(
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
    public static Builder newBuilder(greco.ContactsModelParamsOuterClass.ContactsModelParams prototype) {
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
     * Protobuf type {@code greco.ContactsModelParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.ContactsModelParams)
        greco.ContactsModelParamsOuterClass.ContactsModelParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.ContactsModelParamsOuterClass.internal_static_greco_ContactsModelParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.ContactsModelParamsOuterClass.internal_static_greco_ContactsModelParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.ContactsModelParamsOuterClass.ContactsModelParams.class, greco.ContactsModelParamsOuterClass.ContactsModelParams.Builder.class);
      }

      // Construct using greco.ContactsModelParamsOuterClass.ContactsModelParams.newBuilder()
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
          getContactsParamsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        phonelistRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        pronGeneratorRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (contactsParamsBuilder_ == null) {
          contactsParams_ = null;
        } else {
          contactsParamsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        contactsNormalizerRef_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.ContactsModelParamsOuterClass.internal_static_greco_ContactsModelParams_descriptor;
      }

      @java.lang.Override
      public greco.ContactsModelParamsOuterClass.ContactsModelParams getDefaultInstanceForType() {
        return greco.ContactsModelParamsOuterClass.ContactsModelParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.ContactsModelParamsOuterClass.ContactsModelParams build() {
        greco.ContactsModelParamsOuterClass.ContactsModelParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.ContactsModelParamsOuterClass.ContactsModelParams buildPartial() {
        greco.ContactsModelParamsOuterClass.ContactsModelParams result = new greco.ContactsModelParamsOuterClass.ContactsModelParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.phonelistRef_ = phonelistRef_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.pronGeneratorRef_ = pronGeneratorRef_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (contactsParamsBuilder_ == null) {
            result.contactsParams_ = contactsParams_;
          } else {
            result.contactsParams_ = contactsParamsBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.contactsNormalizerRef_ = contactsNormalizerRef_;
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

      private java.lang.Object phonelistRef_ = "";
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @return Whether the phonelistRef field is set.
       */
      public boolean hasPhonelistRef() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @return The phonelistRef.
       */
      public java.lang.String getPhonelistRef() {
        java.lang.Object ref = phonelistRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            phonelistRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @return The bytes for phonelistRef.
       */
      public com.google.protobuf.ByteString
          getPhonelistRefBytes() {
        java.lang.Object ref = phonelistRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phonelistRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @param value The phonelistRef to set.
       * @return This builder for chaining.
       */
      public Builder setPhonelistRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        phonelistRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhonelistRef() {
        bitField0_ = (bitField0_ & ~0x00000001);
        phonelistRef_ = getDefaultInstance().getPhonelistRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string phonelist_ref = 1;</code>
       * @param value The bytes for phonelistRef to set.
       * @return This builder for chaining.
       */
      public Builder setPhonelistRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        phonelistRef_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object pronGeneratorRef_ = "";
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @return Whether the pronGeneratorRef field is set.
       */
      public boolean hasPronGeneratorRef() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @return The pronGeneratorRef.
       */
      public java.lang.String getPronGeneratorRef() {
        java.lang.Object ref = pronGeneratorRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            pronGeneratorRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @return The bytes for pronGeneratorRef.
       */
      public com.google.protobuf.ByteString
          getPronGeneratorRefBytes() {
        java.lang.Object ref = pronGeneratorRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pronGeneratorRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @param value The pronGeneratorRef to set.
       * @return This builder for chaining.
       */
      public Builder setPronGeneratorRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        pronGeneratorRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPronGeneratorRef() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pronGeneratorRef_ = getDefaultInstance().getPronGeneratorRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string pron_generator_ref = 2;</code>
       * @param value The bytes for pronGeneratorRef to set.
       * @return This builder for chaining.
       */
      public Builder setPronGeneratorRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        pronGeneratorRef_ = value;
        onChanged();
        return this;
      }

      private greco.DynamicClassModelParamsOuterClass.DynamicClassParams contactsParams_;
      private com.google.protobuf.SingleFieldBuilderV3<
          greco.DynamicClassModelParamsOuterClass.DynamicClassParams, greco.DynamicClassModelParamsOuterClass.DynamicClassParams.Builder, greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder> contactsParamsBuilder_;
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       * @return Whether the contactsParams field is set.
       */
      public boolean hasContactsParams() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       * @return The contactsParams.
       */
      public greco.DynamicClassModelParamsOuterClass.DynamicClassParams getContactsParams() {
        if (contactsParamsBuilder_ == null) {
          return contactsParams_ == null ? greco.DynamicClassModelParamsOuterClass.DynamicClassParams.getDefaultInstance() : contactsParams_;
        } else {
          return contactsParamsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public Builder setContactsParams(greco.DynamicClassModelParamsOuterClass.DynamicClassParams value) {
        if (contactsParamsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          contactsParams_ = value;
          onChanged();
        } else {
          contactsParamsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public Builder setContactsParams(
          greco.DynamicClassModelParamsOuterClass.DynamicClassParams.Builder builderForValue) {
        if (contactsParamsBuilder_ == null) {
          contactsParams_ = builderForValue.build();
          onChanged();
        } else {
          contactsParamsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public Builder mergeContactsParams(greco.DynamicClassModelParamsOuterClass.DynamicClassParams value) {
        if (contactsParamsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              contactsParams_ != null &&
              contactsParams_ != greco.DynamicClassModelParamsOuterClass.DynamicClassParams.getDefaultInstance()) {
            contactsParams_ =
              greco.DynamicClassModelParamsOuterClass.DynamicClassParams.newBuilder(contactsParams_).mergeFrom(value).buildPartial();
          } else {
            contactsParams_ = value;
          }
          onChanged();
        } else {
          contactsParamsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public Builder clearContactsParams() {
        if (contactsParamsBuilder_ == null) {
          contactsParams_ = null;
          onChanged();
        } else {
          contactsParamsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public greco.DynamicClassModelParamsOuterClass.DynamicClassParams.Builder getContactsParamsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getContactsParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      public greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder getContactsParamsOrBuilder() {
        if (contactsParamsBuilder_ != null) {
          return contactsParamsBuilder_.getMessageOrBuilder();
        } else {
          return contactsParams_ == null ?
              greco.DynamicClassModelParamsOuterClass.DynamicClassParams.getDefaultInstance() : contactsParams_;
        }
      }
      /**
       * <code>optional .greco.DynamicClassParams contacts_params = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          greco.DynamicClassModelParamsOuterClass.DynamicClassParams, greco.DynamicClassModelParamsOuterClass.DynamicClassParams.Builder, greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder> 
          getContactsParamsFieldBuilder() {
        if (contactsParamsBuilder_ == null) {
          contactsParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              greco.DynamicClassModelParamsOuterClass.DynamicClassParams, greco.DynamicClassModelParamsOuterClass.DynamicClassParams.Builder, greco.DynamicClassModelParamsOuterClass.DynamicClassParamsOrBuilder>(
                  getContactsParams(),
                  getParentForChildren(),
                  isClean());
          contactsParams_ = null;
        }
        return contactsParamsBuilder_;
      }

      private java.lang.Object contactsNormalizerRef_ = "";
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @return Whether the contactsNormalizerRef field is set.
       */
      public boolean hasContactsNormalizerRef() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @return The contactsNormalizerRef.
       */
      public java.lang.String getContactsNormalizerRef() {
        java.lang.Object ref = contactsNormalizerRef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            contactsNormalizerRef_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @return The bytes for contactsNormalizerRef.
       */
      public com.google.protobuf.ByteString
          getContactsNormalizerRefBytes() {
        java.lang.Object ref = contactsNormalizerRef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          contactsNormalizerRef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @param value The contactsNormalizerRef to set.
       * @return This builder for chaining.
       */
      public Builder setContactsNormalizerRef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        contactsNormalizerRef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearContactsNormalizerRef() {
        bitField0_ = (bitField0_ & ~0x00000008);
        contactsNormalizerRef_ = getDefaultInstance().getContactsNormalizerRef();
        onChanged();
        return this;
      }
      /**
       * <code>optional string contacts_normalizer_ref = 4;</code>
       * @param value The bytes for contactsNormalizerRef to set.
       * @return This builder for chaining.
       */
      public Builder setContactsNormalizerRefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        contactsNormalizerRef_ = value;
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


      // @@protoc_insertion_point(builder_scope:greco.ContactsModelParams)
    }

    // @@protoc_insertion_point(class_scope:greco.ContactsModelParams)
    private static final greco.ContactsModelParamsOuterClass.ContactsModelParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.ContactsModelParamsOuterClass.ContactsModelParams();
    }

    public static greco.ContactsModelParamsOuterClass.ContactsModelParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ContactsModelParams>
        PARSER = new com.google.protobuf.AbstractParser<ContactsModelParams>() {
      @java.lang.Override
      public ContactsModelParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<ContactsModelParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ContactsModelParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.ContactsModelParamsOuterClass.ContactsModelParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 94579392;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.ContactsModelParamsOuterClass.ContactsModelParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.ContactsModelParamsOuterClass.ContactsModelParams.getDefaultInstance(),
          0,
          greco.ContactsModelParamsOuterClass.ContactsModelParams.class,
          greco.ContactsModelParamsOuterClass.ContactsModelParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_ContactsModelParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_ContactsModelParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1speech/greco3/context/contacts_model_p" +
      "arams.proto\022\005greco\0326speech/greco3/contex" +
      "t/dynamic_class_model_params.proto\032\037spee" +
      "ch/greco3/core/params.proto\"\327\001\n\023Contacts" +
      "ModelParams\022\025\n\rphonelist_ref\030\001 \001(\t\022\032\n\022pr" +
      "on_generator_ref\030\002 \001(\t\0222\n\017contacts_param" +
      "s\030\003 \001(\0132\031.greco.DynamicClassParams\022\037\n\027co" +
      "ntacts_normalizer_ref\030\004 \001(\t28\n\002id\022\r.grec" +
      "o.Params\030\300\325\214- \001(\0132\032.greco.ContactsModelP" +
      "aramsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.DynamicClassModelParamsOuterClass.getDescriptor(),
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_ContactsModelParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_ContactsModelParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_ContactsModelParams_descriptor,
        new java.lang.String[] { "PhonelistRef", "PronGeneratorRef", "ContactsParams", "ContactsNormalizerRef", });
    greco.DynamicClassModelParamsOuterClass.getDescriptor();
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}