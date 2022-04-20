package com.example.userlistapp.repo

import com.example.userlistapp.api.UserApiClient
import javax.inject.Inject

class UserRespository @Inject constructor(private val userApiClient: UserApiClient) {
    fun fetchDetails() = userApiClient.fetchDetails()
}