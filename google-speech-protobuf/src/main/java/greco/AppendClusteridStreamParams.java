// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/greco3/frontend/append_clusterid_stream_params.proto

package greco;

public final class AppendClusteridStreamParams {
  private AppendClusteridStreamParams() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.id);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AppendClusterIdStreamParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:greco.AppendClusterIdStreamParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 forced_cluster_id = 1;</code>
     * @return Whether the forcedClusterId field is set.
     */
    boolean hasForcedClusterId();
    /**
     * <code>optional int32 forced_cluster_id = 1;</code>
     * @return The forcedClusterId.
     */
    int getForcedClusterId();

    /**
     * <code>optional bool use_one_hot_encoding = 2;</code>
     * @return Whether the useOneHotEncoding field is set.
     */
    boolean hasUseOneHotEncoding();
    /**
     * <code>optional bool use_one_hot_encoding = 2;</code>
     * @return The useOneHotEncoding.
     */
    boolean getUseOneHotEncoding();

    /**
     * <code>optional int32 num_clusters = 3;</code>
     * @return Whether the numClusters field is set.
     */
    boolean hasNumClusters();
    /**
     * <code>optional int32 num_clusters = 3;</code>
     * @return The numClusters.
     */
    int getNumClusters();

    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    int getDomainNameToInternalIdCount();
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    boolean containsDomainNameToInternalId(
        java.lang.String key);
    /**
     * Use {@link #getDomainNameToInternalIdMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Integer>
    getDomainNameToInternalId();
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    java.util.Map<java.lang.String, java.lang.Integer>
    getDomainNameToInternalIdMap();
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */

    int getDomainNameToInternalIdOrDefault(
        java.lang.String key,
        int defaultValue);
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */

    int getDomainNameToInternalIdOrThrow(
        java.lang.String key);
  }
  /**
   * Protobuf type {@code greco.AppendClusterIdStreamParams}
   */
  public static final class AppendClusterIdStreamParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:greco.AppendClusterIdStreamParams)
      AppendClusterIdStreamParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AppendClusterIdStreamParams.newBuilder() to construct.
    private AppendClusterIdStreamParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AppendClusterIdStreamParams() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AppendClusterIdStreamParams();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetDomainNameToInternalId();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.class, greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.Builder.class);
    }

    private int bitField0_;
    public static final int FORCED_CLUSTER_ID_FIELD_NUMBER = 1;
    private int forcedClusterId_;
    /**
     * <code>optional int32 forced_cluster_id = 1;</code>
     * @return Whether the forcedClusterId field is set.
     */
    @java.lang.Override
    public boolean hasForcedClusterId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 forced_cluster_id = 1;</code>
     * @return The forcedClusterId.
     */
    @java.lang.Override
    public int getForcedClusterId() {
      return forcedClusterId_;
    }

    public static final int USE_ONE_HOT_ENCODING_FIELD_NUMBER = 2;
    private boolean useOneHotEncoding_;
    /**
     * <code>optional bool use_one_hot_encoding = 2;</code>
     * @return Whether the useOneHotEncoding field is set.
     */
    @java.lang.Override
    public boolean hasUseOneHotEncoding() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool use_one_hot_encoding = 2;</code>
     * @return The useOneHotEncoding.
     */
    @java.lang.Override
    public boolean getUseOneHotEncoding() {
      return useOneHotEncoding_;
    }

    public static final int NUM_CLUSTERS_FIELD_NUMBER = 3;
    private int numClusters_;
    /**
     * <code>optional int32 num_clusters = 3;</code>
     * @return Whether the numClusters field is set.
     */
    @java.lang.Override
    public boolean hasNumClusters() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 num_clusters = 3;</code>
     * @return The numClusters.
     */
    @java.lang.Override
    public int getNumClusters() {
      return numClusters_;
    }

    public static final int DOMAIN_NAME_TO_INTERNAL_ID_FIELD_NUMBER = 4;
    private static final class DomainNameToInternalIdDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.Integer>newDefaultInstance(
                  greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> domainNameToInternalId_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetDomainNameToInternalId() {
      if (domainNameToInternalId_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DomainNameToInternalIdDefaultEntryHolder.defaultEntry);
      }
      return domainNameToInternalId_;
    }

    public int getDomainNameToInternalIdCount() {
      return internalGetDomainNameToInternalId().getMap().size();
    }
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */

    @java.lang.Override
    public boolean containsDomainNameToInternalId(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetDomainNameToInternalId().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDomainNameToInternalIdMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer> getDomainNameToInternalId() {
      return getDomainNameToInternalIdMap();
    }
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Integer> getDomainNameToInternalIdMap() {
      return internalGetDomainNameToInternalId().getMap();
    }
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    @java.lang.Override

    public int getDomainNameToInternalIdOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetDomainNameToInternalId().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
     */
    @java.lang.Override

    public int getDomainNameToInternalIdOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetDomainNameToInternalId().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams parseFrom(
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
    public static Builder newBuilder(greco.AppendClusteridStreamParams.AppendClusterIdStreamParams prototype) {
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
     * Protobuf type {@code greco.AppendClusterIdStreamParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:greco.AppendClusterIdStreamParams)
        greco.AppendClusteridStreamParams.AppendClusterIdStreamParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetDomainNameToInternalId();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableDomainNameToInternalId();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.class, greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.Builder.class);
      }

      // Construct using greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.newBuilder()
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
        forcedClusterId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        useOneHotEncoding_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        numClusters_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        internalGetMutableDomainNameToInternalId().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return greco.AppendClusteridStreamParams.internal_static_greco_AppendClusterIdStreamParams_descriptor;
      }

      @java.lang.Override
      public greco.AppendClusteridStreamParams.AppendClusterIdStreamParams getDefaultInstanceForType() {
        return greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.getDefaultInstance();
      }

      @java.lang.Override
      public greco.AppendClusteridStreamParams.AppendClusterIdStreamParams build() {
        greco.AppendClusteridStreamParams.AppendClusterIdStreamParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public greco.AppendClusteridStreamParams.AppendClusterIdStreamParams buildPartial() {
        greco.AppendClusteridStreamParams.AppendClusterIdStreamParams result = new greco.AppendClusteridStreamParams.AppendClusterIdStreamParams(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.forcedClusterId_ = forcedClusterId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.useOneHotEncoding_ = useOneHotEncoding_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.numClusters_ = numClusters_;
          to_bitField0_ |= 0x00000004;
        }
        result.domainNameToInternalId_ = internalGetDomainNameToInternalId();
        result.domainNameToInternalId_.makeImmutable();
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

      private int forcedClusterId_ ;
      /**
       * <code>optional int32 forced_cluster_id = 1;</code>
       * @return Whether the forcedClusterId field is set.
       */
      @java.lang.Override
      public boolean hasForcedClusterId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 forced_cluster_id = 1;</code>
       * @return The forcedClusterId.
       */
      @java.lang.Override
      public int getForcedClusterId() {
        return forcedClusterId_;
      }
      /**
       * <code>optional int32 forced_cluster_id = 1;</code>
       * @param value The forcedClusterId to set.
       * @return This builder for chaining.
       */
      public Builder setForcedClusterId(int value) {
        bitField0_ |= 0x00000001;
        forcedClusterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 forced_cluster_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearForcedClusterId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        forcedClusterId_ = 0;
        onChanged();
        return this;
      }

      private boolean useOneHotEncoding_ ;
      /**
       * <code>optional bool use_one_hot_encoding = 2;</code>
       * @return Whether the useOneHotEncoding field is set.
       */
      @java.lang.Override
      public boolean hasUseOneHotEncoding() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool use_one_hot_encoding = 2;</code>
       * @return The useOneHotEncoding.
       */
      @java.lang.Override
      public boolean getUseOneHotEncoding() {
        return useOneHotEncoding_;
      }
      /**
       * <code>optional bool use_one_hot_encoding = 2;</code>
       * @param value The useOneHotEncoding to set.
       * @return This builder for chaining.
       */
      public Builder setUseOneHotEncoding(boolean value) {
        bitField0_ |= 0x00000002;
        useOneHotEncoding_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool use_one_hot_encoding = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseOneHotEncoding() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useOneHotEncoding_ = false;
        onChanged();
        return this;
      }

      private int numClusters_ ;
      /**
       * <code>optional int32 num_clusters = 3;</code>
       * @return Whether the numClusters field is set.
       */
      @java.lang.Override
      public boolean hasNumClusters() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 num_clusters = 3;</code>
       * @return The numClusters.
       */
      @java.lang.Override
      public int getNumClusters() {
        return numClusters_;
      }
      /**
       * <code>optional int32 num_clusters = 3;</code>
       * @param value The numClusters to set.
       * @return This builder for chaining.
       */
      public Builder setNumClusters(int value) {
        bitField0_ |= 0x00000004;
        numClusters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 num_clusters = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumClusters() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numClusters_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.Integer> domainNameToInternalId_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
      internalGetDomainNameToInternalId() {
        if (domainNameToInternalId_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              DomainNameToInternalIdDefaultEntryHolder.defaultEntry);
        }
        return domainNameToInternalId_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
      internalGetMutableDomainNameToInternalId() {
        onChanged();;
        if (domainNameToInternalId_ == null) {
          domainNameToInternalId_ = com.google.protobuf.MapField.newMapField(
              DomainNameToInternalIdDefaultEntryHolder.defaultEntry);
        }
        if (!domainNameToInternalId_.isMutable()) {
          domainNameToInternalId_ = domainNameToInternalId_.copy();
        }
        return domainNameToInternalId_;
      }

      public int getDomainNameToInternalIdCount() {
        return internalGetDomainNameToInternalId().getMap().size();
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */

      @java.lang.Override
      public boolean containsDomainNameToInternalId(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetDomainNameToInternalId().getMap().containsKey(key);
      }
      /**
       * Use {@link #getDomainNameToInternalIdMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Integer> getDomainNameToInternalId() {
        return getDomainNameToInternalIdMap();
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.String, java.lang.Integer> getDomainNameToInternalIdMap() {
        return internalGetDomainNameToInternalId().getMap();
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */
      @java.lang.Override

      public int getDomainNameToInternalIdOrDefault(
          java.lang.String key,
          int defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Integer> map =
            internalGetDomainNameToInternalId().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */
      @java.lang.Override

      public int getDomainNameToInternalIdOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.Integer> map =
            internalGetDomainNameToInternalId().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearDomainNameToInternalId() {
        internalGetMutableDomainNameToInternalId().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */

      public Builder removeDomainNameToInternalId(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableDomainNameToInternalId().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Integer>
      getMutableDomainNameToInternalId() {
        return internalGetMutableDomainNameToInternalId().getMutableMap();
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */
      public Builder putDomainNameToInternalId(
          java.lang.String key,
          int value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        
        internalGetMutableDomainNameToInternalId().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, int32&gt; domain_name_to_internal_id = 4;</code>
       */

      public Builder putAllDomainNameToInternalId(
          java.util.Map<java.lang.String, java.lang.Integer> values) {
        internalGetMutableDomainNameToInternalId().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:greco.AppendClusterIdStreamParams)
    }

    // @@protoc_insertion_point(class_scope:greco.AppendClusterIdStreamParams)
    private static final greco.AppendClusteridStreamParams.AppendClusterIdStreamParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new greco.AppendClusteridStreamParams.AppendClusterIdStreamParams();
    }

    public static greco.AppendClusteridStreamParams.AppendClusterIdStreamParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AppendClusterIdStreamParams>
        PARSER = new com.google.protobuf.AbstractParser<AppendClusterIdStreamParams>() {
      @java.lang.Override
      public AppendClusterIdStreamParams parsePartialFrom(
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

    public static com.google.protobuf.Parser<AppendClusterIdStreamParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppendClusterIdStreamParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public greco.AppendClusteridStreamParams.AppendClusterIdStreamParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int ID_FIELD_NUMBER = 247260833;
    /**
     * <code>extend .greco.Params { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        greco.ParamsProto.Params,
        greco.AppendClusteridStreamParams.AppendClusterIdStreamParams> id = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.getDefaultInstance(),
          0,
          greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.class,
          greco.AppendClusteridStreamParams.AppendClusterIdStreamParams.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_AppendClusterIdStreamParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_AppendClusterIdStreamParams_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;speech/greco3/frontend/append_clusteri" +
      "d_stream_params.proto\022\005greco\032\037speech/gre" +
      "co3/core/params.proto\"\321\002\n\033AppendClusterI" +
      "dStreamParams\022\031\n\021forced_cluster_id\030\001 \001(\005" +
      "\022\034\n\024use_one_hot_encoding\030\002 \001(\010\022\024\n\014num_cl" +
      "usters\030\003 \001(\005\022b\n\032domain_name_to_internal_" +
      "id\030\004 \003(\0132>.greco.AppendClusterIdStreamPa" +
      "rams.DomainNameToInternalIdEntry\032=\n\033Doma" +
      "inNameToInternalIdEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\005:\0028\0012@\n\002id\022\r.greco.Params\030\241\315\363" +
      "u \001(\0132\".greco.AppendClusterIdStreamParam" +
      "sB\010H\002\242\002\003GRC"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          greco.ParamsProto.getDescriptor(),
        });
    internal_static_greco_AppendClusterIdStreamParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greco_AppendClusterIdStreamParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_AppendClusterIdStreamParams_descriptor,
        new java.lang.String[] { "ForcedClusterId", "UseOneHotEncoding", "NumClusters", "DomainNameToInternalId", });
    internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_descriptor =
      internal_static_greco_AppendClusterIdStreamParams_descriptor.getNestedTypes().get(0);
    internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greco_AppendClusterIdStreamParams_DomainNameToInternalIdEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    greco.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}