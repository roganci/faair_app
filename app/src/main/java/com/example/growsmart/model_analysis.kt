package com.example.growsmart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class model_analysis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model_analysis)

        val cropQualityBtn = findViewById<Button>(R.id.damage_btn)
        val weepCropBtn = findViewById<Button>(R.id.weed_coverage_btn)
        val developmentStagesBtn = findViewById<Button>(R.id.development_btn)


        cropQualityBtn.setOnClickListener {
            val intent = Intent(this, CropQualityDemo()::class.java)
            startActivity(intent)
        }

        weepCropBtn.setOnClickListener {
            val intent = Intent(this, WeedDensity()::class.java)
            startActivity(intent)
        }

        developmentStagesBtn.setOnClickListener {
            val intent = Intent(this, DevelopmentStages()::class.java)
            startActivity(intent)
        }
    }
}