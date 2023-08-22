package com.example.footdeliveryapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
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
fun DetailsScreenBottomPreview() {
    FootDeliveryAppTheme {
        DetailsScreenBottom()
    }
}

@Composable
fun DetailsScreenBottom(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(top = 40.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)


    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 48.dp)
                .padding(horizontal = 35.dp)
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.description),
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = null,
                )
                SpacerWidth(dp = 8.dp)
                Text(
                    text = stringResource(id = R.string.rating),
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.gold)
                    )
                )
            }
            SpacerHeight(dp = 17.dp)
            Text(
                text = stringResource(id = R.string.description_text),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 14.sp,
                )
            )
            SpacerHeight(dp = 20.dp)
            Row {
                SpacerWidth(dp = 40.dp)
                Button(
                    modifier = modifier,
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(
                        text = stringResource(id = R.string.order_now),
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    )
                }
                SpacerWidth(dp = 16.dp)
                OutlinedButton(
                    modifier = modifier,
                    onClick = {},
                    ) {
                    Text(
                        text = stringResource(id = R.string.add_chart),
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                    )
                }
            }
        }
    }
}