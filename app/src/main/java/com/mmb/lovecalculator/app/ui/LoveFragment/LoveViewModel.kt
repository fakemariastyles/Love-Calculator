package com.mmb.lovecalculator.app.ui.LoveFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.data.repository.LoveRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoveViewModel @Inject constructor
    (private val loveRepository: LoveRepository) : ViewModel() {
    private val _result = MutableLiveData<ResultEntity>()
    var result : LiveData<ResultEntity> = _result
    fun calculate(firstName: String , secondName: String){
        loveRepository.calculate(firstName,secondName)
            .subscribeOn(Schedulers.io())
            .doOnSuccess {
                loveRepository.insertResult(it)
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _result.postValue(it)
            },{
                println(it)
            })
    }


    fun getResultsFromDataBase(){
        loveRepository.getAll()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                println(it)
            } , {})
    }
}