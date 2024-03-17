package br.com.fiap.smartcity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
    }
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF673AB7))) {
        HomeScreen(navController = rememberNavController())
    }
}

