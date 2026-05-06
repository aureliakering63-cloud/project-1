package com.example.myfirstapp.ui.screens.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myfirstapp.ui.screens.onboarding.OnboardingScreen
import com.example.myfirstapp.ui.screens.onboarding.OnboardingScreen

@Composable
fun Navigation(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = routes.Onboarding
    ) {
        composable(routes.Onboarding.name) { OnboardingScreen(modifier) }
    }
}