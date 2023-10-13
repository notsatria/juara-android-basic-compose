package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class ArticleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val body1 = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                            "Compose simplifies and accelerates UI development on Android with less code, " +
                            "powerful tools, and intuitive Kotlin APIs."
                    val body2 = "In this tutorial, you build a simple UI component with declarative " +
                            "functions. You call Compose functions to say what elements you want and " +
                            "the Compose compiler does the rest. Compose is built around Composable " +
                            "functions. These functions let you define your app\\'s UI programmatically " +
                            "because they let you describe how it should look and provide data dependencies, " +
                            "rather than focus on the process of the UI\\'s construction, such as initializing " +
                            "an element and then attaching it to a parent. To create a Composable function, " +
                            "you add the @Composable annotation to the function name."

                    ArticleBody(title = "Jetpack Compose tutorial", body1 = body1, body2 = body2)
                }
            }
        }
    }
}

@Composable
fun ArticleBody(title: String, body1: String, body2: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = "Article Header"
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = body1,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = body2,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    GreetingCardTheme {
        val body1 = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs."
        val body2 = "In this tutorial, you build a simple UI component with declarative " +
                "functions. You call Compose functions to say what elements you want and " +
                "the Compose compiler does the rest. Compose is built around Composable " +
                "functions. These functions let you define your app\\'s UI programmatically " +
                "because they let you describe how it should look and provide data dependencies, " +
                "rather than focus on the process of the UI\\'s construction, such as initializing " +
                "an element and then attaching it to a parent. To create a Composable function, " +
                "you add the @Composable annotation to the function name."

        ArticleBody(title = "Jetpack Compose tutorial", body1 = body1, body2 = body2)
    }
}