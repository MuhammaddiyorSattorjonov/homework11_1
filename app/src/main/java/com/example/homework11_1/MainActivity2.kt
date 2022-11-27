package com.example.homework11_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework11_1.databinding.ActivityMain2Binding
import com.example.homework11_1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var a =   intent.getSerializableExtra("kotlin") as User

        binding.info.text=a.info
        binding.nameA.text= a.name
        binding.image.setImageResource(a.image)


    }
}