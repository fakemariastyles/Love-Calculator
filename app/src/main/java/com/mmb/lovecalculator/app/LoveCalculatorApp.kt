package com.mmb.lovecalculator.app

import android.app.Application
import com.mmb.lovecalculator.app.di.ApplicationComponent
import com.mmb.lovecalculator.app.di.DaggerApplicationComponent
import com.mmb.lovecalculator.app.di.modules.AppModule

class LoveCalculatorApp : Application(){

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent
            .builder()
            .appModule(AppModule(this))
            .build()
        component.inject(this)
    }
    companion object{
        lateinit var component : ApplicationComponent
    }
}