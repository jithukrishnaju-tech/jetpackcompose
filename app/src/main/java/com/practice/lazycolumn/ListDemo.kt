package com.practice.lazycolumn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo() {
    LazyColumnsDemo()
}

@Composable
fun LazyColumnsDemo(modifier: Modifier = Modifier) {
    LazyColumn(content = {
        items(100, itemContent = {
            TextView(it)
        })
    })
}

@Composable
fun DemoList(modifier: Modifier = Modifier) {
    val scrollView = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollView)) {
        for (i in 1..1116) {
            TextView(i)
        }
    }
}

@Composable
fun TextView(index: Int) {
    Text(
        text = "Index ${index}",
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        fontSize = 20.sp, textAlign = TextAlign.Center,
    )
}