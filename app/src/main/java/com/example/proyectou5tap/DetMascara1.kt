package com.example.mascaras

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class DetMascara1 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masc1)
    }

    fun regM1(view : View){

        val intent = Intent(this,Productos::class.java)
        startActivity(intent)

    }

}