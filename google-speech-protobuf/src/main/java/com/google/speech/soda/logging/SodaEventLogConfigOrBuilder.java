// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

public interface SodaEventLogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.SodaEventLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .logs.proto.speech.soda.ClientLogConfig client_log_config = 1;</code>
   * @return Whether the clientLogConfig field is set.
   */
  boolean hasClientLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.ClientLogConfig client_log_config = 1;</code>
   * @return The clientLogConfig.
   */
  com.google.speech.soda.logging.ClientLogConfig getClientLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.ClientLogConfig client_log_config = 1;</code>
   */
  com.google.speech.soda.logging.ClientLogConfigOrBuilder getClientLogConfigOrBuilder();

  /**
   * <code>optional .logs.proto.speech.soda.HotwordLogConfig hotword_log_config = 2;</code>
   * @return Whether the hotwordLogConfig field is set.
   */
  boolean hasHotwordLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.HotwordLogConfig hotword_log_config = 2;</code>
   * @return The hotwordLogConfig.
   */
  com.google.speech.soda.logging.HotwordLogConfig getHotwordLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.HotwordLogConfig hotword_log_config = 2;</code>
   */
  com.google.speech.soda.logging.HotwordLogConfigOrBuilder getHotwordLogConfigOrBuilder();

  /**
   * <code>optional .logs.proto.speech.soda.OnDeviceAsrLogConfig on_device_asr_log_config = 3;</code>
   * @return Whether the onDeviceAsrLogConfig field is set.
   */
  boolean hasOnDeviceAsrLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.OnDeviceAsrLogConfig on_device_asr_log_config = 3;</code>
   * @return The onDeviceAsrLogConfig.
   */
  com.google.speech.soda.logging.OnDeviceAsrLogConfig getOnDeviceAsrLogConfig();
  /**
   * <code>optional .logs.proto.speech.soda.OnDeviceAsrLogConfig on_device_asr_log_config = 3;</code>
   */
  com.google.speech.soda.logging.OnDeviceAsrLogConfigOrBuilder getOnDeviceAsrLogConfigOrBuilder();
}
