package com.mmb.lovecalculator.app.di

import com.mmb.lovecalculator.app.LoveCalculatorApp
import com.mmb.lovecalculator.app.MainActivity
import com.mmb.lovecalculator.app.di.modules.AppModule
import com.mmb.lovecalculator.app.di.modules.DataBaseModule
import com.mmb.lovecalculator.app.di.modules.LoveFragmentModule
import com.mmb.lovecalculator.app.di.modules.NetworkModule
import com.mmb.lovecalculator.app.ui.LoveFragment.LoveFragment
import com.mmb.lovecalculator.app.ui.RecentFragment.RecentFragment
import com.mmb.lovecalculator.app.ui.ResultFragment.ResultFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class,
        NetworkModule::class,
        LoveFragmentModule::class,
        DataBaseModule::class]
)
interface ApplicationComponent {

    fun inject(app: LoveCalculatorApp)
    fun inject(mainActivity: MainActivity)
    fun inject(loveFragment: LoveFragment)
    fun inject(resultFragment: ResultFragment)
    fun inject(recentFragment: RecentFragment)

}