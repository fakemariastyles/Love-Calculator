package com.mmb.lovecalculator.remote.dto


import com.google.gson.annotations.SerializedName

data class ResultDto(
    @SerializedName("fname")
    val firstName: String?,
    @SerializedName("percentage")
    val percentage: String?,
    @SerializedName("result")
    val result: String?,
    @SerializedName("sname")
    val secondName: String?
)