package com.example.myfirstapp

import android.net.http.HttpResponseCache.install
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.myfirstapp.ui.screens.navigation.Navigation
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

val supabase = createSupabaseClient(
    supabaseUrl = "https://skjyqcqvwnumnwqzggbu.supabase.co",
    supabaseKey = "sb_publishable_GOSVc99XgkAYJxGOglAOMA_i72SBPcO"
) {
    install(Postgrest)
}



class MainActivity : ComponentActivity() {
    @Composable
    fun OnCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val navController = rememberNavController()
        setContent {
            MyFirstAppTheme()  {
                Scaffold(modifier = Modifier.fillMaxSize()){ innerpadding ->
                    Navigation(navController, modifier = Modifier.padding(innerpadding))

                }
            }
        }
    }}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppTheme { {

    }
}}