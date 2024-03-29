// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/text_norm/runtime_normalizer.proto

package greco;

public final class RuntimeNormalizer {
  private RuntimeNormalizer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NormalizedTextOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.NormalizedText)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string text = 1;</code>
     * @return Whether the text field is set.
     */
    boolean hasText();
    /**
     * <code>optional string text = 1;</code>
     * @return The text.
     */
    java.lang.String getText();
    /**
     * <code>optional string text = 1;</code>
     * @return The bytes for text.
     */
    com.google.protobuf.ByteString
        getTextBytes();

    /**
     * <code>optional bool is_partial = 3;</code>
     * @return Whether the isPartial field is set.
     */
    boolean hasIsPartial();
    /**
     * <code>optional bool is_partial = 3;</code>
     * @return The isPartial.
     */
    boolean getIsPartial();

    /**
     * <code>optional bool is_hotword_normalized = 4;</code>
     * @return Whether the isHotwordNormalized field is set.
     */
    boolean hasIsHotwordNormalized();
    /**
     * <code>optional bool is_hotword_normalized = 4;</code>
     * @return The isHotwordNormalized.
     */
    boolean getIsHotwordNormalized();

    /**
     * <code>optional bool is_word_glue_normalized = 5;</code>
     * @return Whether the isWordGlueNormalized field is set.
     */
    boolean hasIsWordGlueNormalized();
    /**
     * <code>optional bool is_word_glue_normalized = 5;</code>
     * @return The isWordGlueNormalized.
     */
    boolean getIsWordGlueNormalized();

    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    java.util.List<speech.DecodedWordProto.DecodedWord> 
        getDecodedWordsList();
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    speech.DecodedWordProto.DecodedWord getDecodedWords(int index);
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    int getDecodedWordsCount();
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    java.util.List<? extends speech.DecodedWordProto.DecodedWordOrBuilder> 
        getDecodedWordsOrBuilderList();
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    speech.DecodedWordProto.DecodedWordOrBuilder getDecodedWordsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code greco.NormalizedText}
   */
  public static final class NormalizedText extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.NormalizedText)
      NormalizedTextOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NormalizedText.newBuilder() to construct.
    private NormalizedText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NormalizedText() {
      text_ = "";
      decodedWords_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NormalizedText();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.RuntimeNormalizer.internal_static_greco_NormalizedText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.RuntimeNormalizer.internal_static_greco_NormalizedText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.RuntimeNormalizer.NormalizedText.class, greco.RuntimeNormalizer.NormalizedText.Builder.class);
    }

    private int bitField0_;
    public static final int TEXT_FIELD_NUMBER = 1;
    private volatile java.lang.Object text_;
    /**
     * <code>optional string text = 1;</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string text = 1;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string text = 1;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_PARTIAL_FIELD_NUMBER = 3;
    private boolean isPartial_;
    /**
     * <code>optional bool is_partial = 3;</code>
     * @return Whether the isPartial field is set.
     */
    @java.lang.Override
    public boolean hasIsPartial() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool is_partial = 3;</code>
     * @return The isPartial.
     */
    @java.lang.Override
    public boolean getIsPartial() {
      return isPartial_;
    }

    public static final int IS_HOTWORD_NORMALIZED_FIELD_NUMBER = 4;
    private boolean isHotwordNormalized_;
    /**
     * <code>optional bool is_hotword_normalized = 4;</code>
     * @return Whether the isHotwordNormalized field is set.
     */
    @java.lang.Override
    public boolean hasIsHotwordNormalized() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool is_hotword_normalized = 4;</code>
     * @return The isHotwordNormalized.
     */
    @java.lang.Override
    public boolean getIsHotwordNormalized() {
      return isHotwordNormalized_;
    }

    public static final int IS_WORD_GLUE_NORMALIZED_FIELD_NUMBER = 5;
    private boolean isWordGlueNormalized_;
    /**
     * <code>optional bool is_word_glue_normalized = 5;</code>
     * @return Whether the isWordGlueNormalized field is set.
     */
    @java.lang.Override
    public boolean hasIsWordGlueNormalized() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool is_word_glue_normalized = 5;</code>
     * @return The isWordGlueNormalized.
     */
    @java.lang.Override
    public boolean getIsWordGlueNormalized() {
      return isWordGlueNormalized_;
    }

    public static final int DECODED_WORDS_FIELD_NUMBER = 2;
    private java.util.List<speech.DecodedWordProto.DecodedWord> decodedWords_;
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    @java.lang.Override
    public java.util.List<speech.DecodedWordProto.DecodedWord> getDecodedWordsList() {
      return decodedWords_;
    }
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends speech.DecodedWordProto.DecodedWordOrBuilder> 
        getDecodedWordsOrBuilderList() {
      return decodedWords_;
    }
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    @java.lang.Override
    public int getDecodedWordsCount() {
      return decodedWords_.size();
    }
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    @java.lang.Override
    public speech.DecodedWordProto.DecodedWord getDecodedWords(int index) {
      return decodedWords_.get(index);
    }
    /**
     * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
     */
    @java.lang.Override
    public speech.DecodedWordProto.DecodedWordOrBuilder getDecodedWordsOrBuilder(
        int index) {
      return decodedWords_.get(index);
    }

    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.RuntimeNormalizer.NormalizedText parseFrom(
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
    public static Builder newBuilder(greco.RuntimeNormalizer.NormalizedText prototype) {
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
     * Protobuf type {@code greco.NormalizedText}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.NormalizedText)
        greco.RuntimeNormalizer.NormalizedTextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.RuntimeNormalizer.internal_static_greco_NormalizedText_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.RuntimeNormalizer.internal_static_greco_NormalizedText_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.RuntimeNormalizer.NormalizedText.class, greco.RuntimeNormalizer.NormalizedText.Builder.class);
      }

      // Construct using greco.RuntimeNormalizer.NormalizedText.newBuilder()
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
          getDecodedWordsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        isPartial_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        isHotwordNormalized_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        isWordGlueNormalized_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (decodedWordsBuilder_ == null) {
          decodedWords_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          decodedWordsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.RuntimeNormalizer.internal_static_greco_NormalizedText_descriptor;
      }

      @java.lang.Override
      public greco.RuntimeNormalizer.NormalizedText getDefaultInstanceForType() {
        return greco.RuntimeNormalizer.NormalizedText.getDefaultInstance();
      }

      @java.lang.Override
      public greco.RuntimeNormalizer.NormalizedText build() {
        greco.RuntimeNormalizer.NormalizedText result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.RuntimeNormalizer.NormalizedText buildPartial() {
        greco.RuntimeNormalizer.NormalizedText result = new greco.RuntimeNormalizer.NormalizedText(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.text_ = text_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isPartial_ = isPartial_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isHotwordNormalized_ = isHotwordNormalized_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isWordGlueNormalized_ = isWordGlueNormalized_;
          to_bitField0_ |= 0x00000008;
        }
        if (decodedWordsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            decodedWords_ = java.util.Collections.unmodifiableList(decodedWords_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.decodedWords_ = decodedWords_;
        } else {
          result.decodedWords_ = decodedWordsBuilder_.build();
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

      private java.lang.Object text_ = "";
      /**
       * <code>optional string text = 1;</code>
       * @return Whether the text field is set.
       */
      public boolean hasText() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string text = 1;</code>
       * @return The text.
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            text_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string text = 1;</code>
       * @return The bytes for text.
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string text = 1;</code>
       * @param value The text to set.
       * @return This builder for chaining.
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string text = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000001);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>optional string text = 1;</code>
       * @param value The bytes for text to set.
       * @return This builder for chaining.
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        text_ = value;
        onChanged();
        return this;
      }

      private boolean isPartial_ ;
      /**
       * <code>optional bool is_partial = 3;</code>
       * @return Whether the isPartial field is set.
       */
      @java.lang.Override
      public boolean hasIsPartial() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool is_partial = 3;</code>
       * @return The isPartial.
       */
      @java.lang.Override
      public boolean getIsPartial() {
        return isPartial_;
      }
      /**
       * <code>optional bool is_partial = 3;</code>
       * @param value The isPartial to set.
       * @return This builder for chaining.
       */
      public Builder setIsPartial(boolean value) {
        bitField0_ |= 0x00000002;
        isPartial_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_partial = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPartial() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isPartial_ = false;
        onChanged();
        return this;
      }

      private boolean isHotwordNormalized_ ;
      /**
       * <code>optional bool is_hotword_normalized = 4;</code>
       * @return Whether the isHotwordNormalized field is set.
       */
      @java.lang.Override
      public boolean hasIsHotwordNormalized() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bool is_hotword_normalized = 4;</code>
       * @return The isHotwordNormalized.
       */
      @java.lang.Override
      public boolean getIsHotwordNormalized() {
        return isHotwordNormalized_;
      }
      /**
       * <code>optional bool is_hotword_normalized = 4;</code>
       * @param value The isHotwordNormalized to set.
       * @return This builder for chaining.
       */
      public Builder setIsHotwordNormalized(boolean value) {
        bitField0_ |= 0x00000004;
        isHotwordNormalized_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_hotword_normalized = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHotwordNormalized() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isHotwordNormalized_ = false;
        onChanged();
        return this;
      }

      private boolean isWordGlueNormalized_ ;
      /**
       * <code>optional bool is_word_glue_normalized = 5;</code>
       * @return Whether the isWordGlueNormalized field is set.
       */
      @java.lang.Override
      public boolean hasIsWordGlueNormalized() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bool is_word_glue_normalized = 5;</code>
       * @return The isWordGlueNormalized.
       */
      @java.lang.Override
      public boolean getIsWordGlueNormalized() {
        return isWordGlueNormalized_;
      }
      /**
       * <code>optional bool is_word_glue_normalized = 5;</code>
       * @param value The isWordGlueNormalized to set.
       * @return This builder for chaining.
       */
      public Builder setIsWordGlueNormalized(boolean value) {
        bitField0_ |= 0x00000008;
        isWordGlueNormalized_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool is_word_glue_normalized = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWordGlueNormalized() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isWordGlueNormalized_ = false;
        onChanged();
        return this;
      }

      private java.util.List<speech.DecodedWordProto.DecodedWord> decodedWords_ =
        java.util.Collections.emptyList();
      private void ensureDecodedWordsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          decodedWords_ = new java.util.ArrayList<speech.DecodedWordProto.DecodedWord>(decodedWords_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          speech.DecodedWordProto.DecodedWord, speech.DecodedWordProto.DecodedWord.Builder, speech.DecodedWordProto.DecodedWordOrBuilder> decodedWordsBuilder_;

      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public java.util.List<speech.DecodedWordProto.DecodedWord> getDecodedWordsList() {
        if (decodedWordsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(decodedWords_);
        } else {
          return decodedWordsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public int getDecodedWordsCount() {
        if (decodedWordsBuilder_ == null) {
          return decodedWords_.size();
        } else {
          return decodedWordsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public speech.DecodedWordProto.DecodedWord getDecodedWords(int index) {
        if (decodedWordsBuilder_ == null) {
          return decodedWords_.get(index);
        } else {
          return decodedWordsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder setDecodedWords(
          int index, speech.DecodedWordProto.DecodedWord value) {
        if (decodedWordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDecodedWordsIsMutable();
          decodedWords_.set(index, value);
          onChanged();
        } else {
          decodedWordsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder setDecodedWords(
          int index, speech.DecodedWordProto.DecodedWord.Builder builderForValue) {
        if (decodedWordsBuilder_ == null) {
          ensureDecodedWordsIsMutable();
          decodedWords_.set(index, builderForValue.build());
          onChanged();
        } else {
          decodedWordsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder addDecodedWords(speech.DecodedWordProto.DecodedWord value) {
        if (decodedWordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDecodedWordsIsMutable();
          decodedWords_.add(value);
          onChanged();
        } else {
          decodedWordsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder addDecodedWords(
          int index, speech.DecodedWordProto.DecodedWord value) {
        if (decodedWordsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDecodedWordsIsMutable();
          decodedWords_.add(index, value);
          onChanged();
        } else {
          decodedWordsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder addDecodedWords(
          speech.DecodedWordProto.DecodedWord.Builder builderForValue) {
        if (decodedWordsBuilder_ == null) {
          ensureDecodedWordsIsMutable();
          decodedWords_.add(builderForValue.build());
          onChanged();
        } else {
          decodedWordsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder addDecodedWords(
          int index, speech.DecodedWordProto.DecodedWord.Builder builderForValue) {
        if (decodedWordsBuilder_ == null) {
          ensureDecodedWordsIsMutable();
          decodedWords_.add(index, builderForValue.build());
          onChanged();
        } else {
          decodedWordsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder addAllDecodedWords(
          java.lang.Iterable<? extends speech.DecodedWordProto.DecodedWord> values) {
        if (decodedWordsBuilder_ == null) {
          ensureDecodedWordsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, decodedWords_);
          onChanged();
        } else {
          decodedWordsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder clearDecodedWords() {
        if (decodedWordsBuilder_ == null) {
          decodedWords_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          decodedWordsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public Builder removeDecodedWords(int index) {
        if (decodedWordsBuilder_ == null) {
          ensureDecodedWordsIsMutable();
          decodedWords_.remove(index);
          onChanged();
        } else {
          decodedWordsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public speech.DecodedWordProto.DecodedWord.Builder getDecodedWordsBuilder(
          int index) {
        return getDecodedWordsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public speech.DecodedWordProto.DecodedWordOrBuilder getDecodedWordsOrBuilder(
          int index) {
        if (decodedWordsBuilder_ == null) {
          return decodedWords_.get(index);  } else {
          return decodedWordsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public java.util.List<? extends speech.DecodedWordProto.DecodedWordOrBuilder> 
           getDecodedWordsOrBuilderList() {
        if (decodedWordsBuilder_ != null) {
          return decodedWordsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(decodedWords_);
        }
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public speech.DecodedWordProto.DecodedWord.Builder addDecodedWordsBuilder() {
        return getDecodedWordsFieldBuilder().addBuilder(
            speech.DecodedWordProto.DecodedWord.getDefaultInstance());
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public speech.DecodedWordProto.DecodedWord.Builder addDecodedWordsBuilder(
          int index) {
        return getDecodedWordsFieldBuilder().addBuilder(
            index, speech.DecodedWordProto.DecodedWord.getDefaultInstance());
      }
      /**
       * <code>repeated .speech.DecodedWord decoded_words = 2;</code>
       */
      public java.util.List<speech.DecodedWordProto.DecodedWord.Builder> 
           getDecodedWordsBuilderList() {
        return getDecodedWordsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          speech.DecodedWordProto.DecodedWord, speech.DecodedWordProto.DecodedWord.Builder, speech.DecodedWordProto.DecodedWordOrBuilder> 
          getDecodedWordsFieldBuilder() {
        if (decodedWordsBuilder_ == null) {
          decodedWordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              speech.DecodedWordProto.DecodedWord, speech.DecodedWordProto.DecodedWord.Builder, speech.DecodedWordProto.DecodedWordOrBuilder>(
                  decodedWords_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          decodedWords_ = null;
        }
        return decodedWordsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:greco.NormalizedText)
    }

    // @@protoc_insertion_point(class_scope:greco.NormalizedText)
    private static final greco.RuntimeNormalizer.NormalizedText DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.RuntimeNormalizer.NormalizedText();
    }

    public static greco.RuntimeNormalizer.NormalizedText getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<NormalizedText>
        PARSER = new com.google.protobuf.AbstractParser<NormalizedText>() {
      @java.lang.Override
      public NormalizedText parsePartialFrom(
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

    public static com.google.protobuf.Parser<NormalizedText> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NormalizedText> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.RuntimeNormalizer.NormalizedText getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_NormalizedText_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_NormalizedText_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0speech/greco3/text_norm/runtime_normal" +
      "izer.proto\022\005greco\032(speech/decoder/common" +
      "/decoded_word.proto\"\236\001\n\016NormalizedText\022\014" +
      "\n\004text\030\001 \001(\t\022\022\n\nis_partial\030\003 \001(\010\022\035\n\025is_h" +
      "otword_normalized\030\004 \001(\010\022\037\n\027is_word_glue_" +
      "normalized\030\005 \001(\010\022*\n\rdecoded_words\030\002 \003(\0132" +
      "\023.speech.DecodedWordB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          speech.DecodedWordProto.getDescriptor(),
        });
    internal_static_greco_NormalizedText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_NormalizedText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_NormalizedText_descriptor,
        new java.lang.String[] { "Text", "IsPartial", "IsHotwordNormalized", "IsWordGlueNormalized", "DecodedWords", });
    speech.DecodedWordProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
