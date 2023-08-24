package com.datdroid.timer.di

import android.app.Application
import com.datdroid.timer.di.modules.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TimerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TimerApplication)
            modules(appModule)
        }
    }
}