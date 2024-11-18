package com.plcoding.jetpackcomposepokedex.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BlackWhite(
    @Json(name = "animated")
    val animated: Animated,
    @Json(name = "back_default")
    val backDefault: String,
    @Json(name = "back_female")
    val backFemale: Any,
    @Json(name = "back_shiny")
    val backShiny: String,
    @Json(name = "back_shiny_female")
    val backShinyFemale: Any,
    @Json(name = "front_default")
    val frontDefault: String,
    @Json(name = "front_female")
    val frontFemale: Any,
    @Json(name = "front_shiny")
    val frontShiny: String,
    @Json(name = "front_shiny_female")
    val frontShinyFemale: Any
)