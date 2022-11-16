package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_certificate
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_reports
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorCertificatesFragmentBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_Certificates_adapter
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_report_adapter

class mentor_certificates_fragment : Fragment() {

    private var _binding: FragmentMentorCertificatesFragmentBinding? = null
    private lateinit var rvAdapter: mentor_Certificates_adapter
    private lateinit var mentors_certificates : List<mentors_certificate>
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        load_dummy_programms()
        _binding = FragmentMentorCertificatesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun load_dummy_programms() {
        mentors_certificates = listOf(
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),
            mentors_certificate("GADS CLOUD 2022 - COMPLETION",R.id.certificate),


            )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        // pass it to rvLists layoutManager
        binding.mentorCertificatesRecycleview.setLayoutManager(layoutManager)
        // initialize the adapter,
        // and pass the required argument
        rvAdapter = mentor_Certificates_adapter(mentors_certificates)
        // attach adapter to the recycler view
        binding.mentorCertificatesRecycleview.adapter = rvAdapter

        binding.certificate.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mentors_programs_fragment_to_mentro_tasks_fragment)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }



}