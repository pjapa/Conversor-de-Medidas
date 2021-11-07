package com.thiago.conversordemedidas

import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.lang.Double

class ConversorComprimento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        )
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_conversor_comprimento)
        var unidades = arrayOf("Milimetro(mm)", "Centimetro (cm)", "Metros (m)", "Quilometros (km)")
        var selecao = 0

        val spinner = findViewById<Spinner>(R.id.select)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val txtValor = findViewById<TextView>(R.id.txtValor)
        val btnComprimento = findViewById<Button>(R.id.btnComprimento)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,unidades)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selecao = position
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
        btnComprimento.setOnClickListener {
            var valor = txtValor.text.toString()
            if(valor!=""){
                if (selecao == 0){
                    var texto =" Centimetro"
                    texto += Double.parseDouble(valor) / 10f
                    texto +="cm \nMetro = "
                    texto += Double.parseDouble(valor) /1000f
                    texto +="cm \nQuilometro = "
                    texto += Double.parseDouble(valor) /1000000f
                    texto +="km"

                    txtResultado.text = texto
                }else if(selecao== 1){
                    var texto =" Milimetro = "
                    texto += Double.parseDouble(valor) / 10f
                    texto +="cm \nMetro = "
                    texto += Double.parseDouble(valor) /100f
                    texto +="cm \nQuilometro = "
                    texto += Double.parseDouble(valor) /100000f
                    texto +="km"

                    txtResultado.text =texto

                }else if (selecao ==  2){
                    var texto =" Milimetro = "
                    texto += Double.parseDouble(valor) * 1000f
                    texto +="cm \nCentimetro = "
                    texto += Double.parseDouble(valor) * 100f
                    texto +="cm \nQuilometro = "
                    texto += Double.parseDouble(valor) * 1000f
                    texto +="km"

                    txtResultado.text =texto

                }else if (selecao == 3){
                    var texto =" Milimetro = "
                    texto += Double.parseDouble(valor) * 1000000f
                    texto +="cm \nCentimetro = "
                    texto += Double.parseDouble(valor) * 100000f
                    texto +="cm \nMetro = "
                    texto += Double.parseDouble(valor) * 1000f
                    texto +="km"

                    txtResultado.text =texto
                }
            }else{
            txtResultado.text = "Adicione um valor para ser convertido"
        }
        }


    }
}



