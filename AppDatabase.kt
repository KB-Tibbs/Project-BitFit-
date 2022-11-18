package com.example.bitfit

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class AppDatabase(private val applicationContext: Context) {

    @Database(entities = [Water::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun waterDao(): WaterDAO
    }

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "water-consumed"
    ).build()
}