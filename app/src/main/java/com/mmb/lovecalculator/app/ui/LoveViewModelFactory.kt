package com.mmb.lovecalculator.app.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.mmb.lovecalculator.data.repository.LoveRepository

class LoveViewModelFactory(private val loveRepository: LoveRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoveViewModel(loveRepository) as T
    }

}