package com.google.firebase

import android.content.Context

class FirebaseApp private constructor() {
    companion object {
        @JvmStatic fun initializeApp(context: Context): FirebaseApp? = null
        @JvmStatic fun getInstance(): FirebaseApp = FirebaseApp()
    }
}
