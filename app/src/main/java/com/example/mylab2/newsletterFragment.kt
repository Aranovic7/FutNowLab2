package com.example.mylab2

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class newsletterFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_newsletter, container, false)

        val users = ArrayList<User>(
            listOf(
                User(
                    ""
                )
            )
        )

        // ID's
        val emailInput: TextInputEditText = view.findViewById(R.id.et_emailInput)
        val mySubscribeNowBtn: TextInputEditText = view.findViewById(R.id.btn_subscribeNow)

        // On Click
        mySubscribeNowBtn.setOnClickListener {
            if (TextUtils.isEmpty(emailInput.toString())) {
                Toast.makeText(context, "Empty field not allowed!", Toast.LENGTH_SHORT).show()
            } else {
                users[0].email
                val customSnackBar =
                    Snackbar.make(view, "Your email was submitted", Snackbar.LENGTH_LONG)
                        .setAction("UNDO") {
                            users.clear()
                        }
                customSnackBar.show()
            }
        }
        return view
    }
}