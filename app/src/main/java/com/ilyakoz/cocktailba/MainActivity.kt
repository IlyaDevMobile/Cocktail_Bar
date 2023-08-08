package com.ilyakoz.cocktailba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilyakoz.cocktailba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addCocktailsBtn.setOnClickListener {
            val intent = Intent(this, MyCocktail::class.java)
            startActivity(intent)
        }
    }
}