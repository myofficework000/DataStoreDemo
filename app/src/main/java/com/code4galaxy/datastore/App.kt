package com.code4galaxy.datastore

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Locator.initWith(this)
    }
}