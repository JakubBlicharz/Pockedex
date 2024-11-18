package com.plcoding.jetpackcomposepokedex.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Cries(
    @Json(name = "latest")
    val latest: String,
    @Json(name = "legacy")
    val legacy: String
)