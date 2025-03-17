package com.example.tresenrayaconur3vmovil.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tresenrayaconur3vmovil.R
import com.example.tresenrayaconur3vmovil.Routes
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavController) {
    val titulo = "Tres en Raya"
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center){
        Image(painter =painterResource(R.drawable.logo), contentDescription = "Imagen")
        AnimatedText(titulo)

        Button(onClick = {}) { Text(text = "Jugar")}
        Button(onClick = {navController.navigate(Routes.SettingsScreen.route)}) {
            Text(text = "Ajustes")
            Icon(imageVector = Icons.Filled.Settings , contentDescription = "Ajustes")
        }
    }
}


@Composable
fun AnimatedText(titulo: String) {
    var displayedText by remember { mutableStateOf("") }

    LaunchedEffect(titulo) {
        titulo.forEachIndexed { index, _ ->
            displayedText = titulo.substring(0, index + 1)
            delay(200) // Ajusta el delay para cambiar la velocidad del efecto
        }
    }
    Row{
        Text(text = displayedText, fontFamily = titleFont, fontSize = 40.sp)
    }
}


var titleFont:FontFamily= FontFamily(Font(R.font.title))