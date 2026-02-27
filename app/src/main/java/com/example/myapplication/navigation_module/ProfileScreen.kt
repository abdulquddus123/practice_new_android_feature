package com.example.myapplication.navigation_module

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(onBack: () ->Unit){

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Profile")},
                navigationIcon = {
                    IconButton(onClick = onBack) {

                    }
                }
            )
        }
    ) {
            padding ->

        Text(
            "Profile Screen",
            modifier = Modifier.padding(padding).padding(16.dp)
        )
    }
}