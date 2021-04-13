package com.example.myapplication

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var MyAirplaneReceiver = AirplaneReceiver()
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(MyAirplaneReceiver,filter)

        buttonlogin.setOnClickListener{
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        buttonregis.setOnClickListener{
            val intent= Intent(this,Register::class.java)
            startActivity(intent)
        }

    }

}