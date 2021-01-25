package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_addfriend.*

class addfriend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addfriend)

        val archer= findViewById<ImageButton>(R.id.archer)
        archer?.setOnClickListener{
            val ListFriend = Intent(this@addfriend,ListFriend::class.java)
            startActivity(ListFriend)
        }

        B3.setOnClickListener{
            val intent= Intent(this,Search::class.java)
            startActivity(intent)
        }

        B1.setOnClickListener{
            val intent= Intent(this,invite::class.java)
            startActivity(intent)
        }
    }
}