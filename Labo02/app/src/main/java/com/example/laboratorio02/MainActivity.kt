package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

private lateinit var calculateButton: Button
private lateinit var weightTV: EditText
private lateinit var heightTV: EditText
private lateinit var rangeTV: EditText




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind()
            // ocultando el actionBar
        //supportActionBar!!.hide();


    }

    private fun setListener() {
        TODO("Not yet implemented")
    }
}

