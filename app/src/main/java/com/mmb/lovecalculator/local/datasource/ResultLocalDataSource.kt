package com.mmb.lovecalculator.local.datasource

import com.mmb.lovecalculator.local.dao.ResultDao
import com.mmb.lovecalculator.local.model.LocalResult
import javax.inject.Inject

class ResultLocalDataSource @Inject constructor(private val resultDao: ResultDao) {
    fun insert(localResult: LocalResult){
        resultDao.insertResult(localResult)
    }
    fun getAll():List<LocalResult>{
        return resultDao.getAll()
    }
}