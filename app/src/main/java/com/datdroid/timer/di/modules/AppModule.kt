package com.datdroid.timer.di.modules

import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val appModule = module {
    loadKoinModules(
        viewModelModule
    )
}