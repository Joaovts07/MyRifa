package com.example.myrifa.data.datasource

import com.example.myrifa.domain.model.Status
import com.example.myrifa.domain.model.User
import com.picpay.desafio.android.data.datasource.UsersDataSource
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import java.util.Date

@ExperimentalCoroutinesApi
class ApiUsersDataSource() : UsersDataSource {

    override fun getUsers(): Flow<List<User>> {

        return flow {
            listOf(User(1, "nome", "3", Date(), Status.PENDENTE))
        }
    }
}




