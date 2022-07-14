package com.sirius.test_app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = gold,
    onPrimary = Color.Black,
    background = blackBlue,
    onBackground = Grey,
    surface = blackBlue,
    onSurface = Grey,
    primaryVariant = gold,
    secondary = darkBlue,
    onSecondary = lightBlue,
)

private val LightColorPalette = lightColors(
    primary = gold,
    primaryVariant = gold,
    secondary = darkBlue,
    onSecondary = lightBlue,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

data class ExtendedColors(
    val frame: Color,
    val tagBackground: Color,
    val tagForeground: Color
)

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        frame = Color.Unspecified,
        tagBackground = Color.Unspecified,
        tagForeground = Color.Unspecified,
    )
}

object ExtendedTheme {
    val colors: ExtendedColors
        @Composable
        get() = LocalExtendedColors.current
}


@Composable
fun AndroidTestTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val extendedColors = ExtendedColors(
        frame = darkGrey,
        tagBackground = darkBlue,
        tagForeground = lightBlue,

        )

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    CompositionLocalProvider(LocalExtendedColors provides extendedColors) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            content = content
        )
    }
}

