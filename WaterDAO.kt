package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WaterDAO{
    @Query("SELECT * FROM water")
    fun getAll(): List<Water>

    @Insert
    fun insert(water: Water)

}