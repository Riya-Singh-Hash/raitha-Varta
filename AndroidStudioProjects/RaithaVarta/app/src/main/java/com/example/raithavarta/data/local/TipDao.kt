package com.example.raithavarta.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TipDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTips(tips: List<TipEntity>)

    @Query("SELECT * FROM tips")
    fun getAllTips(): LiveData<List<TipEntity>>

    @Query("SELECT * FROM tips WHERE cropType = :crop")
    fun getTipsByCrop(crop: String): LiveData<List<TipEntity>>
}