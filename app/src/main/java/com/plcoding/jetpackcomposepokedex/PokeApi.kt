package com.plcoding.jetpackcomposepokedex

import com.plcoding.jetpackcomposepokedex.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList


    @GET("pokemon/{name}")
    suspend fun getPokemonIfo(
        @Path("name") name: String
    ): Pokemon
}