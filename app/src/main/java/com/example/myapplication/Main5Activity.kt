package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        imageButton.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        coment.setOnClickListener{
            val intent= Intent(this,komentar::class.java)
            startActivity(intent)
        }

        comennt1.setOnClickListener{
            val intent= Intent(this,komentar::class.java)
            startActivity(intent)
        }

        imageButton2.setOnClickListener{
            val intent= Intent(this,Post::class.java)
            startActivity(intent)
        }

    }

}
