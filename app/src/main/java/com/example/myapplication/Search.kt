package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val archer= findViewById<ImageButton>(R.id.archer)
        archer?.setOnClickListener{
            val addfriend = Intent(this@Search,addfriend::class.java)
            startActivity(addfriend)
        }
    }
}