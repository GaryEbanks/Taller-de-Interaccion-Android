package com.example.tallerinteraccion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tallerinteraccion.databinding.ActivityCamaraBinding

class camara : AppCompatActivity() {
    private lateinit var binding: ActivityCamaraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCamaraBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegresar.setOnClickListener() {
            volverVista()
        }
    }

    private fun volverVista(){
        startActivity(Intent(this, registro::class.java))
    }

}