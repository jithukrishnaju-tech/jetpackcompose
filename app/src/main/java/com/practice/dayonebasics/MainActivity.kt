package com.practice.dayonebasics

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            var num1 by remember {
                mutableStateOf("0")
            }
            var num2 by remember {
                mutableStateOf("0")
            }
            Column( modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.statusBars)) {
                TextField(num1, onValueChange = {
                    num1 = it
                })
                TextField(num2, onValueChange = {
                    num2 = it
                })
                Row {
                    Button(onClick = {
                        val sum = num1.toInt() + num2.toInt()
                        Toast.makeText(applicationContext, "Sum = $sum", Toast.LENGTH_SHORT).show()
                    }) {
                        Text("Add")
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Button(onClick = {
                        val sum = num1.toInt() - num2.toInt()
                        Toast.makeText(applicationContext, "Difference = $sum", Toast.LENGTH_SHORT).show()
                    }) {
                        Text("Subtract")
                    }
                }

            }
        }
    }
}
