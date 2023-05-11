package com.example.laboratorio_06.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_06.data.model.MovieModel
import com.example.laboratorio_06.databinding.FragmentItemMovieBinding
import com.example.laboratorio_06.generated.callback.OnClickListener
import com.example.laboratorio_06.ui.movie.viewmodel.MovieViewModel

class MovieRecyclerViewHolder(private val binding: FragmentItemMovieBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit){
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification


        binding.movieItemCardVIew.setOnClickListener{
            clickListener(movie)
        }
    }
}