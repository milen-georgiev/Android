package com.example.homeworknavigationandlifecycle.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeworknavigationandlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonNextActivity.setOnClickListener {
            val  argBundle = Bundle()
            argBundle.putString("title", "Welcome to Second Activity")
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(argBundle)
            startActivity(intent)
        }

    }
}