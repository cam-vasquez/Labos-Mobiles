package com.uca.labo05

import android.app.Application
import com.uca.labo05.data.movies
import com.uca.labo05.repositories.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}