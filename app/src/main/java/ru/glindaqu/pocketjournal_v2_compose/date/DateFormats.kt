package ru.glindaqu.pocketjournal_v2_compose.date

import android.annotation.SuppressLint
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
val monthAndDay = SimpleDateFormat("MMMM, dd")
@SuppressLint("SimpleDateFormat")
val dayOnly = SimpleDateFormat("d")
@SuppressLint("SimpleDateFormat")
val dayOfWeek = SimpleDateFormat("u")
@SuppressLint("SimpleDateFormat")
val hoursAndMinutes = SimpleDateFormat("hh:mm a")