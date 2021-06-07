package com.pokedex.di

import com.pokedex.data.datasource.remote.PokedexRemoteDataSource
import com.pokedex.data.datasource.remote.PokedexRemoteDataSourceImpl
import com.pokedex.domain.repository.PokedexRepository
import com.pokedex.data.repository.PokedexRepositoryImpl
import org.koin.dsl.module

val dataModule = module {

    factory <PokedexRemoteDataSource>{
        PokedexRemoteDataSourceImpl()
    }
    factory<PokedexRepository>{
        PokedexRepositoryImpl(remoteDataSource = get())
    }
}