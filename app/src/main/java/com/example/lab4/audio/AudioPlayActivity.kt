package com.example.lab4.audio

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import com.example.lab4.R
import kotlinx.android.synthetic.main.activity_audio_play.*


class AudioPlayActivity() : AppCompatActivity() {

    private var mPlayer : MediaPlayer = MediaPlayer()
    private lateinit var runnable : Runnable
    private var handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_play)

        val actionBar = supportActionBar
        actionBar!!.title = "Audios"

        mPlayer = MediaPlayer.create(this, R.raw.joy_division_love_will_tear_us_apart)

        mPlayer.start()

        initializeSeekBar()

        audioSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser){
                    mPlayer.seekTo(progress * 1000)

                    Toast.makeText(
                        this@AudioPlayActivity,
                        (mPlayer.currentPosition / 1000 / 60).toString() + " min, " +
                                (mPlayer.currentPosition / 1000 % 60).toString() + " sec",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        }
    private fun initializeSeekBar() {
        audioSeekBar.max = mPlayer.duration / 1000

        runnable = Runnable {
            audioSeekBar.progress = mPlayer.currentPosition / 1000

            val diff = mPlayer.duration / 1000 - mPlayer.currentPosition / 1000

            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }

    fun onPlay(view: View){
        mPlayer.start()
    }
    fun onPause(view: View){
        mPlayer.pause()
    }
    fun onStop(view: View){
        mPlayer.stop()
        finish()
    }
}