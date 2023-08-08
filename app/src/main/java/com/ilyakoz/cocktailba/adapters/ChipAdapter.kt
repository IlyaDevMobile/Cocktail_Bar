package com.ilyakoz.cocktailba.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.ilyakoz.cocktailba.R

class ChipAdapter : RecyclerView.Adapter<ChipAdapter.ChipViewHolder>() {

    private val chipList: MutableList<String> = mutableListOf()

    fun addNewChip(chipText: String) {
        chipList.add(chipText)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chip_item, parent, false)
        return ChipViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChipViewHolder, position: Int) {
        holder.bind(chipList[position])
    }

    override fun getItemCount(): Int {
        return chipList.size
    }

    inner class ChipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val chip: Chip = itemView.findViewById(R.id.chip)

        fun bind(chipText: String) {
            chip.text = chipText
        }
    }
}