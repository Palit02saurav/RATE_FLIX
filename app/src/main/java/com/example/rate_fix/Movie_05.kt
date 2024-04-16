package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityMovie05Binding

class Movie_05 : AppCompatActivity() {
    private lateinit var binding: ActivityMovie05Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovie05Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.watchNowButton.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11S7BlJ16argrym-5muq9tg")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
