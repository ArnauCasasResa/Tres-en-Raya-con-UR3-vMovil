package com.example.tresenrayaconur3vmovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tresenrayaconur3vmovil.Screens.*
import com.example.tresenrayaconur3vmovil.ui.theme.TresEnRayaConUR3VMovilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TresEnRayaConUR3VMovilTheme {
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.HomeScreen.route
                ) {
                    composable(Routes.HomeScreen.route) { HomeScreen(navigationController) }
                    composable(Routes.SettingsScreen.route) { SettingsScreen(navigationController) }
                    composable(Routes.ConnectScreen.route) { ConnectScreen(navigationController) }
                    composable(Routes.GameScreen.route) { GameScreen(navigationController) }
                }
            }
        }
    }
}
