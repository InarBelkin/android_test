package com.sirius.test_app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sirius.test_app.DataModel
import kotlin.math.roundToInt

@Composable
fun Rating(data: DataModel) {
    Box(modifier = Modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = data.rating.toString(),
                fontSize = 48.sp,
                style = MaterialTheme.typography.h1
            )
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(horizontal = 16.dp).fillMaxHeight()
            ) {
                Stars(count = data.rating.roundToInt())
                Text(text = data.gradeCnt.plus(" Reviews"))
            }
        }
    }
}