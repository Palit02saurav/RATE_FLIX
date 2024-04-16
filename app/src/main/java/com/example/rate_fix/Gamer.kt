package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityGamerBinding

class Gamer : AppCompatActivity() {
    private lateinit var binding: ActivityGamerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.watchNowButton.setOnClickListener {
            openWebLink("https://www.example.com/watch_movie04")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
