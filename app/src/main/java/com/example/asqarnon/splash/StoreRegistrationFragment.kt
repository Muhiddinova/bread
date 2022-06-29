package com.example.asqarnon.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.R
import com.example.asqarnon.databinding.FragmentStoreRegistrationBinding

class StoreRegistrationFragment : Fragment() {

    private lateinit var binding:FragmentStoreRegistrationBinding
    private lateinit var viewModel: StoreRegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_store_registration, container, false)
        viewModel = ViewModelProvider(this).get(StoreRegistrationViewModel::class.java)
        binding.btnReg.setOnClickListener {
            findNavController().navigate(R.id.mainActivity)
        }
        return binding.root
    }



}