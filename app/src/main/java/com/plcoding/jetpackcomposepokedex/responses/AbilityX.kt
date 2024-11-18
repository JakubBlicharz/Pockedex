package com.plcoding.jetpackcomposepokedex.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityX(
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
)