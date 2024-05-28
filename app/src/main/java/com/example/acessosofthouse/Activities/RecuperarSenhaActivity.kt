package com.example.acessosofthouse.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acessosofthouse.R

class RecuperarSenhaActivity : AppCompatActivity() {

    lateinit var btnRecuperarSenha: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recuperar_senha)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recuperarSenha)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnRecuperarSenha = findViewById<Button>(R.id.btn_recuperarSenha)
        btnRecuperarSenha.setOnClickListener {
            val btnRecuperaIntent = Intent(this, PinSenhaActivity::class.java)
            startActivity(btnRecuperaIntent)
        }


    }
}