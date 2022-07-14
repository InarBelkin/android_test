package com.sirius.test_app.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun Description(description: String) {
    Text(text = description, lineHeight = 19.sp)
}