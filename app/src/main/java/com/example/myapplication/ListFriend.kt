package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_list_friend.*

class ListFriend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_friend)

        IB1.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        imageButton5.setOnClickListener{
            val intent= Intent(this,obrolan::class.java)
            startActivity(intent)
        }

        val imageButton15 = findViewById<ImageButton>(R.id.imageButton15)
        imageButton15?.setOnClickListener{
            val addfriend = Intent(this@ListFriend,addfriend::class.java)
            startActivity(addfriend)
        }


    }
}