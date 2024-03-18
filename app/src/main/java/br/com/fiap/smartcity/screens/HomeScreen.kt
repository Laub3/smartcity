package br.com.fiap.smartcity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.smartcity.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffold(navController: NavController, userName: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.background(Color.Blue),
                actions = {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = "Add",
                        Modifier
                            .padding(end = 15.dp)
                    )
                },
                title = {
                    Icon(Icons.Default.Menu, contentDescription = "Add")

                },
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Row (){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                IconButton(onClick = {navController.navigate(route = Screen.ResidueManagement.route)}) {
                                    Icon(
                                        Icons.Filled.Delete,
                                        contentDescription = "Localized description"
                                    )
                                }
                                Text(
                                    text = "Resíduos"
                                )
                            }
                        }
                        Row {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                IconButton(onClick = {navController.navigate(route = Screen.Reports.route)}) {
                                    Icon(
                                        Icons.Filled.Call,
                                        contentDescription = "Localized description"
                                    )
                                }
                                Text(
                                    text = "Reportar"
                                )
                            }
                        }
                        Row {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                IconButton(onClick = {navController.navigate(route = Screen.Education.route)}) {
                                    Icon(
                                        Icons.Filled.Face,
                                        contentDescription = "Localized description"
                                    )
                                }
                                Text(
                                    text = "Educação"
                                )
                            }
                        }
                        Row {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                IconButton(onClick = {navController.navigate(route = Screen.Help.route)}) {
                                    Icon(
                                        Icons.Filled.Info,
                                        contentDescription = "Localized description"
                                    )
                                }
                                Text(
                                    text = "Ajuda"
                                )
                            }
                        }
                    }
                },
            )

        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            OutlinedButton(
                onClick = ({navController.navigate(Screen.ResidueManagement.route)}))
            {
                Text("Outlined")
            }
        }
    }
}
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(navController, userName = "Lucas Laube")
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

