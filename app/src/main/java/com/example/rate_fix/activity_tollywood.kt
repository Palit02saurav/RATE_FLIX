package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityTollywoodBinding

class activity_tollywood : AppCompatActivity() {
    private lateinit var binding: ActivityTollywoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTollywoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for each ImageButton
        binding.imagebutt01.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1tUheykuwxAN3K3Yj4tVXFA")
        }
        binding.imagebutt02.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1tUheykuwxAN3K3Yj4tVXFA")
        }
        binding.imagebutt03.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1NUH2dv_GKVUHhspX5TaP9g")
        }
        binding.imagebutt04.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1Vqp5MiLzCwn41jiodnn-vg")
        }
        binding.imagebutt05.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1ktkYaHscWIh7W349pqpqzA")
        }
        binding.imagebutt06.setOnClickListener {
            openWebLink("https://t.me/joinchat/AAAAAFJgqXFVNN0pQUKFog")
        }
        binding.imagebutt07.setOnClickListener {
            openWebLink("https://a.urlstox.com/SSaHoF")
        }
        binding.imagebutt08.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1AQUPSSrhkwb-_HKdBjms5A")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
