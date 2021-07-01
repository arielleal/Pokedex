package com.pokedex.data.repository

import com.pokedex.data.datasource.remote.PokedexRemoteDataSource
import com.pokedex.data.mapper.CreateListPokemonMapper
import com.pokedex.domain.model.Pokemon
import com.pokedex.domain.repository.PokedexRepository
import io.reactivex.Single

class PokedexRepositoryImpl(
    private val remoteDataSource: PokedexRemoteDataSource,
    private val mapper: CreateListPokemonMapper
) : PokedexRepository {

    override fun getPokemonList(): Single<List<Pokemon>> {
        return remoteDataSource.getPokedexList().map(mapper::map)
    }
}

