package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorProfileBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorReportDetailsBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorsReportsBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.viewmodels.MentorReportDetailsViewModel

class mentor_report_details : Fragment() {
    private var _binding: FragmentMentorReportDetailsBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMentorReportDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.frame375.setOnClickListener {
                val dialogView = layoutInflater.inflate(R.layout.alert_dialog_box_share_reportt, null)
                val customDialog = context?.let { it1 ->
                    AlertDialog.Builder(it1)
                        .setView(dialogView)
                        .show()
                }
                val btDismiss = dialogView.findViewById<RelativeLayout>(R.id.frame_352)
                btDismiss.setOnClickListener {
                    if (customDialog != null) {
                        customDialog.dismiss()
                    }
            }
        }


        binding.frame376.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.alert_dialog_box_report_download_succesfult, null)
            val customDialog = context?.let { it1 ->
                AlertDialog.Builder(it1)
                    .setView(dialogView)
                    .show()
            }
            val btDismiss = dialogView.findViewById<RelativeLayout>(R.id.frame_351)
            btDismiss.setOnClickListener {
                if (customDialog != null) {
                    customDialog.dismiss()
                }
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }

}