package com.mmb.lovecalculator.app.ui.result

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.data.entity.ResultEntity

class ResultAdapter(private val items: List<ResultEntity>) : RecyclerView.Adapter<ResultViewHolder>() {
    override fun getItemCount()=items.size

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
       holder.bind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_result_item , parent , false)
        return ResultViewHolder(view)
    }

}