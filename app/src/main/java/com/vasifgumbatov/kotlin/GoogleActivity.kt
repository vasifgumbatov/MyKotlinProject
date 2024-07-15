package com.vasifgumbatov.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class GoogleActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)

        initViews()
    }
    private fun buttonGoogleBack(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    private fun initViews(){
        val buttonGoogle = findViewById<MaterialButton>(R.id.google_back_button)
        buttonGoogle.setOnClickListener {
            buttonGoogleBack()
        }
    }
}