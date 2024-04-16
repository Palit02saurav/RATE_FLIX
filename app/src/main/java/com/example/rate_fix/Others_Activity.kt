package com.example.rate_fix
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rate_fix.databinding.ActivityOthersBinding

class Others_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOthersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOthersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for each ImageButton
        binding.imagebutt01.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11ZyU79LYWKoW4YhnOJrDYg")
        }
        binding.imagebutt02.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/11ZyU79LYWKoW4YhnOJrDYg")
        }
        binding.imagebutt03.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1hq1QNhkgW71Z59iS5Jsl6A")
        }
        binding.imagebutt04.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1jklLqLyoOLXKHw6gm_GNWg")
        }
        binding.imagebutt05.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1jklLqLyoOLXKHw6gm_GNWg")
        }
        binding.imagebutt06.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1bXYqOK_aAqEADYcn7vW8Ty")
        }
        binding.imagebutt07.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1Nk6CCbTNvouA200yQSgV5g")
        }
        binding.imagebutt08.setOnClickListener {
            openWebLink("https://teraboxapp.com/s/1Nk6CCbTNvouA200yQSgV5g")
        }
    }

    private fun openWebLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
