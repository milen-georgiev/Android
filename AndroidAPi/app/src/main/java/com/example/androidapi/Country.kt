package com.example.androidapi

data class Country(
    var name: String,
    var capital: String,
    var flags: Flag
)

data class Flag(
    var svg: String,
    var png: String
)
