package com.example.myfirstapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Food(
    val id: Long? = null,
    val name: String = "",
    val description: String = "",
    val image: String = "",
    val price: Double = 0.0,
)
