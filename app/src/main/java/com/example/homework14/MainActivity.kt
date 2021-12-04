package com.example.homework14

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnActivity1 = findViewById<Button>(R.id.act1)
        val btnActivity2 = findViewById<Button>(R.id.act2)
        val btnActivity3 = findViewById<Button>(R.id.act3)
        val btnActivity4 = findViewById<Button>(R.id.act4)

        btnActivity1.setOnClickListener {
            val intent = Intent(this@MainActivity, App1Activity::class.java)
            startActivity(intent)
        }
        btnActivity2.setOnClickListener {
            val intent = Intent(this@MainActivity, App2Activity::class.java)
            startActivity(intent)
        }
        btnActivity3.setOnClickListener {
            val intent = Intent(this@MainActivity, App3Activity::class.java)
            startActivity(intent)
        }
        btnActivity4.setOnClickListener {
            val intent = Intent(this@MainActivity, App4Activity::class.java)
            startActivity(intent)
        }
    }

}