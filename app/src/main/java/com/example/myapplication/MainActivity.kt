package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.background(color = Color.Green)) {
                Text("Hello")
                Text("Hello")
            }
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    color = MaterialTheme.colors.background
//                ) {
//                    Column(modifier = Modifier
//                        .fillMaxSize()
//                        .background(color = Color.Green).padding(16.dp)) {
//                        Text("Hello")
//                        Spacer(Modifier.width(16.dp))
//                        Text("world")
//                    }
//                }
//            }
        }
    }
}
