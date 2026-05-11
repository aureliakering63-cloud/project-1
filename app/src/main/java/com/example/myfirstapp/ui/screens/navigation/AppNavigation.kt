package com.example.myfirstapp.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myfirstapp.data.CartViewModel
import com.example.myfirstapp.ui.screens.CheckOut.Checkoutscreen
import com.example.myfirstapp.ui.screens.Homescreen.HomeScreen
import com.example.myfirstapp.ui.screens.authentication.forgotPassword.ForgotPasswordScreen
import com.example.myfirstapp.ui.screens.authentication.login.LoginScreen
import com.example.myfirstapp.ui.screens.CartScreen.CartScreen
import com.example.myfirstapp.ui.screens.FoodList.FoodListScreen
import com.example.myfirstapp.ui.screens.maps.MapScreen
import com.example.myfirstapp.ui.screens.onboarding.OnboardingScreen
import com.example.myfirstapp.ui.screens.signup.SignupScreen

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier) {
    val cartViewModel: CartViewModel = viewModel()
    
    NavHost(
        navController = navController,
        startDestination = Routes.Onboarding.name
    ) {
        composable(Routes.Onboarding.name) { 
            OnboardingScreen(navController, modifier) 
        }
        composable(Routes.Login.name) { 
            LoginScreen(navController, modifier) 
        }
        composable(Routes.Signup.name) { 
            SignupScreen(modifier) 
        }
        composable(Routes.ForgotPassword.name) { 
            ForgotPasswordScreen(navController, modifier) 
        }
        composable(Routes.HomeScreen.name) { 
            HomeScreen(navController) 
        }
        composable(Routes.FoodList.name) { 
            FoodListScreen(
                onBack = { navController.popBackStack() },
                onAddToCart = { food -> cartViewModel.addToCart(food) },
                onCartClick = { navController.navigate(Routes.CartScreen.name) }
            ) 
        }
        composable(Routes.CartScreen.name) { 
            CartScreen(
                navController = navController, 
                modifier = modifier,
                cartViewModel = cartViewModel
            ) 
        }
        composable(Routes.CheckOut.name) { 
            Checkoutscreen(navController, cartViewModel)
        }
        composable(Routes.Maps.name) {
            MapScreen()
        }
    }
}
