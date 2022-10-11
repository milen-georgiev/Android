package com.example.firstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.firstapplication.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var counter = 0
    var input = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {view ->
            input = binding.inputString.text.toString()
            counter++;
            val bufferStr = counter.toString().plus(". $input")
            binding.inputString.setText("")
            binding.result.text = bufferStr
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.resetButton.setOnClickListener {
            counter = 0
            binding.result.text = ""
            binding.inputString.setText("")
        }

        binding.backButton.setOnClickListener {
            counter--
            binding.inputString.setText(input)
            binding.result.text = ""
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}