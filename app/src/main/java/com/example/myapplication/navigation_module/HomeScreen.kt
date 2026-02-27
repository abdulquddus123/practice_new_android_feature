package com.example.myapplication.navigation_module

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(){
    Column(){
Button(onClick = {}){
    Text("Go To Details")
}

        Spacer(Modifier.height(12.dp))
        Button(onClick = {}) {
            Text("Go To Profile")
        }
    }
}