package com.example.firstproject

fun main(){
    ignoreNulls()
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
    var b : Int = when(score){ // 값을 반환하는 Expression
        1 -> 1
        2 -> 2
        else -> 3
    }
}
fun checknumEx(score : Int) {
    when(score){// 값을 반환하지않는 Statement
        in 90..100 -> println("Good")
        in 0..10 -> println("Bad")
        else -> println("Okay")
    }
}

// Array

// 1. List : 수정 불가능 2. MutableList : 수정 가능

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3

    // list[0] = 1 , list는 읽기 전용, 수정 불가능
    var result = list.get(0) // list의 값을 불러오는 것은 가능

    var arrayList = arrayListOf<Int>() // arrayList가 가리키는 것은 주소값으로 변하지 않으므로 val을 써도 무방, 새 arrayList 할당은 불가
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0]=20

}

// For, While

fun forAndWhile(){

    val students = arrayListOf("abc", "def")
    for (name in students){
        println(name)
    }
    var sum = 0
    for (i in 1..10 step 2) {
        sum+=i

    }
    println(sum)
    for ((index,name) in students.withIndex()){
        println("${index+1} 번째 학생 : ${name}")
    }

    var index : Int = 0
    while (index < 10){
        println("curren index is ${index}")
        index++
    }
}

// Nullable / NunNull

fun nullcheck(){
    //NPE : NULL pointer Exception, 자바에선 프로그램을 실행시켜야 오류를 잡아내야하는 불편함이 있음

    var name : String = "abc"
    var nullName : String? = null // ?를 붙여 nonnull type에 null 사용

    var nameInUpperCase : String = name.toUpperCase()

    var nullNameInUpperCase : String? = nullName?.toUpperCase() //nullName이 null이 아니면 Upper, null이면 null

    // ?: default값을 주고 싶을 때 사용

    val lastName : String? = null
    val fullName = name+" "+(lastName?: "No lastName") // lastName이 null이 아니면 그대로, null이면 No lastName

    // !! : 무조건 null이 아님
}

fun ignoreNulls(){
    val str : String? = "ab"
    val mNotNull : String = str!!
    val upper : String = mNotNull.toUpperCase()

    val email : String? = "paladyn12@naver.com"
    email?.let {  // email이 null이 아니면 실행
        println("My email is ${email}")
    }
}

// Class