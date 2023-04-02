package com.example.mylab2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import kotlinx.coroutines.flow.MutableStateFlow

class viewmodel : Fragment() {

    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_viewmodel, container, false)

        view.findViewById<TextView>(R.id.tv_viewModelText).text = "${counterViewModel.myCounter}"
        val myButton: Button = view.findViewById(R.id.btn_changeValue)

        myButton.setOnClickListener {
            counterViewModel.myCounter++
            view.findViewById<TextView>(R.id.tv_viewModelText).text = "${counterViewModel.myCounter}"
        }

        return view



    }
}


