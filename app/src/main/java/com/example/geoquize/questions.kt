package com.example.geoquize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


object Game {
    var questions = ArrayList<Questions>()

    fun init(){
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("A cube have 12 straight edges.", true))
    }
}

@Parcelize
data class Questions(var question: String, var boolean: Boolean) : Parcelable