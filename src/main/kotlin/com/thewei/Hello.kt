package com.thewei

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    val h = Human();
//    h.hello();
    //縮寫
    val hu = Human(weight = 66.5F, height = 1.7f)
    println(hu.bmi());

    val score = 88;
    println(score > 60)
    val c:Char = 'A'
    println(c.toInt() > 60)

//    var age : Int = 19;
//    age = 20;
//    var weight = 66.5f;
//    val name = "The Wei";
//    var enname :String;
//    enname = "Wei";
}

class Human(var name:String="", var weight:Float, var height:Float){
    init {
        println("test $weight")
    }

    //constructor(name:String, weight:Float, height: Float):this(weight, height)

    fun bmi():Float{
        val bmi = weight / (height * height);
        return  bmi;
    }
    fun hello(){
        println("Hello Kotlin");
    }
}