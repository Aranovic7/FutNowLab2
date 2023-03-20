package com.example.mylab2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class homeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // ID's
        val myAboutBtn: Button = view.findViewById(R.id.btn_about)
        val myFunctionsdBtn: Button = view.findViewById(R.id.btn_functions)

        myAboutBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutFragment)
        }

        myFunctionsdBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_functionsFragment)
        }

        return view
    }
}