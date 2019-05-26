package com.mmb.lovecalculator.remote.datasource

import com.mmb.lovecalculator.remote.api.LoveApi
import com.mmb.lovecalculator.remote.dto.ResultDto
import io.reactivex.Single
import javax.inject.Inject

class LoveRemoteDataSource @Inject constructor(private val loveApi: LoveApi) {
    fun calculate(firstName: String, secondName: String)
            : Single<ResultDto> {
        return loveApi.calculate(firstName, secondName)
    }
}