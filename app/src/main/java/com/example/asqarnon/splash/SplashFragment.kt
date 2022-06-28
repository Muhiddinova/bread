package com.example.asqarnon.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.R
import com.example.asqarnon.databinding.FragmentSplashBinding
import java.util.*


class SplashFragment : Fragment() {
    private lateinit var timer: Timer
    private lateinit var binding: FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false)
        return binding.root
    }

    private fun waitAndOpenOtherFragment() {
        val mainHandler = context?.let { Handler(it.mainLooper) }
        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                val runnable = kotlinx.coroutines.Runnable {
                    findNavController().navigate(R.id.registrationFragment)

                }
                mainHandler?.post(runnable)
            }
        }, 2000)
    }

    override fun onResume() {
        super.onResume()
        waitAndOpenOtherFragment()
    }
}