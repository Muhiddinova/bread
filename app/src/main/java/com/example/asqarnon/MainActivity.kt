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
//                R.id.nav_setting -> navController.navigate(R.id.settingFragment)
//                R.id.nav_home -> navController.navigate(R.id.homeFragment)
//                R.id.nav_debts -> navController.navigate(R.id.debtsFragment)
//                R.id.nav_fees -> navController.navigate(R.id.feesFragment)
//                R.id.nav_qr_cod -> navController.navigate(R.id.qrCodScannerFragment)
//                R.id.nav_share -> navController.navigate(R.id.profileFragment)

            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true

        }


    }


    override fun onBackPressed() {


        if (navController.currentDestination?.id == R.id.allOrdersFragment || navController.currentDestination?.id == R.id.registrationFragment) {
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
