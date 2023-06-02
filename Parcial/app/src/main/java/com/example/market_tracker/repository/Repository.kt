package com.example.market_tracker.repository

import com.example.market_tracker.data.Model.MarketModel

class Repository(private val supers: MutableList<MarketModel>) {

    fun getSingers () = supers
    fun setSinger (market: MarketModel) = supers.add(market)
}
