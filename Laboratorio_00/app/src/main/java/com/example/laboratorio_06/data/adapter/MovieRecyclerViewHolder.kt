package com.example.laboratorio_06.data.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_06.data.model.MovieModel
import com.example.laboratorio_06.databinding.FragmentMovieItemBinding

class MovieRecyclerViewHolder(private val binding: FragmentMovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie : MovieModel, clickListener: (MovieModel) -> Unit){
        binding.textViewName.text = movie.name
        binding.textViewQualification.text = movie.qualification

        binding.cardViewMovie.setOnClickListener{
            clickListener(movie)
        }
    }
}