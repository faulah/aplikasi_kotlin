package com.example.aplikasi_kotlin

class house {
    val houseColor:String = "white"
    val numberOfWindows:Int = 2
    val isForSale:Boolean = false

    fun updatecolor(){

    }
    fun putOnSale(){

    }
}
fun main(){
    val A1 = house()
    val A2 = house()
    val A3 = house()

    println(A1)
    println("=".repeat(20))
    println(A2)
    println("=".repeat(20))
    println(A3)
}