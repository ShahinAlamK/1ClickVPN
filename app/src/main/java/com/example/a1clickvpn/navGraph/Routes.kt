package com.example.a1clickvpn.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.a1clickvpn.screens.HomeScreen
import com.example.a1clickvpn.screens.SplashScreen

@Composable
fun Routes(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = RouteItem.SplashScreen.route) {

        composable(RouteItem.SplashScreen.route) {
            SplashScreen(navHost = navHostController)
        }

        composable(RouteItem.HomeScreen.route) {
            HomeScreen(navHost = navHostController)
        }

    }
}