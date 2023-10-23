package com.example.segundoproyecto


import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity


class ActivityResultado : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_resultado)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val volver= findViewById<Button>(R.id.volver)

        tvResult.text = getString(R.string.hola, name)

        volver.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            val alerta= AlertDialog.Builder(this)
            alerta.setTitle("ALERTA")
            alerta.setMessage("Estas seguro de volver????")
            alerta.setPositiveButton(android.R.string.ok){ dialogInterface: DialogInterface, i: Int -> }
            alerta.show()
        }
    }
}

