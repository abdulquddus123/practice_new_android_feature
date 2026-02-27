package com.example.myapplication.navigation_module

sealed class Screen(val route:String){
data object Home:Screen("home")

    data object Detail : Screen("detail/{name}") {
        fun createRoute(name: String) = "detail/$name"
    }

    data object Profile : Screen("profile")
}