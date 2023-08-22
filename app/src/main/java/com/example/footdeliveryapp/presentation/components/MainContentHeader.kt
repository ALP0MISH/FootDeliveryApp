package com.example.footdeliveryapp.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.domain.models.User
import com.example.footdeliveryapp.presentation.extension.SpacerWidth
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun MainContentHeaderPreview() {
    FootDeliveryAppTheme {
        MainContentHeader(
            user = User.preview
        )
    }
}

@Composable
fun MainContentHeader(
    modifier: Modifier = Modifier,
    user: User
) {
    Box(
        modifier = modifier
            .padding(top = 50.dp)
            .fillMaxWidth()
    ) {
        Spacer(modifier = modifier.padding(top = 50.dp))
        Row {
            SpacerWidth(dp = 16.dp)
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_icon),
                    contentDescription = null
                )
            }
            Spacer(modifier = modifier.weight(1f))
            AsyncImage(
                modifier = modifier
                    .padding(end = 21.dp)
                    .padding(top = 5.dp)
                    .size(58.dp)
                    .border(
                        width = 5.dp, brush = Brush.horizontalGradient(
                            colors = listOf(colorResource(id = R.color.red), Color.White)
                        ),
                        shape = (CircleShape)
                    )
                    .size(60.dp)
                    .clip(CircleShape),
                model = user.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}