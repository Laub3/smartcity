package br.com.fiap.smartcity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fiap.smartcity.screens.Education
import br.com.fiap.smartcity.screens.Help
import br.com.fiap.smartcity.screens.HomeScreen
import br.com.fiap.smartcity.screens.LoginScreen
import br.com.fiap.smartcity.screens.Reports
import br.com.fiap.smartcity.screens.ResidueManagement

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
        ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.ResidueManagement.route
        ){
            ResidueManagement(navController = navController)
        }
        composable(
            route = Screen.Reports.route
        ){
            Reports(navController = navController)
        }
        composable(
            route = Screen.Education.route
        ){
            Education(navController = navController)
        }
        composable(
            route = Screen.Help.route
        ){
            Help(navController = navController)
        }
    }
}