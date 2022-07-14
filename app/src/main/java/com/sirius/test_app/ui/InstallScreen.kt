package com.sirius.test_app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sirius.test_app.DataModel
import com.sirius.test_app.ScrollingPart

@Composable
fun InstallScreen(dataModel: DataModel) {
    val imageHeight = 300.dp
    val contentIndent = 20.dp
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        AsyncImage(
            modifier = Modifier.height(300.dp),
            model = dataModel.image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(imageHeight - contentIndent)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(modifier = Modifier.height(20.dp)) {
                    }
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                    ) { }
                }
                ScrollingPart(dataModel = dataModel)
            }
        }
    }

}