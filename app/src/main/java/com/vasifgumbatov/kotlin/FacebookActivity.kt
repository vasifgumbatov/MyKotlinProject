package com.vasifgumbatov.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class FacebookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)

       buttonFacebookViews()
    }
    @SuppressLint("SuspiciousIndentation")
    private fun buttonFacebookBack() {
    val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    private fun buttonFacebookViews(){
        val buttonFacebook = findViewById<MaterialButton>(R.id.facebook_back_button)
        buttonFacebook.setOnClickListener {
            buttonFacebookBack()
        }
    }
}