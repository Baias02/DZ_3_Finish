package com.example.dz_3_finish

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

class Pizza(
    var image: Int,
    var name: String,
    var estimation: String,
    var country: String,
    var mealName: String,
    var time: String,
    var freeClub: String,
    var minimum: String,
    var km: String,
    var around: String,
    var info: String):  Serializable {
}