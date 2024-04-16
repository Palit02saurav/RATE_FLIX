package com.example.rate_fix

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityHollywoodBinding

class Hollywood_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHollywoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHollywoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for each ImageButton
        binding.imagebutt01.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1RI4y42EFcgOIv0dHSIRMww")
        }
        binding.imagebutt02.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1hXujUg3krMio_Nr2mSiiGw")
        }
        binding.imagebutt03.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1-PrxXSbpncixkN09oBg23w")
        }
        binding.imagebutt04.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1XGku7Rol4JhBD8bhSBImqg")
        }
        binding.imagebutt05.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/16WTgL6IEGofZ1ixLp-K55w")
        }
        binding.imagebutt06.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11iIdgi0AUPF6MNr2lAQ_KQ")
        }
        binding.imagebutt07.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/194ZsnpkNv4E0Odja-VQcyw")
        }
        binding.imagebutt08.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1sFYi1ZJ9hDDQ-k0WpS9H1Q")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
