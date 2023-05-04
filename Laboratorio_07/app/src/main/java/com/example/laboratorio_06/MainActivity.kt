package com.example.laboratorio_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.laboratorio_06.databinding.FragmentNewMovieBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : FragmentNewMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)


        supportActionBar!!.hide()
    }

}