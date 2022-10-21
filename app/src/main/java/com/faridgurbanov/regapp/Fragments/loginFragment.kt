package com.faridgurbanov.regapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.faridgurbanov.regapp.R
import com.faridgurbanov.regapp.databinding.FragmentLoginBinding


class loginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.registerPage.setOnClickListener {
            findNavController().navigate(loginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }

        binding.loginbutton.setOnClickListener {
            val email = binding.emailLogin.text.toString().trim()
            val password = binding.passwordLogin.text.toString().trim()
            if ((email == "admin") && (password == "admin")) {
                findNavController().navigate(loginFragmentDirections.actionLoginFragmentToAfterloginFragment("You are logined as "+ email))
            } else {
                Toast.makeText(context, "Wrong mail or password!", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}