package com.mmb.lovecalculator.app.ui.recent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.LoveCalculatorApp
import javax.inject.Inject

class RecentFragment :Fragment(){
    @Inject lateinit var viewModel : RecentViewModel
    var adapter : RecentAdapter? = null
    var recyclerView : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoveCalculatorApp.component.inject(this)
        viewModel.getRecentResults()
        viewModel.apply {
            results.observe(this@RecentFragment , Observer {
                adapter = RecentAdapter(it)
                recyclerView?.adapter = adapter
            })
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(view.context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_list , container , false)
    }
}