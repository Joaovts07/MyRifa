package com.picpay.desafio.android.data.datasource

import com.example.myrifa.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UsersDataSource {

    fun getUsers(): Flow<List<User>>
}