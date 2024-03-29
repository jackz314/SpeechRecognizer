// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface ContextServerLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.ContextServerLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  java.util.List<com.google.speech.logs.RequestContextLog> 
      getRequestContextList();
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  com.google.speech.logs.RequestContextLog getRequestContext(int index);
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  int getRequestContextCount();
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  java.util.List<? extends com.google.speech.logs.RequestContextLogOrBuilder> 
      getRequestContextOrBuilderList();
  /**
   * <code>repeated .speech.logs.RequestContextLog request_context = 1;</code>
   */
  com.google.speech.logs.RequestContextLogOrBuilder getRequestContextOrBuilder(
      int index);

  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   * @return Whether the contextBackendLog field is set.
   */
  boolean hasContextBackendLog();
  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   * @return The contextBackendLog.
   */
  com.google.speech.logs.ContextBackendLog getContextBackendLog();
  /**
   * <code>optional .speech.logs.ContextBackendLog context_backend_log = 11;</code>
   */
  com.google.speech.logs.ContextBackendLogOrBuilder getContextBackendLogOrBuilder();
}
