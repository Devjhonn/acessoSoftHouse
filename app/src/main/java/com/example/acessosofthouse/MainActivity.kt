package com.example.acessosofthouse

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.acessosofthouse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var navControler: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initFragment()
    }

    private fun initFragment(){
        val navFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navControler = navFragment.navController
        NavigationUI.setupWithNavController(viewBinding.btnNavigation, navControler)
    }
}