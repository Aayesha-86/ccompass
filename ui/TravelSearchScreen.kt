package com.example.travel.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

@Composable
fun TravelSearchScreen(navController: NavController) {
    var budget by remember { mutableStateOf("") }
    var destination by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = destination,
            onValueChange = { destination = it },
            label = { Text("Enter Destination") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = budget,
            onValueChange = { budget = it },
            label = { Text("Enter Budget (₹)") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                if (destination.isNotEmpty() && budget.isNotEmpty()) {
                    navController.navigate("results/$destination/$budget")
                }
            },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Find Best Deals")
        }
    }
}
