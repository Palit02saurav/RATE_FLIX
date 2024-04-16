package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityMovie10Binding

class Movie_10 : AppCompatActivity() {
    private lateinit var binding: ActivityMovie10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the watch_now_button
        binding.watchNowButton.setOnClickListener {
            // Implement the functionality to watch the movie
            openWebLink("https://www.example.com/watch_movie04")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
