package com.example.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class DatabaseHandler(var context: Context) : SQLiteOpenHelper(context, DatabaseHandler.DB_NAME, null, DatabaseHandler.DB_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        val table = "CREATE TABLE $NAME(" + nama + "TEXT," + email + "TEXT," + nohp + "INTEGER PRIMARY KEY," + pass + "TEXT);"
        db?.execSQL(table)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    companion object{
        private val NAME = "NereON"
        private val DB_NAME = "NereOn"
        private val DB_VERSION = 1
        private val nama = "Name"
        private val email = "E-Mail"
        private val nohp = "Phone Number"
        private val pass = "Password"
    }

    fun write(data: data): Long {
        val db = this.writableDatabase
        var contentValues = ContentValues()
        contentValues.put(nama,data.nama)
        contentValues.put(email,data.alamatemail)
        contentValues.put(nohp,data.phonenumber)
        contentValues.put(pass,data.pass)
        var hasil = db.insert(NAME,null,contentValues)
        db.close()
        return hasil
    }
}