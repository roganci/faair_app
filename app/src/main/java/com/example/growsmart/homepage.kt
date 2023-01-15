package com.example.growsmart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val modelBtn = findViewById<Button>(R.id.models)

        modelBtn.setOnClickListener {
            val intent = Intent(this, model_analysis()::class.java)
            startActivity(intent)
        }
    }
}