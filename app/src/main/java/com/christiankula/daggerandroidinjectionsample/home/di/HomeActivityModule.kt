package com.christiankula.daggerandroidinjectionsample.home.di

import com.christiankula.daggerandroidinjectionsample.home.HomeHelloWorldService
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    fun provideHomeHelloWorldService(): HomeHelloWorldService {
        return HomeHelloWorldService()
    }
}