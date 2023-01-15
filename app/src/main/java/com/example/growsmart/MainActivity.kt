package com.example.growsmart

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_VISIBLE
        val buttonClick = findViewById<Button>(R.id.start_btn)

        buttonClick.setOnClickListener {
            val intent = Intent(this, homepage()::class.java)
            startActivity(intent)
        }

    }
}