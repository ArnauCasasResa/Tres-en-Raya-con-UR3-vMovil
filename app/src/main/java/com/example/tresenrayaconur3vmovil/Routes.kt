package com.example.tresenrayaconur3vmovil

sealed class Routes(val route: String)
{
    object HomeScreen:Routes("home_screen" )
    object SettingsScreen:Routes("settings_screen" )
    object GameScreen:Routes("game_screen" )

}
