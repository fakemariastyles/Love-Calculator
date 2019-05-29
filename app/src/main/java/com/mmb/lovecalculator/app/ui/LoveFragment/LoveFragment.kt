package com.mmb.lovecalculator.app.ui.LoveFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.LoveCalculatorApp
import com.mmb.lovecalculator.app.ui.ResultFragment.ResultFragment
import com.mmb.lovecalculator.remote.dto.ResultDto
import javax.inject.Inject


class LoveFragment : Fragment() {
    @Inject
    lateinit var viewModel: LoveViewModel
    var firstName: EditText? = null
    var secondName: EditText? = null
    var calculateButton: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoveCalculatorApp.component.inject(this)
        Log.e("SS" , "onCreate")
        viewModel.getResultsFromDataBase()
        viewModel.apply {
            result.observe(this@LoveFragment, Observer {
                Log.d("SS", "observe")
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(
                        R.id.content_frame, ResultFragment.newInstance(
                            it.result.toString()
                            , it.percentage.toString()
                        )
                    )
                    ?.addToBackStack(null)
                    ?.commit()
            })
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("SS", "onViewCreated");

        firstName = view.findViewById(R.id.firstName)
        secondName = view.findViewById(R.id.secondName)
        calculateButton = view.findViewById(R.id.calculate)

        calculateButton?.setOnClickListener {
            viewModel.calculate(firstName?.text.toString(), secondName?.text.toString())
        }

    }

    override fun onResume() {
        super.onResume()
        firstName?.setText("")
        secondName?.setText("")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_love_fragment_layout, container, false)
    }
}