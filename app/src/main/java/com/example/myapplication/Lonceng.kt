package com.example.myapplication

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.icu.text.CaseMap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_coment.*
import kotlinx.android.synthetic.main.activity_lonceng.*

class Lonceng : AppCompatActivity() {
   private lateinit var notificationManager:NotificationManagerCompat
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lonceng)

        notificationManager = NotificationManagerCompat.from(this)

        val intent = Intent(this,Lonceng::class.java)
        val pendingIntent = PendingIntent.getActivity(this,0,intent,0)

        buttonsendchanel.setOnClickListener {
            val Title  = judul.text.toString()
            val Message = pesan.text.toString()
            val builder = NotificationCompat.Builder(this,BaseNereON.CHANNEL_1_ID)
                .setSmallIcon(R.mipmap.ic_newlogo_round)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_newlogo_foreground))
                .setBadgeIconType(NotificationCompat.BADGE_ICON_LARGE)
                .setColor(Color.BLACK)
                .setContentTitle(Title)
                .setContentText(Message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)

            val notification = builder.build()
            notificationManager.notify(1,notification)

            count++
            val textView = findViewById<TextView>(R.id.textViewnotif)
            textView.text = "$count"

        }
    }
    fun reset(view: View) {
        count=0
        val textView = findViewById<TextView>(R.id.textViewnotif)
        textView.text = "$count"
    }
}