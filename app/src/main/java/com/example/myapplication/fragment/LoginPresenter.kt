package com.example.myapplication.fragment

import com.example.myapplication.inLogin
import com.example.myapplication.Login1
import com.example.myapplication.User1

class LoginPresenter(internal var Login:inLogin) : Login1 {
    override fun onLogin1(email: String, password: String) {
        val user = User1(email,password)
        val success = user.isDataValid
        if(success)
            Login.onLogin("Login Successful")
        else
            Login.onLogin("Your email and Your password is wrong")
    }
}