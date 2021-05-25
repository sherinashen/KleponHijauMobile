package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.fragment.InterfaceData
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_recycle_view_profile.*
import kotlinx.android.synthetic.main.fragment_tiga.*
import kotlinx.android.synthetic.main.layoutrecycleview.*
import org.w3c.dom.Text

class RecycleViewProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_profile)

        val myListContact = listOf(
            MyContext (id = "IZxEL" , nama = "IZ",motto = "I\'ve been a gamer all my life")
        )
        val contactAdapter = myAdapterRecycleView(myListContact)
        profilerecycle.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewProfile)
            adapter = contactAdapter
        }
    }
}