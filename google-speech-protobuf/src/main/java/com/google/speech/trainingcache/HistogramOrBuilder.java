// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech/training_cache/proto/metrics.proto

package com.google.speech.trainingcache;

public interface HistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.training_cache.Histogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int64, int64&gt; buckets = 1;</code>
   */
  int getBucketsCount();
  /**
   * <code>map&lt;int64, int64&gt; buckets = 1;</code>
   */
  boolean containsBuckets(
      long key);
  /**
   * Use {@link #getBucketsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.Long>
  getBuckets();
  /**
   * <code>map&lt;int64, int64&gt; buckets = 1;</code>
   */
  java.util.Map<java.lang.Long, java.lang.Long>
  getBucketsMap();
  /**
   * <code>map&lt;int64, int64&gt; buckets = 1;</code>
   */

  long getBucketsOrDefault(
      long key,
      long defaultValue);
  /**
   * <code>map&lt;int64, int64&gt; buckets = 1;</code>
   */

  long getBucketsOrThrow(
      long key);
}
