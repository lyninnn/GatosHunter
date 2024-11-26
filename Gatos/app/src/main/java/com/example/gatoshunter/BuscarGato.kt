package com.example.gatoshunter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BuscarGato : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscar_gatos)

        val backButton: Button = findViewById(R.id.backbutton)

        backButton.setOnClickListener {
            finish()
        }

    }




}
