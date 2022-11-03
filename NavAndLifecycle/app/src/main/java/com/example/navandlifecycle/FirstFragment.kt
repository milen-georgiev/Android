package com.example.navandlifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navandlifecycle.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {

    lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.nextFragment.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.container, SecondFragment())
            transaction.addToBackStack("second_transaction")
            transaction.commit()
        }
        return binding.root
    }
}