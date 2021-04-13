package com.example.myapplication

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.contentValuesOf
import kotlinx.android.synthetic.main.activity_lonceng.*

open class AlarmReceiver : BroadcastReceiver() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onReceive(context: Context, intent: Intent) {
        val NotificationID = 30103
        val ChannelAlarm = "Channel Alarm"
        val name = "ON/OFF"
        val importance = NotificationManager.IMPORTANCE_HIGH
        val NotifikasiChannel = NotificationChannel(ChannelAlarm,name,importance)
        val builder = NotificationCompat.Builder(context,ChannelAlarm)
            .setSmallIcon(R.drawable.ic_alarmon)
            .setContentText(intent?.getStringExtra(EXTRA_PESAN)?: "Tidak ada pesan")
            .setContentTitle("New Alarm")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
        var notifikasimanager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        for (s in notifikasimanager.notificationChannels){
            notifikasimanager.deleteNotificationChannel(s.id)
        }
        notifikasimanager.createNotificationChannel(NotifikasiChannel)
        notifikasimanager.notify(NotificationID,builder.build())
    }
}