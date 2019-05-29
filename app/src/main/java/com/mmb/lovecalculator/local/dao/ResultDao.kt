package com.mmb.lovecalculator.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mmb.lovecalculator.local.model.LocalResult


@Dao
interface ResultDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertResult(vararg localResult: LocalResult)

    @Query("SELECT * FROM result")
    fun getAll():List<LocalResult>
}