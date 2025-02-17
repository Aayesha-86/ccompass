package com.example.travel.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome to Code Compass", style = MaterialTheme.typography.h4)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("search") },
            modifier = Modifier.size(180.dp, 50.dp)
        ) {
            Text("Start Planning", fontWeight = FontWeight.Bold)
        }
    }
}
