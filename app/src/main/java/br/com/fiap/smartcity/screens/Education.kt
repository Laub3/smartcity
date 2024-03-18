package br.com.fiap.smartcity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
@Composable
fun Education(navController: NavController) {
    Box {
        Text(text = "A Fazer")
    }
}

@Preview(showSystemUi = true)
@Composable
fun EducationScreenPreview() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF673AB7))) {
        Education(navController = rememberNavController())
    }
}