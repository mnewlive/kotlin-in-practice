package com.example.vadimm.kotlininaction

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.View
import com.example.vadimm.kotlininaction.tools.vibrateOnce
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var vibrator: Vibrator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCLickListeners()
        vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    private fun setupCLickListeners() {
        vibroButton.setOnClickListener(this)
        findAge.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val viewId = v?.id ?: return
        when (viewId) {
            R.id.vibroButton -> vibrator?.vibrateOnce()
            R.id.findAge -> findMyAge()
        }
    }

    private fun findMyAge() {
        val intent = Intent(this@MainActivity, FindAge::class.java)
        startActivity(intent)
    }
}