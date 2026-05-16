package com.google.firebase.analytics

import android.content.Context
import android.os.Bundle

class FirebaseAnalytics private constructor() {
    companion object {
        private val instance = FirebaseAnalytics()
        @JvmStatic fun getInstance(context: Context): FirebaseAnalytics = instance
        @JvmStatic internal fun noOpInstance(): FirebaseAnalytics = instance
    }

    fun logEvent(event: String, bundle: Bundle?) {}
    fun setAnalyticsCollectionEnabled(enabled: Boolean) {}
    fun setUserProperty(name: String, value: String?) {}
    fun setUserId(userId: String?) {}

    object Event {
        const val APP_OPEN = "app_open"
        const val SCREEN_VIEW = "screen_view"
        const val SELECT_CONTENT = "select_content"
        const val LOGIN = "login"
    }

    object Param {
        const val SCREEN_NAME = "screen_name"
        const val SCREEN_CLASS = "screen_class"
        const val CONTENT_TYPE = "content_type"
        const val ITEM_ID = "item_id"
        const val METHOD = "method"
    }
}
