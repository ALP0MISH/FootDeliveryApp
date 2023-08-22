package com.example.footdeliveryapp.presentation.screens.main_screen

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun Main(
    navigator: DestinationsNavigator
) {
    MainScreen()
}