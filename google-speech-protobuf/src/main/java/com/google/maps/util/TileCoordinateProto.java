// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maps/util/tile_coordinate.proto

package com.google.maps.util;

/**
 * Protobuf type {@code maps_util.TileCoordinateProto}
 */
public final class TileCoordinateProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maps_util.TileCoordinateProto)
    TileCoordinateProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TileCoordinateProto.newBuilder() to construct.
  private TileCoordinateProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TileCoordinateProto() {
    tileSize_ = 256;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TileCoordinateProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.util.DummyTileCoordinateProto.internal_static_maps_util_TileCoordinateProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.util.DummyTileCoordinateProto.internal_static_maps_util_TileCoordinateProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.util.TileCoordinateProto.class, com.google.maps.util.TileCoordinateProto.Builder.class);
  }

  private int bitField0_;
  public static final int ZOOM_FIELD_NUMBER = 1;
  private int zoom_;
  /**
   * <code>required int32 zoom = 1;</code>
   * @return Whether the zoom field is set.
   */
  @java.lang.Override
  public boolean hasZoom() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int32 zoom = 1;</code>
   * @return The zoom.
   */
  @java.lang.Override
  public int getZoom() {
    return zoom_;
  }

  public static final int X_FIELD_NUMBER = 2;
  private int x_;
  /**
   * <code>required int32 x = 2;</code>
   * @return Whether the x field is set.
   */
  @java.lang.Override
  public boolean hasX() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int32 x = 2;</code>
   * @return The x.
   */
  @java.lang.Override
  public int getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 3;
  private int y_;
  /**
   * <code>required int32 y = 3;</code>
   * @return Whether the y field is set.
   */
  @java.lang.Override
  public boolean hasY() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>required int32 y = 3;</code>
   * @return The y.
   */
  @java.lang.Override
  public int getY() {
    return y_;
  }

  public static final int TILE_SIZE_FIELD_NUMBER = 4;
  private int tileSize_;
  /**
   * <code>optional int32 tile_size = 4 [default = 256];</code>
   * @return Whether the tileSize field is set.
   */
  @java.lang.Override
  public boolean hasTileSize() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int32 tile_size = 4 [default = 256];</code>
   * @return The tileSize.
   */
  @java.lang.Override
  public int getTileSize() {
    return tileSize_;
  }

  public static com.google.maps.util.TileCoordinateProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.util.TileCoordinateProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.maps.util.TileCoordinateProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.util.TileCoordinateProto parseFrom(
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
  public static Builder newBuilder(com.google.maps.util.TileCoordinateProto prototype) {
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
   * Protobuf type {@code maps_util.TileCoordinateProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maps_util.TileCoordinateProto)
      com.google.maps.util.TileCoordinateProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.util.DummyTileCoordinateProto.internal_static_maps_util_TileCoordinateProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.util.DummyTileCoordinateProto.internal_static_maps_util_TileCoordinateProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.util.TileCoordinateProto.class, com.google.maps.util.TileCoordinateProto.Builder.class);
    }

    // Construct using com.google.maps.util.TileCoordinateProto.newBuilder()
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
      zoom_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      x_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      y_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      tileSize_ = 256;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.util.DummyTileCoordinateProto.internal_static_maps_util_TileCoordinateProto_descriptor;
    }

    @java.lang.Override
    public com.google.maps.util.TileCoordinateProto getDefaultInstanceForType() {
      return com.google.maps.util.TileCoordinateProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.util.TileCoordinateProto build() {
      com.google.maps.util.TileCoordinateProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.util.TileCoordinateProto buildPartial() {
      com.google.maps.util.TileCoordinateProto result = new com.google.maps.util.TileCoordinateProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.zoom_ = zoom_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.x_ = x_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.y_ = y_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.tileSize_ = tileSize_;
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

    private int zoom_ ;
    /**
     * <code>required int32 zoom = 1;</code>
     * @return Whether the zoom field is set.
     */
    @java.lang.Override
    public boolean hasZoom() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 zoom = 1;</code>
     * @return The zoom.
     */
    @java.lang.Override
    public int getZoom() {
      return zoom_;
    }
    /**
     * <code>required int32 zoom = 1;</code>
     * @param value The zoom to set.
     * @return This builder for chaining.
     */
    public Builder setZoom(int value) {
      bitField0_ |= 0x00000001;
      zoom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 zoom = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearZoom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      zoom_ = 0;
      onChanged();
      return this;
    }

    private int x_ ;
    /**
     * <code>required int32 x = 2;</code>
     * @return Whether the x field is set.
     */
    @java.lang.Override
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int32 x = 2;</code>
     * @return The x.
     */
    @java.lang.Override
    public int getX() {
      return x_;
    }
    /**
     * <code>required int32 x = 2;</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(int value) {
      bitField0_ |= 0x00000002;
      x_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 x = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000002);
      x_ = 0;
      onChanged();
      return this;
    }

    private int y_ ;
    /**
     * <code>required int32 y = 3;</code>
     * @return Whether the y field is set.
     */
    @java.lang.Override
    public boolean hasY() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int32 y = 3;</code>
     * @return The y.
     */
    @java.lang.Override
    public int getY() {
      return y_;
    }
    /**
     * <code>required int32 y = 3;</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(int value) {
      bitField0_ |= 0x00000004;
      y_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 y = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000004);
      y_ = 0;
      onChanged();
      return this;
    }

    private int tileSize_ = 256;
    /**
     * <code>optional int32 tile_size = 4 [default = 256];</code>
     * @return Whether the tileSize field is set.
     */
    @java.lang.Override
    public boolean hasTileSize() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 tile_size = 4 [default = 256];</code>
     * @return The tileSize.
     */
    @java.lang.Override
    public int getTileSize() {
      return tileSize_;
    }
    /**
     * <code>optional int32 tile_size = 4 [default = 256];</code>
     * @param value The tileSize to set.
     * @return This builder for chaining.
     */
    public Builder setTileSize(int value) {
      bitField0_ |= 0x00000008;
      tileSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 tile_size = 4 [default = 256];</code>
     * @return This builder for chaining.
     */
    public Builder clearTileSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      tileSize_ = 256;
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


    // @@protoc_insertion_point(builder_scope:maps_util.TileCoordinateProto)
  }

  // @@protoc_insertion_point(class_scope:maps_util.TileCoordinateProto)
  private static final com.google.maps.util.TileCoordinateProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.util.TileCoordinateProto();
  }

  public static com.google.maps.util.TileCoordinateProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TileCoordinateProto>
      PARSER = new com.google.protobuf.AbstractParser<TileCoordinateProto>() {
    @java.lang.Override
    public TileCoordinateProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<TileCoordinateProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TileCoordinateProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.util.TileCoordinateProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

