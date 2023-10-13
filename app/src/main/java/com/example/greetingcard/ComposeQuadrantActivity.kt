package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantView()
                }
            }
        }
    }
}

@Composable
fun QuadrantView() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantItem(
                title = "Text Composable",
                desc = "Displays text and follows the recommended " +
                        "Material Design guidelines.",
                hexColor = 0xFFEADDFF,
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = "Image Composable",
                desc = "Creates a composable that lays out and draws a given " +
                        "Painter class object.",
                hexColor = 0xFFD0BCFF,
                modifier = Modifier.weight(1f),
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantItem(
                title = "Row Composable",
                desc = "A layout composable that places its " +
                        "children in a horizontal sequence.",
                hexColor = 0xFFB69DF8,
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = "Column Composable",
                desc = "A layout composable that places its children in a vertical sequence.",
                hexColor = 0xFFF6EDFF,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantItem(title: String, desc: String, modifier: Modifier = Modifier, hexColor: Long) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(hexColor))
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    GreetingCardTheme {
        QuadrantView()
    }
}