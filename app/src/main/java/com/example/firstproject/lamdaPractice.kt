package com.example.firstproject


// Lamda : value처럼 다룰 수 있는 익명함수
// 메소드의 파라미터로 넘길 수 있고 retrun값으로 사용할 수도 있음
// 기본 정의
// val/var lamdaName : Type = {argumentList -> codebody}

val square : (Int) -> (Int) = {number : Int -> number*number}

val nameAge : (String,Int) -> (Unit) = {name : String, age : Int -> println("이름은 ${name}, 나이는 ${age}")}

// 확장함수 : 기존 클래스에 확장된 기능을 추가하는 함수
// ex) val/var funName : Type.() -> Type = {this + "~~~"}

val stringAdd : String.() -> String = {this + " added String"}

fun main(){
    val a="def"
    println(square(10))
    nameAge("abc",23)
    println(stringAdd("abc"))
    println("abc".stringAdd())
    println(a.stringAdd())
    println(extendedString("abc",23))
    println(extendedString2("def",23))

    val lamda1 = {number : Double ->
        number==4.1
    }
    println(invokeLamda(lamda1,4.1))
    println(invokeLamda(lamda1,4.2))
    println(invokeLamda2(lamda1))
    println(invokeLamda2 { it>3.2 }) // 마지막 parameter가 lamda식일 때 사용 가능

    println(ll(10))
    println(Iex(10))

}

val ll : (Int) -> (String) = {num : Int -> "${num}을 입력"}
val Iex : Int.() -> Int = {
    this+30
}

fun extendedString (name : String, age : Int) : String {
    val introduce : (String, Int) -> (String) = {name, age -> "name is ${name}, age is ${age}"}
    return introduce(name,age)
}
fun extendedString2 (name : String, age : Int) : String {
    val introduce : String.(Int) -> String = {"name is $this, age is $it"}
    return name.introduce(age)
}

// 람다의 return

val calculate : (Int) -> (String) = {
    when(it){
        in 0..40 -> "fail"
        in 41..80-> "pass"
        in 71..100 -> "perfect"
        else -> "none"
    }
}

fun invokeLamda (lamda : (Double) -> (Boolean), num : Double) : (Boolean){
    return lamda(num)
}
fun invokeLamda2 (lamda : (Double) -> Boolean) : Boolean {
    return lamda(4.1)
}

