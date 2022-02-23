package com.example.geoquize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


object Game {
    var questions = ArrayList<Questions>()

    fun init(){
        questions.add(Questions("A cube have 12 straight edges.", true))
        questions.add(Questions("Katherine Hepburn is the actress has won the most Oscars.", true))
        questions.add(Questions("Seven players are there in an ice hockey team.", false))
        questions.add(Questions("Milk Mekhela also known as the Milky Way  is the name of our galaxy.", true))
    }
}

@Parcelize
data class Questions(var question: String, var boolean: Boolean) : Parcelable