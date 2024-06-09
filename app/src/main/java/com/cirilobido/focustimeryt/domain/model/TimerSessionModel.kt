package com.cirilobido.focustimeryt.domain.model

import com.cirilobido.focustimeryt.data.local.entity.TimerSessionEntity

data class TimerSessionModel(
    var date: String,
    var value: Long,
    var round: Int? = 0
)

fun TimerSessionModel.toTimerSessionEntity(): TimerSessionEntity {
    return TimerSessionEntity(
        date = this.date,
        value = this.value
    )
}
