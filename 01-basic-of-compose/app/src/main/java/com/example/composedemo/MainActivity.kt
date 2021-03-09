package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val image = painterResource(id = R.drawable.header)
    val imageModifier = Modifier
        .requiredHeight(180.dp)
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(4.dp))
    MaterialTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(painter = image, contentDescription = "", modifier = imageModifier, contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.requiredHeight(16.dp))
            Text(text = "A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw", style = typography.h6, maxLines = 2, overflow = TextOverflow.Ellipsis)
            Text(text = "Davenport, California", style = typography.body2)
            Text(text = "December 2018", style = typography.body2)
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}
