package com.example.homework14

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class App1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app1)

        val btnTextFormat = findViewById<Button>(R.id.btnTextFormat)
        val inputText = findViewById<EditText>(R.id.editText)
        val formattedTextView = findViewById<TextView>(R.id.formattedText)
//test11
        btnTextFormat.setOnClickListener {
            var string = inputText.text.toString()
            string.replace('а', 'о', true).also { string = it }
            formattedTextView.text = string
        }
    }
}
