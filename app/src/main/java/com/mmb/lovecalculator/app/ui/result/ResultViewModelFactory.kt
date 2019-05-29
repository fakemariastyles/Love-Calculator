package com.mmb.lovecalculator.app.ui.result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mmb.lovecalculator.data.repository.LoveRepository
import javax.inject.Inject

class ResultViewModelFactory @Inject constructor(
    private val loveRepository: LoveRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ResultViewModel(loveRepository) as T
    }

}
