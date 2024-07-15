package com.vasifgumbatov.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(R.layout.homework15_task1)

        initViews()
        imageButtonViews1()
        imageButtonViews2()
        imageButtonViews3()
    }

    private fun secondPage() {
        val emailEditText = findViewById<TextInputEditText>(R.id.emailEditText)
        val text1 = emailEditText.text.toString()

        val passwordEditText = findViewById<TextInputEditText>(R.id.passwordEditText)
        val text2 = passwordEditText.text.toString()

        val intent = Intent(this, AccountCreatedActivity::class.java)
        intent.putExtra(AccountCreatedActivity.EMAIL, text1)
        intent.putExtra(AccountCreatedActivity.PASSWORD, text2)
        startActivity(intent)
    }

    private fun initViews() {
        val signUpButton1 = findViewById<MaterialButton>(R.id.sign_up)
        signUpButton1.setOnClickListener {
            secondPage()
        }
    }

    private fun imageButtonViews1() {
        val imageButton1 = findViewById<ImageButton>(R.id.google_ig)
        imageButton1.setOnClickListener {
            imageButton1()
        }
    }

    private fun imageButtonViews2() {
        val imageButton2 = findViewById<ImageButton>(R.id.facebook_ig)
        imageButton2.setOnClickListener {
            imageButton2()
        }
    }

    private fun imageButtonViews3() {
        val imageButton3 = findViewById<ImageButton>(R.id.apple_ig)
        imageButton3.setOnClickListener {
            imageButton3()
        }
    }

    private fun imageButton1() {
        val intent = Intent(this, GoogleActivity::class.java)
        startActivity(intent)
    }

    private fun imageButton2() {
        val intent = Intent(this, FacebookActivity::class.java)
        startActivity(intent)
    }

    private fun imageButton3() {
        val intent = Intent(this, AppleActivity::class.java)
        startActivity(intent)
    }
}


