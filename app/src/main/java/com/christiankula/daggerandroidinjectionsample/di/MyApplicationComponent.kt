package com.christiankula.daggerandroidinjectionsample.di

import com.christiankula.daggerandroidinjectionsample.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        BuildersModule::class,
        MyApplicationModule::class]
)
interface MyApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(myApplication: MyApplication): Builder

        fun build(): MyApplicationComponent
    }

    fun inject(myApplication: MyApplication)
}