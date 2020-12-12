// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/timeline_event.proto

package com.google.speech.logs.timeline;

public interface FrontendEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.timeline.FrontendEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.logs.timeline.FrontendEvent.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <code>optional .speech.logs.timeline.FrontendEvent.Event event = 1;</code>
   * @return The event.
   */
  com.google.speech.logs.timeline.FrontendEvent.Event getEvent();

  /**
   * <code>optional .speech.logs.timeline.LanguageSelectionDecision language_selection_decision = 2;</code>
   * @return Whether the languageSelectionDecision field is set.
   */
  boolean hasLanguageSelectionDecision();
  /**
   * <code>optional .speech.logs.timeline.LanguageSelectionDecision language_selection_decision = 2;</code>
   * @return The languageSelectionDecision.
   */
  com.google.speech.logs.timeline.LanguageSelectionDecision getLanguageSelectionDecision();
  /**
   * <code>optional .speech.logs.timeline.LanguageSelectionDecision language_selection_decision = 2;</code>
   */
  com.google.speech.logs.timeline.LanguageSelectionDecisionOrBuilder getLanguageSelectionDecisionOrBuilder();

  /**
   * <code>optional .speech.logs.timeline.EndpointDelayInfo endpoint_delay_info = 3;</code>
   * @return Whether the endpointDelayInfo field is set.
   */
  boolean hasEndpointDelayInfo();
  /**
   * <code>optional .speech.logs.timeline.EndpointDelayInfo endpoint_delay_info = 3;</code>
   * @return The endpointDelayInfo.
   */
  com.google.speech.logs.timeline.EndpointDelayInfo getEndpointDelayInfo();
  /**
   * <code>optional .speech.logs.timeline.EndpointDelayInfo endpoint_delay_info = 3;</code>
   */
  com.google.speech.logs.timeline.EndpointDelayInfoOrBuilder getEndpointDelayInfoOrBuilder();

  /**
   * <code>optional .speech.logs.timeline.UnintendedQueryInfo unintended_query_info = 5;</code>
   * @return Whether the unintendedQueryInfo field is set.
   */
  boolean hasUnintendedQueryInfo();
  /**
   * <code>optional .speech.logs.timeline.UnintendedQueryInfo unintended_query_info = 5;</code>
   * @return The unintendedQueryInfo.
   */
  com.google.speech.logs.timeline.UnintendedQueryInfo getUnintendedQueryInfo();
  /**
   * <code>optional .speech.logs.timeline.UnintendedQueryInfo unintended_query_info = 5;</code>
   */
  com.google.speech.logs.timeline.UnintendedQueryInfoOrBuilder getUnintendedQueryInfoOrBuilder();

  /**
   * <code>optional .speech.logs.timeline.AccountSwitchedInfo account_switched_info = 6;</code>
   * @return Whether the accountSwitchedInfo field is set.
   */
  boolean hasAccountSwitchedInfo();
  /**
   * <code>optional .speech.logs.timeline.AccountSwitchedInfo account_switched_info = 6;</code>
   * @return The accountSwitchedInfo.
   */
  com.google.speech.logs.timeline.AccountSwitchedInfo getAccountSwitchedInfo();
  /**
   * <code>optional .speech.logs.timeline.AccountSwitchedInfo account_switched_info = 6;</code>
   */
  com.google.speech.logs.timeline.AccountSwitchedInfoOrBuilder getAccountSwitchedInfoOrBuilder();
}