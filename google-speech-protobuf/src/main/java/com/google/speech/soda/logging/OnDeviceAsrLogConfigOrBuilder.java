// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/soda/soda_event_log_config.proto

package com.google.speech.soda.logging;

public interface OnDeviceAsrLogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:logs.proto.speech.soda.OnDeviceAsrLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool enabled = 1;</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <code>optional bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   * @return Whether the languagePackInfo field is set.
   */
  boolean hasLanguagePackInfo();
  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   * @return The languagePackInfo.
   */
  com.google.speech.soda.logging.LanguagePackInfo getLanguagePackInfo();
  /**
   * <code>optional .logs.proto.speech.soda.LanguagePackInfo language_pack_info = 2;</code>
   */
  com.google.speech.soda.logging.LanguagePackInfoOrBuilder getLanguagePackInfoOrBuilder();

  /**
   * <code>optional int32 application_domain = 3;</code>
   * @return Whether the applicationDomain field is set.
   */
  boolean hasApplicationDomain();
  /**
   * <code>optional int32 application_domain = 3;</code>
   * @return The applicationDomain.
   */
  int getApplicationDomain();

  /**
   * <code>optional bool longform_enabled = 4;</code>
   * @return Whether the longformEnabled field is set.
   */
  boolean hasLongformEnabled();
  /**
   * <code>optional bool longform_enabled = 4;</code>
   * @return The longformEnabled.
   */
  boolean getLongformEnabled();
}