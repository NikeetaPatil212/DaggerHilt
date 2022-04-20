package com.example.userlistapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserApp : Application() {
    companion object{
        private lateinit var instance: UserApp
        fun getInstance(): UserApp = instance
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}