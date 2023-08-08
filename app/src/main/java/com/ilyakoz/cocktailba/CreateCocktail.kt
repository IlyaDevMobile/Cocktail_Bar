package com.ilyakoz.cocktailba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ilyakoz.cocktailba.adapters.ChipAdapter

class CreateCocktail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_coctail)

        val chipsRecyclerView: RecyclerView = findViewById(R.id.chipsRecyclerView)
        val addChipButton: Button = findViewById(R.id.addChipButton)

        val chipAdapter = ChipAdapter() // Создайте адаптер для RecyclerView
        chipsRecyclerView.adapter = chipAdapter
        chipsRecyclerView.layoutManager = GridLayoutManager(this, 2,LinearLayoutManager.HORIZONTAL, false)

        addChipButton.setOnClickListener {
            chipAdapter.addNewChip("Новый Chip")
        }
    }
}