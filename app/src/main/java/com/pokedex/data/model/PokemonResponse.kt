package com.pokedex.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PokemonResponse(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = ""
):Serializable
