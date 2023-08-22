package com.example.footdeliveryapp.presentation.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.footdeliveryapp.R
import com.example.footdeliveryapp.domain.models.Category
import com.example.footdeliveryapp.presentation.extension.SpacerHeight
import com.example.footdeliveryapp.ui.theme.FootDeliveryAppTheme

@Preview
@Composable
fun MainContentPreview() {
    FootDeliveryAppTheme {
        MainContent(
            category = Category.preview
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    category: Category
) {
    val isSelected = remember { mutableStateOf(false) }

    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Column {
            Text(
                modifier = modifier.padding(start = 17.dp),
                text = stringResource(id = R.string.enjoy_your_favourite),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 40.sp,

                    )
            )
            SpacerHeight(dp = 30.dp)
            val (value, onValueChange) = remember { mutableStateOf("") }
            OutlinedTextField(
                value = value,
                onValueChange = onValueChange,
                textStyle = TextStyle(fontSize = 20.sp),
                shape = CircleShape,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                },
                modifier = modifier
                    .padding(start = 30.dp)
                    .background(Color(0xFFE7F1F1), RoundedCornerShape(24.dp)),
                placeholder = { Text(text = "Start Search") },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.DarkGray,

                    )
            )
            LazyRow(
                modifier = modifier,
            ) {
                items(items = category.categories) {
                    Text(
                        modifier = modifier.padding(
                            start = 40.dp,
                            top = 57.dp
                        ), text = it
                    )
                }
            }
        }
    }
}
