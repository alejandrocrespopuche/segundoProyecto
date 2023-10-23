package com.example.segundoproyecto


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_primera)
        val boton = findViewById<Button>(R.id.boton1)
        val texto = findViewById<EditText>(R.id.texto1)

        boton.setOnClickListener {
            val nombre = texto.text.toString()

            if (nombre.isNotEmpty()) {
                val intent = Intent(this, ActivityResultado::class.java)
                intent.putExtra("EXTRA_NAME", nombre)
                startActivity(intent)
                Toast.makeText(this, "actividad 2", Toast.LENGTH_SHORT).show()
            }
        }

    }
}