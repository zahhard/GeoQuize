package com.example.geoquize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.geoquize.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    lateinit var currentQuestion: Questions
    private var i = 0
    var currentAnswer: Boolean = true
    private var isAnsweredList  = arrayListOf<String?>(null, null, null, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Game.init()

        binding.prev.isEnabled = false
        currentQuestion = Game.questions[0]
        currentAnswer = currentQuestion.boolean
        binding.textView3.text = currentQuestion.question


        binding.btnCheat.setOnClickListener(::onClicked)
        binding.t.setOnClickListener(::checkTruth)
        binding.f.setOnClickListener(::checkTruth)
        binding.prev.setOnClickListener(::prev)
        binding.next.setOnClickListener(::next)
    }

    private fun onClicked(view: View) {
        val intent = Intent(this, areYouSure::class.java)
        intent.putExtra("question", Game.questions[0])
        startActivity(intent)
    }

    private fun checkTruth(view: View) {
        if (view is Button) {
            if (currentAnswer.toString() == view.text) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                isAnsweredList[i] = ( "view.text.toString()" )
            } else
                Toast.makeText(this, "NOT correct!", Toast.LENGTH_SHORT).show()
            isAnsweredList[i] = ( "view.text.toString()" )
        }
        binding.t.isEnabled = false
        binding.f.isEnabled = false
    }

    private fun prev(view: View) {
        i--
        binding.prev.isEnabled = true
        currentQuestion = Game.questions[i]
        binding.textView3.text = currentQuestion.question
        currentAnswer = currentQuestion.boolean
        if (isAnsweredList[i] != null) {
            binding.t.isEnabled = false
            binding.f.isEnabled = false
        }
        else{
            binding.t.isEnabled = true
            binding.f.isEnabled = true
        }
    }

    private fun next(view: View) {
        i++
        binding.prev.isEnabled = true
        if (currentQuestion == Game.questions[3]) {
            binding.next.isEnabled = false
        } else {
            currentQuestion = Game.questions[i]
            binding.textView3.text = currentQuestion.question
            currentAnswer = currentQuestion.boolean
            if (isAnsweredList[i] != null) {
                binding.t.isEnabled = false
                binding.f.isEnabled = false
            }
            else{
                binding.t.isEnabled = true
                binding.f.isEnabled = true
            }

        }
    }

}