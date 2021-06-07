package com.pokedex.domain.repository

import com.pokedex.data.model.PokemonResponse
import io.reactivex.Single
import retrofit2.Call

interface PokedexRepository {
    fun getPokemonList(): Single<List<PokemonResponse>>
}