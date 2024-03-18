package br.com.fiap.smartcity

sealed class Screen(val route: String) {
    data object Login : Screen(route = "login_screen")
    data object Home : Screen(route = "home_screen")
    data object ResidueManagement : Screen(route = "residue_management_screen")
    data object Reports : Screen(route = "reports_screen")
    data object Education : Screen(route = "education_screen")
    data object Help : Screen(route = "help_screen")
}
