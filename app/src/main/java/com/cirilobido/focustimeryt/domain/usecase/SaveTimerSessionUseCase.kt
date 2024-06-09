package com.cirilobido.focustimeryt.domain.usecase

import com.cirilobido.focustimeryt.domain.model.Resource
import com.cirilobido.focustimeryt.domain.model.TimerSessionModel
import com.cirilobido.focustimeryt.domain.repository.LocalStorageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SaveTimerSessionUseCase @Inject constructor(
    private val repository: LocalStorageRepository
) {
    operator fun invoke(timerSessionModel: TimerSessionModel): Flow<Resource<Boolean>> = flow {
        try {
            emit(Resource.Loading())
            emit(
                Resource.Success(
                    data = repository.saveTimerSession(timerSessionModel)
                )
            )
        } catch (e: Exception) {
            emit(
                Resource.Error(e.message ?: "Unknown Error")
            )
        }
    }
}