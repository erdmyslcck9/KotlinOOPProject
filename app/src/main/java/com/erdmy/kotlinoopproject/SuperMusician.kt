package com.erdmy.kotlinoopproject

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {
    fun sing() {
        println("Enter Sandman")
    }
}