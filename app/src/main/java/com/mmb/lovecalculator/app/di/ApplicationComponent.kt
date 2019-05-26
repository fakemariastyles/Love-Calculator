package com.mmb.lovecalculator.app.di

import android.app.Application
import android.view.textclassifier.TextClassification
import com.mmb.lovecalculator.app.LoveCalculatorApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app : Application):Builder
        fun build():ApplicationComponent
    }

    fun inject(app : LoveCalculatorApp)

}