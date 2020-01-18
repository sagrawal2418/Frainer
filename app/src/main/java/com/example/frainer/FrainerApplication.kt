package com.example.frainer

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FrainerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@FrainerApplication)
        }
    }
}