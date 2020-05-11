package com.example.lab4.audio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.example.lab4.R


class AudioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        val actionBar = supportActionBar
        actionBar!!.title = "Audios"

        //val spinner = findViewById<Spinner>(R.id.audioSpinner)

    }

    fun onListPlayerClicked(view: View){
        val intent = Intent(this, AudioPlayActivity::class.java)
        startActivity(intent);
    }

}
