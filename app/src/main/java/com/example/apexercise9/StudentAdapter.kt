package com.example.apexercise9

import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.apexercise9.databinding.ActivityMainBinding
import com.example.apexercise9.databinding.StudentLayoutBinding

class StudentAdapter(private val student:List<Student>):RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = StudentLayoutBinding.inflate(inflater, parent, false)
        return StudentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return student.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(student[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,student[position].subject,Toast.LENGTH_LONG).show()
            val image = student[position].profImage

            val intent = Intent(holder.itemView.context, ItemInfoActivity::class.java)
            if (image is Int) {
                intent.putExtra("ProfImage", image) // Put the image as a Drawable extra

            }
            intent.putExtra("subject", student[position].subject)
            intent.putExtra("Schedule", student[position].schedule)
            intent.putExtra("Room", student[position].room)
            intent.putExtra("ProfName", student[position].profName)
            holder.itemView.context.startActivity(intent)
        }
    }
    interface StudentClickListener {
        fun onStudentClick(student: Student)
    }

}