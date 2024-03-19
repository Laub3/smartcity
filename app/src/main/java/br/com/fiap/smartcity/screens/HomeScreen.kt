package br.com.fiap.smartcity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.smartcity.Screen

// Função para agrupar botões no home

// No futuro vamos remover o Scaffold em todas as telas de deixar ele unico sendo somente a mudança de tela dentro de um Scaffold
@Composable
// Função para alinhar os botões e deixando o generico, se precisar de mais rotas é só adicionar um novo BlackBorderedButton() passando a rota como destino
fun SquareButtonRow(navController: NavController) {
    Column {
        Row {
            BlackBorderedButton(text = "Resíduos", onClick = {navController.navigate(route = Screen.ResidueManagement.route)}, icons = Icons.Filled.Face)
            BlackBorderedButton(text = "Reportar", onClick = {}, icons = Icons.Filled.Face)
        }
        Row {
            BlackBorderedButton(text = "Educação", onClick = {}, icons = Icons.Filled.Face)
            BlackBorderedButton(text = "Ajuda", onClick = {}, icons = Icons.Filled.Face)
        }
    }
}

@Composable
fun BlackBorderedButton(text: String, icons: ImageVector,onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(140.dp)
            .height(140.dp)
            .padding(5.dp),

        shape = RoundedCornerShape(4.dp),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text)
            // No futuro, vamos colocar icones
//            Icons(Icons)
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffold(navController: NavController) {
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
//                    Icon(Icons.Default.Menu, contentDescription = "Add")
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
                                        contentDescription = "Botão para navegar até Residuos"
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
                                        contentDescription = "Botão para navegar até Reportar"
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
                                        contentDescription = "Botão para navegar até Educação"
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
                                        contentDescription = "Botão para navegar até ajuda"
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
            Box(
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(start = 60.dp, top = 60.dp)
            ){
                SquareButtonRow(navController)
            }
        }
    }
}
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(navController)
}


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    Surface(modifier = Modifier
        .fillMaxSize()
        ) {
        HomeScreen(navController = rememberNavController())
    }
}

