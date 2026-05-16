package com.google.firebase.analytics.ktx

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.ktx.Firebase

private val noOpInstance = FirebaseAnalytics.noOpInstance()

val Firebase.analytics: FirebaseAnalytics
    get() = noOpInstance
