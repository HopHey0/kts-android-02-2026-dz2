package com.example.kts_metaclass_hw2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import kts_metaclass_hw2.composeapp.generated.resources.Res
import kts_metaclass_hw2.composeapp.generated.resources.load_error
import kts_metaclass_hw2.composeapp.generated.resources.load_placeholder
import kts_metaclass_hw2.composeapp.generated.resources.welcomeButtonMsg
import kts_metaclass_hw2.composeapp.generated.resources.welcomeImageUrl
import kts_metaclass_hw2.composeapp.generated.resources.welcomeMsg
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun WelcomeScreen(
    onButtonClick: () -> Unit
) {
    Column (
        modifier = Modifier.safeContentPadding()
            .fillMaxSize()
            .padding(all = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .weight(4f)
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            AsyncImage(
                modifier = Modifier.fillMaxSize(),
                contentDescription = "Welcome image",
                model = stringResource(Res.string.welcomeImageUrl),
                placeholder = painterResource(Res.drawable.load_placeholder),
                error = painterResource(Res.drawable.load_error)
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                .weight(3f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(Res.string.welcomeMsg),
                fontSize = 42.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                lineHeight = 42.sp
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                .weight(3f),
            contentAlignment = Alignment.BottomCenter
        ) {
            FilledTonalButton(
                modifier = Modifier.fillMaxWidth()
                    .height(62.dp),
                colors = ButtonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFF018786),
                    disabledContainerColor = Color(0xFF018786),
                    disabledContentColor = Color.White
                ),
                content = {
                    Text(
                        text = stringResource(Res.string.welcomeButtonMsg),
                        fontSize = 32.sp
                    )
                },
                onClick = onButtonClick
            )
        }
    }
}