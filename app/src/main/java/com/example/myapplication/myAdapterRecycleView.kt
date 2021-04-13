package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_tiga.view.*
import kotlinx.android.synthetic.main.layoutrecycleview.view.*

class myAdapterRecycleView(private val contact: List<MyContext>) : RecyclerView.Adapter<myHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myHolder {
        return myHolder (
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layoutrecycleview,parent,false)
        )
    }

    override fun getItemCount(): Int =contact.size
    override fun onBindViewHolder(holder: myHolder, position: Int) {
        holder.cari(contact[position])
    }

}

class myHolder(view: View) : RecyclerView.ViewHolder(view){
    private val ID = view.contactid
    private val Name = view.contactname
    private val Motto = view.contactmotto
    private val Gender = view.gender

    fun cari (tmp: MyContext){
        ID.text = "${ID.text} ${tmp.id}"
        Name.text = "${Name.text} ${tmp.nama}"
        Motto.text = "${Motto.text} ${tmp.motto}"
        Gender.text = "${Gender.text} ${tmp.gender}"
    }
}