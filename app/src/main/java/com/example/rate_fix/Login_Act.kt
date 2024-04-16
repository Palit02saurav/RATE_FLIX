package com.example.rate_fix

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login_Act : AppCompatActivity() {

    private lateinit var enterName: EditText
    private lateinit var enterPassword: EditText
    private lateinit var loginButton: Button
    private lateinit var signInText: TextView
    private lateinit var sharedPreferences: SharedPreferences

    private val validNames = setOf("Saurav Palit", "Subhankar Sarkar", "Audrijeet Bal", "Preetam Dey", "Kalyan Ray")
    private val validPass = "5864"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        enterName = findViewById(R.id.edittext01)
        enterPassword = findViewById(R.id.edittext02)
        loginButton = findViewById(R.id.loginbutton)
        signInText = findViewById(R.id.signin_text)

        sharedPreferences = getSharedPreferences(
            getString(R.string.rate_fix),
            Context.MODE_PRIVATE
        )

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        if (isLoggedIn) {
            redirectToMain()
        }

        loginButton.setOnClickListener {
            val name = enterName.text.toString().trim()
            val pass = enterPassword.text.toString()

            if (validNames.contains(name) && pass == validPass) {
                Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
                saveLoginStatus(true)
                redirectToMain()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_LONG).show()
            }
        }
        signInText.setOnClickListener {
            val intent = Intent(this, Sign_Act::class.java)
            startActivity(intent)
        }
    }

    private fun redirectToMain() {
        val intent = Intent(this, MainActivity::class.java) // Assuming MainActivity hosts the HomeFragment
        startActivity(intent)
        finish()
    }

    private fun saveLoginStatus(isLoggedIn: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean("isLoggedIn", isLoggedIn)
        editor.apply()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                logout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logout() {
        val editor = sharedPreferences.edit()
        editor.putBoolean("isLoggedIn", false)
        editor.apply()

        // Redirect to the login activity
        val intent = Intent(this, Login_Act::class.java)
        startActivity(intent)
        finish()
    }
}
