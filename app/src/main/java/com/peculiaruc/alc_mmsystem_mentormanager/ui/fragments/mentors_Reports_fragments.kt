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
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_reports
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_tasks
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorsReportsBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_report_adapter
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_tasks_adapter

class mentors_Reports_fragments : Fragment() {
    private var _binding: FragmentMentorsReportsBinding? = null
    private lateinit var rvAdapter: mentor_report_adapter
    private lateinit var mentors_reports : List<mentors_reports>
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        load_dummy_programms()
        _binding = FragmentMentorsReportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun load_dummy_programms() {
        mentors_reports = listOf(
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),
            mentors_reports("Google Africa Scholarship Report","By Ibrahim Kabir  -  19th - 25th Oct 22"),

        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        // pass it to rvLists layoutManager
        binding.mentorTasksRecycleview.setLayoutManager(layoutManager)
        // initialize the adapter,
        // and pass the required argument
        rvAdapter = mentor_report_adapter(mentors_reports)
        // attach adapter to the recycler view
        binding.mentorTasksRecycleview.adapter = rvAdapter

        binding.certificate.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mentors_Reports_fragments_to_mentor_certificates_fragment)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }



}