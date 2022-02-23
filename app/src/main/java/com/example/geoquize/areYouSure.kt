package com.example.geoquize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.geoquize.databinding.ActivityAreYouSureBinding
import com.example.geoquize.databinding.ActivityMainBinding

class areYouSure : AppCompatActivity() {
    lateinit var binding : ActivityAreYouSureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAreYouSureBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun ocClicked(view: View){
        val question = Questions
        question.init()
        binding.textView.text = question.mapQuestions["A cube have 12 straight edges."].toString()

    }


}