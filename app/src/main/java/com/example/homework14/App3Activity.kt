package com.example.homework14

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class App3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app3)

        val btnGenerateRiddle = findViewById<Button>(R.id.app3Btn)
        val riddleTextView = findViewById<TextView>(R.id.app3RiddletextView)
        val answer = findViewById<EditText>(R.id.app3Answer)
        val confirmBtn = findViewById<Button>(R.id.app3ConfirmBtn)

        val riddle1 = Riddle(
            "Два конца, два кольца,\n" +
                    "Посредине гвоздик.", "Ножницы"
        )
        val riddle2 = Riddle(
            "Зимой — звезда,\n" +
                    "Весной — вода.", "Снежинка"
        )
        val riddle3 = Riddle(
            "Загадка от Жака Фреско\n" +
                    "Чё задали?", "Амогус"
        )
        val riddles = listOf(riddle1, riddle2, riddle3)
        var currentRiddle = Riddle("not determ", "not determ")

        btnGenerateRiddle.setOnClickListener {
            currentRiddle = riddles.random()
            riddleTextView.text = currentRiddle.riddle
            answer.text.clear()
        }

        fun makeToast(text: String): Toast {
            val toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            return toast
        }

        confirmBtn.setOnClickListener {
            if (riddleTextView.text.isNotEmpty()) {
                if (answer.text.toString()
                        .compareTo(currentRiddle.answer, ignoreCase = true) == 0
                ) {
                    makeToast("Верно!").show()
                } else makeToast("Не верно!").show()
            }
        }
    }
}