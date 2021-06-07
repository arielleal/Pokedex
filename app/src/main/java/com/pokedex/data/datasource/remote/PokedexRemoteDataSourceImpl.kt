package com.pokedex.data.datasource.remote

import com.pokedex.data.api.PokedexService
import com.pokedex.data.model.PokemonResponse
import com.pokedex.data.retrofit.RetrofitConfig
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Retrofit

class PokedexRemoteDataSourceImpl() :PokedexRemoteDataSource {
    private val retrofitConfig: Retrofit = RetrofitConfig().getRetrofitInstance()
    private val endpoint = retrofitConfig.create(PokedexService::class.java)

    override fun getPokedexList(): Single<List<PokemonResponse>> {
        return endpoint.getAllPokemon()
    }
}