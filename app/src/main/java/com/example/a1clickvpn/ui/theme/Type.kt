package com.example.a1clickvpn.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a1clickvpn.R

val roboto = FontFamily(
    Font(R.font.roboto_bold, weight = FontWeight.Bold),
    Font(R.font.roboto_medium, weight = FontWeight.Medium),
    Font(R.font.roboto_light, weight = FontWeight.Light),
)

val Typography = Typography(

    titleLarge = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
    ),

    bodyMedium = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
    ),

    bodySmall = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
    ),
)