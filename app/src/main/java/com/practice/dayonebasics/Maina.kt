package com.practice.dayonebasics

fun main() {
    println("Stone paper Scissor, Enter you choice")
    var personChoice: String
    var computerChoice: String
    var personPoints = 0
    personChoice = personChoice()
    computerChoice = computerChoice()
    while (computerChoice != personChoice) {
        personPoints += 1
        println("Your points is $personPoints")
        println("Computer choice was $computerChoice")
        computerChoice = computerChoice()
        personChoice = personChoice()
    }
    println("GAME END")
    return
}

private fun computerChoice():String{
    val randomNumber = (1..3).random()
    val chooseValue = when(randomNumber){
        1 -> "Stone"
        2 -> "Paper"
        3 -> "Scissors"
        else -> "Default"
    }
    return chooseValue
}

private fun personChoice():String{
    println("Enter your choice")
    return readln()
}
