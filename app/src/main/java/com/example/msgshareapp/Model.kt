package com.example.msgshareapp

//create data class in kotlin
data class Hobby(var title: String)

//create object of class
object Supplier {
    val hoppies = listOf<Hobby>(
        Hobby("swimming"),
        Hobby("running"),
        Hobby("reading"),
        Hobby("drawing"),
        Hobby("swimming"),
        Hobby("running"),
        Hobby("reading"),
        Hobby("drawing")

    )
}