package com.sirius.test_app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.sirius.test_app.ReviewModel

@Composable
fun Reviews(reviews: List<ReviewModel>) {
    for (review in reviews) {
        ReviewItem(review = review)
    }
}

@Composable
fun ReviewItem(review: ReviewModel) {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                model = review.userImage,
                contentDescription = null,
            )
            Column {
                Text(review.userName, style = MaterialTheme.typography.h3)
                Text(review.date)
            }
        }
        Text(text = review.message, lineHeight = 20.sp)
    }


}