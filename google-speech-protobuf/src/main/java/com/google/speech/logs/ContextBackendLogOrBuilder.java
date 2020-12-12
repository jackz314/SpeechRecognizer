// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logs/proto/speech/service/recognizer_log.proto

package com.google.speech.logs;

public interface ContextBackendLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:speech.logs.ContextBackendLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .speech.logs.ContextBackendStatus footprints = 1;</code>
   * @return Whether the footprints field is set.
   */
  boolean hasFootprints();
  /**
   * <code>optional .speech.logs.ContextBackendStatus footprints = 1;</code>
   * @return The footprints.
   */
  com.google.speech.logs.ContextBackendStatus getFootprints();
  /**
   * <code>optional .speech.logs.ContextBackendStatus footprints = 1;</code>
   */
  com.google.speech.logs.ContextBackendStatusOrBuilder getFootprintsOrBuilder();

  /**
   * <code>optional .speech.logs.ContextBackendStatus focus = 2;</code>
   * @return Whether the focus field is set.
   */
  boolean hasFocus();
  /**
   * <code>optional .speech.logs.ContextBackendStatus focus = 2;</code>
   * @return The focus.
   */
  com.google.speech.logs.ContextBackendStatus getFocus();
  /**
   * <code>optional .speech.logs.ContextBackendStatus focus = 2;</code>
   */
  com.google.speech.logs.ContextBackendStatusOrBuilder getFocusOrBuilder();

  /**
   * <code>optional .speech.logs.ContextBackendStatus lattice_augmentation_service = 3 [deprecated = true];</code>
   * @return Whether the latticeAugmentationService field is set.
   */
  @java.lang.Deprecated boolean hasLatticeAugmentationService();
  /**
   * <code>optional .speech.logs.ContextBackendStatus lattice_augmentation_service = 3 [deprecated = true];</code>
   * @return The latticeAugmentationService.
   */
  @java.lang.Deprecated com.google.speech.logs.ContextBackendStatus getLatticeAugmentationService();
  /**
   * <code>optional .speech.logs.ContextBackendStatus lattice_augmentation_service = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.speech.logs.ContextBackendStatusOrBuilder getLatticeAugmentationServiceOrBuilder();

  /**
   * <code>repeated .speech.logs.AugmentContextStatus augment_context = 4;</code>
   */
  java.util.List<com.google.speech.logs.AugmentContextStatus> 
      getAugmentContextList();
  /**
   * <code>repeated .speech.logs.AugmentContextStatus augment_context = 4;</code>
   */
  com.google.speech.logs.AugmentContextStatus getAugmentContext(int index);
  /**
   * <code>repeated .speech.logs.AugmentContextStatus augment_context = 4;</code>
   */
  int getAugmentContextCount();
  /**
   * <code>repeated .speech.logs.AugmentContextStatus augment_context = 4;</code>
   */
  java.util.List<? extends com.google.speech.logs.AugmentContextStatusOrBuilder> 
      getAugmentContextOrBuilderList();
  /**
   * <code>repeated .speech.logs.AugmentContextStatus augment_context = 4;</code>
   */
  com.google.speech.logs.AugmentContextStatusOrBuilder getAugmentContextOrBuilder(
      int index);

  /**
   * <code>repeated .speech.logs.ContextProviderServiceStatus context_provider_service_status = 5;</code>
   */
  java.util.List<com.google.speech.logs.ContextProviderServiceStatus> 
      getContextProviderServiceStatusList();
  /**
   * <code>repeated .speech.logs.ContextProviderServiceStatus context_provider_service_status = 5;</code>
   */
  com.google.speech.logs.ContextProviderServiceStatus getContextProviderServiceStatus(int index);
  /**
   * <code>repeated .speech.logs.ContextProviderServiceStatus context_provider_service_status = 5;</code>
   */
  int getContextProviderServiceStatusCount();
  /**
   * <code>repeated .speech.logs.ContextProviderServiceStatus context_provider_service_status = 5;</code>
   */
  java.util.List<? extends com.google.speech.logs.ContextProviderServiceStatusOrBuilder> 
      getContextProviderServiceStatusOrBuilderList();
  /**
   * <code>repeated .speech.logs.ContextProviderServiceStatus context_provider_service_status = 5;</code>
   */
  com.google.speech.logs.ContextProviderServiceStatusOrBuilder getContextProviderServiceStatusOrBuilder(
      int index);
}