package com.mmb.lovecalculator.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface LoveApi{
    @GET("getPercentage")
    fun calculate(@Query("fname") firstName: String , @Query("sname") secondName : String)
    companion object{
        const val BASE_URL = "https://love-calculator.p.rapidapi.com"
    }
}