package com.example.footdeliveryapp.domain.models

import java.util.UUID

data class User(
    val id: String,
    val imageUrl: String,
){
    companion object {
        val preview = User(
            id = UUID.randomUUID().toString(),
            imageUrl = "https://i.pinimg.com/originals/e0/07/90/e007904e05c77e1764fa9db3d8ffa4a1.jpg"
        )
        val previews = listOf(
            preview.copy(
                imageUrl = "https://i.pinimg.com/originals/e0/07/90/e007904e05c77e1764fa9db3d8ffa4a1.jpg"
            )
        )
    }
}
