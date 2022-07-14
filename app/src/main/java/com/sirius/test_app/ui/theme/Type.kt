package com.sirius.test_app.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sirius.test_app.R

val SkModernist = FontFamily(
    Font(R.font.sk_modernist_regular),
    Font(R.font.sk_modernist_bold, FontWeight.Bold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        lineHeight = 26.sp,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp
    ),
    body2 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = darkGrey
    ),
    h1 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight(700),
        fontSize = 20.sp,
        color = White
    ),
    h2 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight(700),
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.6.sp,
        color = White
    ),
    h3 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight(400),
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        color = White
    ),
    button = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight(700),
        fontSize = 20.sp,
        letterSpacing = 0.6.sp
    )
)

