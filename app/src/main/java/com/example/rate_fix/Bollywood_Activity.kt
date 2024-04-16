package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityBollywoodBinding

class Bollywood_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityBollywoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBollywoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for each ImageButton
        binding.imagebutt01.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1qZ5JX_3rcdkTmD5wXruowA")
        }
        binding.imagebutt02.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1wdQ6-LBB2zA7L2CB9hxXpA")
        }
        binding.imagebutt03.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11lKafQIeVFBLdJXq_fICew")
        }
        binding.imagebutt04.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/164aHGWi5ytcgIuCFGyAVKw")
        }
        binding.imagebutt05.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1seQpp1Riatb20F_3mZRveQ")
        }
        binding.imagebutt06.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/164aHGWi5ytcgIuCFGyAVKw")
        }
        binding.imagebutt07.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1qtdc-BFuSXxl9RNbz3Apyw")
        }
        binding.imagebutt08.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/13TmMsbmgsr0f4N7I8M2Q3w")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
