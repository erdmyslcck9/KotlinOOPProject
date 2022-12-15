package com.erdmy.kotlinoopproject

class User {

    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init
    constructor(nameInput: String, ageInput: Int) {
        this@User.name = nameInput
        this@User.age = ageInput
        println("user created")
    }
}