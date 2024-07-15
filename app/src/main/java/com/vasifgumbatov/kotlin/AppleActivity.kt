package com.vasifgumbatov.kotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class AppleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)

        buttonAppleViews()
    }
    private fun buttonAppleBack() {
        finish()
    }
    private fun buttonAppleViews(){
        val buttonApple = findViewById<MaterialButton>(R.id.apple_back_button)
        buttonApple.setOnClickListener {
            buttonAppleBack()
        }
    }
}