package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        B1.setOnClickListener{
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }

        B2.setOnClickListener{
            val intent=Intent(this,ListFriend::class.java)
            startActivity(intent)
        }

        B4.setOnClickListener{
            val intent=Intent(this,community::class.java)
            startActivity(intent)
        }

        B3.setOnClickListener{
            val intent= Intent(this,group::class.java)
            startActivity(intent)
        }

        B5.setOnClickListener{
            val intent= Intent(this,opsi::class.java)
            startActivity(intent)
        }

        B6.setOnClickListener{
            val intent= Intent(this,pengaturan::class.java)
            startActivity(intent)
        }
    }
}