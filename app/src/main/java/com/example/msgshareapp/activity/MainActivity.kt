package com.example.msgshareapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import com.example.msgshareapp.AppConstants
import com.example.msgshareapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // similer to static tag in java
    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast_btn.setOnClickListener {
            //code
            // Log.d("MainActivity:", "button is clicked !")
            Log.d(TAG, "button is clicked !")
            //toast msg
            val toast = Toast.makeText(this, "button is clicked !", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 100, 100)
            toast.show()
        }
        send_btn.setOnClickListener {
            val intent = Intent(this, SecendActivity::class.java)
            intent.putExtra(AppConstants.USER_MSG, editTextTextPersonName.text.toString())
            startActivity(intent)
        }
        share_btn.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, editTextTextPersonName.text.toString())
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "choose appp"))
        }
        //recycler view
        recyclerViewDemobtn.setOnClickListener {
            val intent = Intent(
                this,
                HobbiesActivity::class.java
            )
            startActivity(intent)
        }
    }
}