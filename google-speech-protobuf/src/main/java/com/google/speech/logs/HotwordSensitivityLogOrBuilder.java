// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface HotwordSensitivityLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.HotwordSensitivityLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool model_supports_sensitivity = 1;</code>
   * @return Whether the modelSupportsSensitivity field is set.
   */
  boolean hasModelSupportsSensitivity();
  /**
   * <code>optional bool model_supports_sensitivity = 1;</code>
   * @return The modelSupportsSensitivity.
   */
  boolean getModelSupportsSensitivity();

  /**
   * <code>optional .speech.logs.HotwordSensitivityLog.UserSelectedSensitivity user_selected_sensitivity = 2;</code>
   * @return Whether the userSelectedSensitivity field is set.
   */
  boolean hasUserSelectedSensitivity();
  /**
   * <code>optional .speech.logs.HotwordSensitivityLog.UserSelectedSensitivity user_selected_sensitivity = 2;</code>
   * @return The userSelectedSensitivity.
   */
  com.google.speech.logs.HotwordSensitivityLog.UserSelectedSensitivity getUserSelectedSensitivity();

  /**
   * <code>optional int32 selected_threshold_table_index = 3;</code>
   * @return Whether the selectedThresholdTableIndex field is set.
   */
  boolean hasSelectedThresholdTableIndex();
  /**
   * <code>optional int32 selected_threshold_table_index = 3;</code>
   * @return The selectedThresholdTableIndex.
   */
  int getSelectedThresholdTableIndex();

  /**
   * <code>optional int32 selected_threshold_adjustment_factor = 4;</code>
   * @return Whether the selectedThresholdAdjustmentFactor field is set.
   */
  boolean hasSelectedThresholdAdjustmentFactor();
  /**
   * <code>optional int32 selected_threshold_adjustment_factor = 4;</code>
   * @return The selectedThresholdAdjustmentFactor.
   */
  int getSelectedThresholdAdjustmentFactor();

  /**
   * <code>optional .speech.logs.HotwordSensitivityLog.HotwordThresholds selected_hotword_thresholds = 5;</code>
   * @return Whether the selectedHotwordThresholds field is set.
   */
  boolean hasSelectedHotwordThresholds();
  /**
   * <code>optional .speech.logs.HotwordSensitivityLog.HotwordThresholds selected_hotword_thresholds = 5;</code>
   * @return The selectedHotwordThresholds.
   */
  com.google.speech.logs.HotwordSensitivityLog.HotwordThresholds getSelectedHotwordThresholds();
  /**
   * <code>optional .speech.logs.HotwordSensitivityLog.HotwordThresholds selected_hotword_thresholds = 5;</code>
   */
  com.google.speech.logs.HotwordSensitivityLog.HotwordThresholdsOrBuilder getSelectedHotwordThresholdsOrBuilder();

  /**
   * <code>optional bool server_provided_threshold_adjustment_factor_applied = 6;</code>
   * @return Whether the serverProvidedThresholdAdjustmentFactorApplied field is set.
   */
  boolean hasServerProvidedThresholdAdjustmentFactorApplied();
  /**
   * <code>optional bool server_provided_threshold_adjustment_factor_applied = 6;</code>
   * @return The serverProvidedThresholdAdjustmentFactorApplied.
   */
  boolean getServerProvidedThresholdAdjustmentFactorApplied();
}