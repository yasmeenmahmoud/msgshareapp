package com.example.msgshareapp

import android.content.Context
import android.widget.Toast
import java.time.Duration

/* we can call showToast method
* showToast("msg")
* or
* showToast(msg,durantion)*/
fun Context.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()

//we can call normal function with default parameter or with out any parameters
    normal()
    //or
    normal(5)
}

fun normal(pos: Int = 2) {

}