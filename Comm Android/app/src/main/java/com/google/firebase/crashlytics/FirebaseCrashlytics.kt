package com.google.firebase.crashlytics

class FirebaseCrashlytics private constructor() {
    companion object {
        @JvmStatic fun getInstance(): FirebaseCrashlytics = FirebaseCrashlytics()
    }

    fun log(message: String) {}
    fun recordException(throwable: Throwable) {}
    fun setCrashlyticsCollectionEnabled(enabled: Boolean) {}
    fun setUserId(userId: String) {}
    fun setCustomKey(key: String, value: String) {}
    fun setCustomKey(key: String, value: Boolean) {}
    fun setCustomKey(key: String, value: Int) {}
    fun setCustomKey(key: String, value: Long) {}
    fun setCustomKey(key: String, value: Float) {}
    fun setCustomKey(key: String, value: Double) {}
}
