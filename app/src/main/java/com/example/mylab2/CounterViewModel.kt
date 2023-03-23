package com.example.mylab2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {
    private val myCounter = MutableStateFlow(0)

    fun incrementCount() {
        myCounter.value++
    }
}