package com.sirius.test_app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.sirius.test_app.data.DataModelProvider
import com.sirius.test_app.ui.*

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
            Text("Review & Ratings", style = MaterialTheme.typography.h2)
            Rating(data = dataModel)
            Reviews(reviews = dataModel.reviews)
        }
    }

}


