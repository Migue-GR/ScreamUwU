package com.example.screamuwu

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context.AUDIO_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val audioManager: AudioManager = applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)

        val mp: MediaPlayer = MediaPlayer.create(this, R.raw.gemidos)
        mp.start()
        mp.isLooping = true

        activity_main.setOnClickListener{
            audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, 1, 0)
            val mp2: MediaPlayer = MediaPlayer.create(this, R.raw.suicide)
            mp2.start()
            mp2.isLooping = true
        }
    }
}
