package com.sirius.test_app.ui.srollingpart

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sirius.test_app.R

@Composable
fun Stars(count: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        for (i in 0 until count) {
            Icon(
                modifier = Modifier
                    .padding(2.dp)
                    .size(12.dp),
                painter = painterResource(id = R.drawable.ic_baseline_star_24),
                contentDescription = null,
                tint = MaterialTheme.colors.primary
            )
        }
    }
}