package com.example.apexercise9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apexercise9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        val student = listOf(
            Student("Baking & Pastry Production (Lecture)","MW - 7:30am-9:00am", "Room:101","Prof. Juvy Tamondong",R.drawable.woman),
            Student("Baking & Pastry Production (Lab)","MW - 9:00am-12:00nn", "Lab:102","Prof. Juvy Tamondong",R.drawable.woman),
            Student("English Com. 1","TTH - 7:30am-9:00am", "Room:102","Prof. Claudia Ayala",R.drawable.womantwo),
            Student("Basic Statistics","TTH - 9:00am-10:30am","Room:103","Prof. Sheryl Mae Drio",R.drawable.womanthree),
            Student("Bartending (Lecture)","Fri - 7:30am-8:30am","Room:104","Prof. Jennifer Reyes",R.drawable.womanone),
            Student("Bartending (Lab)","Fri - 9:00am-12:00nn","Lab:102","Prof. Jennifer Reyes",R.drawable.womanone),
            Student("Principles of Marketing","MW - 1:00pm-2:30pm","Room:105","Prof. Ashley Taranco",R.drawable.womanfour),
            Student("Business Communication","MW - 3:30pm-5:00pm","Room:106","Prof. Famela Ramos",R.drawable.woman),
            Student("Accounting Appreciation","TTH - 1:00pm-2:30pm","Room:107","Prof.Armand Ordinanza",R.drawable.man),
            Student("Front Office Procedures","TTH - 3:30pm-5:00pm","Room:108","Prof. Violeta Maningas",R.drawable.womantwo),
            Student("Philippine History","Fri - 1:00pm-2:30pm","Room:109","Prof. Darius Virrey",R.drawable.manone),
        )



        recyclerView.adapter = StudentAdapter(student)

    }
}