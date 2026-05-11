package com.example.myfirstapp.repository

import com.example.myfirstapp.data.UserModel

interface AuthService {
    suspend fun signupUser(userDetails: UserModel)
    suspend fun loginUser(userDetails: UserModel)
    suspend fun resetPassword(email: String)
    suspend fun getUserProfile(user: UserModel)
    suspend fun logoutUser()
}
