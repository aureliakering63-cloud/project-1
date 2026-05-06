package com.example.myfirstapp.ui.screens.CheckOut

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Checkoutscreen(){
    Column(modifier = Modifier.padding(16.dp)) {
        Text("CheckOut", fontSize = 24.sp)
        Text("Order placed successfully!")
        Text("payment")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text("Back to Home")
        }
    }
}