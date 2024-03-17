package br.com.fiap.smartcity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.smartcity.R
import br.com.fiap.smartcity.Screen

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            modifier = Modifier
                .size(width = 500.dp, height = 250.dp)
                .align(Alignment.CenterHorizontally),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE1FFC7)),
            shape = RoundedCornerShape(bottomStart = 0.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.building_smartcity),
                contentDescription = "Foto da Cidade",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
        Column (modifier = Modifier.padding(start = 25.dp)) {
            Text(
                text = "Cidade nas Mãos",
                fontSize = 45.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "Icone E-mail")
                },
                label = {
                    Text(text = "E-mail")
                })
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),

                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock, contentDescription = "Icone Senha")
                },
                label = {
                    Text(text = "Senha")
                })
            Button(
                onClick = {
                    navController.navigate(route = Screen.Home.route)
                          },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE1FFC7)
                )) {
                Text(
                    text = "Acessar",
                    fontSize = 19.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(text = "Não possui conta?",
                fontSize = 20.sp,
                color = Color(0xFF000000),
                modifier = Modifier
                    .padding(end = 60.dp))
            Text(text = " Cadastre-se",
                fontSize = 20.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(end = 30.dp),

                )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF673AB7))) {
        LoginScreen(navController = rememberNavController())
    }
}