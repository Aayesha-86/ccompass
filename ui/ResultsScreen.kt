package com.example.travel.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*

@Composable
fun ResultsScreen(destination: String, budget: String) {
    val items = listOf("Flight to $destination", "Hotel in $destination", "Top Attractions")

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Results for $destination under ₹$budget", style = MaterialTheme.typography.h5)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(items) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    elevation = 4.dp
                ) {
                    Row(modifier = Modifier.padding(16.dp)) {
                        Text(text = item, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
