package com.gmail.vkorotkevich2.kira

import android.app.Application

class KiraApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: KiraApplication
    }
}
