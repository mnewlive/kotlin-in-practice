package com.example.vadimm.kotlininaction

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_find_age.*
import java.util.*

class FindAge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_age)

        button.setOnClickListener {
            val yearOfBirth: Int = editText.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            ageView.text = "Your Age if $myAge years"
        }
    }
}