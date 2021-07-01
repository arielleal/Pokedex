package com.pokedex.domain.repository

import com.pokedex.domain.model.Pokemon
import io.reactivex.Single

interface PokedexRepository {
    fun getPokemonList(): Single<List<Pokemon>>
}