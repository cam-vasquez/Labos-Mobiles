package com.example.market_tracker.data.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.market_tracker.data.Model.MarketModel

class MarketRecyclerViewAdapter(
    private val clickListener: (MarketModel) -> Unit
): RecyclerView.Adapter<MarketRecyclerViewHolder>() {
    private val supers = ArrayList<MarketModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketRecyclerViewHolder {
        val binding = FragmentMarketItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MarketRecyclerViewHolder(binding)
    }

    override fun getItemCount() = supers.size

    override fun onBindViewHolder(holder: MarketRecyclerViewHolder, position: Int) {
        val singer = supers[position]
        holder.bind(singer, clickListener)
    }

    fun setData(singerList: List<MarketModel>){
        supers.clear()
        supers.addAll(singerList)
    }
}