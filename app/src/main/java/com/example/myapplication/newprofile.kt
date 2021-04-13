package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_newprofile.*

class newprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newprofile)

        var p = intent.getParcelableExtra<Person>(EXTRA_PERSON)
        textView45.text = "ID : ${p?.ID}"
        textView46.text = "Nama : ${p?.Nama}"
        textView47.text = "Motto : ${p?.Motto}"
    }
}