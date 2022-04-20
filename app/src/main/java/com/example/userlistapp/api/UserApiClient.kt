package com.example.userlistapp.api

import javax.inject.Inject

class UserApiClient @Inject constructor(private val userApiService: UserApiService) {

    fun fetchDetails() = userApiService.fetchDetails()
}