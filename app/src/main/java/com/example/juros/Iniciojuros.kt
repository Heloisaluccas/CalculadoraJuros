package com.example.juros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import kotlin.math.pow

class Iniciojuros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciojuros)
        val vf = findViewById<EditText>(R.id.edtFin)
        val taxa = findViewById<EditText>(R.id.edtTaxa)
        val meses =findViewById<EditText>(R.id.edtMeses)
        val mont = findViewById<EditText>(R.id.edtMontante)
        val tot = findViewById<EditText>(R.id.edtTotal)
        val parcela = findViewById<EditText>(R.id.edtParcela)

        val btnSimples = findViewById<Button>(R.id.btnSimples)
        val btnComp = findViewById<Button>(R.id.btnComposto)
        val radio = findViewById<RadioButton>(R.id.rdAa)
        val radiom = findViewById<RadioButton>(R.id.rdAm)

        btnSimples.setOnClickListener{
            var ntaxa=taxa.text.toString().toDouble()
            var nvf = vf.text.toString().toDouble()
            var nmeses = meses.text.toString().toInt()
            ntaxa=ntaxa/100
            if(radio.isChecked) {
                ntaxa = ntaxa/12
            }
            val montante = mont.text.toString().toDouble()
            val total = tot.text.toString().toDouble()
            val parcelaj = parcela.text.toString().toDouble()

            var simples = (nvf + (nvf + ntaxa * nmeses))
        }
        btnComp.setOnClickListener{
            var ntaxa=taxa.text.toString().toDouble()
            var nvf = vf.text.toString().toDouble()
            val nmeses = meses.text.toString().toInt()
            ntaxa=ntaxa/100
            if(radio.isChecked) {
                ntaxa = ntaxa/12
            }
            val montante = mont.text.toString().toDouble()
            val total = tot.text.toString().toDouble()
            val parcelaj = parcela.text.toString().toDouble()

            var juroscom =Math.pow(1 +ntaxa,(1 / 12.00)) - 1
            var calcom = nvf * (1.0 + juroscom).pow(nmeses)
            var valorcom = juroscom - nvf
            var calparc = juroscom / nmeses
        }
    }
}