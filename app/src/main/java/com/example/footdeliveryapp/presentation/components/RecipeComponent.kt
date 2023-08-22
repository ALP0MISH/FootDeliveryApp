package com.example.footdeliveryapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.domain.models.Recipe
import com.example.footdeliveryapp.presentation.extension.SpacerHeight
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun MainContentBottomPreview() {
    FootDeliveryAppTheme {
        RecipeItemList(
            recipe = Recipe.previews
        )
    }
}


@Composable
fun RecipeItemList(
    modifier: Modifier = Modifier, recipe: List<Recipe>,
) {
    LazyRow {
        items(items = recipe, key = { data -> data.id }) { recipe ->
            RecipeItem(recipe = recipe)
        }
    }
}


@Composable
fun RecipeItem(
    modifier: Modifier = Modifier,
    recipe: Recipe,
) {
    val isFavorite = remember { mutableStateOf(false) }
    Box(
        modifier = modifier
            .height(300.dp)
            .width(198.dp)
            .padding(top = 35.dp)
            .padding(start = 17.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(color = Color.White)

    ) {
        Column(
            modifier = modifier
                .padding(horizontal = 23.dp),

            ) {
            IconButton(
                modifier = modifier
                    .padding(start = 95.dp),
                onClick = {}
            ) {
                Icon(
                    modifier = modifier
                        .size(18.dp),
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = null,
                    tint = if (isFavorite.value) Color.Red else Color.White
                )
            }
            AsyncImage(
                modifier = modifier
                    .size(138.dp)
                    .clip(RoundedCornerShape(50.dp)),
                model = recipe.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            SpacerHeight(dp = 10.dp)
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = modifier,
                    text = recipe.title,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    modifier = modifier,
                    text = recipe.description,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 10.sp,
                        color = Color.Gray
                    )
                )
                SpacerHeight(dp = 12.dp)
                Text(
                    modifier = modifier,
                    text = recipe.price,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}