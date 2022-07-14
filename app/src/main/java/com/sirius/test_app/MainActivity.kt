package com.sirius.test_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.sirius.test_app.ui.InstallScreen
import com.sirius.test_app.ui.theme.AndroidTestTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        val greeting = findViewById<ComposeView>(R.id.greeting)
        greeting.setContent {
            AndroidTestTheme {
                MainScreen()
            }
        }
    }
}

@Composable
private fun MainScreen() {
    val data by remember { mutableStateOf(DataModel()) }
    Surface {
        InstallScreen(dataModel = data)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidTestTheme(true) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        MainScreen()
    }
}
