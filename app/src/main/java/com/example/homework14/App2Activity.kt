package com.example.homework14

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class App2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)

        val btnAnswer = findViewById<Button>(R.id.btnAnswerApp2)
        val inputText = findViewById<EditText>(R.id.editTextApp2)
        val answerTextView = findViewById<TextView>(R.id.textViewApp2)

        val answers = listOf(
            "да",
            "нет",
            "скорее да",
            "скорее нет",
            "мб",
            "имеются перспективы",
            "вопрос задан неверно"
        )

        btnAnswer.setOnClickListener {
            if (inputText.text.isNotEmpty()) answerTextView.text = answers.random()
        }
    }
}