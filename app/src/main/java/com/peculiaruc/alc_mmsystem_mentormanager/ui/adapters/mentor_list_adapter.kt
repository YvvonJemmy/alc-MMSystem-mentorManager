package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentor_list
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorListRecyclerviewItemBinding

class mentor_list_adapter(private var mentor_list: List<mentor_list>, ) : RecyclerView.Adapter<mentor_list_adapter.ViewHolder>() {


    inner class ViewHolder(val binding: FragmentMentorListRecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentMentorListRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(mentor_list[position]){
                binding.mentorName.text = this.name
                binding.bioData.text = this.Bio_data
                binding.Title.text = this.Title
                binding.role.text = this.Role
                binding.mentorProfilePic.setImageResource(this.profile_pic)
                binding.dropdownsD.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_FirstFragment_to_SecondFragment2)
                }
            }
            }
        }

    override fun getItemCount(): Int {
        return mentor_list.size
    }
}


