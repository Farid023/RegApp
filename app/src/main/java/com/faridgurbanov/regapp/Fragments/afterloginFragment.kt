package com.faridgurbanov.regapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.faridgurbanov.regapp.R
import com.faridgurbanov.regapp.databinding.FragmentAfterloginBinding


class afterloginFragment : Fragment() {
    private var _binding:FragmentAfterloginBinding?=null
    private val binding get() = _binding!!
    private val args:afterloginFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentAfterloginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView4.text=" \n ${args.mailtext}"
    }
}