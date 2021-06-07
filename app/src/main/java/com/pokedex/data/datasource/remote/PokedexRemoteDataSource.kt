package com.pokedex.data.datasource.remote

import com.pokedex.data.model.PokemonResponse
import io.reactivex.Single
import retrofit2.Call

interface PokedexRemoteDataSource {
    fun getPokedexList(): Single<List<PokemonResponse>>
}