package com.vasifgumbatov.kotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class AccountCreatedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accountcreated)

        val button2 = findViewById<MaterialButton>(R.id.account_created_button)
        button2.setOnClickListener {
            backPage()
        }

    }
    private fun backPage(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}