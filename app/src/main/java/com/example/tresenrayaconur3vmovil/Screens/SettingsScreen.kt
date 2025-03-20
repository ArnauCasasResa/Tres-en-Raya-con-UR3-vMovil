package com.example.tresenrayaconur3vmovil.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tresenrayaconur3vmovil.Routes

@Composable
fun SettingsScreen(navController: NavController){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(20.dp)) {
        Spacer(modifier = Modifier.height(60.dp))
         /*
        Box(modifier =Modifier.height(29.dp)){
            Row {
                Text(text = "Rounds",fontSize = 20.sp)
                RadioButton(selected = myViewModel.statusUno, onClick = { myViewModel.modificarRondas(5)
                    myViewModel.modificarOpcionUno() })
                Text(text = "5",fontSize = 20.sp)
                RadioButton(selected = myViewModel.statusDos, onClick = { myViewModel.modificarRondas(10)
                    myViewModel.modificarOpcionDos() })
                Text(text = "10",fontSize = 20.sp)
            }
        }*/
        Spacer(modifier = Modifier.height(200.dp))
        Box(modifier = Modifier
            .background(Color.Gray)
            .width(125.dp)
            .padding(1.dp)
            .align(Alignment.CenterHorizontally)
            .clickable { navController.navigate(Routes.HomeScreen.route) }) {
            Text(
                text = "Menu",
                modifier = Modifier.align(Alignment.Center),
                color = Color.White
            )
        }
    }
}