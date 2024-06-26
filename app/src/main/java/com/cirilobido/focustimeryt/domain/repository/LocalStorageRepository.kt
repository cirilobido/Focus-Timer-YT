package com.cirilobido.focustimeryt.domain.repository

import com.cirilobido.focustimeryt.domain.model.TimerSessionModel

interface LocalStorageRepository {
    suspend fun saveTimerSession(timerSessionModel: TimerSessionModel): Boolean
    suspend fun getTimerSessionByDate(date: String): TimerSessionModel
}