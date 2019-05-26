package com.mmb.lovecalculator.data.repository

import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.remote.datasource.LoveRemoteDataSource
import com.mmb.lovecalculator.toResultEntity
import io.reactivex.Single
import javax.inject.Inject

class LoveRepository @Inject constructor(private val loveRemoteDataSource: LoveRemoteDataSource){
    fun calculate(firstName:String , secondName:String):Single<ResultEntity>{
        return loveRemoteDataSource.calculate(firstName,secondName).map {
            it.toResultEntity()
        }
    }
}