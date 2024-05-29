package com.example.acessosofthouse.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acessosofthouse.R

class NovaSenhaActivity : AppCompatActivity() {
     lateinit var btnNovaSenha: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nova_senha)

        btnNovaSenha = findViewById(R.id.btn_DefinirNovaSenha)
        btnNovaSenha.setOnClickListener {
            val novaSenhaIntent = Intent(this, LoginActivity::class.java)
            startActivity(novaSenhaIntent)
        }
    }
}