package com.example.homeworknavigationandlifecycle.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homeworknavigationandlifecycle.databinding.FragmentFirstBinding

class SecondFragment : Fragment(){

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding


        return (binding.root)
    }
}