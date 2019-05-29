package com.mmb.lovecalculator.app.ui.recent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mmb.lovecalculator.data.repository.LoveRepository
import javax.inject.Inject

class RecentViewModelFactory @Inject constructor(
    private val loveRepository: LoveRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecentViewModel(loveRepository) as T
    }

}
