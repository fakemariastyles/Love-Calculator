package com.mmb.lovecalculator.app.ui.recent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.data.repository.LoveRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RecentViewModel @Inject constructor (private val loveRepository: LoveRepository) : ViewModel(){
    private var _results = MutableLiveData<List<ResultEntity>>()
    var results : LiveData<List<ResultEntity>> = _results
    fun getRecentResults(){
        loveRepository.getRecents()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _results.postValue(it)
            } , {
                println(it)
            })
    }
}