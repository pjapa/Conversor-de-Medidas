package com.thiago.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConversorDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_dados)

        var medidas = arrayOf("Byte(b)", "Quilobyte (kb)", "Megabyte (m)", "Quilometros (km)")
    }
}