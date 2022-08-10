package com.janirefernandez.shimmereffect.domain

import com.janirefernandez.shimmereffect.data.AnimalRepository
import com.janirefernandez.shimmereffect.data.model.Animal
import javax.inject.Inject

class AnimalUseCase @Inject constructor(
    private val repository: AnimalRepository
) {
    suspend operator fun invoke(size: Int): List<Animal> =
        repository.getAnimals(size)
}