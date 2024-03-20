package com.example.a1clickvpn.navGraph

sealed class RouteItem(val route : String) {
    data object SplashScreen:RouteItem("splash_screen")
    data object HomeScreen:RouteItem("home_screen")
    data object ServerScreen:RouteItem("server_screen")
}