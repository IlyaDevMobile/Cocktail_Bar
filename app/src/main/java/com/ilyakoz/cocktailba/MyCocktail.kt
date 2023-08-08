package com.ilyakoz.cocktailba

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ilyakoz.cocktailba.adapters.AlphaAdapter
import com.ilyakoz.cocktailba.adapters.AlphaChar
import com.ilyakoz.cocktailba.databinding.MyCocktailsBinding

class MyCocktail : AppCompatActivity() {

    private val binding: MyCocktailsBinding by lazy {
        MyCocktailsBinding.inflate(layoutInflater)
    }

    private val adapter: AlphaAdapter by lazy {
        val array = setDataInList()
        AlphaAdapter(applicationContext, array)
    }

    private val gridLayoutManager: GridLayoutManager by lazy {
        GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerview.layoutManager = gridLayoutManager
        binding.recyclerview.setHasFixedSize(true)
        binding.recyclerview.adapter = adapter

        binding.addNewCocktailBtn.setOnClickListener {
            val intent = Intent(this, CreateCocktail::class.java)
            startActivity(intent)
        }
    }


    private fun setDataInList(): ArrayList<AlphaChar> {
        var items: ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))
        items.add(AlphaChar(R.mipmap.ic_launcher_foreground, "cocktail"))

        return items
    }


}