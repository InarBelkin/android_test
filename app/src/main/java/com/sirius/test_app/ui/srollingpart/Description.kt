package com.sirius.test_app.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description(description: String) {
    Box(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = description, lineHeight = 19.sp)
    }
}