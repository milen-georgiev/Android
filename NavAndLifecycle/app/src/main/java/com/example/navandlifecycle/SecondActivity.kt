package com.example.navandlifecycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.navandlifecycle.databinding.ActivitySecondBinding

class SecondActivity: Activity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val title = intent.extras?.getString("title") ?: "Default Title"

        binding.muScTit.text = title

        binding.prevButton.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
            finish()
        }


    }
}