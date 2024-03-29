// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/s3_log.proto

package com.google.speech.logs;

public interface S3LogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.S3Log)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.logs.S3RequestLog s3_request_log = 1;</code>
   * @return Whether the s3RequestLog field is set.
   */
  boolean hasS3RequestLog();
  /**
   * <code>optional .speech.logs.S3RequestLog s3_request_log = 1;</code>
   * @return The s3RequestLog.
   */
  com.google.speech.logs.S3RequestLog getS3RequestLog();
  /**
   * <code>optional .speech.logs.S3RequestLog s3_request_log = 1;</code>
   */
  com.google.speech.logs.S3RequestLogOrBuilder getS3RequestLogOrBuilder();

  /**
   * <code>optional .speech.logs.RecognizerLog recognizer_log = 2;</code>
   * @return Whether the recognizerLog field is set.
   */
  boolean hasRecognizerLog();
  /**
   * <code>optional .speech.logs.RecognizerLog recognizer_log = 2;</code>
   * @return The recognizerLog.
   */
  com.google.speech.logs.RecognizerLog getRecognizerLog();
  /**
   * <code>optional .speech.logs.RecognizerLog recognizer_log = 2;</code>
   */
  com.google.speech.logs.RecognizerLogOrBuilder getRecognizerLogOrBuilder();

  /**
   * <code>repeated .speech.logs.RecognizerLog unused_recognizer_log = 6;</code>
   */
  java.util.List<com.google.speech.logs.RecognizerLog> 
      getUnusedRecognizerLogList();
  /**
   * <code>repeated .speech.logs.RecognizerLog unused_recognizer_log = 6;</code>
   */
  com.google.speech.logs.RecognizerLog getUnusedRecognizerLog(int index);
  /**
   * <code>repeated .speech.logs.RecognizerLog unused_recognizer_log = 6;</code>
   */
  int getUnusedRecognizerLogCount();
  /**
   * <code>repeated .speech.logs.RecognizerLog unused_recognizer_log = 6;</code>
   */
  java.util.List<? extends com.google.speech.logs.RecognizerLogOrBuilder> 
      getUnusedRecognizerLogOrBuilderList();
  /**
   * <code>repeated .speech.logs.RecognizerLog unused_recognizer_log = 6;</code>
   */
  com.google.speech.logs.RecognizerLogOrBuilder getUnusedRecognizerLogOrBuilder(
      int index);

  /**
   * <code>optional .speech.logs.CapabilitiesLog capabilities_log = 7;</code>
   * @return Whether the capabilitiesLog field is set.
   */
  boolean hasCapabilitiesLog();
  /**
   * <code>optional .speech.logs.CapabilitiesLog capabilities_log = 7;</code>
   * @return The capabilitiesLog.
   */
  com.google.speech.logs.CapabilitiesLog getCapabilitiesLog();
  /**
   * <code>optional .speech.logs.CapabilitiesLog capabilities_log = 7;</code>
   */
  com.google.speech.logs.CapabilitiesLogOrBuilder getCapabilitiesLogOrBuilder();

  /**
   * <code>optional .speech.logs.timeline.TimelineLog timeline_log = 10;</code>
   * @return Whether the timelineLog field is set.
   */
  boolean hasTimelineLog();
  /**
   * <code>optional .speech.logs.timeline.TimelineLog timeline_log = 10;</code>
   * @return The timelineLog.
   */
  com.google.speech.logs.timeline.TimelineLog getTimelineLog();
  /**
   * <code>optional .speech.logs.timeline.TimelineLog timeline_log = 10;</code>
   */
  com.google.speech.logs.timeline.TimelineLogOrBuilder getTimelineLogOrBuilder();

  /**
   * <code>optional .speech.logs.LogDestinationLog log_destination_log = 22;</code>
   * @return Whether the logDestinationLog field is set.
   */
  boolean hasLogDestinationLog();
  /**
   * <code>optional .speech.logs.LogDestinationLog log_destination_log = 22;</code>
   * @return The logDestinationLog.
   */
  com.google.speech.logs.LogDestinationLog getLogDestinationLog();
  /**
   * <code>optional .speech.logs.LogDestinationLog log_destination_log = 22;</code>
   */
  com.google.speech.logs.LogDestinationLogOrBuilder getLogDestinationLogOrBuilder();
}
