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
import androidx.compose.ui.text.style.TextAlign
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
                    ComposeQuadrants()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(head: String, body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = head,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrants() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier.weight(1F)) {
            ComposeQuadrant(
                head = stringResource(R.string.text_composable),
                body = stringResource(R.string.text_composabel_description),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp)
            )
            ComposeQuadrant(
                head = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
                    .padding(16.dp)
            )
        }
        Row(Modifier.weight(1F)) {
            ComposeQuadrant(
                head = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            ComposeQuadrant(
                head = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
                    .padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrants()
    }
}