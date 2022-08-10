package com.janirefernandez.shimmereffect.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.janirefernandez.shimmereffect.R
import com.janirefernandez.shimmereffect.data.model.Animal

class AnimalAdapter(
    private val animalList: List<Animal>
) : RecyclerView.Adapter<AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val item = animalList[position]
        holder.render(item)
    }

    override fun getItemCount() = animalList.size

}