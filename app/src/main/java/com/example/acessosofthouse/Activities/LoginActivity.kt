package com.example.acessosofthouse.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acessosofthouse.MainActivity
import com.example.acessosofthouse.R

class LoginActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var txtCadastro: TextView
    lateinit var txtEsqueceuSenha: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            val btnLoginIntent = Intent(this, MainActivity::class.java)
            startActivity(btnLoginIntent)
        }


        txtEsqueceuSenha = findViewById<TextView>(R.id.txt_esqueceu_senha)
        txtEsqueceuSenha.setOnClickListener {
            val txtEsqueceuSenhaIntent = Intent(this, RecuperarSenhaActivity::class.java)
            startActivity(txtEsqueceuSenhaIntent)
        }

        txtCadastro = findViewById<TextView>(R.id.txt_criar_conta)
        txtCadastro.setOnClickListener {
            val txtCadastroIntent = Intent(this, RegisterActivity::class.java)
            startActivity(txtCadastroIntent)
        }

    }
}