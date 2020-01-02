package com.thewei

fun main(args: Array<String>) {
//    println("Hello Kotlin");
    Human().hello()
    val h = Human();
    h.hello();

    var age : Int = 19;
    age = 20;
    var weight = 66.5f;
    val name = "The Wei";
    var enname :String;
    enname = "Wei";
}

class Human{
    fun hello(){
        println("Hello Kotlin");
    }
}