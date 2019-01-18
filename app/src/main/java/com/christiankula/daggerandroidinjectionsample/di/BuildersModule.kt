package com.christiankula.daggerandroidinjectionsample.di

import com.christiankula.daggerandroidinjectionsample.home.di.HomeActivityModule
import com.christiankula.daggerandroidinjectionsample.home.ui.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindHomeActivity(): HomeActivity
}