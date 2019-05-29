package com.mmb.lovecalculator.app.ui.RecentFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mmb.lovecalculator.data.repository.LoveRepository
import javax.inject.Inject

class RecentFragment :Fragment(){
    @Inject lateinit var loveRepository: LoveRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}