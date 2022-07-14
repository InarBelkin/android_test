package com.sirius.test_app

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sirius.test_app.data.DataModelProvider
import com.sirius.test_app.ui.*
import com.sirius.test_app.ui.theme.ExtendedTheme

@Preview
@Composable
fun ScrollingPart(@PreviewParameter(DataModelProvider::class) dataModel: DataModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        Column {
            BigName(dataModel = dataModel)
            Tags(tags = dataModel.tags)
            Description(description = dataModel.description)
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "Review & Ratings",
                style = MaterialTheme.typography.h2
            )
            Rating(data = dataModel)
            Divider(color = ExtendedTheme.colors.frame)
            Reviews(reviews = dataModel.reviews)
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp)
                .height(64.dp), onClick = { }) {
                Text(text = "Install")
            }
        }
    }

}


