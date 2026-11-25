package com.practica.analiticamovil

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos de la interfaz
        val tvEstadoModelo = findViewById<TextView>(R.id.tvEstadoModelo)
        val btnSincronizar = findViewById<Button>(R.id.btnSincronizar)

        // Evento clic del boton
        btnSincronizar.setOnClickListener {
            Toast.makeText(
                this,
                "Preparando entorno para consumir API...",
                Toast.LENGTH_SHORT
            ).show()

            tvEstadoModelo.text = "Estado del Modelo: Listo para conectar"
        }
    }

    // Metodos del ciclo de vida de la Activity
    override fun onStart() {
        super.onStart()
        Log.d("CICLO_VIDA", "La aplicación entró en primer plano (onStart)")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO_VIDA", "La aplicación pasó a segundo plano (onPause)")
    }
}