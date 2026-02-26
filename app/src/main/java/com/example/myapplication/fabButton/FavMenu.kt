package com.example.myapplication.fabButton

import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FabMenu(modifier: Modifier=Modifier){
    var expanded by remember{ mutableStateOf(false) }

}