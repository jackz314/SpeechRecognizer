// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: third_party/tensorflow/core/example/feature.proto

package org.tensorflow.example;

public interface FeatureListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.FeatureList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  java.util.List<org.tensorflow.example.Feature> 
      getFeatureList();
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  org.tensorflow.example.Feature getFeature(int index);
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  int getFeatureCount();
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  java.util.List<? extends org.tensorflow.example.FeatureOrBuilder> 
      getFeatureOrBuilderList();
  /**
   * <code>repeated .tensorflow.Feature feature = 1;</code>
   */
  org.tensorflow.example.FeatureOrBuilder getFeatureOrBuilder(
      int index);
}
