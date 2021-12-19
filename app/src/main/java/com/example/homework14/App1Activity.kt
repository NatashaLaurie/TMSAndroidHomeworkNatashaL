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
        var numberMap = mutableMapOf<String, String>()
        numberMap.put("1", "один")
        numberMap.put("2", "два")
        numberMap.put("3", "три")
        numberMap.put("4", "четыре")
        numberMap.put("5", "пять")
        numberMap.put("6", "шесть")
        numberMap.put("7", "семь")
        numberMap.put("8", "восемь")
        numberMap.put("9", "девять")
        numberMap.put("10", "десять")


        val btnTextFormat = findViewById<Button>(R.id.btnTextFormat)
        val inputText = findViewById<EditText>(R.id.editText)
        val formattedTextView = findViewById<TextView>(R.id.formattedText)

        btnTextFormat.setOnClickListener {
            var string = inputText.text.toString()
            string.replace('а', 'о', true).also { string = it }
//            formattedTextView.text = string
           var sl = string.split(" ")
            //string = sl.joinToString(" ")
            sl.forEach() {
                if (numberMap.containsKey(it)) {
                    string.replace(it,numberMap.getValue(it),true).also { string = it
                    sl=string.split(" ")}
                }
            }
            var stringList=sl.sortedWith(Comparator { word1, word2 ->
                word1.length - word2.length

            })

            formattedTextView.text=stringList.joinToString (" ")

        }
    }
}
