package com.example.geoquize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.geoquize.databinding.ActivityAreYouSureBinding

private var isCheatedList  = arrayListOf<String?>(null, null, null, null)
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
        val num = this.intent.getIntExtra("number", 0)
        binding.question.text = question?.question.toString()
        binding.answer.text = question?.boolean.toString()
        isCheatedList[num] = "Cheeted!"
        val intent = Intent(this, areYouSure::class.java)
        intent.putExtra("cheet", "cheeted")
    }
}