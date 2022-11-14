package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.mentor_list
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorListBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.mentor_list_adapter


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Mentor_list_Fragment : Fragment() {

    private var _binding:FragmentMentorListBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: mentor_list_adapter
    private lateinit var mentorLists : List<mentor_list>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        _binding = FragmentMentorListBinding.inflate(inflater, container, false)

        // load data to mentors list
        load_mentors_dummy_list()

        // create  layoutManager
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)

        // pass it to rvLists layoutManager
        binding.mentorsRv.setLayoutManager(layoutManager)

        // initialize the adapter,
        // and pass the required argument
        rvAdapter = mentor_list_adapter(mentorLists)

        // attach adapter to the recycler view
        binding.mentorsRv.adapter = rvAdapter


        return binding.root



    }

    private fun load_mentors_dummy_list() {

        mentorLists = listOf(
            mentor_list("Peculiar C. Umeh" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD",
                R.drawable.ann),
            mentor_list("Mohammend J. Hassan" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann_2),
            mentor_list("Ombasanjo R. Uke" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.grace),
            mentor_list("James Karim Michael" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.andrew),
            mentor_list("Josep K Ndururro" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann_2),
            mentor_list("Abdul Hassan Mohamed" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann),
            mentor_list("MiKe Njoronge Macharia" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.andrew),
            mentor_list("Pendo Karisa Haddassah" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD",R.drawable.grace),
            mentor_list("Peculiar C. Umeh" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD",R.drawable.ann),
            mentor_list("Mohammend J. Hassan" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann_2),
            mentor_list("Ombasanjo R. Uke" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.grace),
            mentor_list("James Karim Michael" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.andrew),
            mentor_list("Josep K Ndururro" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann_2),
            mentor_list("Abdul Hassan Mohamed" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.ann),
            mentor_list("MiKe Njoronge Macharia" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD", R.drawable.andrew),
            mentor_list("Pendo Karisa Haddassah" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD",R.drawable.grace),
            mentor_list("Peculiar C. Umeh" , "Program Assistant, Andela, She/her","PROGRAM ASST.","MENTOR-GAD",R.drawable.ann),


            )


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}