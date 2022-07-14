package com.sirius.test_app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sirius.test_app.ui.theme.ExtendedTheme

@Composable
fun TopNavigationButton(iconId: Int) {
    Box(
        modifier = Modifier
            .size(56.dp)
            .clip(CircleShape)
            .background(ExtendedTheme.colors.topNavigationBackground),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(28.dp),
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = ExtendedTheme.colors.topNavigationForeground
        )
    }

}