package com.vasifgumbatov.kotlin

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

        val buttonFacebook = findViewById<MaterialButton>(R.id.facebook_back_button)
        buttonFacebook.setOnClickListener {
            buttonFacebookBack()
        }
    }
    private fun buttonFacebookBack() {
    val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}