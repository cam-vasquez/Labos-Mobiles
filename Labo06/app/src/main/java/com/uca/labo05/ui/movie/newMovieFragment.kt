package com.uca.labo05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.uca.labo05.R

private lateinit var submitBtn : Button

class newMovieFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }

    private fun bind(){
        submitBtn = view?.findViewById(R.id.button_add_new_movie) as Button
    }

    private fun listeners(){
        submitBtn.setOnClickListener{
            it.findNavController().navigate(R.id.action_newMovieFragment_to_billboardFragment62)
        }
    }
}
