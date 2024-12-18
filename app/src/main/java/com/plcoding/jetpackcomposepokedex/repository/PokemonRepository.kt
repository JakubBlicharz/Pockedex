package com.plcoding.jetpackcomposepokedex.repository

import com.plcoding.jetpackcomposepokedex.PokeApi
import com.plcoding.jetpackcomposepokedex.Resource
import com.plcoding.jetpackcomposepokedex.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.responses.PokemonList
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")

        }
        return Resource.Success(response)
    }

    suspend fun getPokemonIfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonIfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")

        }
        return Resource.Success(response)
    }

}