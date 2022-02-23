package com.example.geoquize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.geoquize.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun ocClicked(view: View) {
        
    }
}