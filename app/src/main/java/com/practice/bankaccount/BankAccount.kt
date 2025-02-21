package com.practice.bankaccount

class BankAccount(var accountHolderName: String, var balance: Double) {

    private var transactionHistoryList: MutableList<String> = mutableListOf<String>()

    fun deposit(money:Double) {
        balance+=money
        transactionHistoryList.add("Deposit amound $money, Total balance is $balance")
    }

    fun withdraw(money:Double){
        if(money>=balance){
            balance-=money
            transactionHistoryList.add("Withdraw amound $money, Total balance is $balance")
        }
        else {
            println("Can't withdraw money, insufficient balance in your account")
        }

    }
    fun transactionHistory(): MutableList<String> {
        return transactionHistoryList
    }

}