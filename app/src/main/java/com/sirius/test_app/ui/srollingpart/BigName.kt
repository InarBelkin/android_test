package com.sirius.test_app.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sirius.test_app.DataModel
import com.sirius.test_app.R
import com.sirius.test_app.data.DataModelProvider
import com.sirius.test_app.ui.theme.ExtendedTheme
import kotlin.math.roundToInt

@Preview
@Composable
fun BigName(@PreviewParameter(DataModelProvider::class) dataModel: DataModel) {
    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Bottom) {
        Card(
            modifier = Modifier.size(85.dp),
            border = BorderStroke(2.dp, ExtendedTheme.colors.frame),
            shape = RoundedCornerShape(12.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                AsyncImage(
                    modifier = Modifier.size(54.dp),
                    model = dataModel.logo,
                    contentDescription = null
                )
            }
        }
        Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.Bottom) {
            Text(
                modifier = Modifier.padding(horizontal = 4.dp),
                text = dataModel.name,
                style = MaterialTheme.typography.h1
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Stars(dataModel.rating.roundToInt())
                Text(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    style = MaterialTheme.typography.body2,
                    text = dataModel.gradeCnt
                )
            }

        }


    }
}

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