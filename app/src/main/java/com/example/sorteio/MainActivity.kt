package com.example.sorteio

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }


    fun sortear(view: View) {
        val textResultado = findViewById<TextView>(R.id.text_resultado)
        val number = java.util.Random().nextInt(11)
        textResultado.setText("Número Sorteado: $number")
    }

}