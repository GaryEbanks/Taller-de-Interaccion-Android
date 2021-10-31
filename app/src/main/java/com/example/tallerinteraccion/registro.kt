package com.example.tallerinteraccion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tallerinteraccion.databinding.ActivityRegistroBinding

class registro : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCamara.setOnClickListener(){
            verVistaCam()
        }

        binding.btnRegresar.setOnClickListener(){
            volverVistaMain()
        }
    }

    private fun volverVistaMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun verVistaCam(){
        startActivity(Intent(this, camara::class.java))
    }


}