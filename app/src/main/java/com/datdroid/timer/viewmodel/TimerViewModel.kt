package com.datdroid.timer.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TimerViewModel : ViewModel() {
    private val _secondsFirstDigit = mutableStateOf(MIN_DIGIT)
    var mSecondsFirstDigit = _secondsFirstDigit

    fun incSeconds() {
        if (_secondsFirstDigit.value < MAX_DIGIT) {
            _secondsFirstDigit.value += 1
        } else if (_secondsFirstDigit.value == MAX_DIGIT) {
            _secondsFirstDigit.value = MIN_DIGIT
        }
    }

    fun decSeconds() {
        if (_secondsFirstDigit.value > MIN_DIGIT) {
            _secondsFirstDigit.value -= 1
        } else if (_secondsFirstDigit.value == MIN_DIGIT) {
            _secondsFirstDigit.value = MAX_DIGIT
        }
    }

    companion object {
        const val MAX_DIGIT = 9
        const val MIN_DIGIT = 0
    }
}