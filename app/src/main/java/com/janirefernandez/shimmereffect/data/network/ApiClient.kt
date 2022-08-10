package com.janirefernandez.shimmereffect.data.network

import com.janirefernandez.shimmereffect.data.model.Animal
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    //https://zoo-animal-api.herokuapp.com/animals/rand/5
    @GET("/animals/rand/{size}")
    suspend fun getAnimals(
        @Path("size") size: Int = 5,
    ): Response<List<Animal>>

}