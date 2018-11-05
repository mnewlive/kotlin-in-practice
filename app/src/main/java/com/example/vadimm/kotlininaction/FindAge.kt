package com.example.vadimm.kotlininaction

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_find_age.*

class FindAge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_age)

        button.setOnClickListener {
            val yearOfBirth: Int = editText.text.toString().toInt()
            val myAge = 2018 - yearOfBirth
            ageView.text = "Your Age if $myAge years"
        }
    }
}