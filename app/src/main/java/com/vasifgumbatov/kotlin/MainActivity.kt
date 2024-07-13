package com.vasifgumbatov.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homework15_task1)

        val signUpButton1 = findViewById<MaterialButton>(R.id.sign_up)
        signUpButton1.setOnClickListener {
            nextPage()
        }

        val imageButton1 = findViewById<ImageButton>(R.id.google_ig)
        imageButton1.setOnClickListener {
            imageButton1()
        }

        val imageButton2 = findViewById<ImageButton>(R.id.facebook_ig)
        imageButton2.setOnClickListener {
            imageButton2()
        }

        val imageButton3 = findViewById<ImageButton>(R.id.apple_ig)
        imageButton3.setOnClickListener {
            imageButton3()
        }


    }

    private fun nextPage() {
        val intent = Intent(this, AccountCreatedActivity::class.java)
        startActivity(intent)
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


