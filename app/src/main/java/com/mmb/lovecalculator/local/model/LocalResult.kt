package com.mmb.lovecalculator.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "result")
data class LocalResult (
    @PrimaryKey val id:Int,
    val firstName: String?,
    val secondName:String?,
    val result: String?,
    val percentage: String?
)