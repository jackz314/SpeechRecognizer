// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: third_party/tensorflow/core/example/example.proto

package org.tensorflow.example;

public interface SequenceExampleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SequenceExample)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.Features context = 1;</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <code>.tensorflow.Features context = 1;</code>
   * @return The context.
   */
  org.tensorflow.example.Features getContext();
  /**
   * <code>.tensorflow.Features context = 1;</code>
   */
  org.tensorflow.example.FeaturesOrBuilder getContextOrBuilder();

  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   * @return Whether the featureLists field is set.
   */
  boolean hasFeatureLists();
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   * @return The featureLists.
   */
  org.tensorflow.example.FeatureLists getFeatureLists();
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2;</code>
   */
  org.tensorflow.example.FeatureListsOrBuilder getFeatureListsOrBuilder();
}
