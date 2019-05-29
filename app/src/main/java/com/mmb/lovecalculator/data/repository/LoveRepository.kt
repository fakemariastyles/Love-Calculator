package com.mmb.lovecalculator.data.repository

import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.local.datasource.ResultLocalDataSource
import com.mmb.lovecalculator.remote.datasource.LoveRemoteDataSource
import com.mmb.lovecalculator.toLocalResult
import com.mmb.lovecalculator.toResultEntity
import io.reactivex.Single
import javax.inject.Inject

class LoveRepository @Inject constructor(
    private val loveRemoteDataSource: LoveRemoteDataSource
    , private val resultLocalDataSource: ResultLocalDataSource
) {
    fun calculate(firstName: String, secondName: String): Single<ResultEntity> {
        return loveRemoteDataSource.calculate(firstName, secondName).map {
            it.toResultEntity()
        }
    }
    fun insertResult(result : ResultEntity){
        resultLocalDataSource.insert(result.toLocalResult())
    }

    fun getAll(): Single<List<ResultEntity>>{
        return Single.fromCallable {
            resultLocalDataSource.getAll().map {
                it.toResultEntity()
            }
        }
    }
}