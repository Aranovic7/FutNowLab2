package com.example.mylab2

import Counter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider

class testViewModel : AppCompatActivity() {

    /*
     * Denna activity är endast till för att visa översiktliga kunskaper gällande viewmodel då det ej fungera
     * på ett effektivare sätt i activity main (mer specifikt -> newsletterFragment)
     */

    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_view_model)

        val myTextView: TextView = findViewById(R.id.tv_viewModelText)
        val myButton: Button = findViewById(R.id.btn_changeValue)

        myButton.setOnClickListener {
            counterViewModel.incrementCount()
        }




    }
}