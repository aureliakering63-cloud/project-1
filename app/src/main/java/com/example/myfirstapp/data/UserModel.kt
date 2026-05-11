package com.example.myfirstapp.data

import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val email: String = "",
    val id: String? = null,
    val password: String = ""
)
