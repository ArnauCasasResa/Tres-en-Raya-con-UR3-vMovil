package com.example.tresenrayaconur3vmovil.Screens

import android.R.attr.padding
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import java.net.ServerSocket

@Composable
fun GameScreen(navController: NavController){
    var server=ServerClass()
    var juego=TresEnRalla()
    Column(modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center) {
        AnimatedText(juego.turno, 200, 50, titleFont)
        for (fila in juego.tablero) {
            Row {
                for (casilla in fila) {
                    Box(modifier = Modifier.size(80.dp).border(2.dp, Color.Black).background(Color.White)
                        .clickable{
                            //val envio=juego.enviarRobotPosiFicha(juego.turno,Pair(fila.indexOf(casilla),juego.tablero.indexOf(fila)))
                            if(juego.comprovacionFichaPossible(fila.indexOf(casilla),juego.tablero.indexOf(fila))){
                                juego.ponerFicha(fila.indexOf(casilla),juego.tablero.indexOf(fila))
                                juego.cambiarTurno()
                            }
                        }){
                        if (casilla != "n") {
                            Text(text = casilla, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}

