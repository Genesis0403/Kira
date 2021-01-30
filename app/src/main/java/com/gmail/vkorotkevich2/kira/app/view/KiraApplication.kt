package com.gmail.vkorotkevich2.kira.app.view

import android.app.Application

class KiraApplication : Application(), AppView {
    
    override fun onCreate() {
        super.onCreate()
        _instance = this
    }

    companion object {
        private lateinit var _instance: KiraApplication
        val instance get() = _instance
    }
}
