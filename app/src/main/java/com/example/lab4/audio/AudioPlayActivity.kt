package com.example.lab4.audio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.example.lab4.R


class AudioPlayActivity() : AppCompatActivity() {

    private val mPlayer : MediaPlayer = MediaPlayer() //MediaPlayer.create(this, R.raw.joy_division_love_will_tear_us_apart)

    //private val seekBar : SeekBar = findViewById(R.id.audioSeekBar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_play)

        val actionBar = supportActionBar
        actionBar!!.title = "Audios"

        val mPlayer = MediaPlayer.create(this, R.raw.joy_division_love_will_tear_us_apart)
        val tmp = mPlayer.duration
        //seekBar.max = mPlayer.duration
        /*seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onStopTrackingTouch(seekBar: SeekBar?) { }

            override fun onStartTrackingTouch(seekBar: SeekBar?) { }

            override fun onProgressChanged(
                seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser){
                    //mPlayer.seekTo(progress)
                    seekBar?.progress = mPlayer.currentPosition
                }
            }
        })*/

    }
    fun onPlay(view: View){
        //mPlayer.start()
    }
    fun onPause(view: View){
        //mPlayer.pause()
    }
    fun onStop(view: View){
        //mPlayer.stop()
        onDestroy()
    }
}