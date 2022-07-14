package com.sirius.test_app.ui

import androidx.compose.foundation.layout.*
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
        Row(
            modifier = Modifier
                .padding(8.dp)
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                model = review.userImage,
                contentDescription = null,
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(review.userName, style = MaterialTheme.typography.h3)
                Text(review.date, style = MaterialTheme.typography.body2)
            }
        }
        Text(
            modifier = Modifier.padding(top = 8.dp, bottom = 4.dp),
            text = review.message,
            lineHeight = 20.sp
        )
    }


}