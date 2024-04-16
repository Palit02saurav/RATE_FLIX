package com.example.rate_fix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sign_Act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val registerButton: Button = findViewById(R.id.confirmbutton)
        registerButton.setOnClickListener {
            // Start MainActivity
            val intent = Intent(this@Sign_Act, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val backToLoginTextView: TextView = findViewById(R.id.backtologin)
        backToLoginTextView.setOnClickListener {
            // Start LoginActivity
            val intent = Intent(this@Sign_Act, Login_Act::class.java)
            startActivity(intent)
            finish()
        }
    }
}
