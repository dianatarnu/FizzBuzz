package com.example.fizzbuzz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (number in  1..100) {
           when{
               number % 15 == 0 -> Log.d("FizzBuzz" ,"FizzBuzz")
               number % 3 == 0 -> Log.d("Fizz", "Fizz")
               number % 5 == 0 -> Log.d("Buzz", "Buzz")
               else -> Log.d("number", "$number")
           }
        }
    }
}