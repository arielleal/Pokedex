package com.pokedex.data.api

import com.pokedex.data.model.PokemonResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PokedexService {

    @GET("/V2/pokemon")
    fun getAllPokemon(): Single<List<PokemonResponse>>

    @GET ("/v2/pokemon")
    fun getPokemon(@Query ("name") name: String): Single<PokemonResponse>
}