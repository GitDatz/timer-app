package com.datdroid.timer.di.modules

import com.datdroid.timer.viewmodel.TimerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        TimerViewModel()
    }
}