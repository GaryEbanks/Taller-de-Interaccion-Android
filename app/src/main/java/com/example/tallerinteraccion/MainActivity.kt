package com.example.tallerinteraccion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tallerinteraccion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener(){
            verVistaRegistro()
        }

        binding.btnLista.setOnClickListener (){
            verVistaLista()
        }
    }

    private fun  verVistaRegistro(){
        startActivity(Intent(this, registro::class.java))
    }

    private fun  verVistaLista(){
        startActivity(Intent(this, lista::class.java))
    }
}

