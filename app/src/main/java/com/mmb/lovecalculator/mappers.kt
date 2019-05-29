package com.mmb.lovecalculator

import com.mmb.lovecalculator.data.entity.ResultEntity
import com.mmb.lovecalculator.local.model.LocalResult
import com.mmb.lovecalculator.remote.dto.ResultDto

fun ResultDto.toResultEntity() = ResultEntity(
    firstName = firstName, secondName = secondName,
    result = result, percentage = percentage
)

fun ResultEntity.toLocalResult() = LocalResult(
    firstName = firstName, secondName = secondName
    , result = result, percentage = percentage, id = 0
)


fun LocalResult.toResultEntity() = ResultEntity(
    firstName = firstName, secondName = secondName
    , result = result, percentage = percentage
)