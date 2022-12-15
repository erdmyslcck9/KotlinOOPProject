package com.erdmy.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Erdem",19)

        println("${myUser.age}")
        println(myUser.name)

        //encapsulation
        var james = Musician("james","Guitar",67)
        println(james.age)
        println(james.returnBandName("Erdem"))
        println(james.returnBandName("Kirk Hammet"))

        //inheritance
        var lars = SuperMusician("lars","Drums",69)
        lars.sing()

        //polymorphism  -> static polymorphism - dynamic polymorphism

        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        //abstract & interface
        var piano = Piano()
        piano.brand = "Yamaha"
        piano.digital = false
        piano.info()

        //Lambda expressions
        /* yorum satırı ile aşağıdaki kod aynı şey
        fun printStr(myString : String) {
            println(myString)
        }
        printStr("My test Str")
         */

        val testString = {myString : String -> println(myString)}
        testString("My Lambda Str")

        //1)
        val multiplyLambda = {a: Int, b: Int -> a*b}
        println(multiplyLambda(5,4))

        //2)
        val multiplyLambda2 : (Int,Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,9))

        //asynchrnous
        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : () -> Unit) {
        //url -> download
        //everthings over
        //data
            completion()
        }

        downloadMusicians("metallica.com",{
            println("ready")
        })
    }
}