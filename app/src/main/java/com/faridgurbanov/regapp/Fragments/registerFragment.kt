package com.faridgurbanov.regapp.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.faridgurbanov.regapp.databinding.FragmentRegisterBinding


class registerFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonContinueRegister.setOnClickListener {
            val emailreg = binding.emailRegister.text.toString().trim()
            val userReg = binding.usernameRegister.text.toString().trim()
            val passwordReg = binding.passwordRegister.text.toString().trim()

            if (emailreg.isNotEmpty() && userReg.isNotEmpty() && passwordReg.isNotEmpty()) {
                findNavController().navigate(registerFragmentDirections.actionRegisterFragmentToAfterloginFragment("Please confirm your email adress: " + emailreg))
            } else {
                Toast.makeText(context, "Enter valid data", Toast.LENGTH_SHORT).show()
            }
        }
        binding.haveanaccount.setOnClickListener {
            findNavController().navigate(registerFragmentDirections.actionRegisterFragmentToLoginFragment())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}