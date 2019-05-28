package com.mmb.lovecalculator.app.di

import android.app.Application
import com.mmb.lovecalculator.app.LoveCalculatorApp
import com.mmb.lovecalculator.app.MainActivity
import com.mmb.lovecalculator.app.di.modules.AppModule
import com.mmb.lovecalculator.app.di.modules.LoveFragmentModule
import com.mmb.lovecalculator.app.di.modules.NetworkModule
import com.mmb.lovecalculator.app.ui.LoveFragment.LoveFragment
import com.mmb.lovecalculator.app.ui.ResultFragment.ResultFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class , LoveFragmentModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(app: LoveCalculatorApp)
    fun inject(mainActivity: MainActivity)
    fun inject(loveFragment: LoveFragment)
    fun inject(resultFragment: ResultFragment)

}