package com.example.homework11_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework11_1.databinding.ActivityItemViewBinding
import com.example.homework11_1.databinding.ActivityMainBinding

class ItemView : AppCompatActivity() {
    lateinit var binding:ActivityItemViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityItemViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}