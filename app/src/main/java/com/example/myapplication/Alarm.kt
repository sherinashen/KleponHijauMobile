package com.example.myapplication

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_alarm.*
import java.text.SimpleDateFormat
import java.util.*

class Alarm : AppCompatActivity() {
    private var kalender = Calendar.getInstance()
    private fun setMyTimeFormat() :String{
        val myformat = "HH:mm"
        val tanggal = SimpleDateFormat(myformat)
        return tanggal.format(kalender.time)
    }
    private fun myTimePicker() : TimePickerDialog.OnTimeSetListener{
        val timeSetListener = object : TimePickerDialog.OnTimeSetListener{
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
                kalender.set(Calendar.HOUR_OF_DAY,hourOfDay)
                kalender.set(Calendar.MINUTE,minute)
                time.text=setMyTimeFormat()
            }
        }
        return timeSetListener
    }
    var myAlarmManager : AlarmManager?= null
    var pending : PendingIntent?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        myAlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        buttonalarm.setOnClickListener {
            if(pending!= null){
                myAlarmManager?.cancel(pending)
                pending?.cancel()
            }
            var alarmTimer = Calendar.getInstance()
            var waktu = time.text.split(":")
            alarmTimer.set(Calendar.HOUR_OF_DAY,waktu[0].toInt())
            alarmTimer.set(Calendar.MINUTE,waktu[1].toInt())
            alarmTimer.set(Calendar.SECOND,0)

            var kirimintent = Intent(this,AlarmReceiver::class.java)
            kirimintent.putExtra(EXTRA_PESAN,alarmname.text.toString())
            var pending = PendingIntent.getBroadcast(this,30,kirimintent,0)
            myAlarmManager?.set(AlarmManager.RTC,alarmTimer.timeInMillis,pending)
            Toast.makeText(this,"Alarm Set for ${time.text}:00 from now", Toast.LENGTH_SHORT).show()

        }
        cancelalarm.setOnClickListener {
            if(pending!= null){
                myAlarmManager?.cancel(pending)
                pending?.cancel()
                Toast.makeText(this,"Alarm Stop", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Don't Have A New Alarm", Toast.LENGTH_SHORT).show()
            }
        }

        buttontimer.setOnClickListener{TimePickerDialog(
            this,myTimePicker(),kalender.get(Calendar.HOUR_OF_DAY),kalender.get(Calendar.MINUTE),true
        ).show() }
    }
}