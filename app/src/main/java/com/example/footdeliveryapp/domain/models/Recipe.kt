package com.example.footdeliveryapp.domain.models

import java.util.UUID

data class Recipe(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val heardIcon: Boolean,
    val price: String
){
    companion object {
        val preview = Recipe(
            id = UUID.randomUUID().toString(),
            title = "Eybisi Salad Mix",
            description = "Mix vegetables inggridients",
            imageUrl = "https://traveltimes.ru/wp-content/uploads/2022/03/italo.jpeg",
            heardIcon = true,
            price = "$14.99"
        )
        val previews = listOf(
            preview.copy(
                id = UUID.randomUUID().toString(),
                title = "Eybisi Salad Mix",
                description = "Mix vegetables inggridients",
                imageUrl = "https://traveltimes.ru/wp-content/uploads/2022/03/italo.jpeg",
                heardIcon = true,
                price = "$14.99"
            ),
             preview.copy(
                id = UUID.randomUUID().toString(),
                title = "juicy steak",
                description = "Rib Eye Beef Steak",
                imageUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-09/1663798317_6-mykaleidoscope-ru-p-steik-iz-govyadini-ribai-yeda-krasivo-6.jpg",
                heardIcon = true,
                price = "$14.99"
            )
        )
    }
}
