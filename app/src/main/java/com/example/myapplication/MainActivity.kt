package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val validarEmail = "turmadeandroid@gmail.com"
    private val validarSenha = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextSenha = findViewById<EditText>(R.id.editTextSenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener(View.OnClickListener {
            val email = editTextEmail.text.toString()
            val senha = editTextSenha.text.toString()

            if (email == validarEmail && senha == validarSenha) {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email ou senha incorretos.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}