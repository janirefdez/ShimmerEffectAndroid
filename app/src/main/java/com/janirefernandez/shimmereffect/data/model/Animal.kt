package com.janirefernandez.shimmereffect.data.model

import com.google.gson.annotations.SerializedName


data class Animal(
    @SerializedName("name") val name: String,
    @SerializedName("animal_type") val animalType: String,
    @SerializedName("image_link") val imageLink: String
)