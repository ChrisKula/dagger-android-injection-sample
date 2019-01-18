package com.christiankula.daggerandroidinjectionsample.di

import com.christiankula.daggerandroidinjectionsample.home.ui.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun bindHomeActivity(): HomeActivity
}