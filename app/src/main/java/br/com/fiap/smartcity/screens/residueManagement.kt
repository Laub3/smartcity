package br.com.fiap.smartcity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.smartcity.R
import br.com.fiap.smartcity.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResidueManagementScaffold(navController: NavController) {
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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box (
                Modifier.padding(start = 20.dp, end = 15.dp, top = 80.dp)
            ){
                Text(
                    fontSize = 35.sp,
                    text = "Está com problemas na coleta do seu lixo?",
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier
                    .width(350.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(id = R.drawable.trashpicture),
                    contentDescription = "Foto de reciclagem",
                    modifier = Modifier.width(230.dp).padding(bottom = 20.dp),
                    contentScale = ContentScale.FillBounds
                )
                ElevatedButton(
                    modifier = Modifier
                        .width(200.dp)
                        .height(80.dp),
                    onClick = {}
                ) {
                    Text("Reportar problemas com meu lixo", textAlign = TextAlign.Center, fontSize = 15.sp)
                }
            }
        }
    }
}
@Composable
fun ResidueManagement(navController: NavController) {
    ResidueManagementScaffold(navController)
}


@Preview(showSystemUi = true)
@Composable
fun ResidueManagementPreview() {
    Surface(modifier = Modifier
        .fillMaxSize()
    ) {
        ResidueManagement(navController = rememberNavController())
    }
}

