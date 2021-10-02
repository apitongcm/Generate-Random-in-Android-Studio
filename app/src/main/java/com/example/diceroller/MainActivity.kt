package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val generateButton: Button = findViewById(R.id.generate_button)
        generateButton.setOnClickListener {
            Toast.makeText(this,"button clicked", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val arr = arrayOf("Hello", "How are you?", "Welcome, Handsome", "Play game","Mobile Legends na this!!")
        val index = (0..4).random()
        resultText.text = arr[index]
    }
}