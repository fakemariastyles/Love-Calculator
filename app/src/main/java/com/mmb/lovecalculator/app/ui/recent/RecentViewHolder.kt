package com.mmb.lovecalculator.app.ui.recent

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.data.entity.ResultEntity
import kotlinx.android.synthetic.main.item_result_item.view.*

class RecentViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
    val firstName : TextView = itemView.findViewById(R.id.firstNameResult)
    val secondName :  TextView = itemView.findViewById(R.id.secondNameResult)
    val percentage : TextView = itemView.findViewById(R.id.percentageResult)
    fun bind(result : ResultEntity){
        firstName.text = result.firstName
        secondName.text = result.secondName
        percentage.text = result.percentage
    }
}