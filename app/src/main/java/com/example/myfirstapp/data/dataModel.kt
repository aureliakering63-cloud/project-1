package com.example.myfirstapp.data

import kotlinx.serialization.Serializable

@Serializable
data class DataModel(
    val id: String? = null,
    val name: String = "",
    val description: String = ""
)
