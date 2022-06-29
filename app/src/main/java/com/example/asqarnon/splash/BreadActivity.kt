package com.example.asqarnon.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.R

import com.example.asqarnon.databinding.ActivitySplashBinding

class BreadActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)

        val navHost =
            supportFragmentManager.findFragmentById(R.id.splash_nav_controller) as NavHostFragment
        navController = navHost.navController
        navController = navHost.findNavController()
        setContentView(binding.root)
    }
}