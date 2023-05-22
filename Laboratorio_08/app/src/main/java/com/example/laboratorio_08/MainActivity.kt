package com.example.laboratorio_08

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.laboratorio_08.databinding.ActivityMainBinding
import com.example.laboratorio_08.ui.movie.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val movieViewModel: MovieViewModel by viewModels {
        MovieViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        supportActionBar!!.hide()
    }




    override fun onBackPressed() {
        val trans = supportFragmentManager.beginTransaction()
        binding.navHostFragment.id
        if(movieViewModel.getScreenFragment() == 0){
            super.onBackPressed()
        }

    }

}