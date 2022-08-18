package com.example.myrifa.domain.usecase

import com.example.myrifa.data.repository.UsersRepository
import com.example.myrifa.domain.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetUserUseCaseImpl @Inject constructor(
    private val usersRepository: UsersRepository
) : GetUserUseCase {
    override fun invoke(): Flow<List<User>> = usersRepository.getUsers()

}