// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface SodaEventLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.SodaEventLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   * @return Whether the initEventLog field is set.
   */
  boolean hasInitEventLog();
  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   * @return The initEventLog.
   */
  com.google.speech.soda.logging.InitEventLog getInitEventLog();
  /**
   * <code>.logs.proto.speech.soda.InitEventLog init_event_log = 2;</code>
   */
  com.google.speech.soda.logging.InitEventLogOrBuilder getInitEventLogOrBuilder();

  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   * @return Whether the hotwordEvent field is set.
   */
  boolean hasHotwordEvent();
  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   * @return The hotwordEvent.
   */
  com.google.speech.soda.logging.HotwordEventLog getHotwordEvent();
  /**
   * <code>.logs.proto.speech.soda.HotwordEventLog hotword_event = 3;</code>
   */
  com.google.speech.soda.logging.HotwordEventLogOrBuilder getHotwordEventOrBuilder();

  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   * @return Whether the onDeviceAsrEvent field is set.
   */
  boolean hasOnDeviceAsrEvent();
  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   * @return The onDeviceAsrEvent.
   */
  com.google.speech.soda.logging.OnDeviceAsrEventLog getOnDeviceAsrEvent();
  /**
   * <code>.logs.proto.speech.soda.OnDeviceAsrEventLog on_device_asr_event = 4;</code>
   */
  com.google.speech.soda.logging.OnDeviceAsrEventLogOrBuilder getOnDeviceAsrEventOrBuilder();

  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   * @return Whether the hybridAsrEvent field is set.
   */
  boolean hasHybridAsrEvent();
  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   * @return The hybridAsrEvent.
   */
  com.google.speech.soda.logging.HybridAsrEventLog getHybridAsrEvent();
  /**
   * <code>.logs.proto.speech.soda.HybridAsrEventLog hybrid_asr_event = 5;</code>
   */
  com.google.speech.soda.logging.HybridAsrEventLogOrBuilder getHybridAsrEventOrBuilder();

  public com.google.speech.soda.logging.SodaEventLog.EventCase getEventCase();
}
