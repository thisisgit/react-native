/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<0a1e1cdc3861ba113ce05a80f989fdc5>>
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

package com.facebook.react.internal.featureflags

public class ReactNativeFeatureFlagsLocalAccessor : ReactNativeFeatureFlagsAccessor {
  private var currentProvider: ReactNativeFeatureFlagsProvider = ReactNativeFeatureFlagsDefaults()

  private val accessedFeatureFlags = mutableSetOf<String>()

  private var commonTestFlagCache: Boolean? = null
  private var allowCollapsableChildrenCache: Boolean? = null
  private var allowRecursiveCommitsWithSynchronousMountOnAndroidCache: Boolean? = null
  private var batchRenderingUpdatesInEventLoopCache: Boolean? = null
  private var changeOrderOfMountingInstructionsOnAndroidCache: Boolean? = null
  private var completeReactInstanceCreationOnBgThreadOnAndroidCache: Boolean? = null
  private var destroyFabricSurfacesInReactInstanceManagerCache: Boolean? = null
  private var enableAlignItemsBaselineOnFabricIOSCache: Boolean? = null
  private var enableCleanTextInputYogaNodeCache: Boolean? = null
  private var enableFabricRendererExclusivelyCache: Boolean? = null
  private var enableGranularShadowTreeStateReconciliationCache: Boolean? = null
  private var enableLongTaskAPICache: Boolean? = null
  private var enableMicrotasksCache: Boolean? = null
  private var enablePropsUpdateReconciliationAndroidCache: Boolean? = null
  private var enableSynchronousStateUpdatesCache: Boolean? = null
  private var enableUIConsistencyCache: Boolean? = null
  private var excludeYogaFromRawPropsCache: Boolean? = null
  private var fetchImagesInViewPreallocationCache: Boolean? = null
  private var fixIncorrectScrollViewStateUpdateOnAndroidCache: Boolean? = null
  private var fixMappingOfEventPrioritiesBetweenFabricAndReactCache: Boolean? = null
  private var fixMissedFabricStateUpdatesOnAndroidCache: Boolean? = null
  private var forceBatchingMountItemsOnAndroidCache: Boolean? = null
  private var fuseboxEnabledDebugCache: Boolean? = null
  private var fuseboxEnabledReleaseCache: Boolean? = null
  private var initEagerTurboModulesOnNativeModulesQueueAndroidCache: Boolean? = null
  private var lazyAnimationCallbacksCache: Boolean? = null
  private var loadVectorDrawablesOnImagesCache: Boolean? = null
  private var setAndroidLayoutDirectionCache: Boolean? = null
  private var useImmediateExecutorInAndroidBridgelessCache: Boolean? = null
  private var useModernRuntimeSchedulerCache: Boolean? = null
  private var useNativeViewConfigsInBridgelessModeCache: Boolean? = null
  private var useNewReactImageViewBackgroundDrawingCache: Boolean? = null
  private var useRuntimeShadowNodeReferenceUpdateCache: Boolean? = null
  private var useRuntimeShadowNodeReferenceUpdateOnLayoutCache: Boolean? = null
  private var useStateAlignmentMechanismCache: Boolean? = null

  override fun commonTestFlag(): Boolean {
    var cached = commonTestFlagCache
    if (cached == null) {
      cached = currentProvider.commonTestFlag()
      accessedFeatureFlags.add("commonTestFlag")
      commonTestFlagCache = cached
    }
    return cached
  }

  override fun allowCollapsableChildren(): Boolean {
    var cached = allowCollapsableChildrenCache
    if (cached == null) {
      cached = currentProvider.allowCollapsableChildren()
      accessedFeatureFlags.add("allowCollapsableChildren")
      allowCollapsableChildrenCache = cached
    }
    return cached
  }

  override fun allowRecursiveCommitsWithSynchronousMountOnAndroid(): Boolean {
    var cached = allowRecursiveCommitsWithSynchronousMountOnAndroidCache
    if (cached == null) {
      cached = currentProvider.allowRecursiveCommitsWithSynchronousMountOnAndroid()
      accessedFeatureFlags.add("allowRecursiveCommitsWithSynchronousMountOnAndroid")
      allowRecursiveCommitsWithSynchronousMountOnAndroidCache = cached
    }
    return cached
  }

  override fun batchRenderingUpdatesInEventLoop(): Boolean {
    var cached = batchRenderingUpdatesInEventLoopCache
    if (cached == null) {
      cached = currentProvider.batchRenderingUpdatesInEventLoop()
      accessedFeatureFlags.add("batchRenderingUpdatesInEventLoop")
      batchRenderingUpdatesInEventLoopCache = cached
    }
    return cached
  }

  override fun changeOrderOfMountingInstructionsOnAndroid(): Boolean {
    var cached = changeOrderOfMountingInstructionsOnAndroidCache
    if (cached == null) {
      cached = currentProvider.changeOrderOfMountingInstructionsOnAndroid()
      accessedFeatureFlags.add("changeOrderOfMountingInstructionsOnAndroid")
      changeOrderOfMountingInstructionsOnAndroidCache = cached
    }
    return cached
  }

  override fun completeReactInstanceCreationOnBgThreadOnAndroid(): Boolean {
    var cached = completeReactInstanceCreationOnBgThreadOnAndroidCache
    if (cached == null) {
      cached = currentProvider.completeReactInstanceCreationOnBgThreadOnAndroid()
      accessedFeatureFlags.add("completeReactInstanceCreationOnBgThreadOnAndroid")
      completeReactInstanceCreationOnBgThreadOnAndroidCache = cached
    }
    return cached
  }

  override fun destroyFabricSurfacesInReactInstanceManager(): Boolean {
    var cached = destroyFabricSurfacesInReactInstanceManagerCache
    if (cached == null) {
      cached = currentProvider.destroyFabricSurfacesInReactInstanceManager()
      accessedFeatureFlags.add("destroyFabricSurfacesInReactInstanceManager")
      destroyFabricSurfacesInReactInstanceManagerCache = cached
    }
    return cached
  }

  override fun enableAlignItemsBaselineOnFabricIOS(): Boolean {
    var cached = enableAlignItemsBaselineOnFabricIOSCache
    if (cached == null) {
      cached = currentProvider.enableAlignItemsBaselineOnFabricIOS()
      accessedFeatureFlags.add("enableAlignItemsBaselineOnFabricIOS")
      enableAlignItemsBaselineOnFabricIOSCache = cached
    }
    return cached
  }

  override fun enableCleanTextInputYogaNode(): Boolean {
    var cached = enableCleanTextInputYogaNodeCache
    if (cached == null) {
      cached = currentProvider.enableCleanTextInputYogaNode()
      accessedFeatureFlags.add("enableCleanTextInputYogaNode")
      enableCleanTextInputYogaNodeCache = cached
    }
    return cached
  }

  override fun enableFabricRendererExclusively(): Boolean {
    var cached = enableFabricRendererExclusivelyCache
    if (cached == null) {
      cached = currentProvider.enableFabricRendererExclusively()
      accessedFeatureFlags.add("enableFabricRendererExclusively")
      enableFabricRendererExclusivelyCache = cached
    }
    return cached
  }

  override fun enableGranularShadowTreeStateReconciliation(): Boolean {
    var cached = enableGranularShadowTreeStateReconciliationCache
    if (cached == null) {
      cached = currentProvider.enableGranularShadowTreeStateReconciliation()
      accessedFeatureFlags.add("enableGranularShadowTreeStateReconciliation")
      enableGranularShadowTreeStateReconciliationCache = cached
    }
    return cached
  }

  override fun enableLongTaskAPI(): Boolean {
    var cached = enableLongTaskAPICache
    if (cached == null) {
      cached = currentProvider.enableLongTaskAPI()
      accessedFeatureFlags.add("enableLongTaskAPI")
      enableLongTaskAPICache = cached
    }
    return cached
  }

  override fun enableMicrotasks(): Boolean {
    var cached = enableMicrotasksCache
    if (cached == null) {
      cached = currentProvider.enableMicrotasks()
      accessedFeatureFlags.add("enableMicrotasks")
      enableMicrotasksCache = cached
    }
    return cached
  }

  override fun enablePropsUpdateReconciliationAndroid(): Boolean {
    var cached = enablePropsUpdateReconciliationAndroidCache
    if (cached == null) {
      cached = currentProvider.enablePropsUpdateReconciliationAndroid()
      accessedFeatureFlags.add("enablePropsUpdateReconciliationAndroid")
      enablePropsUpdateReconciliationAndroidCache = cached
    }
    return cached
  }

  override fun enableSynchronousStateUpdates(): Boolean {
    var cached = enableSynchronousStateUpdatesCache
    if (cached == null) {
      cached = currentProvider.enableSynchronousStateUpdates()
      accessedFeatureFlags.add("enableSynchronousStateUpdates")
      enableSynchronousStateUpdatesCache = cached
    }
    return cached
  }

  override fun enableUIConsistency(): Boolean {
    var cached = enableUIConsistencyCache
    if (cached == null) {
      cached = currentProvider.enableUIConsistency()
      accessedFeatureFlags.add("enableUIConsistency")
      enableUIConsistencyCache = cached
    }
    return cached
  }

  override fun excludeYogaFromRawProps(): Boolean {
    var cached = excludeYogaFromRawPropsCache
    if (cached == null) {
      cached = currentProvider.excludeYogaFromRawProps()
      accessedFeatureFlags.add("excludeYogaFromRawProps")
      excludeYogaFromRawPropsCache = cached
    }
    return cached
  }

  override fun fetchImagesInViewPreallocation(): Boolean {
    var cached = fetchImagesInViewPreallocationCache
    if (cached == null) {
      cached = currentProvider.fetchImagesInViewPreallocation()
      accessedFeatureFlags.add("fetchImagesInViewPreallocation")
      fetchImagesInViewPreallocationCache = cached
    }
    return cached
  }

  override fun fixIncorrectScrollViewStateUpdateOnAndroid(): Boolean {
    var cached = fixIncorrectScrollViewStateUpdateOnAndroidCache
    if (cached == null) {
      cached = currentProvider.fixIncorrectScrollViewStateUpdateOnAndroid()
      accessedFeatureFlags.add("fixIncorrectScrollViewStateUpdateOnAndroid")
      fixIncorrectScrollViewStateUpdateOnAndroidCache = cached
    }
    return cached
  }

  override fun fixMappingOfEventPrioritiesBetweenFabricAndReact(): Boolean {
    var cached = fixMappingOfEventPrioritiesBetweenFabricAndReactCache
    if (cached == null) {
      cached = currentProvider.fixMappingOfEventPrioritiesBetweenFabricAndReact()
      accessedFeatureFlags.add("fixMappingOfEventPrioritiesBetweenFabricAndReact")
      fixMappingOfEventPrioritiesBetweenFabricAndReactCache = cached
    }
    return cached
  }

  override fun fixMissedFabricStateUpdatesOnAndroid(): Boolean {
    var cached = fixMissedFabricStateUpdatesOnAndroidCache
    if (cached == null) {
      cached = currentProvider.fixMissedFabricStateUpdatesOnAndroid()
      accessedFeatureFlags.add("fixMissedFabricStateUpdatesOnAndroid")
      fixMissedFabricStateUpdatesOnAndroidCache = cached
    }
    return cached
  }

  override fun forceBatchingMountItemsOnAndroid(): Boolean {
    var cached = forceBatchingMountItemsOnAndroidCache
    if (cached == null) {
      cached = currentProvider.forceBatchingMountItemsOnAndroid()
      accessedFeatureFlags.add("forceBatchingMountItemsOnAndroid")
      forceBatchingMountItemsOnAndroidCache = cached
    }
    return cached
  }

  override fun fuseboxEnabledDebug(): Boolean {
    var cached = fuseboxEnabledDebugCache
    if (cached == null) {
      cached = currentProvider.fuseboxEnabledDebug()
      accessedFeatureFlags.add("fuseboxEnabledDebug")
      fuseboxEnabledDebugCache = cached
    }
    return cached
  }

  override fun fuseboxEnabledRelease(): Boolean {
    var cached = fuseboxEnabledReleaseCache
    if (cached == null) {
      cached = currentProvider.fuseboxEnabledRelease()
      accessedFeatureFlags.add("fuseboxEnabledRelease")
      fuseboxEnabledReleaseCache = cached
    }
    return cached
  }

  override fun initEagerTurboModulesOnNativeModulesQueueAndroid(): Boolean {
    var cached = initEagerTurboModulesOnNativeModulesQueueAndroidCache
    if (cached == null) {
      cached = currentProvider.initEagerTurboModulesOnNativeModulesQueueAndroid()
      accessedFeatureFlags.add("initEagerTurboModulesOnNativeModulesQueueAndroid")
      initEagerTurboModulesOnNativeModulesQueueAndroidCache = cached
    }
    return cached
  }

  override fun lazyAnimationCallbacks(): Boolean {
    var cached = lazyAnimationCallbacksCache
    if (cached == null) {
      cached = currentProvider.lazyAnimationCallbacks()
      accessedFeatureFlags.add("lazyAnimationCallbacks")
      lazyAnimationCallbacksCache = cached
    }
    return cached
  }

  override fun loadVectorDrawablesOnImages(): Boolean {
    var cached = loadVectorDrawablesOnImagesCache
    if (cached == null) {
      cached = currentProvider.loadVectorDrawablesOnImages()
      accessedFeatureFlags.add("loadVectorDrawablesOnImages")
      loadVectorDrawablesOnImagesCache = cached
    }
    return cached
  }

  override fun setAndroidLayoutDirection(): Boolean {
    var cached = setAndroidLayoutDirectionCache
    if (cached == null) {
      cached = currentProvider.setAndroidLayoutDirection()
      accessedFeatureFlags.add("setAndroidLayoutDirection")
      setAndroidLayoutDirectionCache = cached
    }
    return cached
  }

  override fun useImmediateExecutorInAndroidBridgeless(): Boolean {
    var cached = useImmediateExecutorInAndroidBridgelessCache
    if (cached == null) {
      cached = currentProvider.useImmediateExecutorInAndroidBridgeless()
      accessedFeatureFlags.add("useImmediateExecutorInAndroidBridgeless")
      useImmediateExecutorInAndroidBridgelessCache = cached
    }
    return cached
  }

  override fun useModernRuntimeScheduler(): Boolean {
    var cached = useModernRuntimeSchedulerCache
    if (cached == null) {
      cached = currentProvider.useModernRuntimeScheduler()
      accessedFeatureFlags.add("useModernRuntimeScheduler")
      useModernRuntimeSchedulerCache = cached
    }
    return cached
  }

  override fun useNativeViewConfigsInBridgelessMode(): Boolean {
    var cached = useNativeViewConfigsInBridgelessModeCache
    if (cached == null) {
      cached = currentProvider.useNativeViewConfigsInBridgelessMode()
      accessedFeatureFlags.add("useNativeViewConfigsInBridgelessMode")
      useNativeViewConfigsInBridgelessModeCache = cached
    }
    return cached
  }

  override fun useNewReactImageViewBackgroundDrawing(): Boolean {
    var cached = useNewReactImageViewBackgroundDrawingCache
    if (cached == null) {
      cached = currentProvider.useNewReactImageViewBackgroundDrawing()
      accessedFeatureFlags.add("useNewReactImageViewBackgroundDrawing")
      useNewReactImageViewBackgroundDrawingCache = cached
    }
    return cached
  }

  override fun useRuntimeShadowNodeReferenceUpdate(): Boolean {
    var cached = useRuntimeShadowNodeReferenceUpdateCache
    if (cached == null) {
      cached = currentProvider.useRuntimeShadowNodeReferenceUpdate()
      accessedFeatureFlags.add("useRuntimeShadowNodeReferenceUpdate")
      useRuntimeShadowNodeReferenceUpdateCache = cached
    }
    return cached
  }

  override fun useRuntimeShadowNodeReferenceUpdateOnLayout(): Boolean {
    var cached = useRuntimeShadowNodeReferenceUpdateOnLayoutCache
    if (cached == null) {
      cached = currentProvider.useRuntimeShadowNodeReferenceUpdateOnLayout()
      accessedFeatureFlags.add("useRuntimeShadowNodeReferenceUpdateOnLayout")
      useRuntimeShadowNodeReferenceUpdateOnLayoutCache = cached
    }
    return cached
  }

  override fun useStateAlignmentMechanism(): Boolean {
    var cached = useStateAlignmentMechanismCache
    if (cached == null) {
      cached = currentProvider.useStateAlignmentMechanism()
      accessedFeatureFlags.add("useStateAlignmentMechanism")
      useStateAlignmentMechanismCache = cached
    }
    return cached
  }

  override fun override(provider: ReactNativeFeatureFlagsProvider) {
    if (accessedFeatureFlags.isNotEmpty()) {
      val accessedFeatureFlagsStr = accessedFeatureFlags.joinToString(separator = ", ") { it }
      throw IllegalStateException(
          "Feature flags were accessed before being overridden: $accessedFeatureFlagsStr")
    }
    currentProvider = provider
  }

  override fun dangerouslyReset() {
    // We don't need to do anything here because `ReactNativeFeatureFlags` will
    // just create a new instance of this class.
  }
}
