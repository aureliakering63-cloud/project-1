package com.example.myfirstapp.data

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {
    private val _cartItems = mutableStateListOf<Food>()
    val cartItems: List<Food> get() = _cartItems

    fun addToCart(food: Food) {
        _cartItems.add(food)
    }

    fun removeFromCart(food: Food) {
        _cartItems.remove(food)
    }

    fun clearCart() {
        _cartItems.clear()
    }

    val totalAmount: Double
        get() = _cartItems.sumOf { it.price.toDouble() }
}
