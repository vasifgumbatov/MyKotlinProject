package com.vasifgumbatov.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class AccountCreatedActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accountcreated)

        buttonViews()

        //input email
        val text1 = intent.getStringExtra(EMAIL)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        emailTextView.text = text1

        //input password
        val text2 = intent.getStringExtra(PASSWORD)
        val passwordTextView = findViewById<TextView>(R.id.passwordTextView)
        passwordTextView.text = text2
    }

    companion object {
        const val EMAIL = "email"
        const val PASSWORD = "password"
    }
    private fun backPage(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    private fun buttonViews(){
        val button2 = findViewById<MaterialButton>(R.id.account_created_button)
        button2.setOnClickListener {
            backPage()
        }
    }
}