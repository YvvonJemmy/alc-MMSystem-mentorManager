package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentComposeReportBinding

class ComposeReportFragment : Fragment() {

    private var _binding: FragmentComposeReportBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentComposeReportBinding.inflate(inflater, container, false)

        binding.composeReportToolbar.apply {
            setNavigationIcon(R.drawable.ic_back)
        }

        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}