package com.example.segundoproyecto


import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class ActivityResultado : ComponentActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_resultado)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvResult2 = findViewById<TextView>(R.id.tvResult2)

        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val f: String = intent.extras?.getString("HORA").orEmpty()
        val volver= findViewById<Button>(R.id.volver)

        tvResult.text = getString(R.string.hola, name)
        tvResult2.text = f
        val intent = Intent(this, MainActivity::class.java)

        volver.setOnClickListener()
        {

            val alerta = AlertDialog.Builder(this)
            alerta.setTitle("ALERTA")
            alerta.setMessage("¿Estás seguro de volver?")
            alerta.setPositiveButton(android.R.string.ok) { dialog, which ->

                Toast.makeText(applicationContext, android.R.string.ok, Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
            alerta.setNegativeButton(android.R.string.cancel) { dialog, which ->
                Toast.makeText(applicationContext, android.R.string.cancel, Toast.LENGTH_SHORT).show() }

            alerta.setNeutralButton("omitir") { dialog, which ->
                Toast.makeText(applicationContext, "has pulsado omitir", Toast.LENGTH_SHORT).show() }

            alerta.show()


        }
    }
}

