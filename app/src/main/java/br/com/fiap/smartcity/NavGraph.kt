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

// Função para melhor visualização das navegações
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        // Deixar sempre o login como tela inicial ao abrir o app
        startDestination = Screen.Login.route
        ){
        composable(
            route = Screen.Login.route
        ){
            // Tela de loin
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Home.route
        ){
            // Tela home
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.ResidueManagement.route
        ){
            // Tela de gestão de residuos
            ResidueManagement(navController = navController)
        }
        composable(
            route = Screen.Reports.route
        ){
            // Tela de report
            Reports(navController = navController)
        }
        composable(
            route = Screen.Education.route
        ){
            // Tela de educação
            Education(navController = navController)
        }
        composable(
            route = Screen.Help.route
        ){
            // Tela de Ajuda
            Help(navController = navController)
        }
    }
}