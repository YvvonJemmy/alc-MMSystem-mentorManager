package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_reports
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorReportsRecyclerviewItemBinding

class mentor_report_adapter(var mentor_report: List<mentors_reports>, ) : RecyclerView.Adapter<mentor_report_adapter.ViewHolder>() {


    inner class ViewHolder(val binding: FragmentMentorReportsRecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentMentorReportsRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(mentor_report[position]){
                binding.gadsProgra.text = this.Report_name
                binding.reportCreationInfor.text = this.Report_creation_infor
//                binding.mentorProgramPic.setImageResource(this.program_profile_pic)
                binding.dropdownsD.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_FirstFragment_to_SecondFragment2)
                }
                binding.dropdownsD.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_mentors_Reports_fragments_to_mentor_report_details)
                }
            }
            }
        }

    override fun getItemCount(): Int {
        return mentor_report.size
    }
}


