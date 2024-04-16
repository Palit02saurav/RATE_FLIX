package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityMovie01Binding

class Movie_01 : AppCompatActivity() {
    private lateinit var binding: ActivityMovie01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.watchNowButton.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1Wl3F8fozjQ-OckK5hERirA")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
