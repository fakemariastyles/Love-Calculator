package com.mmb.lovecalculator.app

import android.app.Application
import com.mmb.lovecalculator.app.di.ApplicationComponent
import com.mmb.lovecalculator.app.di.DaggerApplicationComponent

class LoveCalculatorApp : Application(){

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
        component.inject(this)
    }
    companion object{
        lateinit var component : ApplicationComponent
    }
}