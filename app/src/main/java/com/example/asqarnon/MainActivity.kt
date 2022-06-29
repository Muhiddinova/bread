package com.example.asqarnon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.asqarnon.databinding.ActivityMainBinding
import com.example.asqarnon.databinding.HeaderBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController
    private var lastBackPressed: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val navHost = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHost.navController
        navController = navHost.findNavController()
        binding.toolbar.setNavigationOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START, true)
        }
        binding.navView.setNavigationItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.my_orders -> navController.navigate(R.id.acceptedFragment)
                R.id.profile -> navController.navigate(R.id.profileFragment)
//                R.id.report -> navController.navigate(R.id.debtsFragment)
                R.id.comment -> navController.navigate(R.id.propositionFragment)
                R.id.info -> navController.navigate(R.id.infoFragment)


            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true

        }


    }


    override fun onBackPressed() {


        if (navController.currentDestination?.id == R.id.acceptedFragment || navController.currentDestination?.id == R.id.registrationFragment) {
            if (lastBackPressed + 2000 >= System.currentTimeMillis()) {
                finishAffinity()
            } else {
                lastBackPressed = System.currentTimeMillis()
                Toast.makeText(this, "Chiqish uchun yana bir marta bosing", Toast.LENGTH_SHORT)
                    .show()
            }
        } else {
            super.onBackPressed()
        }

    }

    }
