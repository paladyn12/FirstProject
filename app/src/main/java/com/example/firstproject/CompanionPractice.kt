package com.example.firstproject

class Book private constructor (val id : Int, val name : String){

    companion object BookFactory : IdProvider {
        override fun getId(): Int {
            return 400
        }

        val myBook="new book"

        fun create() = Book(getId(),myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main(){

    val book = Book.BookFactory.create()

    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}