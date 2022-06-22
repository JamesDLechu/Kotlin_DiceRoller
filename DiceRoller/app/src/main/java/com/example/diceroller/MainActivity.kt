package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val root= binding.root
        root.setVerticalGravity(Gravity.CENTER)
        setContentView(root)

        val rollButton= binding.rollButton
        rollButton.text= "Let's Roll!"
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText= binding.rollText
        val randomInt= Random.nextInt(6) + 1

        resultText.text= randomInt.toString()
    }
}