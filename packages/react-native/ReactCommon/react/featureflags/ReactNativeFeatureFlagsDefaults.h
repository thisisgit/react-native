/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<71de31447eb8cbc20c817ce5e8e6f8b1>>
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

namespace facebook::react {

class ReactNativeFeatureFlagsDefaults : public ReactNativeFeatureFlagsProvider {
 public:
  ReactNativeFeatureFlagsDefaults() = default;

  bool commonTestFlag() override {
    return false;
  }

  bool allowCollapsableChildren() override {
    return true;
  }

  bool allowRecursiveCommitsWithSynchronousMountOnAndroid() override {
    return false;
  }

  bool batchRenderingUpdatesInEventLoop() override {
    return false;
  }

  bool changeOrderOfMountingInstructionsOnAndroid() override {
    return false;
  }

  bool completeReactInstanceCreationOnBgThreadOnAndroid() override {
    return false;
  }

  bool destroyFabricSurfacesInReactInstanceManager() override {
    return false;
  }

  bool enableAlignItemsBaselineOnFabricIOS() override {
    return true;
  }

  bool enableCleanTextInputYogaNode() override {
    return false;
  }

  bool enableFabricRendererExclusively() override {
    return false;
  }

  bool enableGranularShadowTreeStateReconciliation() override {
    return false;
  }

  bool enableLongTaskAPI() override {
    return false;
  }

  bool enableMicrotasks() override {
    return false;
  }

  bool enablePropsUpdateReconciliationAndroid() override {
    return false;
  }

  bool enableSynchronousStateUpdates() override {
    return false;
  }

  bool enableUIConsistency() override {
    return false;
  }

  bool excludeYogaFromRawProps() override {
    return false;
  }

  bool fetchImagesInViewPreallocation() override {
    return false;
  }

  bool fixIncorrectScrollViewStateUpdateOnAndroid() override {
    return false;
  }

  bool fixMappingOfEventPrioritiesBetweenFabricAndReact() override {
    return false;
  }

  bool fixMissedFabricStateUpdatesOnAndroid() override {
    return false;
  }

  bool forceBatchingMountItemsOnAndroid() override {
    return false;
  }

  bool fuseboxEnabledDebug() override {
    return true;
  }

  bool fuseboxEnabledRelease() override {
    return false;
  }

  bool initEagerTurboModulesOnNativeModulesQueueAndroid() override {
    return false;
  }

  bool lazyAnimationCallbacks() override {
    return false;
  }

  bool loadVectorDrawablesOnImages() override {
    return false;
  }

  bool setAndroidLayoutDirection() override {
    return true;
  }

  bool useImmediateExecutorInAndroidBridgeless() override {
    return false;
  }

  bool useModernRuntimeScheduler() override {
    return false;
  }

  bool useNativeViewConfigsInBridgelessMode() override {
    return false;
  }

  bool useNewReactImageViewBackgroundDrawing() override {
    return false;
  }

  bool useRuntimeShadowNodeReferenceUpdate() override {
    return false;
  }

  bool useRuntimeShadowNodeReferenceUpdateOnLayout() override {
    return false;
  }

  bool useStateAlignmentMechanism() override {
    return false;
  }
};

} // namespace facebook::react
