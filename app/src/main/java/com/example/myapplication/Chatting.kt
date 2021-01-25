package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Chatting : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        val panah = findViewById<ImageButton>(R.id.panah)
        panah?.setOnClickListener{
            val Chat = Intent(this@Chatting,Chat::class.java)
            startActivity(Chat)
        }
    }
}