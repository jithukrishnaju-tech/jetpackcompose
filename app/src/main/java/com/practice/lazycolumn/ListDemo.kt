package com.practice.lazycolumn

import android.graphics.drawable.PaintDrawable
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo() {
    MarvalCharactersLazyRow()
}

@Composable
fun MarvalCharactersLazyRow() {
    val listOfMarval: List<MarvalCharactersDataClass> = getAllMarvalList()
    LazyColumn (content = {
        itemsIndexed(listOfMarval, itemContent = { _, item ->
            MarvalItem(item)
        })
    })
}

@Composable
fun MarvalItem(item : MarvalCharactersDataClass) {
    val context = LocalContext.current
    Row (modifier = Modifier.fillMaxWidth().padding(20.dp)) {
        Image(painter = painterResource(item.imageUrl), contentDescription = item.actualName, modifier = Modifier.size(64.dp).scale(1f).clickable {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        })
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp), horizontalAlignment = Alignment.Start) {
            Text(text = item.character, style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))
            Text(text = item.actualName, style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
        }
    }
}

@Composable
fun LazyColumnsDemo() {
    LazyColumn(content = {
        items(100, itemContent = {
            TextView(it)
        })
    })
}

@Composable
fun LazyColumnItemIndex(modifier: Modifier = Modifier) {
    val myList: List<Int> = listOf(1,2,3,4,5,6,7)
    LazyColumn (content = {
        itemsIndexed(myList, itemContent = {index: Int, item: Int ->
            TextView(item)
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