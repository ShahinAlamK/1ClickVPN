package com.example.a1clickvpn.data.models

data class VpnInfoModel(
    val hostname:String,
    val ip:String,
    val ping:String,
    val speed:Int,
    val vpnSessionNum:Int,
    val countryLongName:String,
    val countryShortName:String,
    val baseVpnConfiguration:String,
)
