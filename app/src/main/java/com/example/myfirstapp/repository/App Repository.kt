package com.example.myfirstapp.repository

import com.example.myfirstapp.data.Food
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.postgrest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AppRepository(private val supabase: SupabaseClient) {

    suspend fun getAllFoods(): List<Food> = withContext(Dispatchers.IO) {
        try {
            // "FoodList" is the name of your table in the Supabase dashboard
            supabase.postgrest["FoodList"]
                .select()
                .decodeList<Food>()
        } catch (e: Exception) {
            emptyList()
        }
    }
    suspend fun addFood(food: Food) = withContext(Dispatchers.IO) {
        try {
            supabase.postgrest["FoodList"].insert(food)
        } catch (e: Exception) {
            // Handle error (e.g., log it)
        }
    }
}
