package com.example.mylab2

import androidx.lifecycle.ViewModel

class Greeting: ViewModel() { // Extending our Greeting class with ViewModel
    var greeting: String = "" // Variable greeting will take in a String value, right now empty

    fun myGreeting(){ // Creating our method for our Greeting class
        "Welcome '$greeting'"
    }
}