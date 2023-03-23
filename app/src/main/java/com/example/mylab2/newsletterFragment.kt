package com.example.mylab2

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class newsletterFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    // Initialization
    lateinit var viewModelGreeting: Greeting
    private val users = mutableListOf<String>() //Mutable Array
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_newsletter, container, false)

        // ID's
        val inputEmail = view.findViewById<TextView>(R.id.et_emailInput)
        val subscribeBtn = view.findViewById<Button>(R.id.btn_subscribeNow)
        val myViewModelGreeting = view.findViewById<TextView>(R.id.tv_viewModelGreeting)

        // On Click
        subscribeBtn.setOnClickListener {
            val email = inputEmail.text.toString() // Variable email takes the value of the email input and converts it to a string
            if(email.isNotEmpty()) {
                users.add(email) // If the email input is not empty, then add the value to our Array "
                Log.d("Emails: ", users.toString())
                Snackbar.make(view, "Email submitted.", Snackbar.LENGTH_LONG)
                    .setAction("UNDO"){ // Creating a snackbar with the option to 'UNDO' which removes email from array
                        users.remove(email)
                        Log.d("Emails ", users.toString())
                    }
                    .show()
                viewModelGreeting.greeting = inputEmail.text.toString()
            } else {
                val text = "You need to type in email." // If user press button on empty input display a classic toast message
                Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
            }
            viewModelGreeting.myGreeting().let { // Making our greeting textview component in a viewmodel
                myViewModelGreeting.text = viewModelGreeting.greeting
            }
        }
        return view
    }
}