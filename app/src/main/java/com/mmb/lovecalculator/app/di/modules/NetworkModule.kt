package com.mmb.lovecalculator.app.di.modules

import com.mmb.lovecalculator.remote.api.LoveApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(LoveApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideLoveApi(retrofit: Retrofit): LoveApi {
        return retrofit.create(LoveApi::class.java)
    }


    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        return OkHttpClient()
            .newBuilder()
            .addInterceptor { chain ->
                val request = chain.request()
                val requestBuilder = request.newBuilder()
                    .header("X-RapidAPI-Host", "love-calculator.p.rapidapi.com")
                    .header("X-RapidAPI-Key", "6a4ff8a2bfmshf46bbdfa295c742p146fa3jsn49b5c09615ab")
                val newRequest = requestBuilder.build()
                chain.proceed(newRequest)
            }
            .build()
    }
}