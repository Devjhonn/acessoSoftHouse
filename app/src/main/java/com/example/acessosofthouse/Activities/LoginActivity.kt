package com.example.acessosofthouse.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acessosofthouse.MainActivity
import com.example.acessosofthouse.R

class LoginActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            val btnRecuperaIntent = Intent(this, MainActivity::class.java)
            startActivity(btnRecuperaIntent)
        }

    }
}