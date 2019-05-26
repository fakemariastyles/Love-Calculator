package com.mmb.lovecalculator.app.ui.ResultFragment

import android.os.Bundle
import androidx.fragment.app.Fragment

class ResultFragment : Fragment() {
    private var result: String? = null
    private var percentage: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        result = arguments?.getString("RESULT")
        percentage = arguments?.getString("PERCENTAGE")

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