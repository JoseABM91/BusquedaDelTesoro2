package com.example.busquedadeltesoro

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentActivity


class MainActivity2 : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()
            st TexViewUsuario = usuario();
        }
    }

    fun pulsador(view: View) {
    var boton: Button = view as Button;
    var tag: String = boton.tag as String;

        if (boton.equals("B")){
            var mensaje = "¡Vaya, has perdido!";
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        }
        else if (boton.equals ("T")) {
            var mensaje = "¡Vaya, has ganado!";
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        }
        }







    fun resolver(view: View) {
        //.visibility = View.VISIBLE;
        //.visibility = View.INVISIBLE;
    }
    fun cancelarPartida(view: View) {
        finish();
    }
    fun reiniciarPartida(view: View) {
        onRestart();
    }

}