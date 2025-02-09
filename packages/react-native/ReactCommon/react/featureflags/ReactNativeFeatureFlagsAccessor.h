/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<ad2f5694448a89cb1e3fce22e302a8bd>>
 */

/**
 * IMPORTANT: Do NOT modify this file directly.
 *
 * To change the definition of the flags, edit
 *   packages/react-native/scripts/featureflags/ReactNativeFeatureFlags.config.js.
 *
 * To regenerate this code, run the following script from the repo root:
 *   yarn featureflags-update
 */

#pragma once

#include <react/featureflags/ReactNativeFeatureFlagsProvider.h>
#include <array>
#include <atomic>
#include <memory>
#include <optional>

namespace facebook::react {

class ReactNativeFeatureFlagsAccessor {
 public:
  ReactNativeFeatureFlagsAccessor();

  bool commonTestFlag();
  bool allowCollapsableChildren();
  bool allowRecursiveCommitsWithSynchronousMountOnAndroid();
  bool batchRenderingUpdatesInEventLoop();
  bool changeOrderOfMountingInstructionsOnAndroid();
  bool completeReactInstanceCreationOnBgThreadOnAndroid();
  bool destroyFabricSurfacesInReactInstanceManager();
  bool enableAlignItemsBaselineOnFabricIOS();
  bool enableCleanTextInputYogaNode();
  bool enableFabricRendererExclusively();
  bool enableGranularShadowTreeStateReconciliation();
  bool enableLongTaskAPI();
  bool enableMicrotasks();
  bool enablePropsUpdateReconciliationAndroid();
  bool enableSynchronousStateUpdates();
  bool enableUIConsistency();
  bool excludeYogaFromRawProps();
  bool fetchImagesInViewPreallocation();
  bool fixIncorrectScrollViewStateUpdateOnAndroid();
  bool fixMappingOfEventPrioritiesBetweenFabricAndReact();
  bool fixMissedFabricStateUpdatesOnAndroid();
  bool forceBatchingMountItemsOnAndroid();
  bool fuseboxEnabledDebug();
  bool fuseboxEnabledRelease();
  bool initEagerTurboModulesOnNativeModulesQueueAndroid();
  bool lazyAnimationCallbacks();
  bool loadVectorDrawablesOnImages();
  bool setAndroidLayoutDirection();
  bool useImmediateExecutorInAndroidBridgeless();
  bool useModernRuntimeScheduler();
  bool useNativeViewConfigsInBridgelessMode();
  bool useNewReactImageViewBackgroundDrawing();
  bool useRuntimeShadowNodeReferenceUpdate();
  bool useRuntimeShadowNodeReferenceUpdateOnLayout();
  bool useStateAlignmentMechanism();

  void override(std::unique_ptr<ReactNativeFeatureFlagsProvider> provider);

 private:
  void markFlagAsAccessed(int position, const char* flagName);
  void ensureFlagsNotAccessed();

  std::unique_ptr<ReactNativeFeatureFlagsProvider> currentProvider_;
  bool wasOverridden_;

  std::array<std::atomic<const char*>, 35> accessedFeatureFlags_;

  std::atomic<std::optional<bool>> commonTestFlag_;
  std::atomic<std::optional<bool>> allowCollapsableChildren_;
  std::atomic<std::optional<bool>> allowRecursiveCommitsWithSynchronousMountOnAndroid_;
  std::atomic<std::optional<bool>> batchRenderingUpdatesInEventLoop_;
  std::atomic<std::optional<bool>> changeOrderOfMountingInstructionsOnAndroid_;
  std::atomic<std::optional<bool>> completeReactInstanceCreationOnBgThreadOnAndroid_;
  std::atomic<std::optional<bool>> destroyFabricSurfacesInReactInstanceManager_;
  std::atomic<std::optional<bool>> enableAlignItemsBaselineOnFabricIOS_;
  std::atomic<std::optional<bool>> enableCleanTextInputYogaNode_;
  std::atomic<std::optional<bool>> enableFabricRendererExclusively_;
  std::atomic<std::optional<bool>> enableGranularShadowTreeStateReconciliation_;
  std::atomic<std::optional<bool>> enableLongTaskAPI_;
  std::atomic<std::optional<bool>> enableMicrotasks_;
  std::atomic<std::optional<bool>> enablePropsUpdateReconciliationAndroid_;
  std::atomic<std::optional<bool>> enableSynchronousStateUpdates_;
  std::atomic<std::optional<bool>> enableUIConsistency_;
  std::atomic<std::optional<bool>> excludeYogaFromRawProps_;
  std::atomic<std::optional<bool>> fetchImagesInViewPreallocation_;
  std::atomic<std::optional<bool>> fixIncorrectScrollViewStateUpdateOnAndroid_;
  std::atomic<std::optional<bool>> fixMappingOfEventPrioritiesBetweenFabricAndReact_;
  std::atomic<std::optional<bool>> fixMissedFabricStateUpdatesOnAndroid_;
  std::atomic<std::optional<bool>> forceBatchingMountItemsOnAndroid_;
  std::atomic<std::optional<bool>> fuseboxEnabledDebug_;
  std::atomic<std::optional<bool>> fuseboxEnabledRelease_;
  std::atomic<std::optional<bool>> initEagerTurboModulesOnNativeModulesQueueAndroid_;
  std::atomic<std::optional<bool>> lazyAnimationCallbacks_;
  std::atomic<std::optional<bool>> loadVectorDrawablesOnImages_;
  std::atomic<std::optional<bool>> setAndroidLayoutDirection_;
  std::atomic<std::optional<bool>> useImmediateExecutorInAndroidBridgeless_;
  std::atomic<std::optional<bool>> useModernRuntimeScheduler_;
  std::atomic<std::optional<bool>> useNativeViewConfigsInBridgelessMode_;
  std::atomic<std::optional<bool>> useNewReactImageViewBackgroundDrawing_;
  std::atomic<std::optional<bool>> useRuntimeShadowNodeReferenceUpdate_;
  std::atomic<std::optional<bool>> useRuntimeShadowNodeReferenceUpdateOnLayout_;
  std::atomic<std::optional<bool>> useStateAlignmentMechanism_;
};

} // namespace facebook::react
