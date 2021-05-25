package com.example.myapplication.Login.Model

import android.text.TextUtils
import android.util.Patterns

class ClassUser(override val email : String, override val password : String) : User {
    override val valid: Boolean
        get() = (!TextUtils.isEmpty(email)&& Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 8)
}