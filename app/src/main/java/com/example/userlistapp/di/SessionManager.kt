package com.example.userlistapp.di

import com.google.gson.Gson
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor(private val sharedPrefManager: SharedPrefManager) {

    fun getToken() : String? = sharedPrefManager.getSessionToken()

    fun setIsContactsSynced(status : Boolean)  = sharedPrefManager.setIsContactsSynced(status)

    fun getIsContactsSynced() : Boolean = sharedPrefManager.getIsContactsSynced()

    private fun clearPreference() = sharedPrefManager.clearPreference()

    fun setDeviceToken(token : String?)  = sharedPrefManager.setDeviceToken(token)

    fun getDeviceToken() : String? = sharedPrefManager.getDeviceToken()
    fun setDashBoardTileArray(dashboardTileArray:String?) = sharedPrefManager.setDashBoardTileArray(dashboardTileArray)
    fun getDashBoardTileArray() = sharedPrefManager.getDashBoardTileArray()
    
    fun clearAllData() {
        /*setToken("")
        setRefreshToken("")
        setIsLoggedIn(false)
        setUserID("")
        setUserDetails(null)
        setIsContactsSynced(false)*/
        val isContactSync = getIsContactsSynced()
        clearPreference()
        setIsContactsSynced(isContactSync)
    }
}