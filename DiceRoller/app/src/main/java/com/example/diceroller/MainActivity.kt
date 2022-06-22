package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding= ActivityMainBinding.inflate(layoutInflater)
        val root= binding.root
        root.setVerticalGravity(Gravity.CENTER)
        setContentView(root)

        val rollButton= binding.rollButton
        rollButton.text= "Let's Roll!"
        rollButton.setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}