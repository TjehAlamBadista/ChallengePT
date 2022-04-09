package com.example.androiddev.API

import com.google.gson.annotations.SerializedName

class UsersResponse (
    @field:SerializedName("phone")
    val phone: String?,

    @field:SerializedName("name")
    val name: String?,

    @field:SerializedName("id")
    val id: Int?,

    @field:SerializedName("email")
    val email: String?,

    //company
    @field:SerializedName("bs")
    val bs: String?,

    @field:SerializedName("catchPhrase")
    val catchPhrase: String?,

    @field:SerializedName("nameCompany")
    val nameCompany: String?,

    //address
    @field:SerializedName("suite")
    val suite: String?,

    @field:SerializedName("city")
    val city: String?,

    @field:SerializedName("street")
    val street: String?,

    //geo
    @field:SerializedName("lng")
    val lng: String?,

    @field:SerializedName("lat")
    val lat: String?,
)