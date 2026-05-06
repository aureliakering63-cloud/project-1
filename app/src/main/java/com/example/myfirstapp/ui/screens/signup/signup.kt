package com.example.myfirstapp.ui.screens.signup

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable()
fun SignupScreen(modifier: Modifier) {
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    var confirmPasswordInput by remember { mutableStateOf(TextFieldValue("")) }
    var creteaccountInput by remember { mutableStateOf(TextFieldValue("")) }


    OutlinedTextField(
        value = creteaccountInput,
        onValueChange = { creteaccountInput = it },
        label = { Text("createaccount") },

        )

    Spacer(modifier = Modifier.height(16.dp))
    Text("Sign up")
    Spacer(modifier = Modifier.height(16.dp))
    OutlinedTextField(
        value = emailInput,
        onValueChange = { emailInput = it },
        label = { Text("Email") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = "Email"
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        modifier = Modifier.fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(8.dp))


    OutlinedTextField(
        value = passwordInput,
        onValueChange = { passwordInput = it },
        label = { Text("Enter a password") },
        modifier = Modifier.fillMaxWidth()

    )
    OutlinedTextField(
        value = passwordInput,
        onValueChange = { passwordInput = it },
        label = { Text("Confirm new password") },
        modifier = Modifier.fillMaxWidth()

    )


}

