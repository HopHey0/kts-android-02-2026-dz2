package com.example.kts_metaclass_hw2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kts_metaclass_hw2.composeapp.generated.resources.Res
import kts_metaclass_hw2.composeapp.generated.resources.emailInputHint
import kts_metaclass_hw2.composeapp.generated.resources.loginButtonString
import kts_metaclass_hw2.composeapp.generated.resources.loginWelcomeMsg1
import kts_metaclass_hw2.composeapp.generated.resources.loginWelcomeMsg2
import kts_metaclass_hw2.composeapp.generated.resources.passwordInputHint
import kts_metaclass_hw2.composeapp.generated.resources.passwordRecoveryString
import kts_metaclass_hw2.composeapp.generated.resources.signUpOffer1
import kts_metaclass_hw2.composeapp.generated.resources.signUpOffer2
import kts_metaclass_hw2.composeapp.generated.resources.visibility
import kts_metaclass_hw2.composeapp.generated.resources.visibilityoff
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview(showSystemUi = true)
fun LoginScreen(){
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var isPasswordVisible by rememberSaveable { mutableStateOf(false) }
    BoxWithConstraints {
        val isLandscape = maxWidth > maxHeight
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(vertical = if (isLandscape) 0.dp else 15.dp, horizontal = if (isLandscape) 50.dp else 15.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier.weight(3f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = stringResource(Res.string.loginWelcomeMsg1),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text(
                    text = stringResource(Res.string.loginWelcomeMsg2),
                    fontWeight = FontWeight.Light,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    value = email,
                    onValueChange = { email = it },
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.emailInputHint),
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    },
                )
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = stringResource(Res.string.passwordInputHint),
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    },
                    trailingIcon = {
                        IconButton(
                            onClick = { isPasswordVisible = !isPasswordVisible }
                        ) {
                            Icon(
                                painter = if (isPasswordVisible) painterResource(Res.drawable.visibility) else painterResource(
                                    Res.drawable.visibilityoff
                                ),
                                contentDescription = "Show/hide password button"
                            )
                        }
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(
                        onClick = { },
                    ) {
                        Text(
                            text = stringResource(Res.string.passwordRecoveryString),
                            color = Color.Black
                        )
                    }
                }
                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonColors(
                        contentColor = Color.White,
                        containerColor = Color(0xFF018786),
                        disabledContainerColor = Color(0xFF018786),
                        disabledContentColor = Color.White
                    )
                ) {
                    Text(
                        text = stringResource(Res.string.loginButtonString),
                        fontSize = 18.sp
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(
                        onClick = { },
                    ) {
                        Text(text = stringResource(Res.string.signUpOffer1), color = Color.Black)
                        Text(
                            text = stringResource(Res.string.signUpOffer2),
                            color = Color(0xFF018786)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}