package com.mulla.thinkbright

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),startDestination: String= ROUTE_LOGIN) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(ROUTE_LOGIN){
            Login(navController)
        }
        composable(ROUTE_REGISTRATION){
            Register(navController)
        }
        composable(ROUTE_HOMESCREEEN){
            Homescreen(navController)
        }
        composable(ROUTE_QUOTES){
            
        }



}}