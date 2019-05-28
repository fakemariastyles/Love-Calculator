package com.mmb.lovecalculator.app.ui.ResultFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.LoveCalculatorApp

class ResultFragment : Fragment() {
    private var result: String? = null
    private var percentage: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoveCalculatorApp.component.inject(this)
        result = arguments?.getString("RESULT")
        percentage = arguments?.getString("PERCENTAGE")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_result_layout , container , false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val percentText = view.findViewById<TextView>(R.id.percentage)
        println(percentage)
        percentText.text = percentage ?: "0%"
        val resultText = view.findViewById<TextView>(R.id.result)
        resultText.text = result ?: "No result found"

    }

    companion object {
        fun newInstance(result: String, percentage: String): ResultFragment {
            return ResultFragment().apply {
                arguments = Bundle().apply {
                    putString("RESULT", result)
                    putString("PERCENTAGE", percentage)
                }
            }
        }
    }

}