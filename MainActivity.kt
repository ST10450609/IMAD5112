package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("IMPLICIT_CAST_TO_ANY")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age !=null) {
                val result = when (age) {
                    in 20..28 -> "Tupac"
                    in 28..36 -> "Steve Biko"
                    in 36..44 -> "Brenda Fassie"
                    in 44..52 -> "Micheal Jackson"
                    in 52..60 -> "Micheal Clarke"
                    in 60..68 -> "N.P van Wyk Louw"
                    in 68..76 -> "Muhammed Ali"
                    in 76..84 -> "Neil Armstrong"
                    in 84..92 -> "Walter Sisulu"
                    in 92..100 -> "Nelson Mandela"
                    else -> {}
                }
                txtResult.text = "Age: $age\n${
                    when (result){
                        "Tupac" -> "Tupac died at the age 25"
                        "Steve Biko" -> "Steve Biko died at the age of 30"
                        "Brenda Fassie" -> "Brenda Fassie died at the age of 39"
                        "Micheal Jackson" -> "Micheal Jackson died at the age of 50"
                        "Micheal Clarke" -> "Micheal Clarke died at the age of 54"
                        "N.P van Wyk Louw" -> "van Wyk Louw died at the age of 64"
                        "Muhammed Ali" -> "Muhammed Ali died at the age of 74"
                        "Neil Armstrong" -> "Neil Armstrong died at the age of 82"
                        "Walter Sisulu" -> "Walter Sisulu died at the age of 90"
                        "Nelson Mandela" -> "Nelson Mandela died at the age of 95"
                        else -> {}
                }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}