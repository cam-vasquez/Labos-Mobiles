package com.example.laboratorio_06

import android.app.Application
import com.example.laboratorio_06.data.movies
import com.example.laboratorio_06.respository.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository : MovieRepository by lazy {
        MovieRepository(movies)
    }
}