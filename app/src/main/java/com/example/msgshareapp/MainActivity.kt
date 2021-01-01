package com.example.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast_btn.setOnClickListener {
            //code
            Log.d("MainActivity:", "button is clicked !")
            //toast msg
            val toast = Toast.makeText(this, "button is clicked !", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 100, 100)
//            toast.setView(layout);
            toast.show()
        }
        send_btn.setOnClickListener {
//            Toast.makeText(
//                this,
//                "text is : ${editTextTextPersonName.text.toString()}",
//                Toast.LENGTH_SHORT
//            ).show()
            val intent = Intent(this, SecendActivity::class.java)
            intent.putExtra("name", editTextTextPersonName.text.toString())
            startActivity(intent)
        }
        share_btn.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,editTextTextPersonName.text.toString())
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"choose appp"))
        }
    }
}