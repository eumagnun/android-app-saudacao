package br.com.danielamaral.saudacao

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNome:EditText = findViewById(R.id.etNome)
        val tvResultado:TextView = findViewById(R.id.tvResultado)

        val btBoaNoite:Button = findViewById(R.id.btBoaNoite)
        btBoaNoite.setOnClickListener{
            tvResultado.text = saudacao(btBoaNoite.id,etNome.text.toString())
        }

        val btBomDia:Button = findViewById(R.id.btBomDia)
        btBomDia.setOnClickListener{
            tvResultado.text = saudacao(btBomDia.id,etNome.text.toString())
        }
    }

    fun saudacao(botao: Int, nome: String):String{
        if(botao== R.id.btBomDia) {
            return "Bom dia ${nome}!!!!!!!!!"
        } else{
            return "Boa noite ${nome}!!!!!!!"
        }
    }

}