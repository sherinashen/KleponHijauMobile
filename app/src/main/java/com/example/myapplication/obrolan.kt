package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_obrolan.*

class obrolan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obrolan)

        TV3.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV5.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV7.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV9.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV11.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV12.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV13.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }

        TV15.setOnClickListener{
            val intent= Intent(this,Chatting::class.java)
            startActivity(intent)
        }
    }
}