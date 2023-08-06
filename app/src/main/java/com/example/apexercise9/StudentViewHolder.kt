package com.example.apexercise9

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apexercise9.databinding.StudentLayoutBinding
import javax.security.auth.Subject

class StudentViewHolder(private val binding:StudentLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(student: Student){
        binding.txtRecyclerName.text = student.subject
        binding.txtRecyclerSchedule.text = student.schedule
        binding.txtRecyclerRoom.text = student.room
        binding.txtRecyclerProfName.text = student.profName
        Glide.with(itemView.context)
            .load(student.profImage)
            .into(binding.profImage)


        }

}