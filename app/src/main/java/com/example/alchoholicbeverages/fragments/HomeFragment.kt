package com.example.alchoholicbeverages.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alchoholicbeverages.R


class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val helloButton = view.findViewById<Button>(R.id.startPoint_button)
        helloButton.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBeerFragment()
            findNavController().navigate(action)
        }



    }
    }







