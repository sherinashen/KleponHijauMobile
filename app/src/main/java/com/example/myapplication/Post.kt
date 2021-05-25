package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.button4
import kotlinx.android.synthetic.main.activity_post.*
import java.io.FileInputStream
import java.io.FileNotFoundException

private const val EXTRA_POST = "EXTRA_POST"
class Post : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        button4.setOnClickListener{
            var namafile  = editTextnama.text.toString()
            var namagame  = editTextTextPersonName4.text.toString()
            var pesan   = editTextTextPersonName5.text.toString()
            var hasil = openFileOutput("${namafile}.txt",Context.MODE_PRIVATE).apply {
                write(namagame.toByteArray())
                write(pesan.toByteArray())
                close()
            }
            Toast.makeText(this,"File Saved", Toast.LENGTH_SHORT).show()
            editTextnama.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
        }

        button5.setOnClickListener {
            var namafile  = editTextnama.text.toString()
            var pesan   = editTextTextPersonName5.text.toString()
            var fileInputStream:FileInputStream? = null
            try{
                fileInputStream = openFileInput("${namafile}.txt")
                fileInputStream.apply { bufferedReader().useLines {
                        for (text in it.toList()){
                            textView37.setText("Nama Game dan Pesan ${pesan} \n $text")
                            }
                    }
                    }
            }catch (e : FileNotFoundException){
                Toast.makeText(this,"File Not Found", Toast.LENGTH_SHORT).show()
            }
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