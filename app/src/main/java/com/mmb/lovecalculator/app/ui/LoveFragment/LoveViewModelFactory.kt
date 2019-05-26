package com.mmb.lovecalculator.app.ui.LoveFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mmb.lovecalculator.data.repository.LoveRepository

class LoveViewModelFactory(private val loveRepository: LoveRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoveViewModel(loveRepository) as T
    }

}