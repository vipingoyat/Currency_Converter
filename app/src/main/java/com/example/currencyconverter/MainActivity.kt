package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt: EditText = findViewById(R.id.edt)
        val btr: Button = findViewById(R.id.button1)
        val btd: Button = findViewById(R.id.button2)
        val tv: TextView = findViewById(R.id.textview)

        btr.setOnClickListener {
            val amount = edt.text.toString().toFloat()
            val rupees = 83*amount
            tv.text = "Converted Amount is $rupees"
        }
        btd.setOnClickListener {
            val amount = edt.text.toString().toFloat()
            val dollar = amount/83
            tv.text = "Converted Amount is $dollar"
        }
    }
}