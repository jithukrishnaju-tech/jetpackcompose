package com.practice.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun StateTestScreen(viewModel: StateTestViewModel) {
    val nameValue by viewModel.name.observeAsState()
    Column(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText(nameValue ?: "")
        MyTextField(nameValue ?: "", onValuesChanges = {
            viewModel.updateName(it)
        })
    }

}

@Composable
fun MyText(name: String) {
    Text(text = "Hi, $name", style = TextStyle(fontSize = 30.sp))
}

@Composable
fun MyTextField(name: String, onValuesChanges : (String) -> Unit) {

    OutlinedTextField(value = name, onValueChange = {
        onValuesChanges(it)
    }, label = {
        Text("Enter name")
    })
}