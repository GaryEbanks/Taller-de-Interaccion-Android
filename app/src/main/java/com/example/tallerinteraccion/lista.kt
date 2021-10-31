package com.example.tallerinteraccion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tallerinteraccion.databinding.ActivityListaBinding

class lista : AppCompatActivity() {

    private lateinit var binding: ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegresar.setOnClickListener(){
            volverVistaMain()
        }
    }

    private fun volverVistaMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}