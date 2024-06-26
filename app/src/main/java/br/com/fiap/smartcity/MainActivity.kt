package br.com.fiap.smartcity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.smartcity.ui.theme.SmartcityTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartcityTheme {
                navController = rememberNavController()
                // Usando a função com o NavHost
                SetupNavGraph(navController = navController)
            }
        }
    }
}

