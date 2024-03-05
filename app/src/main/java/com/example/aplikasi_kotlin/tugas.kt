package com.example.aplikasi_kotlin

fun main(args: Array<String>) {
    biodata("Faulah", 19)
    hobby("mancing", "mancing emosi")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("===============================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("===============================")
}

fun hobby(hobby:String, desc:String){
    println("Saya suka $hobby")
    println("Yang saya baca adalah $desc")
}