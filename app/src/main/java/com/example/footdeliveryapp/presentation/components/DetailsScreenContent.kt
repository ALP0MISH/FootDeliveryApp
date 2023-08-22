package com.example.footdeliveryapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.presentation.extension.SpacerHeight
import com.example.footdeliveryapp.presentation.extension.SpacerWidth
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun DetailsScreenContentReview() {
    FootDeliveryAppTheme {
        DetailsScreenContent()
    }
}


@Composable
fun DetailsScreenContent(
    modifier: Modifier = Modifier
) {
    var number by remember { mutableStateOf(0) }
    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        Image(
            modifier = modifier
                .padding(top = 70.dp)
                .padding(start = 185.dp)
                .size(230.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.italo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = modifier
                .padding(top = 75.dp)
                .padding(start = 35.dp)
        ) {

            Text(
                text = stringResource(id = R.string.easy_greak_salad),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            SpacerHeight(dp = 20.dp)
            Text(
                text = stringResource(id = R.string.price),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 14.sp, color = Color.Gray
                )
            )

            SpacerHeight(dp = 6.dp)
            Text(
                text = stringResource(id = R.string.dallar),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            SpacerHeight(dp = 23.dp)
            Text(
                text = stringResource(id = R.string.choice_uantity),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 16.sp, color = Color.Gray

                )
            )
            Row(
                modifier = modifier, horizontalArrangement = Arrangement.spacedBy(
                    space = 5.dp,
                ), verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = modifier
                        .size(24.dp)
                        .background(Color.White)
                ) {
                    IconButton(onClick = { if (number > 0) number-- }) {
                        Icon(
                            modifier = modifier.fillMaxWidth(),
                            painter = painterResource(id = R.drawable.icon_),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                }
                SpacerWidth(dp = 10.dp)
                Text("$number")
                SpacerWidth(dp = 10.dp)
                Box(
                    modifier = modifier
                        .size(24.dp)
                        .background(Color.White)
                ) {
                    IconButton(onClick = { number++ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.pluse_icon),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                }
            }
        }
    }
}
