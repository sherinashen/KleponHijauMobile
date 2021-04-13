package com.example.myapplication

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.annotation.UiThread
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.TaskStackBuilder
import com.example.myapplication.fragment.FragmentDua
import com.example.myapplication.fragment.FragmentSatu
import com.example.myapplication.fragment.FragmentTiga
import com.example.myapplication.fragment.InterfaceData
import kotlinx.android.synthetic.main.activity_lonceng.*
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.fragment_tiga.*
import org.jetbrains.anko.AnkoAsyncContext
import org.jetbrains.anko.doAsync

public const val EXTRA_PERSON = "EXTRA_PERSON"
class Profile : AppCompatActivity(), InterfaceData {
    private lateinit var notificationManager:NotificationManagerCompat

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {

        notificationManager = NotificationManagerCompat.from(this)
        val intent = Intent(this,RecycleViewProfile::class.java)
        val pendingIntent = PendingIntent.getActivity(this,0,intent,0)



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val fragment1 = FragmentSatu()
        supportFragmentManager
            .beginTransaction().replace(R.id.framelayout,fragment1).commit()


        imageButton8.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        textView29.setOnClickListener{
            supportFragmentManager
                .beginTransaction().replace(R.id.framelayout,fragment1).commit()
        }
        textView30.setOnClickListener{
            val fragment2 = FragmentDua()
            supportFragmentManager
                .beginTransaction().replace(R.id.framelayout,fragment2).commit()
        }

        buttonprint.setOnClickListener {
            val builder = NotificationCompat.Builder(this,BaseNereON.CHANNEL_1_ID)
                .setSmallIcon(R.mipmap.ic_newlogo_round)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_newlogo_foreground))
                .setBadgeIconType(NotificationCompat.BADGE_ICON_LARGE)
                .setColor(Color.BLACK)
                .setContentTitle("Show Profile Detail")
                .setContentText("Klik Me")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)

            val notification = builder.build()
            notificationManager.notify(1,notification)
        }
       // doAsync {
           // Thread.sleep(5000L)
            //UiThread { showMotivy() }
    //}

}

    override fun send(editEdit: String) {
        val bundle = Bundle()
        bundle.putString("Kata", editEdit)

        val test = this.supportFragmentManager.beginTransaction()

        val fragment3 = FragmentTiga()
        fragment3.arguments = bundle
        test.replace(R.id.framelayout,fragment3).commit()
        test.addToBackStack(null)
    }
    // @RequiresApi(Build.VERSION_CODES.O)
    //private fun showMotivy() {
      //  val NotificationID = 1101
       // val ChannelAlarm = "Channel Profile"
        //val name = "ON/OFF"
        //val importance = NotificationManager.IMPORTANCE_HIGH
       // val NotifikasiChannel = NotificationChannel(ChannelAlarm,name,importance)
        //val notifydetailintent = Intent(this,RecycleViewProfile::class.java).apply {
         //   flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
       // }
        //var pending  = PendingIntent.getActivity(this,0,notifydetailintent,PendingIntent.FLAG_UPDATE_CURRENT)
        //val builder = NotificationCompat.Builder(this,ChannelAlarm)
          //  .setSmallIcon(R.mipmap.ic_newlogo)
            //.setContentText("Click Me")
            //.setContentTitle("Show Detail Profile")
            //.setAutoCancel(true)
            //.setPriority(NotificationCompat.PRIORITY_HIGH)
            //.setContentIntent(pending)
       // var notifikasimanager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        //for (s in notifikasimanager.notificationChannels){
          //  notifikasimanager.deleteNotificationChannel(s.id)
        //}
        //notifikasimanager.createNotificationChannel(NotifikasiChannel)
        //notifikasimanager.notify(NotificationID,builder.build())
    //}

//    private fun <T> AnkoAsyncContext<T>.UiThread(function: () -> Unit) {
}