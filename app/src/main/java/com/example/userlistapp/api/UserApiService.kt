package com.example.userlistapp.api

import com.example.userlistapp.pojo.UserDetails
import retrofit2.Call
import retrofit2.http.GET

interface UserApiService {

    @GET("users")
    fun fetchDetails(): Call<List<UserDetails>>
}