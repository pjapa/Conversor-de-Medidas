package com.thiago.conversordemedidas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton

class HomeAnime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_home_anime)


        val btnComprimento = findViewById<ImageButton>(R.id.btnComprimento)
        btnComprimento.setOnClickListener {
            val intent = Intent (this, ConversorComprimento::class.java)
            startActivity(intent)
        }

        val btnDados = findViewById<ImageButton>(R.id.btnDados)
        btnDados.setOnClickListener {
            val intent = Intent (this, ConversorDados::class.java)
            startActivity(intent)
        }


        val btnTemperatura = findViewById<ImageButton>(R.id.btnTemperatura)
        btnTemperatura.setOnClickListener {
            val intent = Intent(this, ConversorTemperatura::class.java)
            startActivity(intent)
        }
        val btnPeso = findViewById<ImageButton>(R.id.btnPeso)
        btnPeso.setOnClickListener {
            val intent = Intent(this, conversorPeso::class.java)
            startActivity(intent)
        }
    }
}