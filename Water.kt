package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Water(
    @PrimaryKey
    val uid: Int,
    @ColumnInfo(name = "Oz")
    val firstName: String?
    )