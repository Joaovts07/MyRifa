package com.example.myrifa.domain.usecase.di

import com.example.myrifa.domain.usecase.GetUserUseCase
import com.example.myrifa.domain.usecase.GetUserUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {
    @Binds
    fun bindGetUsersUseCase(useCase: GetUserUseCaseImpl): GetUserUseCase
}