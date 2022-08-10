package com.janirefernandez.shimmereffect.data

import com.janirefernandez.shimmereffect.data.model.Animal
import com.janirefernandez.shimmereffect.data.network.ApiService
import javax.inject.Inject

class AnimalRepository @Inject constructor(
    private val api: ApiService
) {

    suspend fun getAnimals(size: Int): List<Animal> {
        return api.getAnimals(size)
    }
}