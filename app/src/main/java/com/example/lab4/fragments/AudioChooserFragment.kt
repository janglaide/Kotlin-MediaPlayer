package com.example.lab4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4.AudioActivity
import com.example.lab4.R


class AudioChooserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_audio_chooser, container, false)
    }

    private fun goToPlay(context: AudioActivity){
        context.replaceFragment(AudioPlayFragment())
    }
}
