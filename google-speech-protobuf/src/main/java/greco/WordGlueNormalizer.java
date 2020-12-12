// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/text_norm/word_glue_normalizer.proto

package greco;

public final class WordGlueNormalizer {
  private WordGlueNormalizer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.WordGlueNormalizer.WordGlueNormalizerParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WordGlueNormalizerParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.WordGlueNormalizerParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool strict = 1 [default = true];</code>
     * @return Whether the strict field is set.
     */
    boolean hasStrict();
    /**
     * <code>optional bool strict = 1 [default = true];</code>
     * @return The strict.
     */
    boolean getStrict();

    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return Whether the wordGlueDelimiter field is set.
     */
    boolean hasWordGlueDelimiter();
    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return The wordGlueDelimiter.
     */
    java.lang.String getWordGlueDelimiter();
    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return The bytes for wordGlueDelimiter.
     */
    com.google.protobuf.ByteString
        getWordGlueDelimiterBytes();

    /**
     * <code>repeated string special_symbols = 3;</code>
     * @return A list containing the specialSymbols.
     */
    java.util.List<java.lang.String>
        getSpecialSymbolsList();
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @return The count of specialSymbols.
     */
    int getSpecialSymbolsCount();
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @param index The index of the element to return.
     * @return The specialSymbols at the given index.
     */
    java.lang.String getSpecialSymbols(int index);
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the specialSymbols at the given index.
     */
    com.google.protobuf.ByteString
        getSpecialSymbolsBytes(int index);
  }
  /**
   * Protobuf type {@code greco.WordGlueNormalizerParams}
   */
  public static final class WordGlueNormalizerParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.WordGlueNormalizerParams)
      WordGlueNormalizerParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WordGlueNormalizerParams.newBuilder() to construct.
    private WordGlueNormalizerParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WordGlueNormalizerParams() {
      strict_ = true;
      wordGlueDelimiter_ = "";
      specialSymbols_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WordGlueNormalizerParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.WordGlueNormalizer.internal_static_greco_WordGlueNormalizerParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.WordGlueNormalizer.internal_static_greco_WordGlueNormalizerParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.WordGlueNormalizer.WordGlueNormalizerParams.class, greco.WordGlueNormalizer.WordGlueNormalizerParams.Builder.class);
    }

    private int bitField0_;
    public static final int STRICT_FIELD_NUMBER = 1;
    private boolean strict_;
    /**
     * <code>optional bool strict = 1 [default = true];</code>
     * @return Whether the strict field is set.
     */
    @java.lang.Override
    public boolean hasStrict() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool strict = 1 [default = true];</code>
     * @return The strict.
     */
    @java.lang.Override
    public boolean getStrict() {
      return strict_;
    }

    public static final int WORD_GLUE_DELIMITER_FIELD_NUMBER = 2;
    private volatile java.lang.Object wordGlueDelimiter_;
    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return Whether the wordGlueDelimiter field is set.
     */
    @java.lang.Override
    public boolean hasWordGlueDelimiter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return The wordGlueDelimiter.
     */
    @java.lang.Override
    public java.lang.String getWordGlueDelimiter() {
      java.lang.Object ref = wordGlueDelimiter_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          wordGlueDelimiter_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string word_glue_delimiter = 2;</code>
     * @return The bytes for wordGlueDelimiter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getWordGlueDelimiterBytes() {
      java.lang.Object ref = wordGlueDelimiter_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wordGlueDelimiter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SPECIAL_SYMBOLS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList specialSymbols_;
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @return A list containing the specialSymbols.
     */
    public com.google.protobuf.ProtocolStringList
        getSpecialSymbolsList() {
      return specialSymbols_;
    }
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @return The count of specialSymbols.
     */
    public int getSpecialSymbolsCount() {
      return specialSymbols_.size();
    }
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @param index The index of the element to return.
     * @return The specialSymbols at the given index.
     */
    public java.lang.String getSpecialSymbols(int index) {
      return specialSymbols_.get(index);
    }
    /**
     * <code>repeated string special_symbols = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the specialSymbols at the given index.
     */
    public com.google.protobuf.ByteString
        getSpecialSymbolsBytes(int index) {
      return specialSymbols_.getByteString(index);
    }

    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.WordGlueNormalizer.WordGlueNormalizerParams parseFrom(
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
    public static Builder newBuilder(greco.WordGlueNormalizer.WordGlueNormalizerParams prototype) {
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
     * Protobuf type {@code greco.WordGlueNormalizerParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.WordGlueNormalizerParams)
        greco.WordGlueNormalizer.WordGlueNormalizerParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.WordGlueNormalizer.internal_static_greco_WordGlueNormalizerParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.WordGlueNormalizer.internal_static_greco_WordGlueNormalizerParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.WordGlueNormalizer.WordGlueNormalizerParams.class, greco.WordGlueNormalizer.WordGlueNormalizerParams.Builder.class);
      }

      // Construct using greco.WordGlueNormalizer.WordGlueNormalizerParams.newBuilder()
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
        strict_ = true;
        bitField0_ = (bitField0_ & ~0x00000001);
        wordGlueDelimiter_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        specialSymbols_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.WordGlueNormalizer.internal_static_greco_WordGlueNormalizerParams_descriptor;
      }

      @java.lang.Override
      public greco.WordGlueNormalizer.WordGlueNormalizerParams getDefaultInstanceForType() {
        return greco.WordGlueNormalizer.WordGlueNormalizerParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.WordGlueNormalizer.WordGlueNormalizerParams build() {
        greco.WordGlueNormalizer.WordGlueNormalizerParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.WordGlueNormalizer.WordGlueNormalizerParams buildPartial() {
        greco.WordGlueNormalizer.WordGlueNormalizerParams result = new greco.WordGlueNormalizer.WordGlueNormalizerParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.strict_ = strict_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.wordGlueDelimiter_ = wordGlueDelimiter_;
        if (((bitField0_ & 0x00000004) != 0)) {
          specialSymbols_ = specialSymbols_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.specialSymbols_ = specialSymbols_;
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

      private boolean strict_ = true;
      /**
       * <code>optional bool strict = 1 [default = true];</code>
       * @return Whether the strict field is set.
       */
      @java.lang.Override
      public boolean hasStrict() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bool strict = 1 [default = true];</code>
       * @return The strict.
       */
      @java.lang.Override
      public boolean getStrict() {
        return strict_;
      }
      /**
       * <code>optional bool strict = 1 [default = true];</code>
       * @param value The strict to set.
       * @return This builder for chaining.
       */
      public Builder setStrict(boolean value) {
        bitField0_ |= 0x00000001;
        strict_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool strict = 1 [default = true];</code>
       * @return This builder for chaining.
       */
      public Builder clearStrict() {
        bitField0_ = (bitField0_ & ~0x00000001);
        strict_ = true;
        onChanged();
        return this;
      }

      private java.lang.Object wordGlueDelimiter_ = "";
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @return Whether the wordGlueDelimiter field is set.
       */
      public boolean hasWordGlueDelimiter() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @return The wordGlueDelimiter.
       */
      public java.lang.String getWordGlueDelimiter() {
        java.lang.Object ref = wordGlueDelimiter_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            wordGlueDelimiter_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @return The bytes for wordGlueDelimiter.
       */
      public com.google.protobuf.ByteString
          getWordGlueDelimiterBytes() {
        java.lang.Object ref = wordGlueDelimiter_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          wordGlueDelimiter_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @param value The wordGlueDelimiter to set.
       * @return This builder for chaining.
       */
      public Builder setWordGlueDelimiter(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        wordGlueDelimiter_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordGlueDelimiter() {
        bitField0_ = (bitField0_ & ~0x00000002);
        wordGlueDelimiter_ = getDefaultInstance().getWordGlueDelimiter();
        onChanged();
        return this;
      }
      /**
       * <code>optional string word_glue_delimiter = 2;</code>
       * @param value The bytes for wordGlueDelimiter to set.
       * @return This builder for chaining.
       */
      public Builder setWordGlueDelimiterBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        wordGlueDelimiter_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList specialSymbols_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureSpecialSymbolsIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          specialSymbols_ = new com.google.protobuf.LazyStringArrayList(specialSymbols_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @return A list containing the specialSymbols.
       */
      public com.google.protobuf.ProtocolStringList
          getSpecialSymbolsList() {
        return specialSymbols_.getUnmodifiableView();
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @return The count of specialSymbols.
       */
      public int getSpecialSymbolsCount() {
        return specialSymbols_.size();
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param index The index of the element to return.
       * @return The specialSymbols at the given index.
       */
      public java.lang.String getSpecialSymbols(int index) {
        return specialSymbols_.get(index);
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param index The index of the value to return.
       * @return The bytes of the specialSymbols at the given index.
       */
      public com.google.protobuf.ByteString
          getSpecialSymbolsBytes(int index) {
        return specialSymbols_.getByteString(index);
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param index The index to set the value at.
       * @param value The specialSymbols to set.
       * @return This builder for chaining.
       */
      public Builder setSpecialSymbols(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSpecialSymbolsIsMutable();
        specialSymbols_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param value The specialSymbols to add.
       * @return This builder for chaining.
       */
      public Builder addSpecialSymbols(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSpecialSymbolsIsMutable();
        specialSymbols_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param values The specialSymbols to add.
       * @return This builder for chaining.
       */
      public Builder addAllSpecialSymbols(
          java.lang.Iterable<java.lang.String> values) {
        ensureSpecialSymbolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, specialSymbols_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpecialSymbols() {
        specialSymbols_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string special_symbols = 3;</code>
       * @param value The bytes of the specialSymbols to add.
       * @return This builder for chaining.
       */
      public Builder addSpecialSymbolsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureSpecialSymbolsIsMutable();
        specialSymbols_.add(value);
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


      // @@protoc_insertion_point(builder_scope:greco.WordGlueNormalizerParams)
    }

    // @@protoc_insertion_point(class_scope:greco.WordGlueNormalizerParams)
    private static final greco.WordGlueNormalizer.WordGlueNormalizerParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.WordGlueNormalizer.WordGlueNormalizerParams();
    }

    public static greco.WordGlueNormalizer.WordGlueNormalizerParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<WordGlueNormalizerParams>
        PARSER = new com.google.protobuf.AbstractParser<WordGlueNormalizerParams>() {
      @java.lang.Override
      public WordGlueNormalizerParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<WordGlueNormalizerParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WordGlueNormalizerParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.WordGlueNormalizer.WordGlueNormalizerParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 24827402;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.WordGlueNormalizer.WordGlueNormalizerParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.WordGlueNormalizer.WordGlueNormalizerParams.getDefaultInstance(),
          0,
          greco.WordGlueNormalizer.WordGlueNormalizerParams.class,
          greco.WordGlueNormalizer.WordGlueNormalizerParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_WordGlueNormalizerParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_WordGlueNormalizerParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2speech/greco3/text_norm/word_glue_norm" +
      "alizer.proto\022\005greco\032\037speech/greco3/core/" +
      "params.proto\"\245\001\n\030WordGlueNormalizerParam" +
      "s\022\024\n\006strict\030\001 \001(\010:\004true\022\033\n\023word_glue_del" +
      "imiter\030\002 \001(\t\022\027\n\017special_symbols\030\003 \003(\t2=\n" +
      "\002id\022\r.greco.Params\030\212\254\353\013 \001(\0132\037.greco.Word" +
      "GlueNormalizerParamsB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_WordGlueNormalizerParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_WordGlueNormalizerParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_WordGlueNormalizerParams_descriptor,
        new java.lang.String[] { "Strict", "WordGlueDelimiter", "SpecialSymbols", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
