package com.example.navandlifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navandlifecycle.databinding.FragmentFirstBinding
import com.example.navandlifecycle.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {

    lateinit var binding:FragmentSecondBinding

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.tvTitle.text = args.firstArg
        return binding.root
    }
}