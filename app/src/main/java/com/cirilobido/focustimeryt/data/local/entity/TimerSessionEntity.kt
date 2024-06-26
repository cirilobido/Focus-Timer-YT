package com.cirilobido.focustimeryt.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "timer_session")
data class TimerSessionEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int = 0,
    @ColumnInfo(name = "date") var date: String,
    @ColumnInfo(name = "value") var value: Long? = 0
)
