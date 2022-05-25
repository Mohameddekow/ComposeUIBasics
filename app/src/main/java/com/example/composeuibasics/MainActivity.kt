package com.example.composeuibasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuibasics.ui.theme.ComposeUIBasicsTheme
import com.example.composeuibasics.ui.theme.Shapes
import com.example.composeuibasics.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUIBasicsTheme {
                // A surface container using the 'background' color from the theme
                 Column(
                        modifier = Modifier
                            .padding(24.dp)
                            .fillMaxWidth()
                            .background(MaterialTheme.colors.primary),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ExpandableCard()
                    }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeUIBasicsTheme {
        Column {
            ExpandableCard()
        }
    }
}