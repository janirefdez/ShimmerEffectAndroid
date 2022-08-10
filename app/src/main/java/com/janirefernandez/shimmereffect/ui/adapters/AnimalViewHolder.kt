package com.janirefernandez.shimmereffect.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.janirefernandez.shimmereffect.R
import com.janirefernandez.shimmereffect.data.model.Animal
import com.janirefernandez.shimmereffect.databinding.AnimalItemBinding

class AnimalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = AnimalItemBinding.bind(view)

    fun render(animal: Animal) {
        binding.animalName.text = animal.name
        binding.animalType.text = animal.animalType
        Glide.with(binding.animalImage.context)
            .load(animal.imageLink)
            .placeholder(R.color.gray)
            .centerCrop()
            .into(binding.animalImage)

    }
}