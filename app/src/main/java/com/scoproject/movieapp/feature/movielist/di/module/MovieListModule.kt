package com.scoproject.movieapp.feature.movielist.di.module

import com.scoproject.base.di.scope.ActivityScope
import com.scoproject.base.external.scheduler.AppSchedulerProvider
import com.scoproject.movieapp.feature.movielist.presentation.contract.MovieListContract
import com.scoproject.movieapp.feature.movielist.presentation.presenter.MovieListPresenter
import com.scoproject.movieapp.feature.movielist.presentation.view.MovieListActivity
import dagger.Module
import dagger.Provides

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@Module
class MovieListModule {
    @Provides @ActivityScope
    fun provideMovieListActivity(movieListActivity: MovieListActivity): MovieListContract.View = movieListActivity

    @Provides @ActivityScope
    fun provideMovieListPresenter(
                       appSchedulerProvider: AppSchedulerProvider) =
            MovieListPresenter(appSchedulerProvider)
}