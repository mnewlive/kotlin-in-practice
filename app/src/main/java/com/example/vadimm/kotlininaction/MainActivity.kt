package com.example.vadimm.kotlininaction

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.View
import com.example.vadimm.kotlininaction.tools.vibrateOnce
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var vibrator: Vibrator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    private fun setupView() {
        vibroButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val viewId = v?.id ?: return
        when (viewId) {
            R.id.vibroButton -> vibrator?.vibrateOnce()
        }
    }
}