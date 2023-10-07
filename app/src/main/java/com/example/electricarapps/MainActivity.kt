package com.example.electricarapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var KmPercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {
        preco = findViewById(R.id.et_preco_khw)
        KmPercorrido = findViewById(R.id.et_km_percorrido)
        btnCalcular = findViewById(R.id.btn_calcular)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = KmPercorrido.text.toString().toFloat()
        val result = preco / km
        resultado.text = result.toString()
    }
}