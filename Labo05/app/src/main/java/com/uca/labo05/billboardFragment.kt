package com.uca.labo05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class billboardFragment : Fragment() {

    private lateinit var buttonNewMovieFragment: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonNewMovieFragment.setOnClickListener{
            it.findNavController().navigate((R.id.action_billboardFragment6_to_newMovieFragment2))
        }
    }


    private fun bind(){
        buttonNewMovieFragment = view?.findViewById(R.id.button_add_new_movie) as Button
    }

}