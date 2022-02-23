package com.example.geoquize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.geoquize.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Game.init()

        binding.btnCheat.setOnClickListener(::onClicked)
    }
    private fun onClicked(view: View) {
        val intent = Intent(this, areYouSure::class.java)
        intent.putExtra("question", Game.questions[0])
        startActivity(intent)
    }
}