package com.ubaya.uts_anmp_160421140.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.uts_anmp_160421140.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        tes123
    }
}