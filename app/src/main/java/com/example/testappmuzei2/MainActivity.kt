package com.example.testappmuzei2

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Handler().postDelayed({
            val intent: Intent = Intent(this, Registracia::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}