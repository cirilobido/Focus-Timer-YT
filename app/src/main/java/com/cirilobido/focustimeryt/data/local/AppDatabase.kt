package com.cirilobido.focustimeryt.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cirilobido.focustimeryt.data.local.dao.TimerSessionDao
import com.cirilobido.focustimeryt.data.local.entity.TimerSessionEntity

@Database(entities = [TimerSessionEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun timerSessionDao(): TimerSessionDao
}