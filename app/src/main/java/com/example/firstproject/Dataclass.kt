package com.example.firstproject

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy() 메소드 자동 생성

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)


fun main(){
    val ticketA = Ticket("KoreanAir","abc","2022-07-05",14)
    val ticketB = TicketNormal("KoreanAir","abc","2022-07-05",14)
    println(ticketA)
    println(ticketB)
}