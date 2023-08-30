package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    // Used for displaying in TextView at the top
    private var currentNumber : String = "0"
    var results : Int = 0
    var initNum : Int = 0
    var afterNum : Int = 0
    var operation : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Storing Buttons and TextView as variables
        val displayTextView = findViewById<TextView>(R.id.tvDisplay)
        displayTextView.text = currentNumber

        // Digit Buttons
        val b0 = findViewById<Button>(R.id.b0)
        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)
        val b5 = findViewById<Button>(R.id.b5)
        val b6 = findViewById<Button>(R.id.b6)
        val b7 = findViewById<Button>(R.id.b7)
        val b8 = findViewById<Button>(R.id.b8)
        val b9 = findViewById<Button>(R.id.b9)

        // Operation Buttons
        val bClear = findViewById<Button>(R.id.bClear)
        val bAdd = findViewById<Button>(R.id.bAddition)
        val bEquals = findViewById<Button>(R.id.bEquals)

        bClear.setOnClickListener {
            currentNumber = "0"
            results = 0
            initNum = 0
            afterNum = 0
            
        }

        b0.setOnClickListener {
            if (currentNumber.toInt() != 0){
                currentNumber += "0"
                val displayNumber = currentNumber
                displayTextView.text = displayNumber
            }
        }

        b1.setOnClickListener {
            if (currentNumber.toInt() == 0) {
                currentNumber = "1"
            }
            else{
                currentNumber += "1"
            }
            val displayNumber = currentNumber
            displayTextView.text = displayNumber
        }

        bAdd.setOnClickListener {
            initNum = currentNumber.toInt()
            currentNumber = "0"
            operation = "+"
        }

        bEquals.setOnClickListener {
            afterNum = currentNumber.toInt()
            when (operation){
                "+" -> results = initNum + afterNum
            }
            initNum = results
            currentNumber = results.toString()
            displayTextView.text = results.toString()
        }





            
    }

}