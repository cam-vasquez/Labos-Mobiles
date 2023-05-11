package com.example.laboratorio_06.ui.movie.billboard.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio_06.R
import com.example.laboratorio_06.databinding.FragmentItemMovieBinding


class MovieItemFragment : Fragment() {

private lateinit var binding: FragmentItemMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentItemMovieBinding.inflate(inflater, container, false)
        return binding.root
    }


}