package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityMovie02Binding

class Movie_02 : AppCompatActivity() {
    private lateinit var binding: ActivityMovie02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.watchNowButton.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11iIdgi0AUPF6MNr2lAQ_KQ")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
