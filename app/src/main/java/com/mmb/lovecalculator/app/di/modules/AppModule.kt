package com.mmb.lovecalculator.app.di.modules

import android.content.Context
import com.mmb.lovecalculator.app.LoveCalculatorApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app : LoveCalculatorApp) {

    @Provides
    @Singleton
    fun provideContext():Context{
        return app.applicationContext
    }
}