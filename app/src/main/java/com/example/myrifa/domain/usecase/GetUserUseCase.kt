package com.example.myrifa.domain.usecase

import com.example.myrifa.domain.model.User
import kotlinx.coroutines.flow.Flow

interface GetUserUseCase {

    operator fun invoke(): Flow<List<User>>

}
