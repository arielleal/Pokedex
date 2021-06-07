package com.pokedex.data.repository

import com.pokedex.data.datasource.remote.PokedexRemoteDataSource
import com.pokedex.data.model.PokemonResponse
import com.pokedex.domain.repository.PokedexRepository
import io.reactivex.Single
import retrofit2.Call

class PokedexRepositoryImpl(private val remoteDataSource: PokedexRemoteDataSource) :
    PokedexRepository {

    override fun getPokemonList(): Single<List<PokemonResponse>> {
        return remoteDataSource.getPokedexList()
    }

}

