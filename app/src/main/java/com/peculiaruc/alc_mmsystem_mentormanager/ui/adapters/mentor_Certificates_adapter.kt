package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_certificate
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_reports
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorCertificatesRecyclerviewItemBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorReportsRecyclerviewItemBinding

class mentor_Certificates_adapter(var mentor_certificates: List<mentors_certificate>, ) : RecyclerView.Adapter<mentor_Certificates_adapter.ViewHolder>() {


    inner class ViewHolder(val binding: FragmentMentorCertificatesRecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentMentorCertificatesRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(mentor_certificates[position]){
                binding.CertficateName.text = this.certifiacte_name
                //binding.ace_1.text = this.Report_creation_infor
//                binding.mentorProgramPic.setImageResource(this.program_profile_pic)
                binding.dropdownsD.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_mentor_certificates_fragment_to_mentors_certificate_generate)
                }
            }
            }
        }

    override fun getItemCount(): Int {
        return mentor_certificates.size
    }
}


