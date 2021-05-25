package com.example.myapplication.Presenter

import com.example.myapplication.Login.Model.ClassUser
import com.example.myapplication.Login.View.LoginView

class PresenterLogin (internal var LoginView : LoginView) : LoginPresenter {
    override fun onLogin(email: String, password: String) {
        val pengguna = ClassUser(email, password)
        val status = pengguna.valid
        if(status)
            LoginView.HasilOnLogin("Login Successfully")
        else
            LoginView.HasilOnLogin("Invalid Email and Password")
    }
}