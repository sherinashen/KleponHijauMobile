package com.example.myapplication

import android.content.Intent
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.Login.View.LoginView
import com.example.myapplication.Presenter.PresenterLogin
import com.example.myapplication.Presenter.LoginPresenter
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
class MainActivity2 : AppCompatActivity(),LoginView  {
    internal lateinit var presenter:LoginPresenter
    private var soundPool : SoundPool? = null
    private var soundPool2 : SoundPool? = null
    private val sound = 1
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        soundPool = SoundPool(1,AudioManager.STREAM_MUSIC,0)
        soundPool!!.load(baseContext, R.raw.ringtone1,1)
        soundPool2 = SoundPool(1,AudioManager.STREAM_MUSIC,0)
        soundPool2!!.load(baseContext, R.raw.ringtone2,1)

        presenter = PresenterLogin(this)
        button4.setOnClickListener{
            presenter.onLogin(editTextTextPersonName.text.toString(), editTextTextPassword.text.toString())
        }
    }

    override fun HasilOnLogin(message: String) {
        Toasty.info(this,message,Toast.LENGTH_SHORT).show()
        if(message == "Login Successfully"){
            val intent = Intent(this,Main5Activity::class.java)
            startActivity(intent)
            playsound()
        }
        else{
            playsound2()
        }
    }
    private fun playsound(){
        soundPool?.play(sound,1F,1F,0,0,1F)
    }
    private fun playsound2(){
        soundPool2?.play(sound,1F,1F,0,0,1F)
    }
}