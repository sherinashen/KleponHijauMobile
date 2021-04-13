package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person (var ID : String = "kosong" , var Nama : String = "kosong" , var Motto : String = "kosong" ):Parcelable{
}