package com.example.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_secend.*

class SecendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend)
        val bundle = intent.extras
        val msg = bundle?.getString("name")
//chexk if not null :: bundle!! or bundle?
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        //set text in kotlin
        msg_text.text = ("user msg is:: $msg")
    }
}