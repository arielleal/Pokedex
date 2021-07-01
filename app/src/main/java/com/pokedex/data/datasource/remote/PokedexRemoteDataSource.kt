package com.pokedex.data.datasource.remote

import com.pokedex.data.model.PokemonResponse
import io.reactivex.Single

interface PokedexRemoteDataSource {
    fun getPokedexList(): Single<List<PokemonResponse>>
}