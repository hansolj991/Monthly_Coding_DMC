package com.example.monthly_coding_dmc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        Handler().postDelayed({
            val intent = Intent(this@LandingActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}