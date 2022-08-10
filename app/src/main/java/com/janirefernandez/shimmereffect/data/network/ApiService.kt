package com.janirefernandez.shimmereffect.data.network

import com.janirefernandez.shimmereffect.data.model.Animal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ApiService @Inject constructor(private val api: ApiClient) {

    suspend fun getAnimals(size: Int): List<Animal> {
        return withContext(Dispatchers.IO) {
            val response = api.getAnimals(size)
            if (response.body() == null) {
                emptyList()
            } else {
                response.body()!!
            }
        }
    }
}