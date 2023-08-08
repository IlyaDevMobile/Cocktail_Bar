package com.ilyakoz.cocktailba.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ilyakoz.cocktailba.R
import com.ilyakoz.cocktailba.databinding.GridItemBinding

class AlphaAdapter(
    private val context: Context,
    private val arrayList: ArrayList<AlphaChar>
) : RecyclerView.Adapter<AlphaAdapter.ItemHolder>() {

    private val defaultImageResId = R.mipmap.ic_launcher_foreground

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding = GridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val currentItem = arrayList[position]

        holder.binding.itemTextView.text = currentItem.alphaChar

        val imageResId = if (currentItem.icons != 0) currentItem.icons else defaultImageResId
        if (imageResId != null) {
            holder.binding.imageCocktail.setImageResource(imageResId)
        }

        holder.binding.root.setOnClickListener {
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemHolder(val binding: GridItemBinding) : RecyclerView.ViewHolder(binding.root)
}
