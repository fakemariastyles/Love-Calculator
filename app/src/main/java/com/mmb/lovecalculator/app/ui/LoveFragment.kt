package com.mmb.lovecalculator.app.ui

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.mmb.lovecalculator.R
import javax.inject.Inject


class LoveFragment : Fragment() , CalculateClickListener{
    @Inject
    lateinit var viewModel: LoveViewModel
    var firstName: EditText? = null
    var secondName: EditText? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCalculateClick(firstName: String, secondName: String) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firstName = view.findViewById(R.id.firstName)
        secondName = view.findViewById(R.id.secondName)
    }
}