package com.example.busquedadeltesoro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

abstract class MainActivity : AppCompatActivity() {
    lateinit var editTextNombreUsuario:EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun datosUsuario(view: View) {
        var usuario = editTextNombreUsuario.text.toString();
        intent
    }
    fun jugar(view: View) {}
    fun salir(view: View) {
        finish();
    }
}