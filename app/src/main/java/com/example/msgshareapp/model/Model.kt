package com.example.msgshareapp.model

//create data class in kotlin
data class Hobby(var title: String)
class MyClass {
    /*companion object must defin in class and dont have name
    * call as classname.pi
    * */
    companion object {
        val pi = 3.14
    }
}

//object like static in java
object Supplier {
    val hoppies = listOf(
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