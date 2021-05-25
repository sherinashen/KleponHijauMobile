package com.example.myapplication

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_search.*

class Register : AppCompatActivity() {
    var db : DatabaseHandler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        db = DatabaseHandler(this)

        buttonregister.setOnClickListener{
            var data = data()
            data.nama = editTextTextPersonName7.text.toString()
            data.alamatemail = editTextTextPersonName8.text.toString()
            data.phonenumber = editTextTextPersonName9.text.toString()
            data.pass = editTextTextPersonName2.text.toString()
            var hasil1 = db?.write(data)
            if(hasil1!= -1L){
                Toast.makeText(this, "Succesfull",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Failed",Toast.LENGTH_SHORT).show()
            }
            }
        }
    }