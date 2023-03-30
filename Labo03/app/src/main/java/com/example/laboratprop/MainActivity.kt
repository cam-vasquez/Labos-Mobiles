package com.example.laboratprop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // ui elements
    private lateinit var counterTV: TextView
    private lateinit var addNickleIB: ImageButton
    private lateinit var addDimeIB: ImageButton
    private lateinit var addQuarterIB: ImageButton
    private lateinit var addDollarIB: ImageButton

    // counterMoney
    private var counterMoney = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        addListeners()
    }

    private fun bind(){
        counterTV = findViewById(R.id.counter_money)
        addNickleIB = findViewById(R.id.imageButton_nickle)
        addDimeIB = findViewById(R.id.imageButton_dime)
        addQuarterIB = findViewById(R.id.imageButton_quarter)
        addDollarIB = findViewById(R.id.imageButton_dollar)
    }

    private fun addListeners(){
        addNickleIB.setOnClickListener{addMoney(0.05)}
        addDimeIB.setOnClickListener{addMoney(0.10)}
        addQuarterIB.setOnClickListener{addMoney(0.25)}
        addDollarIB.setOnClickListener{addMoney(1.00)}
    }

    private fun addMoney(totalCount: Double){
        counterMoney += totalCount
        counterTV.text= getString(R.string.money_value, String.format("%.2f", counterMoney))
    }
}