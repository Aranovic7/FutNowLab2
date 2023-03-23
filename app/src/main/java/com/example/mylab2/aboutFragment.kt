package com.example.mylab2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class aboutFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)


        // ID's
        val myHomeButton: Button = view.findViewById(R.id.btn_home)
        val mySubscriberButton: Button = view.findViewById(R.id.btn_subscribe)

        // On Click
        myHomeButton.setOnClickListener { // Navigates to home fragment
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_homeFragment)
        }
        mySubscriberButton.setOnClickListener { // Navigates to newsletter fragment
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_newsletterFragment)
        }
        return view
    }
}