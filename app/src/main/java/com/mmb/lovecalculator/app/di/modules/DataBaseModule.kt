package com.mmb.lovecalculator.app.di.modules

import android.content.Context
import android.provider.DocumentsContract
import androidx.room.Room
import com.mmb.lovecalculator.local.AppDataBase
import com.mmb.lovecalculator.local.dao.ResultDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule{

    @Provides
    @Singleton
    fun provideAppDataBase(context: Context):AppDataBase{
        return Room.databaseBuilder(context , AppDataBase::class.java , "db.data").build()
    }

    @Provides
    @Singleton
    fun provideResultDao(appDataBase: AppDataBase):ResultDao{
        return appDataBase.resultDao()
    }
}