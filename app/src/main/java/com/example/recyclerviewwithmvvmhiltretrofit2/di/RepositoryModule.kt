package com.example.recyclerviewwithmvvmhiltretrofit2.di

import com.example.recyclerviewwithmvvmhiltretrofit2.api.ReqresApi
import com.example.recyclerviewwithmvvmhiltretrofit2.data.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(reqresApi: ReqresApi) = UserRepository(reqresApi)
}