package com.example.firstproject

fun main(){
    checknumEx(0)
}

fun HelloWorld() : Unit {
    println("Hello World")
}
fun add(a:Int, b:Int):Int{
    return a+b
}

fun hi(){
    val a:Int = 10
    var b:Int = 100
    b = 50
    //a = 50 : a는 값이 정해져 변하지않는 val이므로 바꿀 수 없음
    //a, b는 정수형 값을 넣었기 때문에 굳이 타입을 명시하지 않아도 됨
    //var c : String 과 같이 값이 정해지지 않은 변수는 타입을 명시해야 함
}

fun StringTemplateEx():Unit{
    val name : String = "TW"
    val Lname : String = "Kim"
    println("My name is TW")
    println("My name in ${name + Lname}")
    println("aa a\$")
}

fun maxBy(a : Int, b : Int) : Int {
    if(a>b) {
        return a
    }
    else {
        return b
    }
}
fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b
fun checkNum(score : Int) {
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }
    var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
}
fun checknumEx(score : Int) {
    when(score){
        in 90..100 -> println("Good")
        in 0..10 -> println("Bad")
        else -> println("Okay")
    }
}