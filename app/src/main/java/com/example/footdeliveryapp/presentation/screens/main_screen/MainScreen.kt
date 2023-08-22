package com.example.footdeliveryapp.presentation.screens.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.domain.models.Category
import com.example.footdeliveryapp.domain.models.Recipe
import com.example.footdeliveryapp.domain.models.User
import com.example.footdeliveryapp.presentation.components.MainContent
import com.example.footdeliveryapp.presentation.components.RecipeItemList
import com.example.footdeliveryapp.presentation.components.MainContentHeader
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun MainScreenPreview() {
    FootDeliveryAppTheme {
        MainScreen()

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.background_color))
        ) {
            item {
                MainContentHeader(user = User.preview)
            }
            item {
                MainContent(category = Category.preview)
            }
            item(key = "recipe_list") {
                RecipeItemList( recipe = Recipe.previews)
            }

        }
    }
}

