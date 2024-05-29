package com.example.acessosofthouse.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acessosofthouse.R

class PinSenhaActivity : AppCompatActivity() {

    lateinit var btnPin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pin_senha)


        btnPin = findViewById(R.id.btn_Pin)
        btnPin.setOnClickListener {
            val btnPinIntent = Intent(this, NovaSenhaActivity::class.java)
            startActivity(btnPinIntent)
        }
    }
}