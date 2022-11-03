package com.example.homeworknavigationandlifecycle.activity

import android.app.Activity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.homeworknavigationandlifecycle.R
import com.example.homeworknavigationandlifecycle.databinding.SecondActivityBinding
import com.example.homeworknavigationandlifecycle.fragment.FirstFragment
import com.example.homeworknavigationandlifecycle.fragment.FirstFragmentDirections

class SecondActivity : Activity() {

    lateinit var binding: SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SecondActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, FirstFragment())
        transaction.addToBackStack("first_transaction")
        transaction.commit()

        val title = intent.extras?.getString("title") ?: "Second Activity"

        binding.titleSecondAct.text = title


    }
}