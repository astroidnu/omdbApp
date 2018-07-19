package com.scoproject.movieapp.feature.movielist.di.component

import com.scoproject.base.di.scope.ActivityScope
import com.scoproject.movieapp.feature.movielist.di.module.MovieListModule
import com.scoproject.movieapp.feature.movielist.presentation.view.MovieListActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@ActivityScope
@Subcomponent(modules = [(MovieListModule::class)])
interface MovieListComponent : AndroidInjector<MovieListActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MovieListActivity>()
}