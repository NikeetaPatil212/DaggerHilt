package com.example.userlistapp.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPrefModule {
    @Singleton
    @Provides
    fun providesSharedPrefs(@ApplicationContext context: Context) : SharedPreferences {
        return context.getSharedPreferences("kayanaPrefs", Context.MODE_PRIVATE)
    }
}