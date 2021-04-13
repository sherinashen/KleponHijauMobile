package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.button4
import kotlinx.android.synthetic.main.activity_post.*
private const val EXTRA_POST = "EXTRA_POST"
class Post : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        button4.setOnClickListener{
            textView37.text = editTextTextPersonName5.text
            editTextTextPersonName5.setText("")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(EXTRA_POST, textView37.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textView37.text = savedInstanceState.getString(EXTRA_POST) ?: "Belum ada Kata-Kata"
    }
}