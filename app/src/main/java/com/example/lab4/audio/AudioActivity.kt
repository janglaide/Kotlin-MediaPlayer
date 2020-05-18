package com.example.lab4.audio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.lab4.R
import java.io.File


@Suppress("DEPRECATION", "RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class AudioActivity : AppCompatActivity() {

    private var chosen: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        val actionBar = supportActionBar
        actionBar!!.title = "Audios"

        //val spinner = findViewById<Spinner>(R.id.audioSpinner)

        val namesList = listOf<String>(
            "joy division - love will tear us apart",
            "pink floyd - comfortably numb"
        )
        //chosen = audioList[0].Id
        val spinner = findViewById<Spinner>(R.id.audioSpinner)
        val audios: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_item, namesList)
        audios.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = audios

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val audioList = listOf(
                    Audio(R.raw.joy_division_love_will_tear_us_apart, "joy division - love will tear us apart"),
                    Audio(R.raw.pink_floyd_comfortably_numb, "pink floyd - comfortably numb")
                )
                Toast.makeText(
                    this@AudioActivity,
                    "Choosed ${audioList[position].Name}",
                    Toast.LENGTH_SHORT
                ).show()
                chosen = audioList[position].Id
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

    }

    fun onListPlayerClicked(view: View){
        val intent = Intent(this, AudioPlayActivity::class.java)
        intent.putExtra("chosenId", chosen)
        startActivity(intent);
    }

}
