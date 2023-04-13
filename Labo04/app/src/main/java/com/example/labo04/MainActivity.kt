package com.example.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    // UI elements
    private lateinit var nameTI : EditText
    private lateinit var emailTI: EditText
    private lateinit var phoneTI: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        addListener()
    }

    private fun bind(){
        nameTI = findViewById(R.id.editText_name)
        emailTI = findViewById(R.id.email_text)
        phoneTI = findViewById(R.id.phone_number_text)
        saveButton = findViewById(R.id.save_button)

    }

    private fun addListener() {
        saveButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            val nameFill = nameTI.text.toString()
            val emailFill = emailTI.text.toString()
            val phoneFill = phoneTI.text.toString()

            intent.putExtra("name", nameFill)
            intent.putExtra("email", emailFill)
            intent.putExtra("phone", phoneFill)

            startActivity(intent)
    }


    }
}

