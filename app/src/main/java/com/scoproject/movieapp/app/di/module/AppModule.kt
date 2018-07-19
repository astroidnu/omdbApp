package com.scoproject.movieapp.app.di.module

import android.app.Application
import android.content.Context
import com.scoproject.base.di.scope.AppScope
import com.scoproject.base.external.scheduler.AppSchedulerProvider
import com.scoproject.movieapp.feature.movielist.di.component.MovieListComponent
import dagger.Module
import dagger.Provides

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@AppScope
@Module(subcomponents = [(MovieListComponent::class)])
class AppModule {
    @Provides @AppScope
    fun provideContext(application: Application): Context = application

    @Provides @AppScope
    fun provideSchedulerProvider() = AppSchedulerProvider()
}