package com.example.userlistapp.di

import android.content.SharedPreferences
import javax.inject.Inject

class SharedPrefManager @Inject constructor(private val sharedPreferences: SharedPreferences) {

    val KEY_SESSION_TOKEN = "key_session_token"
    val KEY_SESSION_ID_TOKEN = "key_session_id_token"
    val KEY_REFRESH_TOKEN = "key_refresh_token"
    val KEY_IS_LOGGEDIN = "key_is_loggedin"
    val KEY_USER_DETAILS = "key_user_details"
    val KEY_USER_ID = "key_user_id"
    val KEY_CONTACTS_SYNCED = "key_contact_synced"
    val KEY_DEVICE_TOKEN ="key_device_token"
    val KEY_IS_DELIVERY_AGENT_ACTIVE ="key_is_delivery_agent_active"
    val KEY_DASHBOARD_TILE_ARRAY ="key_dashboard_tile_array"

    fun setSessionToken(sessionToken : String?) =
        sharedPreferences.edit().putString(KEY_SESSION_TOKEN, sessionToken).apply()

    fun setSessionIdToken(sessionIdToken : String?) =
        sharedPreferences.edit().putString(KEY_SESSION_ID_TOKEN, sessionIdToken).apply()

    fun getSessionToken() : String? =
        sharedPreferences.getString(KEY_SESSION_TOKEN, "")
    fun getSessionIdToken() : String? =
        sharedPreferences.getString(KEY_SESSION_ID_TOKEN, "")

    fun setRefreshToken(refreshToken : String?) =
        sharedPreferences.edit().putString(KEY_REFRESH_TOKEN, refreshToken).apply()

    fun getRefreshToken() : String? =
        sharedPreferences.getString(KEY_REFRESH_TOKEN, "")

    fun setIsLoggedIn(isLoggedIn : Boolean) =
        sharedPreferences.edit().putBoolean(KEY_IS_LOGGEDIN, isLoggedIn).apply()

    fun getIsLoggedIn() : Boolean =
        sharedPreferences.getBoolean(KEY_IS_LOGGEDIN, false)

    fun setUserDetails(userDetailsString : String?) =
        sharedPreferences.edit().putString(KEY_USER_DETAILS, userDetailsString).apply()

    fun getUserDetails() : String? =
        sharedPreferences.getString(KEY_USER_DETAILS, "")

    fun setUserID(username : String?) =
        sharedPreferences.edit().putString(KEY_USER_ID, username).apply()

    fun setDeliveryAgentActive(isLoggedIn: Boolean) =
        sharedPreferences.edit().putBoolean(KEY_IS_DELIVERY_AGENT_ACTIVE, isLoggedIn).apply()

    fun getUserID() : String? =
        sharedPreferences.getString(KEY_USER_ID, "")

    fun getDeliveryAgentActive() : Boolean? =
        sharedPreferences.getBoolean(KEY_IS_DELIVERY_AGENT_ACTIVE, false)

    fun setIsContactsSynced(status : Boolean) =
        sharedPreferences.edit().putBoolean(KEY_CONTACTS_SYNCED, status).apply()

    fun getIsContactsSynced() : Boolean =
        sharedPreferences.getBoolean(KEY_CONTACTS_SYNCED, false)

    fun setDeviceToken(deviceToken : String?) =
        sharedPreferences.edit().putString(KEY_DEVICE_TOKEN, deviceToken).apply()

    fun getDeviceToken() : String? =
        sharedPreferences.getString(KEY_DEVICE_TOKEN, "")

    fun clearPreference() = sharedPreferences.edit().clear().apply()

    fun setDashBoardTileArray( dashBoardTileArray: String?) =
        sharedPreferences.edit().putString(KEY_DASHBOARD_TILE_ARRAY, dashBoardTileArray).apply()

    fun getDashBoardTileArray() : String? =
        sharedPreferences.getString(KEY_DASHBOARD_TILE_ARRAY, "")

}