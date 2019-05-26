package com.mmb.lovecalculator

import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.remote.dto.ResultDto

fun ResultDto.toResultEntity() = ResultEntity(
    firstName = firstName, secondName = secondName,
    result = result, percentage = percentage
)