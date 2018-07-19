package com.scoproject.movieapp.app.di.component

import android.app.Application
import com.scoproject.base.di.scope.AppScope
import com.scoproject.movieapp.app.MovieApp
import com.scoproject.movieapp.app.di.module.AppModule
import com.scoproject.movieapp.app.di.module.builder.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@AppScope
@Component(modules = [(AndroidInjectionModule::class),
    (AppModule::class),
    (ActivityBuilder::class)])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: MovieApp)
}