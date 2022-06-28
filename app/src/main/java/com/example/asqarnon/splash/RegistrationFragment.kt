package com.example.asqarnon.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.R
import com.example.asqarnon.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
    private lateinit var binding:FragmentRegistrationBinding

    private lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_registration,container,false)
        viewModel = ViewModelProvider(this)[RegistrationViewModel::class.java]
        binding.btnSendCod.setOnClickListener{
            findNavController().navigate(R.id.verificationCodeFragment)
        }
        return binding.root
    }


}