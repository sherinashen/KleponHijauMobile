package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_list_friend.*
import kotlinx.android.synthetic.main.activity_list_friend.IB1
import kotlinx.android.synthetic.main.activity_list_friend.TV2

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        IB1.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        TV2.setOnClickListener{
            val intent=Intent(this,Chatting::class.java)
            startActivity(intent)
        }
    }
}