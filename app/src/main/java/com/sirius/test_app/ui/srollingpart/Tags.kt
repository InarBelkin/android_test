package com.sirius.test_app.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sirius.test_app.ui.theme.ExtendedTheme

@Composable
fun Tags(tags: List<String>) {
    Row(modifier = Modifier.padding(vertical = 16.dp)) {
        for (tag in tags) {
            TagItem(tag)
        }
    }
}

@Composable
fun TagItem(tag: String) {
    Card(
        modifier = Modifier.padding(5.dp),
        shape = RoundedCornerShape(100.dp),
        backgroundColor = ExtendedTheme.colors.tagBackground
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                modifier = Modifier.padding(10.dp, 5.dp),
                text = tag,
                color = ExtendedTheme.colors.tagForeground
            )
        }
    }
}