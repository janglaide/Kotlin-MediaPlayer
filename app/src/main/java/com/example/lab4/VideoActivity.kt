package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val actionBar = supportActionBar
        actionBar!!.title = "Videos"
    }
}
