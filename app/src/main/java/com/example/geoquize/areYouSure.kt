package com.example.geoquize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.geoquize.databinding.ActivityAreYouSureBinding

class areYouSure : AppCompatActivity() {
    lateinit var binding : ActivityAreYouSureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAreYouSureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(::onClicked)
    }

    fun onClicked(view: View){
        val question = this.intent.getParcelableExtra<Questions>("question")
        binding.question.text = question?.question.toString()
        binding.answer.text = question?.boolean.toString()

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("cheet", question?.boolean)
        Toast.makeText(this, "ceated!!!!", Toast.LENGTH_SHORT).show()
    }
}