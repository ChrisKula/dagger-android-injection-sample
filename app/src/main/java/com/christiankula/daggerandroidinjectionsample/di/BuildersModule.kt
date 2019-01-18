package com.christiankula.daggerandroidinjectionsample.di

import com.christiankula.daggerandroidinjectionsample.home.di.HomeActivityModule
import com.christiankula.daggerandroidinjectionsample.home.ui.HomeActivity
import com.christiankula.daggerandroidinjectionsample.home.ui.sub.di.SubHomeFragmentModule
import com.christiankula.daggerandroidinjectionsample.home.ui.sub.ui.SubHomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindHomeActivity(): HomeActivity

    @ContributesAndroidInjector(modules = [SubHomeFragmentModule::class])
    abstract fun bindSubHomeFragment(): SubHomeFragment

}
