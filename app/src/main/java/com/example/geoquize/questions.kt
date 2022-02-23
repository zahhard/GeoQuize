package com.example.geoquize

fun question(){

}
object Questions{
    var mapQuestions = mutableMapOf<String, Boolean>()

    fun init(){
       mapQuestions["A cube have 12 straight edges."] = true
    }
}