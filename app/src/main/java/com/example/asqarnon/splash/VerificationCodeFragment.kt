package com.example.asqarnon.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.R
import com.example.asqarnon.databinding.FragmentVerificationCodeBinding


class VerificationCodeFragment : Fragment() {
    private lateinit var binding:FragmentVerificationCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_verification_code, container, false)
//        binding.btnSendCod.setOnClickListener {
//            findNavController().navigate(R.id.storeRegistrationFragment)
//        }
      return  binding.root
    }


}