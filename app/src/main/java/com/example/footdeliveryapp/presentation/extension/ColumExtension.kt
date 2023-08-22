package com.example.footdeliveryapp.presentation.extension

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp


@Composable
fun ColumnScope.SpacerHeight(dp: Dp) {
    Spacer(modifier = Modifier.height(dp))

}
