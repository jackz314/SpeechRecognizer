// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log.proto

package com.google.speech.soda.logging;

public interface SodaLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.SodaLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLogConfig soda_config = 1;</code>
   * @return Whether the sodaConfig field is set.
   */
  boolean hasSodaConfig();
  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLogConfig soda_config = 1;</code>
   * @return The sodaConfig.
   */
  com.google.speech.soda.logging.SodaEventLogConfig getSodaConfig();
  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLogConfig soda_config = 1;</code>
   */
  com.google.speech.soda.logging.SodaEventLogConfigOrBuilder getSodaConfigOrBuilder();

  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLog event_log = 2;</code>
   * @return Whether the eventLog field is set.
   */
  boolean hasEventLog();
  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLog event_log = 2;</code>
   * @return The eventLog.
   */
  com.google.speech.soda.logging.SodaEventLog getEventLog();
  /**
   * <code>optional .logs.proto.speech.soda.SodaEventLog event_log = 2;</code>
   */
  com.google.speech.soda.logging.SodaEventLogOrBuilder getEventLogOrBuilder();
}