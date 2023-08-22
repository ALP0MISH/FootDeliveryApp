package com.example.footdeliveryapp.domain.models

import java.util.UUID

data class Category(
    val id: String,
    val list: List<Recipe>,
    val categories: List<String>,
) {
    companion object {
        val preview = Category(
            id = UUID.randomUUID().toString(),
            list = Recipe.previews,
            categories = listOf("All", "Healthy food", "Junk food", "Dessert")
        )
        val previews = listOf(
            preview.copy(
                categories = listOf("All", "Healthy food", "Junk food", "Dessert")
            )
        )
    }
}
