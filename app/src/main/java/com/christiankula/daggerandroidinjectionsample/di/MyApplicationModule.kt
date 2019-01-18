package com.christiankula.daggerandroidinjectionsample.di

import android.content.Context
import com.christiankula.daggerandroidinjectionsample.MyApplication
import com.christiankula.daggerandroidinjectionsample.common.CommonHelloWorldService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MyApplicationModule {

    @Provides
    fun provideContext(application: MyApplication): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    fun provideCommonHelloWorldService(): CommonHelloWorldService {
        return CommonHelloWorldService()
    }
}
