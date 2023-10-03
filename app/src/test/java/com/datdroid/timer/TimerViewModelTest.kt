package com.datdroid.timer

import com.datdroid.timer.viewmodel.TimerViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TimerViewModelTest {
    private lateinit var viewModel: TimerViewModel

    @Before
    fun setUp() {
        viewModel = TimerViewModel()
    }

    @Test
    fun testInitialSecondsFirstDigitValue() {
        // Ensure that the initial value of _secondsFirstDigit is MIN_DIGIT
        assertEquals(TimerViewModel.MIN_DIGIT, viewModel.mSecondsFirstDigit.value)
    }

    @Test
    fun testIncrementSeconds() {
        // Increment the value from MIN_DIGIT to MAX_DIGIT
        for (i in TimerViewModel.MIN_DIGIT until TimerViewModel.MAX_DIGIT) {
            viewModel.incSeconds()
            assertEquals(i + 1, viewModel.mSecondsFirstDigit.value)
        }

        // Incrementing once more should wrap around to MIN_DIGIT
        viewModel.incSeconds()
        assertEquals(TimerViewModel.MIN_DIGIT, viewModel.mSecondsFirstDigit.value)
    }

    @Test
    fun testDecrementSeconds() {
        // Initial value is 0 -> test wrap around to 9 (MAX_DIGIT)
        viewModel.decSeconds()
        assertEquals(TimerViewModel.MAX_DIGIT, viewModel.mSecondsFirstDigit.value)

        for (i in TimerViewModel.MAX_DIGIT downTo TimerViewModel.MIN_DIGIT + 1) {
            viewModel.decSeconds()
            assertEquals(i - 1, viewModel.mSecondsFirstDigit.value)
        }

        // Decrementing once more should wrap around to MAX_DIGIT
        viewModel.decSeconds()
        assertEquals(TimerViewModel.MAX_DIGIT, viewModel.mSecondsFirstDigit.value)
    }
}
