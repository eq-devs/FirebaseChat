package com.estay.e_message

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        registerbutton_button_register.setOnClickListener {
            val username=username_edittext_register.text.toString()
            val email=email_edittext_reegister.text.toString()
            Log.d("MainActivity","Username is" +username)
            Log.d("MainActivity","Email is "+email)
        }

        allreeadyhaveaccount_textview.setOnClickListener {
            Log.d("MainActivity","Try to show login Activity")
           val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }


    }
}
