package com.example.aplikasi_kotlin

class Club(
    val name: String,
    val premierLeagueTrophies: Int,
    val faCupTrophies: Int,
    val eflTrophies: Int,
    val championsLeagueTrophies: Int,
    val europaLeagueTrophies: Int,
    val country: String,
    val europe: String
)

fun main() {
    val liverpool = Club(
        "Liverpool",
        19, 8, 9, 6, 0, "Inggris", "Eropa"
    )

    val manchesterUnited = Club(
        "Manchester United",
        20, 12, 6, 3, 0, "Inggris", "Eropa"
    )

    // Mengakses properti objek langsung
    println("${liverpool.name} has won ${liverpool.premierLeagueTrophies} Premier League trophies.")
    println("${manchesterUnited.name} has won ${manchesterUnited.championsLeagueTrophies} Champions League trophies.")
}
