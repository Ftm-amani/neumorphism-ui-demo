package com.example.neumorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import com.example.neumorphism.databinding.ActivityMusicBinding

class MusicActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMusicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rotate = RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,
            0.5f,Animation.RELATIVE_TO_SELF,0.5f)

        rotate.duration = 15000
        rotate.interpolator = LinearInterpolator()
        rotate.repeatCount = Animation.INFINITE

        binding.imgMusicCover.startAnimation(rotate)

    }
}