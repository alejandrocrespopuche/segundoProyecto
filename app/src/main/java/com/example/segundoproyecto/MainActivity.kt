package com.example.segundoproyecto


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


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
            }
        }

    }
}