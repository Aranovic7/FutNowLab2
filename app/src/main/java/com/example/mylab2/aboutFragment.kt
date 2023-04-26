package com.example.mylab2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation


class aboutFragment : Fragment() {

    private lateinit var tv_firstTextView: TextView
    private lateinit var tv_secondTextView: TextView
    private lateinit var tv_thirdTextView: TextView
    private lateinit var tv_lastTextView: TextView
    private lateinit var btn_home: Button
    private lateinit var btn_subscribe: Button
    private lateinit var im_footballBackground: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)


        // ID's
        tv_firstTextView = view.findViewById(R.id.tv_firstTextView)
        tv_secondTextView = view.findViewById(R.id.tv_secondTextView)
        tv_thirdTextView = view.findViewById(R.id.tv_thirdTextView)
        tv_lastTextView = view.findViewById(R.id.tv_lastTextView)
        im_footballBackground = view.findViewById(R.id.im_footballBackground)
        btn_home = view.findViewById(R.id.btn_home)
        btn_subscribe = view.findViewById(R.id.btn_subscribe)

        // On Click
        btn_home.setOnClickListener { // Navigates to home fragment
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_homeFragment)
        }
        btn_subscribe.setOnClickListener { // Navigates to newsletter fragment
            Navigation.findNavController(view)
                .navigate(R.id.action_aboutFragment_to_newsletterFragment)
        }

        if (savedInstanceState != null) {
            tv_firstTextView.text = savedInstanceState.getString("tv_firstTextView_text")
            tv_secondTextView.text = savedInstanceState.getString("tv_secondTextView_text")
            tv_thirdTextView.text = savedInstanceState.getString("tv_thirdTextView_text")
            tv_lastTextView.text = savedInstanceState.getString("tv_lastTextView_text")
            btn_home.isEnabled = savedInstanceState.getBoolean("btn_home_enabled")
            btn_subscribe.isEnabled = savedInstanceState.getBoolean("btn_subscribe_enabled")
            val imageResId = savedInstanceState.getInt("image_res_id")
            im_footballBackground.setImageResource(imageResId)
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (outState != null) {
            try {
                outState.putString("tv_firstTextView_text", tv_firstTextView.text.toString())
                outState.putString("tv_secondTextView_text", tv_secondTextView.text.toString())
                outState.putString("tv_thirdTextView_text", tv_thirdTextView.text.toString())
                outState.putString("tv_lastTextView_text", tv_lastTextView.text.toString())
                outState.putBoolean("btn_home_enabled", btn_home.isEnabled)
                outState.putBoolean("btn_subscribe_enabled", btn_subscribe.isEnabled)
                outState.putInt("image_res_id", R.drawable.aboutbackgroundimage)
            } catch (_: Exception) {
            }
        }
    }
}