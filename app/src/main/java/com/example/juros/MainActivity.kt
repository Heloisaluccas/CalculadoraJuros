package com.example.juros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val csenha = findViewById<EditText>(R.id.edtSenha)
        val login = findViewById<EditText>(R.id.edtLogin)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        btnEntrar.setOnClickListener{
            if(csenha.text.toString().toInt()=="123456".toInt()){
                val intent = Intent(this,Iniciojuros::class.java).apply {
                }
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Usuário não encontrado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}