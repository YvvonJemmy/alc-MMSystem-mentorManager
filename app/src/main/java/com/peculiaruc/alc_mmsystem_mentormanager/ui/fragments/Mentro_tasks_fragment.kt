package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_programs
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentors_tasks
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorsProgramsFragmentBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentroTasksFragmentBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_program_adapter
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_tasks_adapter
import com.peculiaruc.alc_mmsystem_mentormanager.ui.viewmodels.MentroTasksFragmentViewModel

class Mentro_tasks_fragment : Fragment() {


    private var _binding: FragmentMentroTasksFragmentBinding? = null
    private lateinit var rvAdapter: mentor_tasks_adapter
    private lateinit var mentors_task_list : List<mentors_tasks>
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        load_dummy_programms()
        _binding = FragmentMentroTasksFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun load_dummy_programms() {
        mentors_task_list = listOf(

            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Debugging in VSCode","3 days from now",R.id.mentor_program_pic),
            mentors_tasks("Room library article writ...","3 days from now",R.id.mentor_program_pic)


            )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        // pass it to rvLists layoutManager
        binding.mentorTasksRecycleview.setLayoutManager(layoutManager)
        // initialize the adapter,
        // and pass the required argument
        rvAdapter = mentor_tasks_adapter(mentors_task_list)
        // attach adapter to the recycler view
        binding.mentorTasksRecycleview.adapter = rvAdapter

        binding.reports.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mentro_tasks_fragment_to_mentors_Reports_fragments)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }

}