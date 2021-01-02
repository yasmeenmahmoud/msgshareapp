package com.example.msgshareapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.msgshareapp.AppConstants
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_secend.*

class SecendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend)
        val bundle = intent.extras
        //check if null
        bundle?.let {

            val msg = bundle.getString(AppConstants.USER_MSG)
//chexk if not null :: bundle!! or bundle?
            showToast(msg + "")
            //set text in kotlin
            msg_text.text = ("user msg is:: $msg")
        }
    }
}