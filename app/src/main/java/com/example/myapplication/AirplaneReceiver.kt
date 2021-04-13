package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.wifi.p2p.WifiP2pManager
import android.provider.Settings
import android.widget.Toast
import kotlin.system.exitProcess

class AirplaneReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(Settings.System.getInt(context.contentResolver,
            Settings.Global.AIRPLANE_MODE_ON, 0)==0){
            Toast.makeText(context,"Your Connection is back", Toast.LENGTH_SHORT).show() }
       else{
            Toast.makeText(context,"Your Connection is stopped working", Toast.LENGTH_SHORT).show()
            exitProcess(0)}
}}