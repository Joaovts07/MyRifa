package com.example.myrifa.data.repository

import com.example.myrifa.domain.model.User
import com.picpay.desafio.android.data.datasource.UsersDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UsersRepository @Inject constructor(
    private val dataSource: UsersDataSource
) {

    fun getUsers(): Flow<List<User>> = dataSource.getUsers()
}