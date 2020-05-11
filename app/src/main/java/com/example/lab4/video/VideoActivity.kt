package com.example.lab4.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4.R

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val actionBar = supportActionBar
        actionBar!!.title = "Videos"
    }
}
