package com.plcoding.jetpackcomposepokedex.responses


import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Species(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)