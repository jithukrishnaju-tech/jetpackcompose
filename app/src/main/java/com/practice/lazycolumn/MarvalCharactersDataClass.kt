package com.practice.lazycolumn

import com.practice.dayonebasics.R

data class MarvalCharactersDataClass(
    val character: String,
    val actualName: String,
    val imageUrl: Int
)

fun getAllMarvalList(): List<MarvalCharactersDataClass> {
    return listOf(
        MarvalCharactersDataClass("Captain America", "Christ Evan", R.drawable.google),
        MarvalCharactersDataClass("Spider-Man", "Tom Holland", R.drawable.google),
        MarvalCharactersDataClass("Iron Man", "Robert Downey Jr", R.drawable.google),
        MarvalCharactersDataClass("Black Panther", "Chadwick Boseman", R.drawable.google)
    )
}
