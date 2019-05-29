package com.mmb.lovecalculator.app.ui.recent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.data.entity.ResultEntity

class RecentAdapter(private val items: List<ResultEntity>) : RecyclerView.Adapter<RecentViewHolder>() {
    override fun getItemCount()=items.size

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {
       holder.bind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_result_item , parent , false)
        return RecentViewHolder(view)
    }

}