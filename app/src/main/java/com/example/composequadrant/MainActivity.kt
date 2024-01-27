package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//            .background(Color(0xFFEADDFF))

    ) {
        QuadrantCompose(
            title = stringResource(R.string.text_composable),
            description = stringResource(R.string.text_composabel_description),
            weight = 1f)
        QuadrantCompose(
            title = stringResource(R.string.image_composable),
            description = stringResource(R.string.image_composable_description),
            weight = 2f)
        QuadrantCompose(
            title = stringResource(R.string.row_composable),
            description = stringResource(R.string.row_composable_description),
            weight = 1f)
        QuadrantCompose(
            title = stringResource(R.string.column_composable),
            description = stringResource(R.string.column_composable_description),
            weight = 1f)
    }

}

@Composable
fun QuadrantCompose(
    title: String,
    description: String,
    weight: Float,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxWidth()
            .background(Color(0xFFEADDFF))
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        QuadrantApp()
    }
}