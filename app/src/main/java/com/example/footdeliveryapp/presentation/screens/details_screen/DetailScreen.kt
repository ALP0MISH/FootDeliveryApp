package com.example.footdeliveryapp.presentation.screens.details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.presentation.components.DetailsScreenBottom
import com.example.footdeliveryapp.presentation.components.DetailsScreenContent
import com.example.footdeliveryapp.presentation.components.DetailsScreenHeader

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier

) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.background_color))
        ) {
            item(key = "details_screen_header") {
                DetailsScreenHeader()
            }
            item(key = "details_screen_content") {
                DetailsScreenContent()
            }
            item(key = "details_screen_bottom") {
                DetailsScreenBottom()
            }
        }
    }
}