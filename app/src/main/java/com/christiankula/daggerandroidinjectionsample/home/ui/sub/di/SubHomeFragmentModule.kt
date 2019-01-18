package com.christiankula.daggerandroidinjectionsample.home.ui.sub.di

import com.christiankula.daggerandroidinjectionsample.home.ui.sub.SubHomeHelloWorldService
import dagger.Module
import dagger.Provides

@Module
class SubHomeFragmentModule {

    @Provides
    fun provideSubHomeHelloWorldService(): SubHomeHelloWorldService {
        return SubHomeHelloWorldService()
    }

}