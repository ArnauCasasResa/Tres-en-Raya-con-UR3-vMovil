package com.example.tresenrayaconur3vmovil.Screens

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tresenrayaconur3vmovil.ServerClass
import com.example.tresenrayaconur3vmovil.TresEnRalla

@Composable
fun GameScreen(navController: NavController) {
    var server = ServerClass()
    var juego by remember { mutableStateOf(TresEnRalla()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AnimatedText(juego.turno.value, 125, 50, titleFont)
        for ((filaIndex, fila) in juego.tablero.withIndex()) {
            Row {
                for ((columnaIndex, casilla) in fila.withIndex()) {
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .border(2.dp, Color.Black)
                            .background(Color.White)
                            .clickable{
                                if (juego.comprovacionFichaPossible(columnaIndex, filaIndex)) {
                                    juego.ponerFicha(columnaIndex, filaIndex)
                                    juego.cambiarTurno()
                                }
                            }, contentAlignment = Alignment.Center
                    ) {
                        if (casilla != "n") {
                            Text(text = casilla, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

    }
}

