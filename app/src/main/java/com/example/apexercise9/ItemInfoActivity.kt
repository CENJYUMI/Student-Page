package com.example.apexercise9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise9.databinding.ActivityItemInfoBinding
import com.example.apexercise9.databinding.ActivityMainBinding

class ItemInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val resourceId = intent.getIntExtra("ProfImage", 0) // Provide a default value if the extra is not found
        binding.imageView2.setImageResource(resourceId)

        binding.txtItemInfo.text = intent.getStringExtra("subject")
        binding.txtItemInfo2.text = intent.getStringExtra("Schedule")
        binding.txtItemInfo4.text = intent.getStringExtra("Room")
        binding.txtItemInfo3.text = intent.getStringExtra("ProfName")



    }
}