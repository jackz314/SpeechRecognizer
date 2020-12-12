// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maps/util/tile_coordinate.proto

package com.google.maps.util;

public interface TileCoordinateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps_util.TileCoordinateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 zoom = 1;</code>
   * @return Whether the zoom field is set.
   */
  boolean hasZoom();
  /**
   * <code>required int32 zoom = 1;</code>
   * @return The zoom.
   */
  int getZoom();

  /**
   * <code>required int32 x = 2;</code>
   * @return Whether the x field is set.
   */
  boolean hasX();
  /**
   * <code>required int32 x = 2;</code>
   * @return The x.
   */
  int getX();

  /**
   * <code>required int32 y = 3;</code>
   * @return Whether the y field is set.
   */
  boolean hasY();
  /**
   * <code>required int32 y = 3;</code>
   * @return The y.
   */
  int getY();

  /**
   * <code>optional int32 tile_size = 4 [default = 256];</code>
   * @return Whether the tileSize field is set.
   */
  boolean hasTileSize();
  /**
   * <code>optional int32 tile_size = 4 [default = 256];</code>
   * @return The tileSize.
   */
  int getTileSize();
}
