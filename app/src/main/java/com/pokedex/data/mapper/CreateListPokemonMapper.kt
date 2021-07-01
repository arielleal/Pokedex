package com.pokedex.data.mapper

import com.pokedex.data.model.PokemonResponse
import com.pokedex.domain.model.Pokemon
import java.util.ArrayList

class CreateListPokemonMapper {
    fun map(listPokemonResponse: List<PokemonResponse>): List<Pokemon> {
        val listPokemon: MutableList<Pokemon> = ArrayList()

        for (item in listPokemonResponse) {
            listPokemon.add (Pokemon(
                id = item.id,
                name = item.name
            ))
        }
        return listPokemon
    }
}