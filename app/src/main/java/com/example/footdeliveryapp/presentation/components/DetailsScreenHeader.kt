package com.example.footdeliveryapp.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.domain.models.User
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun DetailsScreenHeaderPreview(){
    FootDeliveryAppTheme {
        DetailsScreenHeader(
        )
    }
}


@Composable
fun DetailsScreenHeader(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 62.dp)
            .padding(horizontal = 16.dp)


    ) {
        Row {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_back),
                    contentDescription = null,
                )
            }
            Spacer(modifier = modifier.weight(1f))
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable._bag),
                    contentDescription = null,
                )

            }

        }

    }
}