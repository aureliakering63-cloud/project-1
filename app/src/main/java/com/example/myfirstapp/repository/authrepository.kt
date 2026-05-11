package com.example.myfirstapp.repository

import com.example.myfirstapp.data.UserModel
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email

class AuthRepository(
    private val supabase: SupabaseClient
) : AuthService {

    override suspend fun signupUser(userDetails: UserModel) {
        supabase.auth.signUpWith(Email) {
            email = userDetails.email
            password = userDetails.password
        }
    }

    override suspend fun loginUser(userDetails: UserModel) {
        supabase.auth.signInWith(Email) {
            email = userDetails.email
            password = userDetails.password
        }
    }

    override suspend fun resetPassword(email: String) {
        supabase.auth.resetPasswordForEmail(email = email)
    }

    override suspend fun getUserProfile(user: UserModel) {
        // Implementation for profile logic
    }

    override suspend fun logoutUser() {
        supabase.auth.signOut()
    }
}
