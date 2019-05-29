package com.mmb.lovecalculator.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mmb.lovecalculator.local.dao.ResultDao
import com.mmb.lovecalculator.local.model.LocalResult


@Database(entities = [LocalResult::class] , version = 1)
abstract class AppDataBase :RoomDatabase(){
    abstract fun resultDao(): ResultDao
}