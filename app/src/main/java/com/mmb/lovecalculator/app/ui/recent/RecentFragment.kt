package com.mmb.lovecalculator.app.ui.recent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.LoveCalculatorApp
import com.mmb.lovecalculator.app.ui.result.ResultViewModel
import com.mmb.lovecalculator.data.repository.LoveRepository
import javax.inject.Inject

class RecentFragment :Fragment(){
    @Inject lateinit var loveRepository: LoveRepository
    @Inject lateinit var viewModel : ResultViewModel
    var recyclerView : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoveCalculatorApp.component.inject(this)
        viewModel.getRecentResults()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_love_fragment_layout , container , false)
    }
}