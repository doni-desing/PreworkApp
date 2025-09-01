package com.example.preworkapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnHello)

        button.setOnClickListener {
            Toast.makeText(this, "Hello guys!", Toast.LENGTH_SHORT).show()
            Log.d("MainActivity", "Button clicked")
        }
    }
}
