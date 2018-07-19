package com.scoproject.movieapp.app.di.module.builder

import android.app.Activity
import com.scoproject.base.di.scope.AppScope
import com.scoproject.movieapp.feature.movielist.di.component.MovieListComponent
import com.scoproject.movieapp.feature.movielist.presentation.view.MovieListActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@AppScope
@Module
abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MovieListActivity::class)
    internal abstract fun bindMovieListActivity(builder: MovieListComponent.Builder): AndroidInjector.Factory<out Activity>
}