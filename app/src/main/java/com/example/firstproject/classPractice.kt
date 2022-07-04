package com.example.firstproject

open class Human constructor(name : String = "Annonymous"){ //default값 지정 가능

    constructor(name : String, age : Int) : this(name){
        println("My name is ${name}, ${age} years old.")
    }

    init { // 처음 instance를 생성할 때 어떤 동작을 할 지 설정할 수 있음
        println("New human has been born")
    }

    val Name = name
    fun eatingCake(){
        println("This is so yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){ //Human 상속, 코틀린의 class는 file이기 때문에 class를 open 해야함

    override fun singASong(){
        super.singASong()
        println("라라라")
        println("My name is ${super.Name}")
    }
}

fun main(){
    val human = Human("abc")
    human.eatingCake()
    val mom = Human("def",30)
    println("This human's name is ${human.Name}")
    val korean = Korean()
    korean.singASong()

}