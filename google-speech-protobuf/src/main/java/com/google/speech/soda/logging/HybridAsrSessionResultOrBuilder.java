// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface HybridAsrSessionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.HybridAsrSessionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_on_device_event = 1;</code>
   * @return Whether the lastOnDeviceEvent field is set.
   */
  boolean hasLastOnDeviceEvent();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_on_device_event = 1;</code>
   * @return The lastOnDeviceEvent.
   */
  com.google.speech.soda.logging.HybridAsrRecognitionEvent getLastOnDeviceEvent();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_on_device_event = 1;</code>
   */
  com.google.speech.soda.logging.HybridAsrRecognitionEventOrBuilder getLastOnDeviceEventOrBuilder();

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_server_event = 2;</code>
   * @return Whether the lastServerEvent field is set.
   */
  boolean hasLastServerEvent();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_server_event = 2;</code>
   * @return The lastServerEvent.
   */
  com.google.speech.soda.logging.HybridAsrRecognitionEvent getLastServerEvent();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrRecognitionEvent last_server_event = 2;</code>
   */
  com.google.speech.soda.logging.HybridAsrRecognitionEventOrBuilder getLastServerEventOrBuilder();

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType partial_source = 3;</code>
   * @return Whether the partialSource field is set.
   */
  boolean hasPartialSource();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType partial_source = 3;</code>
   * @return The partialSource.
   */
  com.google.speech.soda.logging.HybridAsrSourceType getPartialSource();

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType prefetch_source = 4;</code>
   * @return Whether the prefetchSource field is set.
   */
  boolean hasPrefetchSource();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType prefetch_source = 4;</code>
   * @return The prefetchSource.
   */
  com.google.speech.soda.logging.HybridAsrSourceType getPrefetchSource();

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType final_source = 5;</code>
   * @return Whether the finalSource field is set.
   */
  boolean hasFinalSource();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSourceType final_source = 5;</code>
   * @return The finalSource.
   */
  com.google.speech.soda.logging.HybridAsrSourceType getFinalSource();

  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSelectorConfig selector_config = 6;</code>
   * @return Whether the selectorConfig field is set.
   */
  boolean hasSelectorConfig();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSelectorConfig selector_config = 6;</code>
   * @return The selectorConfig.
   */
  com.google.speech.soda.logging.HybridAsrSelectorConfig getSelectorConfig();
  /**
   * <code>optional .logs.proto.speech.soda.HybridAsrSelectorConfig selector_config = 6;</code>
   */
  com.google.speech.soda.logging.HybridAsrSelectorConfigOrBuilder getSelectorConfigOrBuilder();
}
