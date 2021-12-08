package com.example.homework14

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class App4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app4)
    }

    fun onClick(view: View) {
        val firstNumber = findViewById<EditText>(R.id.app4FirstNumber)
        val secondNumber = findViewById<EditText>(R.id.app4SecondNumber)
        val answer = findViewById<TextView>(R.id.app4Answer)
        val operator = findViewById<TextView>(R.id.operator)

        if (firstNumber.text.isEmpty() || secondNumber.text.isEmpty()) return

        val num1 = firstNumber.text.toString().toDouble()
        val num2 = secondNumber.text.toString().toDouble()
        val result: Double

        when (view.id) {
            R.id.btnAdd -> {
                result = num1 + num2
                operator.text = "+"
                answer.text = result.toString()
            }
            R.id.btnSubtract -> {
                result = num1 - num2
                operator.text = "-"
                answer.text = result.toString()
            }
            R.id.btnMultiply -> {
                result = num1 * num2
                operator.text = "*"
                answer.text = result.toString()
            }
            R.id.btnDivide -> {
                if (num2 != 0.0) {
                    result = num1 / num2
                    operator.text = "/"
                    answer.text = result.toString()
                } else answer.text = "на 0 делить нельзя ага"
            }
            R.id.btnReset -> {
                firstNumber.text.clear()
                secondNumber.text.clear()
                operator.text = ""
                answer.text = ""
            }
        }
    }
}