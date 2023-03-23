package com.example.mylab2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class functionsFragment : Fragment() {

    private val playersArray = mutableListOf<String>() // Mutable Array
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_functions, container, false)

        // ID's
        val btnAddIsak = view.findViewById<Button>(R.id.btn_firstAddButton)
        val btnAddElanga = view.findViewById<Button>(R.id.btn_secondAddButton)

        // On Click
        btnAddIsak.setOnClickListener(){
            val alexanderIsak = "Alexander Isak"
            playersArray.add(alexanderIsak) // Adds Alexander Isak to our array
            Log.d("Players: ", playersArray.toString())
            Toast.makeText(context, "You added Alexander Isak", Toast.LENGTH_SHORT).show() // Displays toast message
        }

        btnAddElanga.setOnClickListener(){
            val anthonyElanga = "Anthony Elanga"
            playersArray.add(anthonyElanga) // Adds Anthony Elanga to our array
            Log.d("Players: ", playersArray.toString())
            Toast.makeText(context, "You added Anthony Elanga", Toast.LENGTH_SHORT).show() // Displays toast message
        }


        return view
    }
}