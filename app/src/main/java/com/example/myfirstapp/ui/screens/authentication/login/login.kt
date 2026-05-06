package com.example.myfirstapp.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.myfirstapp.R
import com.example.myfirstapp.ui.theme.primaryColor


@Composable
fun LoginScreen( modifier: Modifier) {

    // text input
    var emailInput by remember { mutableStateOf(TextFieldValue(" ")) }

    // passwordinput

    var passwordInput by remember { mutableStateOf(TextFieldValue(" ")) }
    //isVisible
    var isVisible by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        //        lottie animation
        LottieAnimationWidget(lottiePath = R.raw.user_interface, size = 100.dp)

        //Welcome Message
        Text(
            text = "Login to get started",
            style = TextStyle
                (
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = primaryColor
            )
        )


        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email"
                )
            },
            placeholder = {
                Text(text = "eg. jd@example.com")
            },
            maxLines = 1,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()


        )
        //        password input
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.password_24dp_ffffff_fill0_wght400_grad0_opsz24),
                    contentDescription = "Email"
                )
            },
            trailingIcon
            = {
                IconButton(
                    onClick = { isVisible = !isVisible}
                ) {
                    if(isVisible){
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.visibility_off_24dp_ffffff_fill0_wght400_grad0_opsz24),
                            contentDescription = "password"
                        ) }
                    else{
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.visibility_off_24dp_ffffff_fill0_wght400_grad0_opsz24),
                            contentDescription = "password"
                        )
                    }
                    0} },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )
        //        button

        OutlinedButton(
            onClick = {}
        ) {
            Text(
                text = "login",
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }

        Row() {
            Text(text = "Forgot Password")
            Text(text = "Sign Up")
        }
    }}


@Composable
fun LottieAnimationWidget(lottiePath: Int, size: Dp) {
    val composition by
    rememberLottieComposition(LottieCompositionSpec.RawRes(lottiePath))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.size(size)
    )}