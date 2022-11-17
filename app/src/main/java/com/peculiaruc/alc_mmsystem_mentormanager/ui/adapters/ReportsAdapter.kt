package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.models.Reports

class ReportsAdapter(private val reports: List<Reports>) : RecyclerView.Adapter<ReportsAdapter.ReportsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.report_item, parent, false)
        return ReportsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReportsViewHolder, position: Int) {
        val current = reports[position]
        holder.bind(current.title, current.user, current.time)
    }

    override fun getItemCount(): Int = reports.size

    class ReportsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nTitle = view.findViewById<TextView>(R.id.textTitle)
        private val nUser = view.findViewById<TextView>(R.id.textUser)
        private val nTime = view.findViewById<TextView>(R.id.textTime)

        fun bind(title: String, user: String, time: String) {
            nTitle.text = title
            nUser.text = user
            nTime.text = time
        }
    }
}