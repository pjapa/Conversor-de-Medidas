package com.thiago.conversordemedidas

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)
        //Carregar componentes


        val btnComecar = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnComecar)
        btnComecar.setOnClickListener {
            val intent = Intent (this, HomeAnime::class.java)
            startActivity(intent)
        }
    }
}