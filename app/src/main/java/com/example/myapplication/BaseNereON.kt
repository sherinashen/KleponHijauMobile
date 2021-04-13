package com.example.myapplication

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class BaseNereON : Application(){

    companion object{
        const val CHANNEL_1_ID = "Channel1"
    }
    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val chanel1 = NotificationChannel(
                CHANNEL_1_ID,
                "Channel Satu",
                NotificationManager.IMPORTANCE_HIGH
            )
            chanel1.description = "Channel ini adalah Channel Pertama"

           val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(chanel1)

            }
        }
    }
