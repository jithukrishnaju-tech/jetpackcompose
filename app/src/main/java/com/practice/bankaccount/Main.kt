package com.practice.bankaccount

fun main(){
    println("Banking app")
    var jithuAccount = BankAccount("jithu", 1000.00)
    jithuAccount.deposit(1000.00)
    jithuAccount.deposit(2000.00)
    jithuAccount.withdraw(1.00)
    println(jithuAccount.transactionHistory().toString())
}